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
left_chevron_icon                   xpath                       .//*[@class='next hbp-previous arrows-wrapper js-arrows-wrapper']
current_page1						css 					    div[class*='footer-desktop'] .js-current-page
body_element                        xpath                       //body
top_Nav_Bar                         xpath                       //nav[@id='hbpNavbar']//div[@class='navbar-container']
toc_flyout_popUp_mobile             css                         div[class^='js-toc-section']
toc_flyout_popUp_mobile_active      xpath                       //div[contains(@class,'js-toc-section')]/ancestor::div/parent::div
toc_flyout_popUp_desktop            css                         div[class*='popover toc-popover']
current_pagenumber               	css                         footer div[class*='footer-reading-mode'] span[class*='current-page']
toc_topic_to_nav_desktop            xpath                       //div[@class='popover-wrapper']//span[contains(text(),'${text}')]
toc_topic_to_nav_mobile             xpath                       //div[contains(@class,'js-toc-section')]//span[contains(text(),'${text}')]
nece_background_heading             xpath                       //h1[contains(@class,'hbp_reader__heading2')]
marketing_the_tronn_heading         xpath                       //h1[contains(@class,'hbp_reader__heading3')]
pageNum_Topic_In_TOC_desktop        xpath                       (//div[@class='popover-wrapper']//li[contains(@class,'chapter-wrapper ')][${text}])//span[contains(@class,'page-number')]
pageNum_Topic_In_TOC_mobile         xpath                       (//div[@class='popover-wrapper']//li[contains(@class,'chapter-wrapper ')][${text}])//span[contains(@class,'page-number')]
footnote_link                       xpath                       //sup/a/word[contains(text(),'${text}')]
span_link_Of_footnote               xpath                        //word[contains(text(),'${text}')]/ancestor::span
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
scrubber                            css                        div[class*='footer-mobile'] .scrubber div[class='rangeslider__handle']
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
back_To_Previous_Link               css                         div[class*='footer-mobile'] div[class*='js-back']>a
navigation_bar                      css                         nav#hbpNavbar
red_grey_spinner                    css                         div#fakeLoader div[class='fl spinner1']
bodyElement                         css                         body#HBPreader
backButton                          xpath                       //div[contains(@class,'js-back span-back')]
hbPLoaderDiv                        xpath                       //div[@id='hbpLoader']/parent::* 
kaltura_player_div                  xpath                       //div[@id='kaltura_player_1'] 
back_To_Previous_Reading_Mode		xpath						.//div[@class='footer-base footer-reading-mode']//a[@class='btn-back js-back-label']
scrubber_bar                        xpath                        (.//div[@class='rangeslider rangeslider--horizontal'])[2]
chapters_In_TOC                     css                       	div[class*='popover toc-popover'] li[class^='chapter-wrapper']
particular_chapters_In_TOC          css                       	div[class*='popover toc-popover'] li[class^='chapter-wrapper']:nth-of-type(${text})
footnotes_topic_From_TOC            xpath                       //div[contains(@class,'popover toc-popover')]//span[contains(text(),'Endnotes')]
page_num_Of_a_Topic_In_TOC          xpath                       //div[contains(@class,'popover toc-popover')]//span[contains(text(),'${text}')]/following-sibling::span
footnoteLink_aTag					xpath                       //a[contains(@data-original-href,'chn${text}')]
footnoteLink_In_Footnotes_Section   xpath                       //word[text()='$']/parent::a[contains(@data-original-href,'chn$')]
subchapter_TOC_Spans                xpath                       (//div[@class='popover-wrapper']//li[@class='subchapter-wrapper'])[${text}]//span
subchapters_TOC                     xpath                       //div[@class='popover-wrapper']//li[@class='subchapter-wrapper']
<<<<<<< HEAD
particular_subchapter_more_margin   xpath                       (//div[@class='popover-wrapper']//li[@class='subchapter-wrapper'])[4]
=======
particular_subchapter_more_margin   xpath                       (//div[@class='popover-wrapper']//li[@class='subchapter-wrapper'])[6]
>>>>>>> 745e4fc0f1529382b857c58bba83ed3ab4386143
particular_subchapter_less_margin   xpath                       (//div[@class='popover-wrapper']//li[@class='subchapter-wrapper'])[1]
exhibit_img							xpath						.//img[contains(@title,'EXHIBIT ${text}')]
iframes_list						xpath						.//iframe[contains(@id,'chapter_')]
exhibit_Modal_Window				xpath						.//*[@class='js-title' and contains(text(),'EXHIBIT ${text}')]/ancestor::div//div[@class='modal-content']
exhibit_Modal_Parent				xpath						.//*[@class='js-title' and contains(text(),'EXHIBIT ${text}')]/ancestor::div/div
exhibit_close_button				xpath						.//*[@class='js-title' and contains(text(),'EXHIBIT ${text}')]/ancestor::div//button[@title='Close modal']
exhibit_new_tab_button				xpath						.//*[@class='js-title' and contains(text(),'EXHIBIT ${text}')]/ancestor::div//button[@title='Open in a new tab']
exhibit_img_src						xpath						.//img[contains(@src,'${text}.png')]
toc_item_titles_span			    xpath						(//div[contains(@class,'label-wrapper')]/span[not(contains(@class,'icon')) and not(contains(@class,'pageNumber'))])
interac_img_div                     xpath                       //div[@class='interactive-wrapper']//div[@class='r-interactive-image']
particular_illusration_figure       xpath                       //figure[contains(@r-ref-target,'${text}')]
img_exhibit        					xpath      					.//img
====================================================================================

@objects
--------------------------------
particular_subchapter_more_margin
      inside: list_toc_menu 28px left
particular_subchapter_less_margin
      inside: list_toc_menu 14px left

@scrubber_bar_Objects
--------------------------------
back_To_Previous_Link :
      below: scrubber_bar
      
@page_number_scrubber_bar_Objects
--------------------------------
current_pagenumber :
      below: scrubber_bar 
