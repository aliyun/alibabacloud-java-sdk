// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudRecordRequest extends TeaModel {
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
    public java.util.List<StartCloudRecordRequestBackgrounds> backgrounds;

    /**
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public StartCloudRecordRequestBgColor bgColor;

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
    public java.util.List<StartCloudRecordRequestClockWidgets> clockWidgets;

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
    public java.util.List<StartCloudRecordRequestImages> images;

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
    public StartCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>The pane settings. You can configure up to 16 panes.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartCloudRecordRequestPanes> panes;

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
    public StartCloudRecordRequestRegionColor regionColor;

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
    public StartCloudRecordRequestSingleStreamingRecord singleStreamingRecord;

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
    public StartCloudRecordRequestStorageConfig storageConfig;

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
    public java.util.List<StartCloudRecordRequestTexts> texts;

    public static StartCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordRequest self = new StartCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public StartCloudRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudRecordRequest setBackgrounds(java.util.List<StartCloudRecordRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartCloudRecordRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartCloudRecordRequest setBgColor(StartCloudRecordRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartCloudRecordRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartCloudRecordRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudRecordRequest setClockWidgets(java.util.List<StartCloudRecordRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartCloudRecordRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartCloudRecordRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartCloudRecordRequest setImages(java.util.List<StartCloudRecordRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<StartCloudRecordRequestImages> getImages() {
        return this.images;
    }

    public StartCloudRecordRequest setLayoutSpecifiedUsers(StartCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public StartCloudRecordRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public StartCloudRecordRequest setPanes(java.util.List<StartCloudRecordRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartCloudRecordRequestPanes> getPanes() {
        return this.panes;
    }

    public StartCloudRecordRequest setRecordMode(Integer recordMode) {
        this.recordMode = recordMode;
        return this;
    }
    public Integer getRecordMode() {
        return this.recordMode;
    }

    public StartCloudRecordRequest setRegionColor(StartCloudRecordRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartCloudRecordRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartCloudRecordRequest setReservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
        this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
        return this;
    }
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    public StartCloudRecordRequest setShowDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
        this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
        return this;
    }
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    public StartCloudRecordRequest setSingleStreamingRecord(StartCloudRecordRequestSingleStreamingRecord singleStreamingRecord) {
        this.singleStreamingRecord = singleStreamingRecord;
        return this;
    }
    public StartCloudRecordRequestSingleStreamingRecord getSingleStreamingRecord() {
        return this.singleStreamingRecord;
    }

    public StartCloudRecordRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartCloudRecordRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartCloudRecordRequest setStorageConfig(StartCloudRecordRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudRecordRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudRecordRequest setSubHighResolutionStream(Boolean subHighResolutionStream) {
        this.subHighResolutionStream = subHighResolutionStream;
        return this;
    }
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    public StartCloudRecordRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudRecordRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartCloudRecordRequest setTexts(java.util.List<StartCloudRecordRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<StartCloudRecordRequestTexts> getTexts() {
        return this.texts;
    }

    public static class StartCloudRecordRequestBackgrounds extends TeaModel {
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

        public static StartCloudRecordRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestBackgrounds self = new StartCloudRecordRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public StartCloudRecordRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestBgColor extends TeaModel {
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

        public static StartCloudRecordRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestBgColor self = new StartCloudRecordRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgetsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgetsBoxColor self = new StartCloudRecordRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgetsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgetsFontColor self = new StartCloudRecordRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgets extends TeaModel {
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
        public StartCloudRecordRequestClockWidgetsBoxColor boxColor;

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
        public StartCloudRecordRequestClockWidgetsFontColor fontColor;

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

        public static StartCloudRecordRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgets self = new StartCloudRecordRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestClockWidgets setBoxColor(StartCloudRecordRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestClockWidgets setFontColor(StartCloudRecordRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public StartCloudRecordRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class StartCloudRecordRequestImages extends TeaModel {
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

        public static StartCloudRecordRequestImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestImages self = new StartCloudRecordRequestImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public StartCloudRecordRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestLayoutSpecifiedUsers extends TeaModel {
        /**
         * <p>The list of specified user IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>The type of the user list. Valid values:</p>
         * <ul>
         * <li>black: Blacklist.</li>
         * <li>white: Whitelist.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("Type")
        public String type;

        public static StartCloudRecordRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestLayoutSpecifiedUsers self = new StartCloudRecordRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public StartCloudRecordRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartCloudRecordRequestPanesBackgrounds extends TeaModel {
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

        public static StartCloudRecordRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesBackgrounds self = new StartCloudRecordRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public StartCloudRecordRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesImages extends TeaModel {
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

        public static StartCloudRecordRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesImages self = new StartCloudRecordRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public StartCloudRecordRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesTextsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTextsBoxColor self = new StartCloudRecordRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestPanesTextsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTextsFontColor self = new StartCloudRecordRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestPanesTexts extends TeaModel {
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
        public StartCloudRecordRequestPanesTextsBoxColor boxColor;

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
        public StartCloudRecordRequestPanesTextsFontColor fontColor;

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

        public static StartCloudRecordRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTexts self = new StartCloudRecordRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestPanesTexts setBoxColor(StartCloudRecordRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestPanesTexts setFontColor(StartCloudRecordRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The ID of the whiteboard. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static StartCloudRecordRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesWhiteboard self = new StartCloudRecordRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class StartCloudRecordRequestPanes extends TeaModel {
        /**
         * <p>The local background images for the pane.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<StartCloudRecordRequestPanesBackgrounds> backgrounds;

        /**
         * <p>The local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartCloudRecordRequestPanesImages> images;

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
        public java.util.List<StartCloudRecordRequestPanesTexts> texts;

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
        public StartCloudRecordRequestPanesWhiteboard whiteboard;

        public static StartCloudRecordRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanes self = new StartCloudRecordRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanes setBackgrounds(java.util.List<StartCloudRecordRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public StartCloudRecordRequestPanes setImages(java.util.List<StartCloudRecordRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesImages> getImages() {
            return this.images;
        }

        public StartCloudRecordRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public StartCloudRecordRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartCloudRecordRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public StartCloudRecordRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartCloudRecordRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartCloudRecordRequestPanes setTexts(java.util.List<StartCloudRecordRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public StartCloudRecordRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public StartCloudRecordRequestPanes setWhiteboard(StartCloudRecordRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public StartCloudRecordRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class StartCloudRecordRequestRegionColor extends TeaModel {
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

        public static StartCloudRecordRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestRegionColor self = new StartCloudRecordRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams extends TeaModel {
        /**
         * <p>The list of user IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>The type of the stream. Valid values:</p>
         * <ul>
         * <li>mic: Audio stream.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mic</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <p>The blacklists and whitelists type for single-stream recording streams. Valid values:</p>
         * <ul>
         * <li>white: Whitelist. Indicates that the stream is recorded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("Type")
        public String type;

        public static StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams self = new StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio extends TeaModel {
        /**
         * <p>The bitrate, in kbps.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The audio codec format. Valid values:</p>
         * <ul>
         * <li>mp3</li>
         * <li>aac</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The sample rate. Valid values:</p>
         * <ul>
         * <li>8000</li>
         * <li>16000</li>
         * <li>32000</li>
         * <li>44100</li>
         * <li>48000</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>48000</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio self = new StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordTranscodingParameters extends TeaModel {
        /**
         * <p>The audio encoding settings.</p>
         */
        @NameInMap("Audio")
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio audio;

        /**
         * <p>The container format for the recording file. Valid values:</p>
         * <ul>
         * <li>mp3</li>
         * <li>aac</li>
         * <li>mp4</li>
         * <li>ts</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Container")
        public String container;

        public static StartCloudRecordRequestSingleStreamingRecordTranscodingParameters build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordTranscodingParameters self = new StartCloudRecordRequestSingleStreamingRecordTranscodingParameters();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters setAudio(StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio audio) {
            this.audio = audio;
            return this;
        }
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio getAudio() {
            return this.audio;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecord extends TeaModel {
        /**
         * <p>Specifies whether to merge the audio file into the video file. Default value: false.</p>
         */
        @NameInMap("AvMerge")
        public Boolean avMerge;

        /**
         * <p>The streams specified for single-stream recording.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SpecifiedStreams")
        public java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> specifiedStreams;

        /**
         * <p>The transcoding parameters. By default, single-stream recording writes files in MP3 format. Specify this parameter if transcoding is required.</p>
         */
        @NameInMap("TranscodingParameters")
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters transcodingParameters;

        public static StartCloudRecordRequestSingleStreamingRecord build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecord self = new StartCloudRecordRequestSingleStreamingRecord();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecord setAvMerge(Boolean avMerge) {
            this.avMerge = avMerge;
            return this;
        }
        public Boolean getAvMerge() {
            return this.avMerge;
        }

        public StartCloudRecordRequestSingleStreamingRecord setSpecifiedStreams(java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> specifiedStreams) {
            this.specifiedStreams = specifiedStreams;
            return this;
        }
        public java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> getSpecifiedStreams() {
            return this.specifiedStreams;
        }

        public StartCloudRecordRequestSingleStreamingRecord setTranscodingParameters(StartCloudRecordRequestSingleStreamingRecordTranscodingParameters transcodingParameters) {
            this.transcodingParameters = transcodingParameters;
            return this;
        }
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters getTranscodingParameters() {
            return this.transcodingParameters;
        }

    }

    public static class StartCloudRecordRequestStorageConfig extends TeaModel {
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

        public static StartCloudRecordRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestStorageConfig self = new StartCloudRecordRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudRecordRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudRecordRequestStorageConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public StartCloudRecordRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudRecordRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudRecordRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class StartCloudRecordRequestTextsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTextsBoxColor self = new StartCloudRecordRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestTextsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTextsFontColor self = new StartCloudRecordRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestTexts extends TeaModel {
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
        public StartCloudRecordRequestTextsBoxColor boxColor;

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
        public StartCloudRecordRequestTextsFontColor fontColor;

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

        public static StartCloudRecordRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTexts self = new StartCloudRecordRequestTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestTexts setBoxColor(StartCloudRecordRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestTexts setFontColor(StartCloudRecordRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
