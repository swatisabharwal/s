page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
page_heading                                  css                                h1
username_field                                id                                 j_username
password_field                                id                                 j_password
login_button                                  css                                form#loginForm input[value=Login]
coursePack_To_Navigate                        xpath                              //ul[@id='coursepack-list']//a[text()='${text}']
eReader_View_Document_Link                    xpath                              (//a[contains(text(),'${text}')]/ancestor::div[@class='product-information'])[1]/preceding-sibling::*//a
offline_read_pop_up                           xpath                              //div[@class='modal-content message-a']
not_now_button                                xpath                              //div[contains(@class,'modal-content message-a')]//a
read_offline_modal_popup                      xpath                              (//div[@class='offline-storage-modal']//div[contains(@class,'modal js-modal')])[1]
coursepacks_link                              css                                ul#hbp-main-menu a[href$='coursepacks'] 
                  