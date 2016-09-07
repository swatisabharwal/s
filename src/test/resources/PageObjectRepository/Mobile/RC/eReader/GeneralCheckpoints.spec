page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
HBP_logo_popup                                css                          div[class$='MediaModalView'] div.modal-content img
done_button_logo_popup                        css                          div#linearContentModal a[class^='close-modal']    
logo_image                                    css                          p.masthead img
authors_list_div                              css                          div[id*='aulist']
publishing_date                               css                          p.pub-date
top_Nav_Bar                                   xpath                        //div[@class='headerView']
toc_icon							          xpath						   //ul[contains(@class,'menu-a navbar-menu')]//span[@class='hbp-icon hbp-icon-toc js-hbp-icon-toc']
notes_Icon                                    xpath                        //ul[contains(@class,'navbar-menu')]/li[contains(@class,'notes')]/a
search_Icon                                   xpath                        //ul[@class='menu-b navbar-menu']//span[@class='hbp-icon hbp-icon-search']
Settings_Icon                                 xpath                        .//*[@class='hbp-icon hbp-icon-settings']
tooltip_Toc                                   xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Table of Contents'] 
tooltip_Notes                                 xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Notes'] 
tooltip_Search                                xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Search'] 
tooltip_Settings                              xpath                        //a[@class='tooltip-bottom tooltip-active' and @data-tooltip='Settings'] 
header_nav_bar                                id                          hbpNavbar
current_page						          css 					    .js-current-page
current_page_number                           css                         footer div.pages span[class*='current']
particular_frame_element                      xpath                       //iframe[@id='chapter_${text}']

@objects
--------------------------------
authors_list_div
      below: logo_image 
authors_list_div
      below: publishing_date 30 to 33px 
