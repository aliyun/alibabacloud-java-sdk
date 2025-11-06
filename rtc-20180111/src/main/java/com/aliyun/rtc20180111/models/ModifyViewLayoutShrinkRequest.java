// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyViewLayoutShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Backgrounds")
    public java.util.List<ModifyViewLayoutShrinkRequestBackgrounds> backgrounds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<ModifyViewLayoutShrinkRequestClockWidgets> clockWidgets;

    @NameInMap("Images")
    public java.util.List<ModifyViewLayoutShrinkRequestImages> images;

    @NameInMap("LayoutSpecifiedUsers")
    public String layoutSpecifiedUsersShrink;

    @NameInMap("Panes")
    public java.util.List<ModifyViewLayoutShrinkRequestPanes> panes;

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
    public java.util.List<ModifyViewLayoutShrinkRequestTexts> texts;

    public static ModifyViewLayoutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyViewLayoutShrinkRequest self = new ModifyViewLayoutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyViewLayoutShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyViewLayoutShrinkRequest setBackgrounds(java.util.List<ModifyViewLayoutShrinkRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<ModifyViewLayoutShrinkRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public ModifyViewLayoutShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ModifyViewLayoutShrinkRequest setClockWidgets(java.util.List<ModifyViewLayoutShrinkRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<ModifyViewLayoutShrinkRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public ModifyViewLayoutShrinkRequest setImages(java.util.List<ModifyViewLayoutShrinkRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ModifyViewLayoutShrinkRequestImages> getImages() {
        return this.images;
    }

    public ModifyViewLayoutShrinkRequest setLayoutSpecifiedUsersShrink(String layoutSpecifiedUsersShrink) {
        this.layoutSpecifiedUsersShrink = layoutSpecifiedUsersShrink;
        return this;
    }
    public String getLayoutSpecifiedUsersShrink() {
        return this.layoutSpecifiedUsersShrink;
    }

    public ModifyViewLayoutShrinkRequest setPanes(java.util.List<ModifyViewLayoutShrinkRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<ModifyViewLayoutShrinkRequestPanes> getPanes() {
        return this.panes;
    }

    public ModifyViewLayoutShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyViewLayoutShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ModifyViewLayoutShrinkRequest setTexts(java.util.List<ModifyViewLayoutShrinkRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<ModifyViewLayoutShrinkRequestTexts> getTexts() {
        return this.texts;
    }

    public static class ModifyViewLayoutShrinkRequestBackgrounds extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestBackgrounds self = new ModifyViewLayoutShrinkRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutShrinkRequestClockWidgetsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestClockWidgetsBoxColor self = new ModifyViewLayoutShrinkRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestClockWidgetsFontColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestClockWidgetsFontColor self = new ModifyViewLayoutShrinkRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestClockWidgets extends TeaModel {
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
        public ModifyViewLayoutShrinkRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutShrinkRequestClockWidgetsFontColor fontColor;

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

        public static ModifyViewLayoutShrinkRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestClockWidgets self = new ModifyViewLayoutShrinkRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setBoxColor(ModifyViewLayoutShrinkRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setFontColor(ModifyViewLayoutShrinkRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public ModifyViewLayoutShrinkRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class ModifyViewLayoutShrinkRequestImages extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestImages build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestImages self = new ModifyViewLayoutShrinkRequestImages();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutShrinkRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public ModifyViewLayoutShrinkRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutShrinkRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutShrinkRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutShrinkRequestPanesImages extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestPanesImages self = new ModifyViewLayoutShrinkRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutShrinkRequestPanesTextsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestPanesTextsBoxColor self = new ModifyViewLayoutShrinkRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestPanesTextsFontColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestPanesTextsFontColor self = new ModifyViewLayoutShrinkRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestPanesTexts extends TeaModel {
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
        public ModifyViewLayoutShrinkRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutShrinkRequestPanesTextsFontColor fontColor;

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

        public static ModifyViewLayoutShrinkRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestPanesTexts self = new ModifyViewLayoutShrinkRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setBoxColor(ModifyViewLayoutShrinkRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setFontColor(ModifyViewLayoutShrinkRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class ModifyViewLayoutShrinkRequestPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<ModifyViewLayoutShrinkRequestPanesImages> images;

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
        public java.util.List<ModifyViewLayoutShrinkRequestPanesTexts> texts;

        public static ModifyViewLayoutShrinkRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestPanes self = new ModifyViewLayoutShrinkRequestPanes();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestPanes setImages(java.util.List<ModifyViewLayoutShrinkRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ModifyViewLayoutShrinkRequestPanesImages> getImages() {
            return this.images;
        }

        public ModifyViewLayoutShrinkRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public ModifyViewLayoutShrinkRequestPanes setPaneId(String paneId) {
            this.paneId = paneId;
            return this;
        }
        public String getPaneId() {
            return this.paneId;
        }

        public ModifyViewLayoutShrinkRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ModifyViewLayoutShrinkRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ModifyViewLayoutShrinkRequestPanes setTexts(java.util.List<ModifyViewLayoutShrinkRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<ModifyViewLayoutShrinkRequestPanesTexts> getTexts() {
            return this.texts;
        }

    }

    public static class ModifyViewLayoutShrinkRequestTextsBoxColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestTextsBoxColor self = new ModifyViewLayoutShrinkRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestTextsFontColor extends TeaModel {
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

        public static ModifyViewLayoutShrinkRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestTextsFontColor self = new ModifyViewLayoutShrinkRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public ModifyViewLayoutShrinkRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public ModifyViewLayoutShrinkRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class ModifyViewLayoutShrinkRequestTexts extends TeaModel {
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
        public ModifyViewLayoutShrinkRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public ModifyViewLayoutShrinkRequestTextsFontColor fontColor;

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

        public static ModifyViewLayoutShrinkRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            ModifyViewLayoutShrinkRequestTexts self = new ModifyViewLayoutShrinkRequestTexts();
            return TeaModel.build(map, self);
        }

        public ModifyViewLayoutShrinkRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public ModifyViewLayoutShrinkRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public ModifyViewLayoutShrinkRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public ModifyViewLayoutShrinkRequestTexts setBoxColor(ModifyViewLayoutShrinkRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public ModifyViewLayoutShrinkRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public ModifyViewLayoutShrinkRequestTexts setFontColor(ModifyViewLayoutShrinkRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public ModifyViewLayoutShrinkRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public ModifyViewLayoutShrinkRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public ModifyViewLayoutShrinkRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public ModifyViewLayoutShrinkRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public ModifyViewLayoutShrinkRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public ModifyViewLayoutShrinkRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public ModifyViewLayoutShrinkRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
