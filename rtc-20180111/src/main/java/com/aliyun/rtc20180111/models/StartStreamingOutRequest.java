// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutRequest extends TeaModel {
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
    public java.util.List<StartStreamingOutRequestBackgrounds> backgrounds;

    /**
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public StartStreamingOutRequestBgColor bgColor;

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
    public java.util.List<StartStreamingOutRequestClockWidgets> clockWidgets;

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
    public java.util.List<StartStreamingOutRequestImages> images;

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
    public StartStreamingOutRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>The pane settings.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartStreamingOutRequestPanes> panes;

    /**
     * <p>The global pane background color.</p>
     */
    @NameInMap("RegionColor")
    public StartStreamingOutRequestRegionColor regionColor;

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
    public java.util.List<StartStreamingOutRequestTexts> texts;

    /**
     * <p>The live stream ingest URL. Only a single URL is supported. This URL cannot be used by multiple tasks at the same time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("Url")
    public String url;

    public static StartStreamingOutRequest build(java.util.Map<String, ?> map) throws Exception {
        StartStreamingOutRequest self = new StartStreamingOutRequest();
        return TeaModel.build(map, self);
    }

    public StartStreamingOutRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public StartStreamingOutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartStreamingOutRequest setBackgrounds(java.util.List<StartStreamingOutRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartStreamingOutRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartStreamingOutRequest setBgColor(StartStreamingOutRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartStreamingOutRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartStreamingOutRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartStreamingOutRequest setClockWidgets(java.util.List<StartStreamingOutRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartStreamingOutRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartStreamingOutRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartStreamingOutRequest setImages(java.util.List<StartStreamingOutRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<StartStreamingOutRequestImages> getImages() {
        return this.images;
    }

    public StartStreamingOutRequest setLayoutSpecifiedUsers(StartStreamingOutRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public StartStreamingOutRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public StartStreamingOutRequest setPanes(java.util.List<StartStreamingOutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartStreamingOutRequestPanes> getPanes() {
        return this.panes;
    }

    public StartStreamingOutRequest setRegionColor(StartStreamingOutRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartStreamingOutRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartStreamingOutRequest setReservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
        this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
        return this;
    }
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    public StartStreamingOutRequest setShowDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
        this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
        return this;
    }
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    public StartStreamingOutRequest setSpecMixedUserList(java.util.List<String> specMixedUserList) {
        this.specMixedUserList = specMixedUserList;
        return this;
    }
    public java.util.List<String> getSpecMixedUserList() {
        return this.specMixedUserList;
    }

    public StartStreamingOutRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartStreamingOutRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartStreamingOutRequest setSubHighResolutionStream(Boolean subHighResolutionStream) {
        this.subHighResolutionStream = subHighResolutionStream;
        return this;
    }
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    public StartStreamingOutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartStreamingOutRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartStreamingOutRequest setTexts(java.util.List<StartStreamingOutRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<StartStreamingOutRequestTexts> getTexts() {
        return this.texts;
    }

    public StartStreamingOutRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class StartStreamingOutRequestBackgrounds extends TeaModel {
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

        public static StartStreamingOutRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestBackgrounds self = new StartStreamingOutRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public StartStreamingOutRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutRequestBgColor extends TeaModel {
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

        public static StartStreamingOutRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestBgColor self = new StartStreamingOutRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestClockWidgetsBoxColor extends TeaModel {
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

        public static StartStreamingOutRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestClockWidgetsBoxColor self = new StartStreamingOutRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestClockWidgetsFontColor extends TeaModel {
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

        public static StartStreamingOutRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestClockWidgetsFontColor self = new StartStreamingOutRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestClockWidgets extends TeaModel {
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
        public StartStreamingOutRequestClockWidgetsBoxColor boxColor;

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
        public StartStreamingOutRequestClockWidgetsFontColor fontColor;

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

        public static StartStreamingOutRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestClockWidgets self = new StartStreamingOutRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutRequestClockWidgets setBoxColor(StartStreamingOutRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutRequestClockWidgets setFontColor(StartStreamingOutRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public StartStreamingOutRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class StartStreamingOutRequestImages extends TeaModel {
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

        public static StartStreamingOutRequestImages build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestImages self = new StartStreamingOutRequestImages();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public StartStreamingOutRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutRequestLayoutSpecifiedUsers extends TeaModel {
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

        public static StartStreamingOutRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestLayoutSpecifiedUsers self = new StartStreamingOutRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public StartStreamingOutRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartStreamingOutRequestPanesBackgrounds extends TeaModel {
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

        public static StartStreamingOutRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesBackgrounds self = new StartStreamingOutRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public StartStreamingOutRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutRequestPanesImages extends TeaModel {
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

        public static StartStreamingOutRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesImages self = new StartStreamingOutRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartStreamingOutRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public StartStreamingOutRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartStreamingOutRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartStreamingOutRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutRequestPanesTextsBoxColor extends TeaModel {
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

        public static StartStreamingOutRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesTextsBoxColor self = new StartStreamingOutRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestPanesTextsFontColor extends TeaModel {
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

        public static StartStreamingOutRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesTextsFontColor self = new StartStreamingOutRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestPanesTexts extends TeaModel {
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
        public StartStreamingOutRequestPanesTextsBoxColor boxColor;

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
        public StartStreamingOutRequestPanesTextsFontColor fontColor;

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

        public static StartStreamingOutRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesTexts self = new StartStreamingOutRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutRequestPanesTexts setBoxColor(StartStreamingOutRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartStreamingOutRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutRequestPanesTexts setFontColor(StartStreamingOutRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartStreamingOutRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartStreamingOutRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The whiteboard ID. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static StartStreamingOutRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanesWhiteboard self = new StartStreamingOutRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class StartStreamingOutRequestPanes extends TeaModel {
        /**
         * <p>The local background images.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<StartStreamingOutRequestPanesBackgrounds> backgrounds;

        /**
         * <p>The local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartStreamingOutRequestPanesImages> images;

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
        public java.util.List<StartStreamingOutRequestPanesTexts> texts;

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
        public StartStreamingOutRequestPanesWhiteboard whiteboard;

        public static StartStreamingOutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanes self = new StartStreamingOutRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanes setBackgrounds(java.util.List<StartStreamingOutRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<StartStreamingOutRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public StartStreamingOutRequestPanes setImages(java.util.List<StartStreamingOutRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartStreamingOutRequestPanesImages> getImages() {
            return this.images;
        }

        public StartStreamingOutRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public StartStreamingOutRequestPanes setPaneId(String paneId) {
            this.paneId = paneId;
            return this;
        }
        public String getPaneId() {
            return this.paneId;
        }

        public StartStreamingOutRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public StartStreamingOutRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartStreamingOutRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartStreamingOutRequestPanes setTexts(java.util.List<StartStreamingOutRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartStreamingOutRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public StartStreamingOutRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public StartStreamingOutRequestPanes setWhiteboard(StartStreamingOutRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public StartStreamingOutRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class StartStreamingOutRequestRegionColor extends TeaModel {
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

        public static StartStreamingOutRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestRegionColor self = new StartStreamingOutRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestTextsBoxColor extends TeaModel {
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

        public static StartStreamingOutRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestTextsBoxColor self = new StartStreamingOutRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestTextsFontColor extends TeaModel {
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

        public static StartStreamingOutRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestTextsFontColor self = new StartStreamingOutRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartStreamingOutRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartStreamingOutRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartStreamingOutRequestTexts extends TeaModel {
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
        public StartStreamingOutRequestTextsBoxColor boxColor;

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
        public StartStreamingOutRequestTextsFontColor fontColor;

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

        public static StartStreamingOutRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestTexts self = new StartStreamingOutRequestTexts();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartStreamingOutRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartStreamingOutRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartStreamingOutRequestTexts setBoxColor(StartStreamingOutRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartStreamingOutRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartStreamingOutRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartStreamingOutRequestTexts setFontColor(StartStreamingOutRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartStreamingOutRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartStreamingOutRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartStreamingOutRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartStreamingOutRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartStreamingOutRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartStreamingOutRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartStreamingOutRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
