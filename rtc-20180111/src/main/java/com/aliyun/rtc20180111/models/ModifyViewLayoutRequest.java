// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyViewLayoutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Backgrounds")
    public java.util.List<ModifyViewLayoutRequestBackgrounds> backgrounds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<ModifyViewLayoutRequestClockWidgets> clockWidgets;

    @NameInMap("Images")
    public java.util.List<ModifyViewLayoutRequestImages> images;

    @NameInMap("LayoutSpecifiedUsers")
    public ModifyViewLayoutRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    @NameInMap("Panes")
    public java.util.List<ModifyViewLayoutRequestPanes> panes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BackgroundCropMode")
        public Integer backgroundCropMode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123.jpg">https://aliyun.com/123.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutRequestClockWidgetsFontColor fontColor;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Y")
        public Double y;

        /**
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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageCropMode")
        public Integer imageCropMode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xxx.jpg">https://aliyun.com/123xxx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Height")
        public Double height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneImageCropMode")
        public Integer paneImageCropMode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xxx.jpg">https://aliyun.com/123xxx.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("Width")
        public Double width;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutRequestPanesTextsFontColor fontColor;

        /**
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>文字水印</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
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
        @NameInMap("Images")
        public java.util.List<ModifyViewLayoutRequestPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public String paneId;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("BoxAlpha")
        public Double boxAlpha;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BoxBorderw")
        public Integer boxBorderw;

        @NameInMap("BoxColor")
        public ModifyViewLayoutRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutRequestTextsFontColor fontColor;

        /**
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("HasBox")
        public Boolean hasBox;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public Integer layer;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>文字水印</p>
         */
        @NameInMap("Texture")
        public String texture;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("X")
        public Double x;

        /**
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
