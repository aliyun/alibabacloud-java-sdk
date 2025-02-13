// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateStreamingOutShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateStreamingOutShrinkRequestBackgrounds> backgrounds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateStreamingOutShrinkRequestClockWidgets> clockWidgets;

    @NameInMap("Images")
    public java.util.List<UpdateStreamingOutShrinkRequestImages> images;

    @NameInMap("LayoutSpecifiedUsers")
    public String layoutSpecifiedUsersShrink;

    @NameInMap("Panes")
    public java.util.List<UpdateStreamingOutShrinkRequestPanes> panes;

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
    public java.util.List<UpdateStreamingOutShrinkRequestTexts> texts;

    public static UpdateStreamingOutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamingOutShrinkRequest self = new UpdateStreamingOutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStreamingOutShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateStreamingOutShrinkRequest setBackgrounds(java.util.List<UpdateStreamingOutShrinkRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateStreamingOutShrinkRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateStreamingOutShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateStreamingOutShrinkRequest setClockWidgets(java.util.List<UpdateStreamingOutShrinkRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateStreamingOutShrinkRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateStreamingOutShrinkRequest setImages(java.util.List<UpdateStreamingOutShrinkRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<UpdateStreamingOutShrinkRequestImages> getImages() {
        return this.images;
    }

    public UpdateStreamingOutShrinkRequest setLayoutSpecifiedUsersShrink(String layoutSpecifiedUsersShrink) {
        this.layoutSpecifiedUsersShrink = layoutSpecifiedUsersShrink;
        return this;
    }
    public String getLayoutSpecifiedUsersShrink() {
        return this.layoutSpecifiedUsersShrink;
    }

    public UpdateStreamingOutShrinkRequest setPanes(java.util.List<UpdateStreamingOutShrinkRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<UpdateStreamingOutShrinkRequestPanes> getPanes() {
        return this.panes;
    }

    public UpdateStreamingOutShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateStreamingOutShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateStreamingOutShrinkRequest setTexts(java.util.List<UpdateStreamingOutShrinkRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<UpdateStreamingOutShrinkRequestTexts> getTexts() {
        return this.texts;
    }

    public static class UpdateStreamingOutShrinkRequestBackgrounds extends TeaModel {
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

        public static UpdateStreamingOutShrinkRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestBackgrounds self = new UpdateStreamingOutShrinkRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutShrinkRequestClockWidgetsBoxColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestClockWidgetsBoxColor self = new UpdateStreamingOutShrinkRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestClockWidgetsFontColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestClockWidgetsFontColor self = new UpdateStreamingOutShrinkRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestClockWidgets extends TeaModel {
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
        public UpdateStreamingOutShrinkRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutShrinkRequestClockWidgetsFontColor fontColor;

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

        public static UpdateStreamingOutShrinkRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestClockWidgets self = new UpdateStreamingOutShrinkRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setBoxColor(UpdateStreamingOutShrinkRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setFontColor(UpdateStreamingOutShrinkRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public UpdateStreamingOutShrinkRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class UpdateStreamingOutShrinkRequestImages extends TeaModel {
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

        public static UpdateStreamingOutShrinkRequestImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestImages self = new UpdateStreamingOutShrinkRequestImages();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutShrinkRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public UpdateStreamingOutShrinkRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutShrinkRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutShrinkRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanesImages extends TeaModel {
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

        public static UpdateStreamingOutShrinkRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanesImages self = new UpdateStreamingOutShrinkRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanesTextsBoxColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanesTextsBoxColor self = new UpdateStreamingOutShrinkRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanesTextsFontColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanesTextsFontColor self = new UpdateStreamingOutShrinkRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanesTexts extends TeaModel {
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
        public UpdateStreamingOutShrinkRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutShrinkRequestPanesTextsFontColor fontColor;

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

        public static UpdateStreamingOutShrinkRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanesTexts self = new UpdateStreamingOutShrinkRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setBoxColor(UpdateStreamingOutShrinkRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setFontColor(UpdateStreamingOutShrinkRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanesWhiteboard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static UpdateStreamingOutShrinkRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanesWhiteboard self = new UpdateStreamingOutShrinkRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class UpdateStreamingOutShrinkRequestPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateStreamingOutShrinkRequestPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

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
        public java.util.List<UpdateStreamingOutShrinkRequestPanesTexts> texts;

        @NameInMap("Whiteboard")
        public UpdateStreamingOutShrinkRequestPanesWhiteboard whiteboard;

        public static UpdateStreamingOutShrinkRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestPanes self = new UpdateStreamingOutShrinkRequestPanes();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestPanes setImages(java.util.List<UpdateStreamingOutShrinkRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateStreamingOutShrinkRequestPanesImages> getImages() {
            return this.images;
        }

        public UpdateStreamingOutShrinkRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public UpdateStreamingOutShrinkRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateStreamingOutShrinkRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateStreamingOutShrinkRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateStreamingOutShrinkRequestPanes setTexts(java.util.List<UpdateStreamingOutShrinkRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateStreamingOutShrinkRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateStreamingOutShrinkRequestPanes setWhiteboard(UpdateStreamingOutShrinkRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public UpdateStreamingOutShrinkRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class UpdateStreamingOutShrinkRequestTextsBoxColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestTextsBoxColor self = new UpdateStreamingOutShrinkRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestTextsFontColor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static UpdateStreamingOutShrinkRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestTextsFontColor self = new UpdateStreamingOutShrinkRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public UpdateStreamingOutShrinkRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public UpdateStreamingOutShrinkRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class UpdateStreamingOutShrinkRequestTexts extends TeaModel {
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
        public UpdateStreamingOutShrinkRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutShrinkRequestTextsFontColor fontColor;

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

        public static UpdateStreamingOutShrinkRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutShrinkRequestTexts self = new UpdateStreamingOutShrinkRequestTexts();
            return TeaModel.build(map, self);
        }

        public UpdateStreamingOutShrinkRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public UpdateStreamingOutShrinkRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public UpdateStreamingOutShrinkRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public UpdateStreamingOutShrinkRequestTexts setBoxColor(UpdateStreamingOutShrinkRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public UpdateStreamingOutShrinkRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public UpdateStreamingOutShrinkRequestTexts setFontColor(UpdateStreamingOutShrinkRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public UpdateStreamingOutShrinkRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public UpdateStreamingOutShrinkRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateStreamingOutShrinkRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public UpdateStreamingOutShrinkRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public UpdateStreamingOutShrinkRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public UpdateStreamingOutShrinkRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public UpdateStreamingOutShrinkRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
