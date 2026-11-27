// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutShrinkRequest extends TeaModel {
    /**
     * <p>The annotation switch.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Annotation")
    public String annotation;

    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The background image.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<StartStreamingOutShrinkRequestBackgrounds> backgrounds;

    /**
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public StartStreamingOutShrinkRequestBgColor bgColor;

    /**
     * <p>The ID of an existing channel. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The global clock watermark.</p>
     */
    @NameInMap("ClockWidgets")
    public java.util.List<StartStreamingOutShrinkRequestClockWidgets> clockWidgets;

    /**
     * <p>The crop mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Crop the image while maintaining the aspect ratio.</li>
     * <li><strong>2</strong>: Maintain the aspect ratio and add borders (default).</li>
     * <li><strong>3</strong>: Stretch the image to fill the pane.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    /**
     * <p>The global image watermark.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Images")
    public java.util.List<StartStreamingOutShrinkRequestImages> images;

    /**
     * <p>The specified user list for layout generation, including Blacklist/Whitelist.</p>
     * <p>Whitelist: specifies the users whose video streams are subscribed to in the channel.</p>
     * <ul>
     * <li>After the settings are applied, automatic padding is performed in sequence based on this list.</li>
     * <li>When switching between multiple layouts in a template, only users in the whitelist are considered.</li>
     * </ul>
     * <p>Blacklist: specifies the users whose video streams are not subscribed to in the channel.</p>
     * <ul>
     * <li>When switching between multiple layouts in a template, only users not in the blacklist are considered.</li>
     * </ul>
     */
    @NameInMap("LayoutSpecifiedUsers")
    public String layoutSpecifiedUsersShrink;

    /**
     * <p>The pane settings.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartStreamingOutShrinkRequestPanes> panes;

    /**
     * <p>The global pane background color.</p>
     */
    @NameInMap("RegionColor")
    public StartStreamingOutShrinkRequestRegionColor regionColor;

    /**
     * <p>Specifies whether to reserve a pane placeholder for users who do not push camera streams. Default value: true. A value of true indicates that a pane is reserved when a user does not push a camera stream. A value of false indicates that no pane is reserved.</p>
     */
    @NameInMap("ReservePaneForNoCameraUser")
    public Boolean reservePaneForNoCameraUser;

    /**
     * <p>Specifies whether to display the default background image of a pane when the user is muted. Valid values:</p>
     * <ul>
     * <li>true: Displays the default background image (default).</li>
     * <li>false: Does not display the default background image, but the configured local pane background image is still displayed.</li>
     * </ul>
     */
    @NameInMap("ShowDefaultBackgroundOnMute")
    public Boolean showDefaultBackgroundOnMute;

    /**
     * <p>The list of specified users for audio mixing.</p>
     */
    @NameInMap("SpecMixedUserList")
    public java.util.List<String> specMixedUserList;

    /**
     * <p>Specifies whether to allow starting the task when the channel does not exist. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No (default).</li>
     * </ul>
     */
    @NameInMap("StartWithoutChannel")
    public Boolean startWithoutChannel;

    /**
     * <p>The wait time for the task when the channel is not started, in seconds. This parameter is valid only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
     * <p>Specifies whether to subscribe to high resolution streams. Valid values:</p>
     * <ul>
     * <li>false: Subscribes to streams of different resolutions based on the pane area (default).</li>
     * <li>true: Uses the highest resolution stream pushed by the client for padding by default.</li>
     * </ul>
     */
    @NameInMap("SubHighResolutionStream")
    public Boolean subHighResolutionStream;

    /**
     * <p>The task ID of the bypass streaming task. Only a single ID is supported. The ID can contain uppercase and lowercase letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length. If you do not specify this parameter, the system automatically generates a task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The global text watermark.</p>
     */
    @NameInMap("Texts")
    public java.util.List<StartStreamingOutShrinkRequestTexts> texts;

    /**
     * <p>The live stream ingest URL. Only a single URL is supported. This URL cannot be used by multiple tasks at the same time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("Url")
    public String url;

    public static StartStreamingOutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartStreamingOutShrinkRequest self = new StartStreamingOutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartStreamingOutShrinkRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public StartStreamingOutShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartStreamingOutShrinkRequest setBackgrounds(java.util.List<StartStreamingOutShrinkRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartStreamingOutShrinkRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartStreamingOutShrinkRequest setBgColor(StartStreamingOutShrinkRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartStreamingOutShrinkRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartStreamingOutShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartStreamingOutShrinkRequest setClockWidgets(java.util.List<StartStreamingOutShrinkRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartStreamingOutShrinkRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartStreamingOutShrinkRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartStreamingOutShrinkRequest setImages(java.util.List<StartStreamingOutShrinkRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<StartStreamingOutShrinkRequestImages> getImages() {
        return this.images;
    }

    public StartStreamingOutShrinkRequest setLayoutSpecifiedUsersShrink(String layoutSpecifiedUsersShrink) {
        this.layoutSpecifiedUsersShrink = layoutSpecifiedUsersShrink;
        return this;
    }
    public String getLayoutSpecifiedUsersShrink() {
        return this.layoutSpecifiedUsersShrink;
    }

    public StartStreamingOutShrinkRequest setPanes(java.util.List<StartStreamingOutShrinkRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartStreamingOutShrinkRequestPanes> getPanes() {
        return this.panes;
    }

    public StartStreamingOutShrinkRequest setRegionColor(StartStreamingOutShrinkRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartStreamingOutShrinkRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartStreamingOutShrinkRequest setReservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
        this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
        return this;
    }
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    public StartStreamingOutShrinkRequest setShowDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
        this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
        return this;
    }
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    public StartStreamingOutShrinkRequest setSpecMixedUserList(java.util.List<String> specMixedUserList) {
        this.specMixedUserList = specMixedUserList;
        return this;
    }
    public java.util.List<String> getSpecMixedUserList() {
        return this.specMixedUserList;
    }

    public StartStreamingOutShrinkRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartStreamingOutShrinkRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartStreamingOutShrinkRequest setSubHighResolutionStream(Boolean subHighResolutionStream) {
        this.subHighResolutionStream = subHighResolutionStream;
        return this;
    }
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    public StartStreamingOutShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartStreamingOutShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartStreamingOutShrinkRequest setTexts(java.util.List<StartStreamingOutShrinkRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<StartStreamingOutShrinkRequestTexts> getTexts() {
        return this.texts;
    }

    public StartStreamingOutShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class StartStreamingOutShrinkRequestBackgrounds extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
         * <li><strong>3</strong>: Stretch to fill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BackgroundCropMode")
        public Integer backgroundCropMode;

        /**
         * <p>The height.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The image URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123.jpg">https://aliyun.com/123.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestBackgrounds self = new StartStreamingOutShrinkRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public StartStreamingOutShrinkRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutShrinkRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutShrinkRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutShrinkRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutShrinkRequestBgColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestBgColor self = new StartStreamingOutShrinkRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestClockWidgetsBoxColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestClockWidgetsBoxColor self = new StartStreamingOutShrinkRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestClockWidgetsFontColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestClockWidgetsFontColor self = new StartStreamingOutShrinkRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestClockWidgets extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle box.</p>
         */
        @NameInMap("BoxColor")
        public StartStreamingOutShrinkRequestClockWidgetsBoxColor boxColor;

        /**
         * <p>The font. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
         * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
         * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
         * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
         * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
         * <li><strong>5</strong>: Alimama ShuHeiTi</li>
         * <li><strong>6</strong>: DingTalk JinBuTi</li>
         * <li><strong>7</strong>: Alimama DaoLiTi</li>
         * <li><strong>8</strong>: Alimama DongFangDaKai</li>
         * <li><strong>9</strong>: Alimama FangYuanTi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>The font color.</p>
         */
        @NameInMap("FontColor")
        public StartStreamingOutShrinkRequestClockWidgetsFontColor fontColor;

        /**
         * <p>The font size of the clock.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether a rectangle box is required.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Zone")
        public Integer zone;

        public static StartStreamingOutShrinkRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestClockWidgets self = new StartStreamingOutShrinkRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutShrinkRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutShrinkRequestClockWidgets setBoxColor(StartStreamingOutShrinkRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutShrinkRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutShrinkRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutShrinkRequestClockWidgets setFontColor(StartStreamingOutShrinkRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutShrinkRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutShrinkRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutShrinkRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutShrinkRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public StartStreamingOutShrinkRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class StartStreamingOutShrinkRequestImages extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The height.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
         * <li><strong>3</strong>: Stretch to fill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageCropMode")
        public Integer imageCropMode;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The image URL. The image content cannot be updated during stream ingest.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xxx.jpg">https://aliyun.com/123xxx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestImages build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestImages self = new StartStreamingOutShrinkRequestImages();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutShrinkRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public StartStreamingOutShrinkRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutShrinkRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutShrinkRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesBackgrounds extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The display condition. Valid values:</p>
         * <ul>
         * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: Displayed when the current user does not have a video stream.</li>
         * <li>always: Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The height.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
         * <li><strong>3</strong>: Stretch to fill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneBackgroundCropMode")
        public Integer paneBackgroundCropMode;

        /**
         * <p>The image URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesBackgrounds self = new StartStreamingOutShrinkRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesImages extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The condition for displaying the watermark. Valid values:</p>
         * <ul>
         * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: Displayed when the current user does not have a video stream.</li>
         * <li>always: Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The height.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
         * <li><strong>3</strong>: Stretch to fill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneImageCropMode")
        public Integer paneImageCropMode;

        /**
         * <p>The corresponding image content cannot be updated while streaming.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xxx.jpg">https://aliyun.com/123xxx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesImages self = new StartStreamingOutShrinkRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutShrinkRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutShrinkRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public StartStreamingOutShrinkRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutShrinkRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutShrinkRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesTextsBoxColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesTextsBoxColor self = new StartStreamingOutShrinkRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesTextsFontColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesTextsFontColor self = new StartStreamingOutShrinkRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesTexts extends TeaModel {
        /**
         * <p>The watermark transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle box.</p>
         */
        @NameInMap("BoxColor")
        public StartStreamingOutShrinkRequestPanesTextsBoxColor boxColor;

        /**
         * <p>The condition for displaying the watermark. Valid values:</p>
         * <ul>
         * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: Displayed when the current user does not have a video stream.</li>
         * <li>always: Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The font. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
         * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
         * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
         * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
         * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
         * <li><strong>5</strong>: Alimama ShuHeiTi</li>
         * <li><strong>6</strong>: DingTalk JinBuTi</li>
         * <li><strong>7</strong>: Alimama DaoLiTi</li>
         * <li><strong>8</strong>: Alimama DongFangDaKai</li>
         * <li><strong>9</strong>: Alimama FangYuanTi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>The font color.</p>
         */
        @NameInMap("FontColor")
        public StartStreamingOutShrinkRequestPanesTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether a rectangle box is required.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The watermark content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Text watermark</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesTexts self = new StartStreamingOutShrinkRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutShrinkRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutShrinkRequestPanesTexts setBoxColor(StartStreamingOutShrinkRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutShrinkRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutShrinkRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutShrinkRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutShrinkRequestPanesTexts setFontColor(StartStreamingOutShrinkRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutShrinkRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutShrinkRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutShrinkRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutShrinkRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartStreamingOutShrinkRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutShrinkRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The whiteboard ID. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static StartStreamingOutShrinkRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanesWhiteboard self = new StartStreamingOutShrinkRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class StartStreamingOutShrinkRequestPanes extends TeaModel {
        /**
         * <p>The local background images.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<StartStreamingOutShrinkRequestPanesBackgrounds> backgrounds;

        /**
         * <p>The local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartStreamingOutShrinkRequestPanesImages> images;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crop while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintain the aspect ratio and add borders.</li>
         * <li><strong>3</strong>: Stretch to fill.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>The pane ID. The value starts from 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public String paneId;

        /**
         * <p>Specifies whether to reserve the pane for users who have not joined the meeting.
         * Default value: true. This value indicates that when the specific user or wildcard user specified for the grid is offline, the pane is forcibly reserved.
         * A value of false indicates that when the specific user or wildcard user specified for the grid is offline, video streams are displayed based on the automatic fill order.</p>
         */
        @NameInMap("ReservePaneForOfflineUser")
        public Boolean reservePaneForOfflineUser;

        /**
         * <p>The media source of the pane. You can specify a userId. To specify a specific user type, you can use wildcard configurations. The following types are supported:</p>
         * <ul>
         * <li><strong>$ActiveSpeaker</strong>: The current speaker in the channel.</li>
         * <li><strong>$ScreenShare</strong>: The user who is sharing their screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The media type of the pane. Valid values:</p>
         * <ul>
         * <li><strong>video</strong>: The user camera or screen sharing stream. This is the default value.</li>
         * <li><strong>camera</strong>: The camera stream.</li>
         * <li><strong>screen</strong>: The screen sharing stream.</li>
         * <li><strong>whiteboard</strong>: The whiteboard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The local text watermarks for the pane.</p>
         */
        @NameInMap("Texts")
        public java.util.List<StartStreamingOutShrinkRequestPanesTexts> texts;

        /**
         * <p>The fill order when SourceType is set to video. Valid values:</p>
         * <ul>
         * <li>screenFirst: Screen sharing takes precedence. This is the default value.</li>
         * <li>cameraFirst: The camera takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cameraFirst</p>
         */
        @NameInMap("VideoOrder")
        public String videoOrder;

        /**
         * <p>The whiteboard configurations.</p>
         */
        @NameInMap("Whiteboard")
        public StartStreamingOutShrinkRequestPanesWhiteboard whiteboard;

        public static StartStreamingOutShrinkRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestPanes self = new StartStreamingOutShrinkRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestPanes setBackgrounds(java.util.List<StartStreamingOutShrinkRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<StartStreamingOutShrinkRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public StartStreamingOutShrinkRequestPanes setImages(java.util.List<StartStreamingOutShrinkRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartStreamingOutShrinkRequestPanesImages> getImages() {
            return this.images;
        }

        public StartStreamingOutShrinkRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public StartStreamingOutShrinkRequestPanes setPaneId(String paneId) {
            this.paneId = paneId;
            return this;
        }
        public String getPaneId() {
            return this.paneId;
        }

        public StartStreamingOutShrinkRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public StartStreamingOutShrinkRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartStreamingOutShrinkRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartStreamingOutShrinkRequestPanes setTexts(java.util.List<StartStreamingOutShrinkRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartStreamingOutShrinkRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public StartStreamingOutShrinkRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public StartStreamingOutShrinkRequestPanes setWhiteboard(StartStreamingOutShrinkRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public StartStreamingOutShrinkRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class StartStreamingOutShrinkRequestRegionColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestRegionColor self = new StartStreamingOutShrinkRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestTextsBoxColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestTextsBoxColor self = new StartStreamingOutShrinkRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestTextsFontColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartStreamingOutShrinkRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestTextsFontColor self = new StartStreamingOutShrinkRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutShrinkRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutShrinkRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutShrinkRequestTexts extends TeaModel {
        /**
         * <p>The watermark transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle box.</p>
         */
        @NameInMap("BoxColor")
        public StartStreamingOutShrinkRequestTextsBoxColor boxColor;

        /**
         * <p>The font. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba PuHuiTi Regular</li>
         * <li><strong>1</strong>: Alibaba PuHuiTi Light</li>
         * <li><strong>2</strong>: Alibaba PuHuiTi Medium</li>
         * <li><strong>3</strong>: Alibaba PuHuiTi Bold</li>
         * <li><strong>4</strong>: Alibaba PuHuiTi Heavy</li>
         * <li><strong>5</strong>: Alimama ShuHeiTi</li>
         * <li><strong>6</strong>: DingTalk JinBuTi</li>
         * <li><strong>7</strong>: Alimama DaoLiTi</li>
         * <li><strong>8</strong>: Alimama DongFangDaKai</li>
         * <li><strong>9</strong>: Alimama FangYuanTi</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>The font color.</p>
         */
        @NameInMap("FontColor")
        public StartStreamingOutShrinkRequestTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether a rectangle box is required.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The watermark content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Text watermark</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>The x-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartStreamingOutShrinkRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutShrinkRequestTexts self = new StartStreamingOutShrinkRequestTexts();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutShrinkRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutShrinkRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutShrinkRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutShrinkRequestTexts setBoxColor(StartStreamingOutShrinkRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutShrinkRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutShrinkRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutShrinkRequestTexts setFontColor(StartStreamingOutShrinkRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutShrinkRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutShrinkRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutShrinkRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutShrinkRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutShrinkRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartStreamingOutShrinkRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutShrinkRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
