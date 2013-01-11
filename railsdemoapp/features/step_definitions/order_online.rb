require "taas"
require 'json'

$order_id


Given /^I visit the order merchant site and I place the order$/ do
  client1 = TaaS.client("http://10.12.6.81:4567/contract",10000);
  response_hash,command_output= client1.execute_contract({:contract_name => "place_order", :name => "Priti", :address => "address_1", :quantity => "2" } )
  puts "COMMAND OUTPUT : #{command_output}\n"
  puts "RESPONSE       : #{response_hash}\n"

  $order_id=response_hash["order_id"]
end

When /^I change the status from play$/ do
  client2 = TaaS.client("http://10.12.6.122:4567/contract",10000);
  response_hash,command_output= client2.execute_contract({:contract_name => "deliver_order", :order_id => $order_id})
  puts "COMMAND OUTPUT : #{command_output}\n"
  puts "RESPONSE       : #{response_hash}\n"
           #puts $order_id
end

Then /^order status is changed at merchant site$/ do
  client1 = TaaS.client("http://10.12.6.81:4567/contract",10000);
  response_hash,command_output= client1.execute_contract({:contract_name => "verify_order", :order_id => $order_id } )
  puts "COMMAND OUTPUT : #{command_output}\n"
  puts "RESPONSE       : #{response_hash}\n"
end
