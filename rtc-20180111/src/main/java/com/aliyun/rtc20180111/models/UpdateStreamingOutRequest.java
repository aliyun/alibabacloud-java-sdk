// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateStreamingOutRequest extends TeaModel {
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
    public java.util.List<UpdateStreamingOutRequestBackgrounds> backgrounds;

    /**
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public UpdateStreamingOutRequestBgColor bgColor;

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
    public java.util.List<UpdateStreamingOutRequestClockWidgets> clockWidgets;

    /**
     * <p>The crop mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
     * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
     * <li><strong>3</strong>: Stretches the image to fill the area.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    /**
     * <p>The global image watermark.</p>
     */
    @NameInMap("Images")
    public java.util.List<UpdateStreamingOutRequestImages> images;

    /**
     * <p>The specified user list for layout generation, which includes two types: blacklist and whitelist.</p>
     * <p>Whitelist: specifies the users in the room whose video streams are subscribed to.</p>
     * <ul>
     * <li>After the setting is applied, automatic padding is performed in sequence based on this list.</li>
     * <li>When switching between multiple layouts in a template, only users in the whitelist are considered.</li>
     * </ul>
     * <p>Blacklist: specifies the users in the room whose video streams are not subscribed to.</p>
     * <ul>
     * <li>When switching between multiple layouts in a template, only users not in the blacklist are considered.</li>
     * </ul>
     */
    @NameInMap("LayoutSpecifiedUsers")
    public UpdateStreamingOutRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>The pane settings. You can configure up to 16 panes.</p>
     */
    @NameInMap("Panes")
    public java.util.List<UpdateStreamingOutRequestPanes> panes;

    /**
     * <p>The global region background color.</p>
     */
    @NameInMap("RegionColor")
    public UpdateStreamingOutRequestRegionColor regionColor;

    /**
     * <p>The list of specified users for audio mixing.</p>
     */
    @NameInMap("SpecMixedUserList")
    public java.util.List<String> specMixedUserList;

    /**
     * <p>The ID of the bypass live streaming task. Only a single ID is supported. The ID can contain uppercase and lowercase letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
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
     * <p>Notice: When you update the template ID, you can only update the layout. The resolution cannot be updated.</p>
     * </blockquote>
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
    public java.util.List<UpdateStreamingOutRequestTexts> texts;

    public static UpdateStreamingOutRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamingOutRequest self = new UpdateStreamingOutRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStreamingOutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateStreamingOutRequest setBackgrounds(java.util.List<UpdateStreamingOutRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateStreamingOutRequest setBgColor(UpdateStreamingOutRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public UpdateStreamingOutRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public UpdateStreamingOutRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateStreamingOutRequest setClockWidgets(java.util.List<UpdateStreamingOutRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateStreamingOutRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public UpdateStreamingOutRequest setImages(java.util.List<UpdateStreamingOutRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestImages> getImages() {
        return this.images;
    }

    public UpdateStreamingOutRequest setLayoutSpecifiedUsers(UpdateStreamingOutRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public UpdateStreamingOutRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public UpdateStreamingOutRequest setPanes(java.util.List<UpdateStreamingOutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestPanes> getPanes() {
        return this.panes;
    }

    public UpdateStreamingOutRequest setRegionColor(UpdateStreamingOutRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public UpdateStreamingOutRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public UpdateStreamingOutRequest setSpecMixedUserList(java.util.List<String> specMixedUserList) {
        this.specMixedUserList = specMixedUserList;
        return this;
    }
    public java.util.List<String> getSpecMixedUserList() {
        return this.specMixedUserList;
    }

    public UpdateStreamingOutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateStreamingOutRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStreamingOutRequest setTexts(java.util.List<UpdateStreamingOutRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestTexts> getTexts() {
        return this.texts;
    }

    public static class UpdateStreamingOutRequestBackgrounds extends TeaModel {
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
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
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
         * <p>The Z-axis layer.</p>
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
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestBackgrounds self = new UpdateStreamingOutRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public UpdateStreamingOutRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutRequestBgColor extends TeaModel {
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

        public static UpdateStreamingOutRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestBgColor self = new UpdateStreamingOutRequestBgColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestClockWidgetsBoxColor extends TeaModel {
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

        public static UpdateStreamingOutRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestClockWidgetsBoxColor self = new UpdateStreamingOutRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestClockWidgetsFontColor extends TeaModel {
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

        public static UpdateStreamingOutRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestClockWidgetsFontColor self = new UpdateStreamingOutRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestClockWidgets extends TeaModel {
        /**
         * <p>The transparency.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle.</p>
         */
        @NameInMap("BoxColor")
        public UpdateStreamingOutRequestClockWidgetsBoxColor boxColor;

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
        public UpdateStreamingOutRequestClockWidgetsFontColor fontColor;

        /**
         * <p>The clock font size.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display the rectangle.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The Z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
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

        public static UpdateStreamingOutRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestClockWidgets self = new UpdateStreamingOutRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutRequestClockWidgets setBoxColor(UpdateStreamingOutRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutRequestClockWidgets setFontColor(UpdateStreamingOutRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public UpdateStreamingOutRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class UpdateStreamingOutRequestImages extends TeaModel {
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
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageCropMode")
        public Integer imageCropMode;

        /**
         * <p>The Z-axis layer.</p>
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
         * <p>The width.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestImages self = new UpdateStreamingOutRequestImages();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public UpdateStreamingOutRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutRequestLayoutSpecifiedUsers extends TeaModel {
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

        public static UpdateStreamingOutRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestLayoutSpecifiedUsers self = new UpdateStreamingOutRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public UpdateStreamingOutRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateStreamingOutRequestPanesBackgrounds extends TeaModel {
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
         * <p>0.79</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <p>The Z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesBackgrounds self = new UpdateStreamingOutRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutRequestPanesImages extends TeaModel {
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
         * <p>The Z-axis layer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
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
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesImages self = new UpdateStreamingOutRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateStreamingOutRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public UpdateStreamingOutRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutRequestPanesTextsBoxColor extends TeaModel {
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

        public static UpdateStreamingOutRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesTextsBoxColor self = new UpdateStreamingOutRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestPanesTextsFontColor extends TeaModel {
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

        public static UpdateStreamingOutRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesTextsFontColor self = new UpdateStreamingOutRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestPanesTexts extends TeaModel {
        /**
         * <p>The transparency of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle.</p>
         */
        @NameInMap("BoxColor")
        public UpdateStreamingOutRequestPanesTextsBoxColor boxColor;

        /**
         * <p>The condition for displaying the watermark. Valid values:</p>
         * <ul>
         * <li>streamOnly: Displayed when the current user has a video stream. This is the default value.</li>
         * <li>backup: Displayed when the current user does not have a video stream.</li>
         * <li>always: Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>always</p>
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
        public UpdateStreamingOutRequestPanesTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display the rectangle.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The Z-axis layer.</p>
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
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesTexts self = new UpdateStreamingOutRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutRequestPanesTexts setBoxColor(UpdateStreamingOutRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public UpdateStreamingOutRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutRequestPanesTexts setFontColor(UpdateStreamingOutRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateStreamingOutRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutRequestPanesWhiteboard extends TeaModel {
        /**
         * <p>The whiteboard ID. Default value: default.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static UpdateStreamingOutRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanesWhiteboard self = new UpdateStreamingOutRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class UpdateStreamingOutRequestPanes extends TeaModel {
        /**
         * <p>The background image of the pane.</p>
         */
        @NameInMap("Backgrounds")
        public java.util.List<UpdateStreamingOutRequestPanesBackgrounds> backgrounds;

        /**
         * <p>The local image watermarks for the pane.</p>
         */
        @NameInMap("Images")
        public java.util.List<UpdateStreamingOutRequestPanesImages> images;

        /**
         * <p>The crop mode. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Crops the image while maintaining the aspect ratio.</li>
         * <li><strong>2</strong>: Adds padding to the image while maintaining the aspect ratio.</li>
         * <li><strong>3</strong>: Stretches the image to fill the area.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>The pane ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>Specifies whether to reserve the pane as a placeholder for offline users. Default value: true. A value of true indicates that the pane is forcibly reserved as a placeholder when the specific user or wildcard user specified for the grid is offline. A value of false indicates that video streams are displayed in the automatic fill order when the specific user or wildcard user specified for the grid is offline.</p>
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
        public java.util.List<UpdateStreamingOutRequestPanesTexts> texts;

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
        public UpdateStreamingOutRequestPanesWhiteboard whiteboard;

        public static UpdateStreamingOutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanes self = new UpdateStreamingOutRequestPanes();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestPanes setBackgrounds(java.util.List<UpdateStreamingOutRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<UpdateStreamingOutRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public UpdateStreamingOutRequestPanes setImages(java.util.List<UpdateStreamingOutRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateStreamingOutRequestPanesImages> getImages() {
            return this.images;
        }

        public UpdateStreamingOutRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public UpdateStreamingOutRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateStreamingOutRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public UpdateStreamingOutRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateStreamingOutRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateStreamingOutRequestPanes setTexts(java.util.List<UpdateStreamingOutRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateStreamingOutRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateStreamingOutRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public UpdateStreamingOutRequestPanes setWhiteboard(UpdateStreamingOutRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public UpdateStreamingOutRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class UpdateStreamingOutRequestRegionColor extends TeaModel {
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

        public static UpdateStreamingOutRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestRegionColor self = new UpdateStreamingOutRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestTextsBoxColor extends TeaModel {
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

        public static UpdateStreamingOutRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestTextsBoxColor self = new UpdateStreamingOutRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestTextsFontColor extends TeaModel {
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

        public static UpdateStreamingOutRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestTextsFontColor self = new UpdateStreamingOutRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutRequestTexts extends TeaModel {
        /**
         * <p>The transparency of the watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>The transparency of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <p>The border width of the rectangle.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        /**
         * <p>The color of the rectangle.</p>
         */
        @NameInMap("BoxColor")
        public UpdateStreamingOutRequestTextsBoxColor boxColor;

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
        public UpdateStreamingOutRequestTextsFontColor fontColor;

        /**
         * <p>The font size.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>Specifies whether to display the rectangle.</p>
         */
        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <p>The Z-axis layer.</p>
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
         * <p>The X-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>The Y-coordinate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        public static UpdateStreamingOutRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestTexts self = new UpdateStreamingOutRequestTexts();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutRequestTexts setBoxColor(UpdateStreamingOutRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutRequestTexts setFontColor(UpdateStreamingOutRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateStreamingOutRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
