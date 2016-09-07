page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
spinner								xpath						.//*[@class='fl spinner1']
toc_icon							xpath						//ul[contains(@class,'menu-a navbar-menu')]//span[@class='hbp-icon hbp-icon-toc js-hbp-icon-toc']
exhibit1_link						xpath						//div[contains(@class,'js-toc-section')]//span[contains(text(),'Exhibit 1 Projected Market Volumes')]
particular_exhibit                  xpath                       //div[@class='popover-wrapper']//span[contains(text(),'Exhibit ${text}')]
exhibit_iframe						id							chapter_2
exhibit1_text						xpath						.//word[contains(text(),'Exhibit ')]
right_chevron_icon					xpath						.//*[@class='next hbp-next arrows-wrapper js-arrows-wrapper']
current_page1						css 					    .js-current-page
body_element                        xpath                       //body
top_Nav_Bar                         xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
toc_flyout_popUp_mobile             css                         div[class^='js-toc-section']
toc_flyout_popUp_mobile_active      xpath                       //div[contains(@class,'js-toc-section')]/ancestor::div/parent::div
toc_flyout_popUp_desktop            css                         div[class*='popover toc-popover']
current_pagenumber                  css                         footer div.pages span[class*='current']
toc_topic_to_nav_desktop            xpath                       //div[@class='popover-wrapper']//span[contains(text(),'${text}')]
toc_topic_to_nav_mobile             xpath                       //div[contains(@class,'js-toc-section')]//span[contains(text(),'${text}')]
nece_background_heading             xpath                       //h1[contains(@class,'hbp_reader__heading2')]
marketing_the_tronn_heading         xpath                       //h1[contains(@class,'hbp_reader__heading3')]
pageNum_Topic_In_TOC_desktop        xpath                       //div[@class='popover-wrapper']//span[text()='${text}']/following-sibling::span
pageNum_Topic_In_TOC_mobile         xpath                       //div[contains(@class,'js-toc-section')]//span[text()='${text}']/following-sibling::span
footnote_link                       xpath                       //span[@class='fn-ref-marker']//word[contains(text(),'[${text}]')]//ancestor::span
span_link_Of_footnote               xpath                       //word[text()='[${text}]']/ancestor::span[@class='fn-marker']
exhibit_to_Click                    css                         div[id*='exh00${text}'] img
view_table_as_text_for_exhibit      css                         div[id*='exh00${text}'] p[class='alttable-ref']>a
enlarged_exhibit_modal_popup        css                         div[class$='MediaModalView'] div[class^='modal js-modal']
cross_buttons                       css                         button[class*='close-modal']
necessary_background                xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='II. The Necessary Background']/ancestor::li
salient_pricing_information         xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Exhibit 3 Salient Pricing Information']/ancestor::li
Projected_market_volumes_by_segment xpath                       //div[contains(@class,'sidebar-toc')]//ul[@class='toc-menu']//span[contains(text(),'Exhibit 1 Projected Market Volumes by Segment')]/ancestor::li
Marketing_the_teronn                xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[contains(text(),'III. Marketing')]/ancestor::li
copyright                           xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[text()='Copyright']/ancestor::li
particular_topic_fromTOC            xpath                       //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[contains(text(),'${text}')]/ancestor::li
list_toc_menu                       css                         div[class^='popover-wrapper'] ul.toc-menu 
parent_topics_in_TOC_desktop        xpath                       //div[@class='popover-wrapper']//li[@class='chapter-wrapper']
parent_topics_in_TOC_mobile         xpath                       //div[contains(@class,'js-toc-section')]//li[@class='chapter-wrapper']
toc_items_desktop                   css                         div[class^='popover-wrapper'] ul.toc-menu li
particular_exhibit                  xpath                       //div[contains(@class,'js-toc-section')]//span[contains(text(),'Exhibit ${text}')]
toc_menu_popUp                      css                         .popover-wrapper
scrubber                            css                        .scrubber div[class='rangeslider__handle']
dragging_scruber                    xpath                       //div[@class='scrubber']//div[@class='rangeslider__handle']
exhibit_title                       xpath                       //div[contains(@id,'exh00${text}')]/h1
view_table_as_text_for_exhibit      css                         div[id*='exh00${text}'] p[class='alttable-ref']>a
back_button                         xpath                       //p[@class='alttable-backref']/a
view_table_as_text_iframe           css                         div[class$='table-modal'] iframe
first_Word_In_Table                 xpath                       ((//tr/td)[1]//word)[1]
google_search_box                   id                          lst-ib
dragging_scruber                    name                        q
table_div                           css                         .table
pagebreak_element_for_Specific_Page xpath                      //p[@class='pagebreak' and @id='pbr-00${text}']
words_pagebreak_element             xpath                      //p[contains(@id,'pbr-00${text}')]/word
footer_div                          id                          hbpFooter
back_To_Previous_Link               xpath                       //a[contains(@class,'js-back-to-prev-page')]
navigation_bar                      css                         nav#hbpNavbar
red_grey_spinner                    css                         div#fakeLoader div[class='fl spinner1']
bodyElement                         css                         body#HBPreader
backButton                          xpath                       //span[contains(@class,'js-back')]
hbPLoaderDiv                        xpath                       //div[@id='hbpLoader']/parent::* 
====================================================================================

@objects
--------------------------------
copyright
      inside: list_toc_menu 14px left
necessary_background
      inside: list_toc_menu 14px left
salient_pricing_information
      inside: list_toc_menu 28px left

    