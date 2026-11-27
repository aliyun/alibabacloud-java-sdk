// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateCloudRecordRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query it in the console. Only one ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Background images.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<UpdateCloudRecordRequestBackgrounds> backgrounds;

    /**
     * <p>The existing channel ID. Only one ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Global clock watermarks.</p>
     */
    @NameInMap("ClockWidgets")
    public java.util.List<UpdateCloudRecordRequestClockWidgets> clockWidgets;

    /**
     * <p>Global image watermarks.</p>
     */
    @NameInMap("Images")
    public java.util.List<UpdateCloudRecordRequestImages> images;

    /**
     * <p>A list that specifies users for layout generation. It supports both blacklists and whitelists.</p>
     * <p>Whitelist: Specifies the users whose video streams are subscribed to in the channel.</p>
     * <ul>
     * <li><p>The auto-fill feature uses this list for sequential filling.</p>
     * </li>
     * <li><p>During multi-layout switching, only users in the whitelist are included.</p>
     * </li>
     * </ul>
     * <p>Blacklist: Specifies the users whose video streams are not subscribed to in the channel.</p>
     * <ul>
     * <li>During multi-layout switching, only users not in the blacklist are included.</li>
     * </ul>
     */
    @NameInMap("LayoutSpecifiedUsers")
    public UpdateCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>Cell settings.</p>
     */
    @NameInMap("Panes")
    public java.util.List<UpdateCloudRecordRequestPanes> panes;

    /**
     * <p>The task ID for this cloud recording. Only one ID is supported. It can contain letters, digits, underscores (_), and hyphens (-), with a maximum length of 55 bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The template ID.</p>
     * <blockquote>
     * <p>Notice: To update the layout, change the template ID. Resolution updates are not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Global text watermarks.</p>
     */
    @NameInMap("Texts")
    public java.util.List<UpdateCloudRecordRequestTexts> texts;

    public static UpdateCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudRecordRequest self = new UpdateCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloudRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCloudRecordRequest setBackgrounds(java.util.List<UpdateCloudRecordRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateCloudRecordRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateCloudRecordRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateCloudRecordRequest setClockWidgets(java.util.List<UpdateCloudRecordRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateCloudRecordRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateCloudRecordRequest setImages(java.util.List<UpdateCloudRecordRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<UpdateCloudRecordRequestImages> getImages() {
        return this.images;
    }

    public UpdateCloudRecordRequest setLayoutSpecifiedUsers(UpdateCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public UpdateCloudRecordRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public UpdateCloudRecordRequest setPanes(java.util.List<UpdateCloudRecordRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<UpdateCloudRecordRequestPanes> getPanes() {
        return this.panes;
    }

    public UpdateCloudRecordRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateCloudRecordRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateCloudRecordRequest setTexts(java.util.List<UpdateCloudRecordRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<UpdateCloudRecordRequestTexts> getTexts() {
        return this.texts;
    }

    public static class UpdateCloudRecordRequestBackgrounds extends TeaModel {
        /**
         * <p>Transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
         * </li>
         * <li><p><strong>3</strong>: Stretch to fill.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BackgroundCropMode")
        public Integer backgroundCropMode;

        /**
         * <p>Height.</p>
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
         * <p>Width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestBackgrounds self = new UpdateCloudRecordRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public UpdateCloudRecordRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateCloudRecordRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateCloudRecordRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateCloudRecordRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateCloudRecordRequestClockWidgetsBoxColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestClockWidgetsBoxColor self = new UpdateCloudRecordRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestClockWidgetsFontColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestClockWidgetsFontColor self = new UpdateCloudRecordRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestClockWidgets extends TeaModel {
        /**
         * <p>Transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>Rectangle box transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>Rectangle box border width.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>Rectangle box color.</p>
         */
        @NameInMap("BoxColor")
        public UpdateCloudRecordRequestClockWidgetsBoxColor boxColor;

        /**
         * <p>Font.</p>
         * <ul>
         * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
         * </li>
         * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
         * </li>
         * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
         * </li>
         * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
         * </li>
         * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
         * </li>
         * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
         * </li>
         * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
         * </li>
         * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
         * </li>
         * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
         * </li>
         * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>Font color.</p>
         */
        @NameInMap("FontColor")
        public UpdateCloudRecordRequestClockWidgetsFontColor fontColor;

        /**
         * <p>Clock font size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Whether to draw a rectangle box.</p>
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
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        /**
         * <p>Time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Zone")
        public Integer zone;

        public static UpdateCloudRecordRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestClockWidgets self = new UpdateCloudRecordRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateCloudRecordRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateCloudRecordRequestClockWidgets setBoxColor(UpdateCloudRecordRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateCloudRecordRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateCloudRecordRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateCloudRecordRequestClockWidgets setFontColor(UpdateCloudRecordRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateCloudRecordRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateCloudRecordRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateCloudRecordRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateCloudRecordRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public UpdateCloudRecordRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class UpdateCloudRecordRequestImages extends TeaModel {
        /**
         * <p>Transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>Height.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
         * </li>
         * <li><p><strong>3</strong>: Stretch to fill.</p>
         * </li>
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
         * <p><a href="https://aliyun.com/123.jpg">https://aliyun.com/123.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestImages self = new UpdateCloudRecordRequestImages();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateCloudRecordRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public UpdateCloudRecordRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateCloudRecordRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateCloudRecordRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateCloudRecordRequestLayoutSpecifiedUsers extends TeaModel {
        /**
         * <p>The list of specified user IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>The type of the user list. Valid values: `black` for a blacklist and `white` for a whitelist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateCloudRecordRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestLayoutSpecifiedUsers self = new UpdateCloudRecordRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public UpdateCloudRecordRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCloudRecordRequestPanesBackgrounds extends TeaModel {
        /**
         * <p>Transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>When to display.</p>
         * <ul>
         * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
         * </li>
         * <li><p>backup: Display only when the user has no video stream.</p>
         * </li>
         * <li><p>always: Always display.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>Height.</p>
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
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
         * </li>
         * <li><p><strong>3</strong>: Stretch to fill.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneBackgroundCropMode")
        public Integer paneBackgroundCropMode;

        /**
         * <p>The background image URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesBackgrounds self = new UpdateCloudRecordRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateCloudRecordRequestPanesImages extends TeaModel {
        /**
         * <p>Transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>When to display the watermark.</p>
         * <ul>
         * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
         * </li>
         * <li><p>backup: Display only when the user has no video stream.</p>
         * </li>
         * <li><p>always: Always display.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>Height.</p>
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
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
         * </li>
         * <li><p><strong>3</strong>: Stretch to fill.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneImageCropMode")
        public Integer paneImageCropMode;

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
         * <p>Width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesImages self = new UpdateCloudRecordRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateCloudRecordRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateCloudRecordRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public UpdateCloudRecordRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateCloudRecordRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateCloudRecordRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateCloudRecordRequestPanesTextsBoxColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesTextsBoxColor self = new UpdateCloudRecordRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestPanesTextsFontColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesTextsFontColor self = new UpdateCloudRecordRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestPanesTexts extends TeaModel {
        /**
         * <p>Watermark transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>Rectangle box transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>Rectangle box border width.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>Rectangle box color.</p>
         */
        @NameInMap("BoxColor")
        public UpdateCloudRecordRequestPanesTextsBoxColor boxColor;

        /**
         * <p>When to display the watermark.</p>
         * <ul>
         * <li><p>streamOnly: Display only when the user has a video stream (default).</p>
         * </li>
         * <li><p>backup: Display only when the user has no video stream.</p>
         * </li>
         * <li><p>always: Always display.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>Font.</p>
         * <ul>
         * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
         * </li>
         * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
         * </li>
         * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
         * </li>
         * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
         * </li>
         * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
         * </li>
         * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
         * </li>
         * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
         * </li>
         * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
         * </li>
         * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
         * </li>
         * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>Font color.</p>
         */
        @NameInMap("FontColor")
        public UpdateCloudRecordRequestPanesTextsFontColor fontColor;

        /**
         * <p>Font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Whether to draw a rectangle box.</p>
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
         * <p>文字水印</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesTexts self = new UpdateCloudRecordRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateCloudRecordRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateCloudRecordRequestPanesTexts setBoxColor(UpdateCloudRecordRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateCloudRecordRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateCloudRecordRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateCloudRecordRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateCloudRecordRequestPanesTexts setFontColor(UpdateCloudRecordRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateCloudRecordRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateCloudRecordRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateCloudRecordRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateCloudRecordRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateCloudRecordRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateCloudRecordRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The whiteboard ID. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static UpdateCloudRecordRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanesWhiteboard self = new UpdateCloudRecordRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class UpdateCloudRecordRequestPanes extends TeaModel {
        /**
         * <p>Background images.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<UpdateCloudRecordRequestPanesBackgrounds> backgrounds;

        /**
         * <p>Local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<UpdateCloudRecordRequestPanesImages> images;

        /**
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Crop while maintaining aspect ratio.</p>
         * </li>
         * <li><p><strong>2</strong>: Maintain aspect ratio with padding.</p>
         * </li>
         * <li><p><strong>3</strong>: Stretch to fill.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>The pane ID, starting from 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>Reserves a pane for a user who goes offline. The default value is true. If true, the pane for a specified user or wildcard user remains as a placeholder. If false, the pane is filled with a video stream based on the Auto Fill order.</p>
         */
        @NameInMap("ReservePaneForOfflineUser")
        public Boolean reservePaneForOfflineUser;

        /**
         * <p>The media source for the cell. You can specify a userId to target a specific user. Wildcard characters are also supported:</p>
         * <ul>
         * <li><p><strong>$ActiveSpeaker</strong>: The current active speaker in the channel.</p>
         * </li>
         * <li><p><strong>$ScreenShare</strong>: A screen-sharing user. If multiple users share their screens, they are filled in sequence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The media type of the cell. Valid values:</p>
         * <ul>
         * <li><p><strong>video</strong>: Camera or screen sharing stream (default).</p>
         * </li>
         * <li><p><strong>camera</strong>: Camera stream.</p>
         * </li>
         * <li><p><strong>screen</strong>: Screen sharing stream.</p>
         * </li>
         * <li><p><strong>whiteboard</strong>: Whiteboard.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>Local text watermarks for the pane.</p>
         */
        @NameInMap("Texts")
        public java.util.List<UpdateCloudRecordRequestPanesTexts> texts;

        /**
         * <p>The fill order when SourceType is video.</p>
         * <ul>
         * <li><p>screenFirst: Prioritize screen sharing (default).</p>
         * </li>
         * <li><p>cameraFirst: Prioritize camera.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cameraFirst</p>
         */
        @NameInMap("VideoOrder")
        public String videoOrder;

        /**
         * <p>Whiteboard configuration.</p>
         */
        @NameInMap("Whiteboard")
        public UpdateCloudRecordRequestPanesWhiteboard whiteboard;

        public static UpdateCloudRecordRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanes self = new UpdateCloudRecordRequestPanes();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestPanes setBackgrounds(java.util.List<UpdateCloudRecordRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<UpdateCloudRecordRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public UpdateCloudRecordRequestPanes setImages(java.util.List<UpdateCloudRecordRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateCloudRecordRequestPanesImages> getImages() {
            return this.images;
        }

        public UpdateCloudRecordRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public UpdateCloudRecordRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateCloudRecordRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public UpdateCloudRecordRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateCloudRecordRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateCloudRecordRequestPanes setTexts(java.util.List<UpdateCloudRecordRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateCloudRecordRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateCloudRecordRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public UpdateCloudRecordRequestPanes setWhiteboard(UpdateCloudRecordRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public UpdateCloudRecordRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class UpdateCloudRecordRequestTextsBoxColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestTextsBoxColor self = new UpdateCloudRecordRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestTextsFontColor extends TeaModel {
        /**
         * <p>B.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateCloudRecordRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestTextsFontColor self = new UpdateCloudRecordRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateCloudRecordRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateCloudRecordRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateCloudRecordRequestTexts extends TeaModel {
        /**
         * <p>Watermark transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>Rectangle box transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>Rectangle box border width.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>Rectangle box color.</p>
         */
        @NameInMap("BoxColor")
        public UpdateCloudRecordRequestTextsBoxColor boxColor;

        /**
         * <p>Font.</p>
         * <ul>
         * <li><p><strong>0</strong>: Alibaba PuHuiTi Regular</p>
         * </li>
         * <li><p><strong>1</strong>: Alibaba PuHuiTi Light</p>
         * </li>
         * <li><p><strong>2</strong>: Alibaba PuHuiTi Medium</p>
         * </li>
         * <li><p><strong>3</strong>: Alibaba PuHuiTi Bold</p>
         * </li>
         * <li><p><strong>4</strong>: Alibaba PuHuiTi Heavy</p>
         * </li>
         * <li><p><strong>5</strong>: Ali Mama ShuHeiTi</p>
         * </li>
         * <li><p><strong>6</strong>: DingTalk JinBuTi</p>
         * </li>
         * <li><p><strong>7</strong>: Ali Mama DaoLiTi</p>
         * </li>
         * <li><p><strong>8</strong>: Ali Mama DongFang DaKai</p>
         * </li>
         * <li><p><strong>9</strong>: Ali Mama FangYuanTi</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        /**
         * <p>Font color.</p>
         */
        @NameInMap("FontColor")
        public UpdateCloudRecordRequestTextsFontColor fontColor;

        /**
         * <p>Font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Whether to draw a rectangle box.</p>
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
         * <p>文字水印</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>The horizontal coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The vertical coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateCloudRecordRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestTexts self = new UpdateCloudRecordRequestTexts();
            return TeaModel.build(map, self);
        }

        public UpdateCloudRecordRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateCloudRecordRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateCloudRecordRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateCloudRecordRequestTexts setBoxColor(UpdateCloudRecordRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateCloudRecordRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateCloudRecordRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateCloudRecordRequestTexts setFontColor(UpdateCloudRecordRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateCloudRecordRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateCloudRecordRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateCloudRecordRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateCloudRecordRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateCloudRecordRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateCloudRecordRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateCloudRecordRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
