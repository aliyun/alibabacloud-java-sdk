// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateStreamingOutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateStreamingOutRequestClockWidgets> clockWidgets;

    @NameInMap("Images")
    public java.util.List<UpdateStreamingOutRequestImages> images;

    @NameInMap("Panes")
    public java.util.List<UpdateStreamingOutRequestPanes> panes;

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

    public UpdateStreamingOutRequest setImages(java.util.List<UpdateStreamingOutRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestImages> getImages() {
        return this.images;
    }

    public UpdateStreamingOutRequest setPanes(java.util.List<UpdateStreamingOutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<UpdateStreamingOutRequestPanes> getPanes() {
        return this.panes;
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

    public static class UpdateStreamingOutRequestClockWidgetsBoxColor extends TeaModel {
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
        public UpdateStreamingOutRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutRequestClockWidgetsFontColor fontColor;

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

    public static class UpdateStreamingOutRequestPanesImages extends TeaModel {
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
        public UpdateStreamingOutRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutRequestPanesTextsFontColor fontColor;

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

    public static class UpdateStreamingOutRequestPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateStreamingOutRequestPanesImages> images;

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
        public java.util.List<UpdateStreamingOutRequestPanesTexts> texts;

        public static UpdateStreamingOutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateStreamingOutRequestPanes self = new UpdateStreamingOutRequestPanes();
            return TeaModel.build(map, self);
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

    }

    public static class UpdateStreamingOutRequestTextsBoxColor extends TeaModel {
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
        public UpdateStreamingOutRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateStreamingOutRequestTextsFontColor fontColor;

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
