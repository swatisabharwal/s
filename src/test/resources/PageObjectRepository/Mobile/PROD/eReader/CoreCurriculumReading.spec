page title:Harvard Business Publishing Reader

#Object Definitions
====================================================================================
core_curriculum_heading_image          xpath             //section[@epub-type='cover']//img  
interac_img_div                        xpath             //div[@class='interactive-wrapper']//div[@class='r-interactive-image']
launch_interactive_button              xpath             //a[contains(@class,'interactive-launch-button')]
interactive_illustration1              xpath            //div[@class='popover-wrapper']//ul[@class='toc-menu']//span[contains(text(),'${text}')]
interactive_wrapper                    xpath            //div[@class='interactive-wrapper']            
====================================================================================

@objects
--------------------------------
launch_interactive_button
      centered all inside: interac_img_div
