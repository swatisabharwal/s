page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
spinner								xpath						.//*[@class='fl spinner1']
toc_icon							xpath						//ul[contains(@class,'menu-a navbar-menu')]//span[@class='hbp-icon hbp-icon-toc js-hbp-icon-toc']
exhibit1_link						xpath						//div[@class='popover-wrapper']//span[contains(text(),'Exhibit 1 Projected Market Volumes')]
particular_exhibit                  xpath                       //div[@class='popover-wrapper']//span[contains(text(),'Exhibit ${text}')]
exhibit_iframe						id							chapter_2
exhibit1_text						xpath						.//word[contains(text(),'Exhibit ')]
right_chevron_icon					xpath						.//*[@class='next hbp-next arrows-wrapper js-arrows-wrapper']
current_page1						css 					    div[class*='footer-desktop'] .js-current-page
total_pages_footer_bar              css                         .js-total-pages
total_pages_footer                  css                         .rm-total                  
body_element                        xpath                       //body
top_Nav_Bar                         xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
toc_flyout_popUp_mobile             css                         div.sidebar  div[class^='sidebar-toc']
toc_flyout_popUp_desktop            css                         div[class*='popover toc-popover']
current_pagenumber               	css                         footer div[class*='footer-reading-mode'] span[class*='current-page']
toc_topic_to_nav_desktop            xpath                       //div[@class='popover-wrapper']//span[contains(text(),'${text}')]
toc_topic_to_nav_mobile             xpath                       //div[contains(@class,'sidebar-toc')]//span[text()='${text}']
nece_background_heading             xpath                       //h1[contains(@class,'hbp_reader__heading2')]
marketing_the_tronn_heading         xpath                       //h1[contains(@class,'hbp_reader__heading3')]
pageNum_Topic_In_TOC_desktop        xpath                       //div[@class='popover-wrapper']//span[contains(text(),'${text}')]/following-sibling::span
pageNum_Topic_In_TOC_mobile         xpath                       //div[contains(@class,'js-toc-section')]//span[text()='${text}']/following-sibling::span
footnote_link                       xpath                       //word[text()='[${text}]']
span_link_Of_footnote               xpath                       //word[text()='[${text}]']/ancestor::span[@class='fn-marker']
exhibit_to_Click                    css                         div[id*='exh00${text}'] img
view_table_as_text_for_exhibit      css                         div[id*='exh00${text}'] p[class='alttable-ref']>a
enlarged_exhibit_modal_popup        css                         div[class$='MediaModalView'] div[class^='modal js-modal']
cross_buttons                       css                         button[class*='close-modal']
enlarged_table_modal_popup          css                         div#nonlinearContentModal .modal-content
table_div                           css                         .table
copyright                           xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Copyright']/ancestor::li
necessary_background                xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='II. The Necessary Background']/ancestor::li
salient_pricing_information         xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Exhibit 3 Salient Pricing Information']/ancestor::li
copyright_mobile                    xpath                       //div[contains(@class,'sidebar-toc')]//ul[@class='toc-menu']//span[text()='Copyright']/ancestor::li
list_toc_menu                       css                         div[class^='popover-wrapper'] ul.toc-menu  
parent_topics_in_TOC_desktop        xpath                       //div[@class='popover-wrapper']//li[@class='chapter-wrapper']
parent_topics_in_TOC_mobile         xpath                       //div[contains(@class,'sidebar-toc')]//li[@class='chapter-wrapper']
toc_items_desktop                   css                         div[class^='popover-wrapper'] ul.toc-menu li
navigation_bar                      css                         nav#hbpNavbar
toc_menu_popUp                      css                         .popover-wrapper
scrubber                            css                         .scrubber div[class='rangeslider__handle']
exhibit_title                       xpath                       //div[contains(@id,'exh00${text}')]/h1
view_table_as_text_iframe           css                         div[class$='table-modal'] iframe
first_Word_In_Table                 xpath                       ((//tr/td)[1]//word)[1]
google_search_box                   id                          lst-ib
dragging_scruber                    name                        q
back_button                         xpath                       //p[@class='alttable-backref']/a
pagebreak_element_for_Specific_Page xpath                       //p[@class='pagebreak' and @id='pbr-00${text}']
words_pagebreak_element             xpath                       //p[contains(@id,'pbr-00${text}')]/word
footer_div                          id                          hbpFooter
back_To_Previous_Link               css                         div[class*='footer-desktop'] div[class*='back-to-prev-page']>a
particular_frame_element            xpath                       //iframe[@id='chapter_${text}']
red_grey_spinner                    css                         div#fakeLoader div[class='fl spinner1']
header_nav_bar                      id                          hbpNavbar
bodyElement                         css                         body#HBPreader
backButton                          xpath                       //span[contains(@class,'js-back')]
hbPLoaderDiv                        xpath                       //div[@id='hbpLoader']/parent::*
kaltura_player_div                  xpath                       //div[@id='kaltura_player_1'] 
====================================================================================
@@ set text  
@objects
--------------------------------
copyright
      inside: list_toc_menu 14px left
necessary_background
      inside: list_toc_menu 14px left
salient_pricing_information
      inside: list_toc_menu 28px left

    