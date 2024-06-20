// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateCloudRecordRequest extends TeaModel {
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
    public java.util.List<UpdateCloudRecordRequestClockWidgets> clockWidgets;

    @NameInMap("Images")
    public java.util.List<UpdateCloudRecordRequestImages> images;

    @NameInMap("Panes")
    public java.util.List<UpdateCloudRecordRequestPanes> panes;

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

    public static class UpdateCloudRecordRequestClockWidgetsBoxColor extends TeaModel {
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
        public UpdateCloudRecordRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateCloudRecordRequestClockWidgetsFontColor fontColor;

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

    public static class UpdateCloudRecordRequestPanesImages extends TeaModel {
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
        public UpdateCloudRecordRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateCloudRecordRequestPanesTextsFontColor fontColor;

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

    public static class UpdateCloudRecordRequestPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateCloudRecordRequestPanesImages> images;

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
        public java.util.List<UpdateCloudRecordRequestPanesTexts> texts;

        public static UpdateCloudRecordRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateCloudRecordRequestPanes self = new UpdateCloudRecordRequestPanes();
            return TeaModel.build(map, self);
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

    }

    public static class UpdateCloudRecordRequestTextsBoxColor extends TeaModel {
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
        public UpdateCloudRecordRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public UpdateCloudRecordRequestTextsFontColor fontColor;

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
