Page Title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
page_heading                                 xpath                              //h1
username_field                                id                                 j_username
password_field                                id                                 j_password
login_button                                  css                                form#loginForm input[value=Login]
coursepacks_link                              css                                ul#hbp-main-menu a[href$='coursepacks'] 
coursePack_To_Navigate                        xpath                              //ul[@id='coursepack-list']//a[text()='${text}']
eReader_View_Document_Link                    xpath                              (//a[contains(text(),'${text}')]/ancestor::div[@class='product-information'])[1]/preceding-sibling::*//a
                  