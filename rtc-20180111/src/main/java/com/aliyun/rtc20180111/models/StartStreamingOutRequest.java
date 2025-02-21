// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Backgrounds")
    public java.util.List<StartStreamingOutRequestBackgrounds> backgrounds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<StartStreamingOutRequestClockWidgets> clockWidgets;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("Images")
    public java.util.List<StartStreamingOutRequestImages> images;

    @NameInMap("LayoutSpecifiedUsers")
    public StartStreamingOutRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    @NameInMap("Panes")
    public java.util.List<StartStreamingOutRequestPanes> panes;

    @NameInMap("RegionColor")
    public StartStreamingOutRequestRegionColor regionColor;

    @NameInMap("ReservePaneForNoCameraUser")
    public Boolean reservePaneForNoCameraUser;

    @NameInMap("StartWithoutChannel")
    public Boolean startWithoutChannel;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
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
    public java.util.List<StartStreamingOutRequestTexts> texts;

    /**
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

    public static class StartStreamingOutRequestClockWidgetsBoxColor extends TeaModel {
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
        public StartStreamingOutRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartStreamingOutRequestClockWidgetsFontColor fontColor;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>This parameter is required.</p>
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

    public static class StartStreamingOutRequestPanesImages extends TeaModel {
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
        public StartStreamingOutRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartStreamingOutRequestPanesTextsFontColor fontColor;

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
        @NameInMap("Images")
        public java.util.List<StartStreamingOutRequestPanesImages> images;

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

        @NameInMap("ReservePaneForOfflineUser")
        public Boolean reservePaneForOfflineUser;

        /**
         * <strong>example:</strong>
         * <p>1811****</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>Video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<StartStreamingOutRequestPanesTexts> texts;

        /**
         * <strong>example:</strong>
         * <p>cameraFirst</p>
         */
        @NameInMap("VideoOrder")
        public String videoOrder;

        @NameInMap("Whiteboard")
        public StartStreamingOutRequestPanesWhiteboard whiteboard;

        public static StartStreamingOutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanes self = new StartStreamingOutRequestPanes();
            return TeaModel.build(map, self);
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
        public StartStreamingOutRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartStreamingOutRequestTextsFontColor fontColor;

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
