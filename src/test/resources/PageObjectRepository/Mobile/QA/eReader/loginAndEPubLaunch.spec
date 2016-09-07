page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
page_heading                                  css                                h1
username_field                                id                                 j_username
password_field                                id                                 j_password
login_button                                  xpath                              //input[@value='Login']
coursepacks_link                              xpath                              //ul[@id='hbp-main-menu']//a[contains(@href,'coursepacks')] 
coursePack_To_Navigate                        xpath                              //ul[@id='coursepack-list']//a[text()='${text}']
eReader_View_Document_Link                    xpath                              (//a[contains(text(),'${text}')]/ancestor::div[@class='product-information'])[1]/preceding-sibling::*//a
offline_read_pop_up                           xpath                              //div[@class='modal-content message-a']
not_now_button                                xpath                              //div[contains(@class,'modal-content message-a')]//a
read_offline_modal_popup                      xpath                              (//div[@class='offline-storage-modal']//div[contains(@class,'modal js-modal')])[1]
progressBars                                  xpath                              //div[@id='hbpLoader']//*[contains(@class,'stage-bar')]
hbPLoaderDiv                                  xpath                              //div[@id='hbpLoader']/parent::*
read_offline_message_body                     css                                div[class*=message-a]>div[class*='offline-message-body']>p
second_read_offline_message_body              css                                div[class*=message-b]>div[class*='offline-message-body']>p 
read_offline_message_header                   css                                div[class*=message-a]>div[class*='offline-message-header']
second_read_offline_message_header            css                                div[class*=message-b]>div[class*='offline-message-header']
loading_message                               classname                          loading-message
search_box									  xpath								 .//*[@id='search-container-1']/input[1]
go_Button									  xpath								 .//*[@id='hbp-search']//input[@type='submit']     
see_A_Preview								  xpath								 .//a[text()='See A Preview'] 
item_Title									  xpath								 .//a[@class='title in-library']   
user_Role									  css								 #hbp-user-info>p:nth-child(2)