// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyViewLayoutRequest extends TeaModel {
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
     * <p>The background images.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<ModifyViewLayoutRequestBackgrounds> backgrounds;

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
    public java.util.List<ModifyViewLayoutRequestClockWidgets> clockWidgets;

    /**
     * <p>The global image watermark.</p>
     */
    @NameInMap("Images")
    public java.util.List<ModifyViewLayoutRequestImages> images;

    /**
     * <p>The blacklists and whitelists settings.</p>
     */
    @NameInMap("LayoutSpecifiedUsers")
    public ModifyViewLayoutRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>The pane settings. You can configure up to 16 panes.</p>
     */
    @NameInMap("Panes")
    public java.util.List<ModifyViewLayoutRequestPanes> panes;

    /**
     * <p>The task ID. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<ModifyViewLayoutRequestTexts> texts;

    public static ModifyViewLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyViewLayoutRequest self = new ModifyViewLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyViewLayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyViewLayoutRequest setBackgrounds(java.util.List<ModifyViewLayoutRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<ModifyViewLayoutRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public ModifyViewLayoutRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ModifyViewLayoutRequest setClockWidgets(java.util.List<ModifyViewLayoutRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<ModifyViewLayoutRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public ModifyViewLayoutRequest setImages(java.util.List<ModifyViewLayoutRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ModifyViewLayoutRequestImages> getImages() {
        return this.images;
    }

    public ModifyViewLayoutRequest setLayoutSpecifiedUsers(ModifyViewLayoutRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public ModifyViewLayoutRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public ModifyViewLayoutRequest setPanes(java.util.List<ModifyViewLayoutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<ModifyViewLayoutRequestPanes> getPanes() {
        return this.panes;
    }

    public ModifyViewLayoutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyViewLayoutRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyViewLayoutRequest setTexts(java.util.List<ModifyViewLayoutRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<ModifyViewLayoutRequestTexts> getTexts() {
        return this.texts;
    }

    public static class ModifyViewLayoutRequestBackgrounds extends TeaModel {
        /**
         * <p>The opacity of the image.</p>
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
         * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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

        public static ModifyViewLayoutRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestBackgrounds self = new ModifyViewLayoutRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public ModifyViewLayoutRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutRequestClockWidgetsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestClockWidgetsBoxColor self = new ModifyViewLayoutRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestClockWidgetsFontColor extends TeaModel {
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

        public static ModifyViewLayoutRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestClockWidgetsFontColor self = new ModifyViewLayoutRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestClockWidgets extends TeaModel {
        /**
         * <p>The opacity of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The opacity of the text box.</p>
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
         * <p>The border color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestClockWidgetsBoxColor boxColor;

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
        public ModifyViewLayoutRequestClockWidgetsFontColor fontColor;

        /**
         * <p>The clock font size.</p>
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

        public static ModifyViewLayoutRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestClockWidgets self = new ModifyViewLayoutRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutRequestClockWidgets setBoxColor(ModifyViewLayoutRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutRequestClockWidgets setFontColor(ModifyViewLayoutRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public ModifyViewLayoutRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class ModifyViewLayoutRequestImages extends TeaModel {
        /**
         * <p>The opacity of the image.</p>
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
         * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
         * <p>The URL of the image.</p>
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

        public static ModifyViewLayoutRequestImages build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestImages self = new ModifyViewLayoutRequestImages();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public ModifyViewLayoutRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutRequestLayoutSpecifiedUsers extends TeaModel {
        /**
         * <p>The list of specified user IDs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>The user list type. Valid values: black: Blacklist. white: Whitelist.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("Type")
        public String type;

        public static ModifyViewLayoutRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestLayoutSpecifiedUsers self = new ModifyViewLayoutRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public ModifyViewLayoutRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyViewLayoutRequestPanesImages extends TeaModel {
        /**
         * <p>The opacity of the image.</p>
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
         * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneImageCropMode")
        public Integer paneImageCropMode;

        /**
         * <p>The URL of the image.</p>
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

        public static ModifyViewLayoutRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestPanesImages self = new ModifyViewLayoutRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public ModifyViewLayoutRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutRequestPanesTextsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestPanesTextsBoxColor self = new ModifyViewLayoutRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestPanesTextsFontColor extends TeaModel {
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

        public static ModifyViewLayoutRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestPanesTextsFontColor self = new ModifyViewLayoutRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestPanesTexts extends TeaModel {
        /**
         * <p>The opacity of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The opacity of the text box.</p>
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
         * <p>The border color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestPanesTextsBoxColor boxColor;

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
        public ModifyViewLayoutRequestPanesTextsFontColor fontColor;

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

        public static ModifyViewLayoutRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestPanesTexts self = new ModifyViewLayoutRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutRequestPanesTexts setBoxColor(ModifyViewLayoutRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutRequestPanesTexts setFontColor(ModifyViewLayoutRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public ModifyViewLayoutRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutRequestPanes extends TeaModel {
        /**
         * <p>The image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<ModifyViewLayoutRequestPanesImages> images;

        /**
         * <p>The crop mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Maintains the aspect ratio and adds padding.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>The ID of the pane. The ID starts from 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public String paneId;

        /**
         * <p>The media source of the pane. You can specify a userId. To specify a specific user type, you can use wildcard configurations. The following types are supported:</p>
         * <ul>
         * <li><strong>$ActiveSpeaker</strong>: The active speaker in the current channel.</li>
         * <li><strong>$ScreenShare</strong>: The user who is sharing the screen. If multiple users are sharing their screens in the channel, the panes are filled in chronological order.</li>
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
         * <li><strong>video</strong>: The camera or screen sharing stream of the user. This is the default value.</li>
         * <li><strong>camera</strong>: The camera stream.</li>
         * <li><strong>screen</strong>: The screen sharing stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The text watermarks for the pane.</p>
         */
        @NameInMap("Texts")
        public java.util.List<ModifyViewLayoutRequestPanesTexts> texts;

        public static ModifyViewLayoutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestPanes self = new ModifyViewLayoutRequestPanes();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestPanes setImages(java.util.List<ModifyViewLayoutRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ModifyViewLayoutRequestPanesImages> getImages() {
            return this.images;
        }

        public ModifyViewLayoutRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public ModifyViewLayoutRequestPanes setPaneId(String paneId) {
            this.paneId = paneId;
            return this;
        }
        public String getPaneId() {
            return this.paneId;
        }

        public ModifyViewLayoutRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ModifyViewLayoutRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ModifyViewLayoutRequestPanes setTexts(java.util.List<ModifyViewLayoutRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<ModifyViewLayoutRequestPanesTexts> getTexts() {
            return this.texts;
        }

    }

    public static class ModifyViewLayoutRequestTextsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestTextsBoxColor self = new ModifyViewLayoutRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestTextsFontColor extends TeaModel {
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

        public static ModifyViewLayoutRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestTextsFontColor self = new ModifyViewLayoutRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutRequestTexts extends TeaModel {
        /**
         * <p>The opacity of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The opacity of the text box.</p>
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
         * <p>The border color of the text box.</p>
         */
        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestTextsBoxColor boxColor;

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
        public ModifyViewLayoutRequestTextsFontColor fontColor;

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

        public static ModifyViewLayoutRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutRequestTexts self = new ModifyViewLayoutRequestTexts();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutRequestTexts setBoxColor(ModifyViewLayoutRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutRequestTexts setFontColor(ModifyViewLayoutRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public ModifyViewLayoutRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
