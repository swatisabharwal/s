page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
HBP_logo_popup                                css                          div[class$='MediaModalView'] div.modal-content img
done_button_logo_popup                        css                          div#linearContentModal a[class^='close-modal']    
logo_image                                    css                          img
authors_list_div                              css                          div[id*='aulist']
publishing_date                               css                          p.pub-date
top_Nav_Bar                                   xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
toc_icon							          xpath						   //ul[contains(@class,'menu-a navbar-menu')]//span[@class='hbp-icon hbp-icon-toc js-hbp-icon-toc']
notes_Icon                                    xpath                        //ul[contains(@class,'navbar-menu')]/li[contains(@class,'notes')]/a
search_Icon                                   xpath                        //ul[@class='menu-b navbar-menu']//span[@class='hbp-icon hbp-icon-search']
Settings_Icon                                 xpath                        .//*[@class='hbp-icon hbp-icon-settings']
tooltip_Toc                                   xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Table of Contents'] 
tooltip_Notes                                 xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Notes'] 
tooltip_Search                                xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Search'] 
tooltip_Settings                              xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Settings'] 
header_nav_bar                                id                          hbpNavbar
current_page						          css 					       div[class*='footer-desktop'] .js-current-page
current_page_number                           css                         footer div[class*='footer-reading-mode'] span[class*='current-page']
particular_frame_element                      xpath                       //iframe[@id='chapter_${text}']
trashcan_offline_storage                      xpath                       //ul[@class='offline-menu']//span[contains(@class,'hbp-icon-trashcan js-btn-delete')]
empty_view_message_offline_storage            xpath                       //li[contains(@class,'epub-empty-view')]/span
currently_viewing_offline_storage             xpath                       //li[contains(@class,'currently-viewing')]
cloud_icon                                    xpath                       //div[contains(@class,'downloaded-content')]
cloud_icon_tooltip                            xpath                       //div[contains(@class,'downloaded-content')]/span
save_offline_now                              xpath                       //button[text()='Save offline now']
settingsLink                                  xpath                       //li[contains(@data-sidebar-panel,'settings')]
offline_window_dnt_show_checkbox              xpath                       //input[@class='offline-message-dont-show']
offline_popup_done_button                     xpath                       //div[@class='offline-storage-modal']//button[text()='Done']
offline_popup_message_B                       xpath                       //div[@class='modal-content message-b']
not_now_button                                xpath                       //div[contains(@class,'modal-content message-a')]//a
offline_read_pop_up                           xpath                       //div[@class='modal-content message-a']
book_title                                    xpath                       //h1[@class='pub-title']
body_el                                       xpath                       //body
Next_Button_TOC                               xpath                       //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content table-of-content')]//button
Next_Button_Highlight                         xpath                       //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content highlighting')]//button
Next_Button_Search                            xpath                       //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content search')]//button 
Next_Button_Offline_Access                    xpath                       //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content offline-access')]//button 
Done_Button_Sync                              xpath                       //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content sync')]//button 
table_of_contents_WT                          css                         div[class='modal-content table-of-content']
highlight_WT                                  css                         div[class='modal-content highlighting']
Search_WT                                     css                         div[class='modal-content search']
offline_access_WT                             css                         div[class='modal-content offline-access']
Sync_WT                                       css                         div[class='modal-content sync']
desktop_walkthrough                           css                         div[class='desktop-instructions-modal'] 
instructions_modal                            css                         div[class='desktop-instructions-modal'] div[class*='modal js-modal']
first_dont_show_box                           xpath                       (//div[@class='desktop-instructions-modal']//div[@class='row options'])[1]//span[@class='checkbox']
desktop_walkthrough                           css                         div[class='desktop-instructions-modal']
Done_Button_Offline_Sync					  xpath						  //div[@class='desktop-instructions-modal']//div[contains(@class,'modal-content offline-access')]//button
instructions_modal                            css                         div[class='desktop-instructions-modal'] div[class*='modal js-modal']
publishing_title                              xpath                       //div[@class='title-container']
navigation_bar_menu                           xpath                       //nav[contains(@class,'hbp-navbar')]//div[@class='menubar js-menubar']


@ForBooktitle
--------------------------------
publishing_title
      centered horizontally inside: navigation_bar_menu
publishing_title
      centered vertically inside: navigation_bar_menu
      
@objects
--------------------------------
authors_list_div
      below: logo_image 
authors_list_div
      below: publishing_date 30 to 33px 

