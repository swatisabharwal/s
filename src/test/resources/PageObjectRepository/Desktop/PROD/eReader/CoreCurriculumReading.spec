page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
core_curriculum_heading_image          xpath             //section[@epub-type='cover']//img  
interac_img_div                        xpath             //div[@class='interactive-wrapper']//div[@class='r-interactive-image']
launch_interactive_button              xpath             //a[contains(@class,'interactive-launch-button')]
interactive_illustration1              xpath            //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[contains(text(),'${text}')]
interactive_wrapper                    xpath            //div[@class='interactive-wrapper']      
interactive_modal_popUp                xpath            //div[contains(@class,'interactive-modal')]/*      
new-tab-button                         css            div[class*='interactive-modal'] button[class*='js-new-tab']
instruction_container                  css              #instruction_container
interactive_close_button               css              div[class*='interactive-modal'] button[class*='js-close-modal']
interactive_modal_parent               xpath            //div[contains(@class,'interactive-modal')]/parent::*
modal_header                           xpath            //div[contains(@class,'interactive-modal')]//div[@class='modal-header']
video_header                           xpath            //div[contains(@id,'vid00${text}')]//h1
video_player                           xpath            //video[@id='pid_kaltura_player_1']
kaltura_player_div                     xpath            //div[@id='kaltura_player_1']
video_img_before_beg                   xpath            //div[@class='videoDisplay']//img
play_pause_button                      xpath            //button[contains(@class,'playPauseBtn')]
large_Play_Button                      css              .icon-play.comp.largePlayBtn.largePlayBtnBorder
watch_video_slider                     xpath            //div[contains(@class,'ui-slider-range-min watched')]
current_time_duration_video            xpath            //div[contains(@class,'currentTimeLabel')]
total_time_duratin_video               xpath            //div[contains(@class,'durationLabel')]
tool_tip_div                           xpath            //div[contains(@class,'ui-tooltip-content')]
mute_button                            xpath            //button[contains(@id,'muteBtn')]
volume_slider                          xpath            //div[contains(@class,'slider ui-slider ui-slider-horizontal')]
cc_icon								   xpath			//button[@class='btn icon-cc']
1x_icon								   xpath			.//button[@class='btn']
full_screen_icon					   xpath			.//button[contains(@class,'icon-expand')]
open_volume_bar						   xpath			.//div[@class='comp volumeControl display-medium horizontal open']
cc_options							   xpath			//ul[@class='dropdown-menu open']//li/a
active_cc_option					   xpath			//ul[@class='dropdown-menu open']//li[@class='active']/a
caption_in_video					   css				.captionContainer.block>.track>.ttmlStyled>span
body_element                           xpath             //body
exit_full_screen_icon					xpath			.//button[contains(@class,'icon-contract')]
parent_1x_icon							xpath			.//a[text()='1x']/parent::li
2x_icon									xpath			.//a[text()='2x']
video2_link								xpath			.//a[contains(@title,'youtube')]//span
slider									xpath			.//div[@role='slider']//a[contains(@class,'slider')]
parent_modal_backdrop					xpath			.//div[@class='modal-backdrop js-modal-backdrop in']
====================================================================================

@objects
--------------------------------
launch_interactive_button
      centered all inside: interac_img_div

@video_Objects
--------------------------------
current_time_duration_video:
      near: total_time_duration_video 13px left
      

@objects1
--------------------------------      
modal_header
    image: file interactive_modal_header.png      
