page title: Harvard Business Publishing Reader

#Object Definitions
====================================================================================
spinner									xpath						.//*[@class='fl spinner1']
search_text_icon						xpath						//ul[@class='menu-b navbar-menu']//span[@class='hbp-icon hbp-icon-search']
active_search							xpath						.//li[@class='navbar-search active']
search_field							classname					search-publication
search_results_list						classname					result
search_page_no_list						xpath						//div[contains(@class,'sidebar-search active')]//*[contains(@class,'bind-pageNumber')]
search_frame							id							chapter_0
search_text_result						classname					search-highlight
top_Nav_Bar                             xpath                       //nav//div[contains(@class,'navbar-wrapper')]
sideBar_search                          xpath                       //div[@class='sidebar']/div[contains(@class,'sidebar-search')]
search_results_text                     xpath                       //div[contains(@class,'sidebar-search')]//p[contains(text(),'Results')]
search_header_text                      css                         div[class*='sidebar-search '] div.search-header>p
search_results                          css                         .sidebar-search-results>*
cross_Icon                              css                         span.input-btn-clear span
header_nav_bar                          id                          hbpNavbar
divs_under_search_body                  xpath                       //div[@class='search-body']//div
particular_frame_element                xpath                       //iframe[@id='chapter_${text}']
====================================================================================