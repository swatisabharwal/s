page title:Harvard Business Publishing Test Builder

#Object Definitions
====================================================================================
page_heading                                  css                                h1  
username_field                                id                                 j_username
password_field                                id                                 j_password
login_button                                  xpath                              //input[@value='Login']
All_Search_result                             css                                #context-items
global_Search_field                           xpath                              //div[@id='search-discipline']/following-sibling::input[@type='text']
global_Search_Button                          xpath                              (//input[@type='submit'])[1]
search_Result_Label                           css                                #search-paging-1 .total-results 
test_Bank_Link                                xpath                              (//div[@id='context-items'])[1]//a[contains(text(),'Test Bank')]
