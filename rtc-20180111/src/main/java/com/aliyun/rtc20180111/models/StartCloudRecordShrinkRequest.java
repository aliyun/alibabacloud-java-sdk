// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudRecordShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the annotation feature.</p>
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
     * <p>The local background images for the pane.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<StartCloudRecordShrinkRequestBackgrounds> backgrounds;

    /**
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public StartCloudRecordShrinkRequestBgColor bgColor;

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
    public java.util.List<StartCloudRecordShrinkRequestClockWidgets> clockWidgets;

    /**
     * <p>The crop mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Crops the video while keeping the aspect ratio.</li>
     * <li><strong>2</strong>: Keeps the aspect ratio and adds padding (default).</li>
     * <li><strong>3</strong>: Stretches the video to fill the pane.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    /**
     * <p>The global image watermarks.</p>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Images")
    public java.util.List<StartCloudRecordShrinkRequestImages> images;

    /**
     * <p>The specified user list for layout generation, which includes Blacklist/Whitelist.</p>
     * <p>Whitelist: specifies the users whose video streams are subscribed to in the room.</p>
     * <ul>
     * <li>After the settings are applied, padding is automatically performed in sequence based on this list.</li>
     * <li>When switching between multiple layouts in a template, only users in the whitelist are calculated.</li>
     * </ul>
     * <p>Blacklist: specifies the users whose video streams are not subscribed to in the room.</p>
     * <ul>
     * <li>When switching between multiple layouts in a template, only users not in the blacklist are calculated.</li>
     * </ul>
     */
    @NameInMap("LayoutSpecifiedUsers")
    public String layoutSpecifiedUsersShrink;

    /**
     * <p>The pane settings. You can configure up to 16 panes.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartCloudRecordShrinkRequestPanes> panes;

    /**
     * <p>The recording mode. Valid values:</p>
     * <ul>
     * <li>0: Mixed-stream recording. This is the default value.</li>
     * <li>1: Single-stream recording. Single-stream recording does not support updates.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecordMode")
    public Integer recordMode;

    /**
     * <p>The global frame background color.</p>
     */
    @NameInMap("RegionColor")
    public StartCloudRecordShrinkRequestRegionColor regionColor;

    /**
     * <p>Specifies whether to reserve a pane for a user who does not publish a camera stream. Default value: true. A value of true indicates that a pane is reserved. A value of false indicates that no pane is reserved.</p>
     */
    @NameInMap("ReservePaneForNoCameraUser")
    public Boolean reservePaneForNoCameraUser;

    /**
     * <p>Specifies whether to display the default background image of the pane when the user is muted. Valid values:</p>
     * <ul>
     * <li>true: Displays the default background image (default).</li>
     * <li>false: Does not display the default background image. The custom background image of the pane is still displayed.</li>
     * </ul>
     */
    @NameInMap("ShowDefaultBackgroundOnMute")
    public Boolean showDefaultBackgroundOnMute;

    /**
     * <p>The parameters for single-stream recording.</p>
     */
    @NameInMap("SingleStreamingRecord")
    public String singleStreamingRecordShrink;

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
     * <p>The wait time for the task when the channel is not started, in seconds. This parameter takes effect only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
     * <p>The storage configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("StorageConfig")
    public StartCloudRecordShrinkRequestStorageConfig storageConfig;

    /**
     * <p>Specifies whether to subscribe to high-resolution streams. Valid values:</p>
     * <ul>
     * <li>false: Subscribes to streams of different resolutions based on the pane area (default).</li>
     * <li>true: Uses the highest resolution stream published by the client as padding.</li>
     * </ul>
     */
    @NameInMap("SubHighResolutionStream")
    public Boolean subHighResolutionStream;

    /**
     * <p>The task ID of the cloud recording task. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
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
     * <p>The global text watermarks.</p>
     */
    @NameInMap("Texts")
    public java.util.List<StartCloudRecordShrinkRequestTexts> texts;

    public static StartCloudRecordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordShrinkRequest self = new StartCloudRecordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordShrinkRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public StartCloudRecordShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudRecordShrinkRequest setBackgrounds(java.util.List<StartCloudRecordShrinkRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartCloudRecordShrinkRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartCloudRecordShrinkRequest setBgColor(StartCloudRecordShrinkRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartCloudRecordShrinkRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartCloudRecordShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudRecordShrinkRequest setClockWidgets(java.util.List<StartCloudRecordShrinkRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartCloudRecordShrinkRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartCloudRecordShrinkRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartCloudRecordShrinkRequest setImages(java.util.List<StartCloudRecordShrinkRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<StartCloudRecordShrinkRequestImages> getImages() {
        return this.images;
    }

    public StartCloudRecordShrinkRequest setLayoutSpecifiedUsersShrink(String layoutSpecifiedUsersShrink) {
        this.layoutSpecifiedUsersShrink = layoutSpecifiedUsersShrink;
        return this;
    }
    public String getLayoutSpecifiedUsersShrink() {
        return this.layoutSpecifiedUsersShrink;
    }

    public StartCloudRecordShrinkRequest setPanes(java.util.List<StartCloudRecordShrinkRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartCloudRecordShrinkRequestPanes> getPanes() {
        return this.panes;
    }

    public StartCloudRecordShrinkRequest setRecordMode(Integer recordMode) {
        this.recordMode = recordMode;
        return this;
    }
    public Integer getRecordMode() {
        return this.recordMode;
    }

    public StartCloudRecordShrinkRequest setRegionColor(StartCloudRecordShrinkRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartCloudRecordShrinkRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartCloudRecordShrinkRequest setReservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
        this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
        return this;
    }
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    public StartCloudRecordShrinkRequest setShowDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
        this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
        return this;
    }
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    public StartCloudRecordShrinkRequest setSingleStreamingRecordShrink(String singleStreamingRecordShrink) {
        this.singleStreamingRecordShrink = singleStreamingRecordShrink;
        return this;
    }
    public String getSingleStreamingRecordShrink() {
        return this.singleStreamingRecordShrink;
    }

    public StartCloudRecordShrinkRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartCloudRecordShrinkRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartCloudRecordShrinkRequest setStorageConfig(StartCloudRecordShrinkRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudRecordShrinkRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudRecordShrinkRequest setSubHighResolutionStream(Boolean subHighResolutionStream) {
        this.subHighResolutionStream = subHighResolutionStream;
        return this;
    }
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    public StartCloudRecordShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudRecordShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartCloudRecordShrinkRequest setTexts(java.util.List<StartCloudRecordShrinkRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<StartCloudRecordShrinkRequestTexts> getTexts() {
        return this.texts;
    }

    public static class StartCloudRecordShrinkRequestBackgrounds extends TeaModel {
        /**
         * <p>The transparency of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
         * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
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
         * <p>The URL of the image.</p>
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

        public static StartCloudRecordShrinkRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestBackgrounds self = new StartCloudRecordShrinkRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public StartCloudRecordShrinkRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordShrinkRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordShrinkRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordShrinkRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordShrinkRequestBgColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestBgColor self = new StartCloudRecordShrinkRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestClockWidgetsBoxColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestClockWidgetsBoxColor self = new StartCloudRecordShrinkRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestClockWidgetsFontColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestClockWidgetsFontColor self = new StartCloudRecordShrinkRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestClockWidgets extends TeaModel {
        /**
         * <p>The transparency of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public StartCloudRecordShrinkRequestClockWidgetsBoxColor boxColor;

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
        public StartCloudRecordShrinkRequestClockWidgetsFontColor fontColor;

        /**
         * <p>The font size of the clock.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display a text box.</p>
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

        public static StartCloudRecordShrinkRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestClockWidgets self = new StartCloudRecordShrinkRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordShrinkRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordShrinkRequestClockWidgets setBoxColor(StartCloudRecordShrinkRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordShrinkRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordShrinkRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordShrinkRequestClockWidgets setFontColor(StartCloudRecordShrinkRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordShrinkRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordShrinkRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordShrinkRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordShrinkRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public StartCloudRecordShrinkRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class StartCloudRecordShrinkRequestImages extends TeaModel {
        /**
         * <p>The transparency of the image.</p>
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
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
         * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
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
         * <p>0.3</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartCloudRecordShrinkRequestImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestImages self = new StartCloudRecordShrinkRequestImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordShrinkRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public StartCloudRecordShrinkRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordShrinkRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordShrinkRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesBackgrounds extends TeaModel {
        /**
         * <p>The transparency of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The condition for displaying the background image. Valid values:</p>
         * <ul>
         * <li>streamOnly: The background image is displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: The background image is displayed when the current user does not have a video stream.</li>
         * <li>always: The background image is always displayed.</li>
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
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
         * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneBackgroundCropMode")
        public Integer paneBackgroundCropMode;

        /**
         * <p>The URL of the image.</p>
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

        public static StartCloudRecordShrinkRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesBackgrounds self = new StartCloudRecordShrinkRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesImages extends TeaModel {
        /**
         * <p>The transparency of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The condition for displaying the watermark. Valid values:</p>
         * <ul>
         * <li>streamOnly: The watermark is displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: The watermark is displayed when the current user does not have a video stream.</li>
         * <li>always: The watermark is always displayed.</li>
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
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
         * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneImageCropMode")
        public Integer paneImageCropMode;

        /**
         * <p>The URL of the image. The image content cannot be updated during stream ingest.</p>
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

        public static StartCloudRecordShrinkRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesImages self = new StartCloudRecordShrinkRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordShrinkRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordShrinkRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public StartCloudRecordShrinkRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordShrinkRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordShrinkRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesTextsBoxColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesTextsBoxColor self = new StartCloudRecordShrinkRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesTextsFontColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesTextsFontColor self = new StartCloudRecordShrinkRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesTexts extends TeaModel {
        /**
         * <p>The transparency of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public StartCloudRecordShrinkRequestPanesTextsBoxColor boxColor;

        /**
         * <p>The condition for displaying the watermark. Valid values:</p>
         * <ul>
         * <li>streamOnly: The watermark is displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: The watermark is displayed when the current user does not have a video stream.</li>
         * <li>always: The watermark is always displayed.</li>
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
        public StartCloudRecordShrinkRequestPanesTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display a text box.</p>
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
         * <p>The content of the watermark.</p>
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

        public static StartCloudRecordShrinkRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesTexts self = new StartCloudRecordShrinkRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordShrinkRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordShrinkRequestPanesTexts setBoxColor(StartCloudRecordShrinkRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordShrinkRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordShrinkRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordShrinkRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordShrinkRequestPanesTexts setFontColor(StartCloudRecordShrinkRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordShrinkRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordShrinkRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordShrinkRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordShrinkRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordShrinkRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordShrinkRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The ID of the whiteboard. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static StartCloudRecordShrinkRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanesWhiteboard self = new StartCloudRecordShrinkRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class StartCloudRecordShrinkRequestPanes extends TeaModel {
        /**
         * <p>The local background images for the pane.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<StartCloudRecordShrinkRequestPanesBackgrounds> backgrounds;

        /**
         * <p>The local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartCloudRecordShrinkRequestPanesImages> images;

        /**
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds borders.</li>
         * <li><strong>3</strong>: Stretches the image to fill the pane.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>The ID of the pane. The value starts from 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>Specifies whether to reserve the pane as a placeholder for users who have not joined the meeting.
         * Default value: true. A value of true indicates that if the specific user or wildcard user specified for the pane is offline, the pane is forcibly reserved as a placeholder. A value of false indicates that if the specific user or wildcard user specified for the pane is offline, video streams are displayed based on the automatic fill order.</p>
         */
        @NameInMap("ReservePaneForOfflineUser")
        public Boolean reservePaneForOfflineUser;

        /**
         * <p>The media source of the pane. You can specify a user ID. To specify a specific user type, you can use wildcard configurations. The following wildcard types are supported:</p>
         * <ul>
         * <li><strong>$ActiveSpeaker</strong>: the current speaker in the channel.</li>
         * <li><strong>$ScreenShare</strong>: the user who is sharing the screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
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
        public java.util.List<StartCloudRecordShrinkRequestPanesTexts> texts;

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
        public StartCloudRecordShrinkRequestPanesWhiteboard whiteboard;

        public static StartCloudRecordShrinkRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestPanes self = new StartCloudRecordShrinkRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestPanes setBackgrounds(java.util.List<StartCloudRecordShrinkRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<StartCloudRecordShrinkRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public StartCloudRecordShrinkRequestPanes setImages(java.util.List<StartCloudRecordShrinkRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartCloudRecordShrinkRequestPanesImages> getImages() {
            return this.images;
        }

        public StartCloudRecordShrinkRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public StartCloudRecordShrinkRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartCloudRecordShrinkRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public StartCloudRecordShrinkRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartCloudRecordShrinkRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartCloudRecordShrinkRequestPanes setTexts(java.util.List<StartCloudRecordShrinkRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartCloudRecordShrinkRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public StartCloudRecordShrinkRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public StartCloudRecordShrinkRequestPanes setWhiteboard(StartCloudRecordShrinkRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public StartCloudRecordShrinkRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class StartCloudRecordShrinkRequestRegionColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestRegionColor self = new StartCloudRecordShrinkRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestStorageConfig extends TeaModel {
        /**
         * <p>The AccessKey. Make sure that the RAM user associated with the AccessKey pair is granted the <strong>write</strong> permissions on the object storage service of the corresponding cloud provider. Otherwise, the result files fail to be written.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAX***</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The name of the bucket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-for-recording</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The private endpoint for Apsara Stack.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyuns.dalian.oss.com">https://aliyuns.dalian.oss.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The storage region.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Region</th>
         * <th>Alibaba Cloud OSS</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>0</td>
         * <td>CN_Hangzhou</td>
         * </tr>
         * <tr>
         * <td>1</td>
         * <td>CN_Shanghai</td>
         * </tr>
         * <tr>
         * <td>2</td>
         * <td>CN_Qingdao</td>
         * </tr>
         * <tr>
         * <td>3</td>
         * <td>CN_Beijing</td>
         * </tr>
         * <tr>
         * <td>4</td>
         * <td>CN_Zhangjiakou</td>
         * </tr>
         * <tr>
         * <td>5</td>
         * <td>CN_Huhehaote</td>
         * </tr>
         * <tr>
         * <td>6</td>
         * <td>CN_Shenzhen</td>
         * </tr>
         * <tr>
         * <td>7</td>
         * <td>CN_Hongkong</td>
         * </tr>
         * <tr>
         * <td>8</td>
         * <td>US_West_1</td>
         * </tr>
         * <tr>
         * <td>9</td>
         * <td>US_East_1</td>
         * </tr>
         * <tr>
         * <td>10</td>
         * <td>AP_Southeast_1</td>
         * </tr>
         * <tr>
         * <td>11</td>
         * <td>AP_Southeast_2 (Deprecated. Do not use.)</td>
         * </tr>
         * <tr>
         * <td>12</td>
         * <td>AP_Southeast_3</td>
         * </tr>
         * <tr>
         * <td>13</td>
         * <td>AP_Southeast_5</td>
         * </tr>
         * <tr>
         * <td>14</td>
         * <td>AP_Northeast_1</td>
         * </tr>
         * <tr>
         * <td>15</td>
         * <td>AP_South_1 (Deprecated. Do not use.)</td>
         * </tr>
         * <tr>
         * <td>16</td>
         * <td>EU_Central_1</td>
         * </tr>
         * <tr>
         * <td>17</td>
         * <td>EU_West_1</td>
         * </tr>
         * <tr>
         * <td>18</td>
         * <td>EU_East_1(ME_East_1)</td>
         * </tr>
         * <tr>
         * <td>19</td>
         * <td>AP_Southeast_6</td>
         * </tr>
         * <tr>
         * <td>20</td>
         * <td>CN_Heyuan</td>
         * </tr>
         * <tr>
         * <td>21</td>
         * <td>CN_Guangzhou</td>
         * </tr>
         * <tr>
         * <td>22</td>
         * <td>CN_Chengdu</td>
         * </tr>
         * <tr>
         * <td>23</td>
         * <td>CN_Nanjing</td>
         * </tr>
         * <tr>
         * <td>24</td>
         * <td>CN_Fuzhou</td>
         * </tr>
         * <tr>
         * <td>25</td>
         * <td>CN_Wulanchabu</td>
         * </tr>
         * <tr>
         * <td>26</td>
         * <td>CN_Northeast_2</td>
         * </tr>
         * <tr>
         * <td>27</td>
         * <td>CN_Southeast_7</td>
         * </tr>
         * <tr>
         * <td>28</td>
         * <td>CN_Wuhan_LR</td>
         * </tr>
         * <tr>
         * <td>100</td>
         * <td>oss-cn-hzjbp</td>
         * </tr>
         * <tr>
         * <td>101</td>
         * <td>oss-cn-shanghai-finance-1</td>
         * </tr>
         * <tr>
         * <td>102</td>
         * <td>oss-cn-shenzhen-finance-1</td>
         * </tr>
         * <tr>
         * <td>103</td>
         * <td>oss-cn-beijing-finance-1</td>
         * </tr>
         * <tr>
         * <td>104</td>
         * <td>oss-cn-hzfinance</td>
         * </tr>
         * <tr>
         * <td>105</td>
         * <td>oss-cn-shanghai-finance-1-pub</td>
         * </tr>
         * <tr>
         * <td>106</td>
         * <td>oss-cn-szfinance</td>
         * </tr>
         * <tr>
         * <td>107</td>
         * <td>oss-cn-beijing-finance-1-pub</td>
         * </tr>
         * </tbody></table>
         * <table>
         * <thead>
         * <tr>
         * <th>Region</th>
         * <th>Apsara Stack OSS</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>0</td>
         * <td>default</td>
         * </tr>
         * </tbody></table>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>secretKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APb6qWYEzKtYxE***</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The storage platform. Valid values:</p>
         * <table>
         * <thead>
         * <tr>
         * <th>vendor</th>
         * <th>Object storage service</th>
         * <th>Remarks</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>1</td>
         * <td>AliYun OSS</td>
         * <td>Alibaba Cloud</td>
         * </tr>
         * <tr>
         * <td>2</td>
         * <td>Apsara Stack OSS</td>
         * <td>Alibaba Cloud Apsara Stack</td>
         * </tr>
         * </tbody></table>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static StartCloudRecordShrinkRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestStorageConfig self = new StartCloudRecordShrinkRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudRecordShrinkRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudRecordShrinkRequestStorageConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public StartCloudRecordShrinkRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudRecordShrinkRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudRecordShrinkRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class StartCloudRecordShrinkRequestTextsBoxColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestTextsBoxColor self = new StartCloudRecordShrinkRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestTextsFontColor extends TeaModel {
        /**
         * <p>The blue component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The green component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The red component.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartCloudRecordShrinkRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestTextsFontColor self = new StartCloudRecordShrinkRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordShrinkRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordShrinkRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordShrinkRequestTexts extends TeaModel {
        /**
         * <p>The transparency of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the text box.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public StartCloudRecordShrinkRequestTextsBoxColor boxColor;

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
        public StartCloudRecordShrinkRequestTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display a text box.</p>
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
         * <p>The content of the watermark.</p>
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

        public static StartCloudRecordShrinkRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordShrinkRequestTexts self = new StartCloudRecordShrinkRequestTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordShrinkRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordShrinkRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordShrinkRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordShrinkRequestTexts setBoxColor(StartCloudRecordShrinkRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordShrinkRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordShrinkRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordShrinkRequestTexts setFontColor(StartCloudRecordShrinkRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordShrinkRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordShrinkRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordShrinkRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordShrinkRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordShrinkRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordShrinkRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordShrinkRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
