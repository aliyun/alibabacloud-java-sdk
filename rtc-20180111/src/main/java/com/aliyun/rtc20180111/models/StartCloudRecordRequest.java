// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCloudRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Annotation")
    public String annotation;

    /**
     * <p>appId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Backgrounds")
    public java.util.List<StartCloudRecordRequestBackgrounds> backgrounds;

    @NameInMap("BgColor")
    public StartCloudRecordRequestBgColor bgColor;

    /**
     * <p>channelName</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<StartCloudRecordRequestClockWidgets> clockWidgets;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("Images")
    public java.util.List<StartCloudRecordRequestImages> images;

    @NameInMap("LayoutSpecifiedUsers")
    public StartCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers;

    /**
     * <p>panes</p>
     */
    @NameInMap("Panes")
    public java.util.List<StartCloudRecordRequestPanes> panes;

    @NameInMap("RecordMode")
    public Integer recordMode;

    @NameInMap("RegionColor")
    public StartCloudRecordRequestRegionColor regionColor;

    @NameInMap("ReservePaneForNoCameraUser")
    public Boolean reservePaneForNoCameraUser;

    @NameInMap("ShowDefaultBackgroundOnMute")
    public Boolean showDefaultBackgroundOnMute;

    @NameInMap("SingleStreamingRecord")
    public StartCloudRecordRequestSingleStreamingRecord singleStreamingRecord;

    @NameInMap("StartWithoutChannel")
    public Boolean startWithoutChannel;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
     * <p>storageConfig</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StorageConfig")
    public StartCloudRecordRequestStorageConfig storageConfig;

    @NameInMap("SubHighResolutionStream")
    public Boolean subHighResolutionStream;

    /**
     * <p>taskId</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>templateId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Texts")
    public java.util.List<StartCloudRecordRequestTexts> texts;

    public static StartCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordRequest self = new StartCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public StartCloudRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCloudRecordRequest setBackgrounds(java.util.List<StartCloudRecordRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartCloudRecordRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartCloudRecordRequest setBgColor(StartCloudRecordRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartCloudRecordRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartCloudRecordRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartCloudRecordRequest setClockWidgets(java.util.List<StartCloudRecordRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartCloudRecordRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartCloudRecordRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartCloudRecordRequest setImages(java.util.List<StartCloudRecordRequestImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<StartCloudRecordRequestImages> getImages() {
        return this.images;
    }

    public StartCloudRecordRequest setLayoutSpecifiedUsers(StartCloudRecordRequestLayoutSpecifiedUsers layoutSpecifiedUsers) {
        this.layoutSpecifiedUsers = layoutSpecifiedUsers;
        return this;
    }
    public StartCloudRecordRequestLayoutSpecifiedUsers getLayoutSpecifiedUsers() {
        return this.layoutSpecifiedUsers;
    }

    public StartCloudRecordRequest setPanes(java.util.List<StartCloudRecordRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartCloudRecordRequestPanes> getPanes() {
        return this.panes;
    }

    public StartCloudRecordRequest setRecordMode(Integer recordMode) {
        this.recordMode = recordMode;
        return this;
    }
    public Integer getRecordMode() {
        return this.recordMode;
    }

    public StartCloudRecordRequest setRegionColor(StartCloudRecordRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartCloudRecordRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartCloudRecordRequest setReservePaneForNoCameraUser(Boolean reservePaneForNoCameraUser) {
        this.reservePaneForNoCameraUser = reservePaneForNoCameraUser;
        return this;
    }
    public Boolean getReservePaneForNoCameraUser() {
        return this.reservePaneForNoCameraUser;
    }

    public StartCloudRecordRequest setShowDefaultBackgroundOnMute(Boolean showDefaultBackgroundOnMute) {
        this.showDefaultBackgroundOnMute = showDefaultBackgroundOnMute;
        return this;
    }
    public Boolean getShowDefaultBackgroundOnMute() {
        return this.showDefaultBackgroundOnMute;
    }

    public StartCloudRecordRequest setSingleStreamingRecord(StartCloudRecordRequestSingleStreamingRecord singleStreamingRecord) {
        this.singleStreamingRecord = singleStreamingRecord;
        return this;
    }
    public StartCloudRecordRequestSingleStreamingRecord getSingleStreamingRecord() {
        return this.singleStreamingRecord;
    }

    public StartCloudRecordRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartCloudRecordRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartCloudRecordRequest setStorageConfig(StartCloudRecordRequestStorageConfig storageConfig) {
        this.storageConfig = storageConfig;
        return this;
    }
    public StartCloudRecordRequestStorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    public StartCloudRecordRequest setSubHighResolutionStream(Boolean subHighResolutionStream) {
        this.subHighResolutionStream = subHighResolutionStream;
        return this;
    }
    public Boolean getSubHighResolutionStream() {
        return this.subHighResolutionStream;
    }

    public StartCloudRecordRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartCloudRecordRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartCloudRecordRequest setTexts(java.util.List<StartCloudRecordRequestTexts> texts) {
        this.texts = texts;
        return this;
    }
    public java.util.List<StartCloudRecordRequestTexts> getTexts() {
        return this.texts;
    }

    public static class StartCloudRecordRequestBackgrounds extends TeaModel {
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

        public static StartCloudRecordRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestBackgrounds self = new StartCloudRecordRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestBackgrounds setBackgroundCropMode(Integer backgroundCropMode) {
            this.backgroundCropMode = backgroundCropMode;
            return this;
        }
        public Integer getBackgroundCropMode() {
            return this.backgroundCropMode;
        }

        public StartCloudRecordRequestBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestBgColor extends TeaModel {
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

        public static StartCloudRecordRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestBgColor self = new StartCloudRecordRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgetsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestClockWidgetsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgetsBoxColor self = new StartCloudRecordRequestClockWidgetsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestClockWidgetsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgetsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestClockWidgetsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgetsFontColor self = new StartCloudRecordRequestClockWidgetsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgetsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestClockWidgetsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestClockWidgetsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestClockWidgets extends TeaModel {
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
        public StartCloudRecordRequestClockWidgetsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartCloudRecordRequestClockWidgetsFontColor fontColor;

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

        public static StartCloudRecordRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestClockWidgets self = new StartCloudRecordRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestClockWidgets setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestClockWidgets setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestClockWidgets setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestClockWidgets setBoxColor(StartCloudRecordRequestClockWidgetsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestClockWidgetsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestClockWidgets setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestClockWidgets setFontColor(StartCloudRecordRequestClockWidgetsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestClockWidgetsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestClockWidgets setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestClockWidgets setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestClockWidgets setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestClockWidgets setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

        public StartCloudRecordRequestClockWidgets setZone(Integer zone) {
            this.zone = zone;
            return this;
        }
        public Integer getZone() {
            return this.zone;
        }

    }

    public static class StartCloudRecordRequestImages extends TeaModel {
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
         * <p>0.3</p>
         */
        @NameInMap("Y")
        public Double y;

        public static StartCloudRecordRequestImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestImages self = new StartCloudRecordRequestImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestImages setImageCropMode(Integer imageCropMode) {
            this.imageCropMode = imageCropMode;
            return this;
        }
        public Integer getImageCropMode() {
            return this.imageCropMode;
        }

        public StartCloudRecordRequestImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestLayoutSpecifiedUsers extends TeaModel {
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

        public static StartCloudRecordRequestLayoutSpecifiedUsers build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestLayoutSpecifiedUsers self = new StartCloudRecordRequestLayoutSpecifiedUsers();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestLayoutSpecifiedUsers setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public StartCloudRecordRequestLayoutSpecifiedUsers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartCloudRecordRequestPanesBackgrounds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

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
        @NameInMap("PaneBackgroundCropMode")
        public Integer paneBackgroundCropMode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
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

        public static StartCloudRecordRequestPanesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesBackgrounds self = new StartCloudRecordRequestPanesBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesBackgrounds setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesBackgrounds setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesBackgrounds setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestPanesBackgrounds setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesBackgrounds setPaneBackgroundCropMode(Integer paneBackgroundCropMode) {
            this.paneBackgroundCropMode = paneBackgroundCropMode;
            return this;
        }
        public Integer getPaneBackgroundCropMode() {
            return this.paneBackgroundCropMode;
        }

        public StartCloudRecordRequestPanesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestPanesBackgrounds setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestPanesBackgrounds setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesBackgrounds setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("Alpha")
        public Double alpha;

        /**
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

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
         * <p><a href="https://aliyun.com/123xx.jpg">https://aliyun.com/123xx.jpg</a></p>
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

        public static StartCloudRecordRequestPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesImages self = new StartCloudRecordRequestPanesImages();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesImages setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesImages setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesImages setHeight(Double height) {
            this.height = height;
            return this;
        }
        public Double getHeight() {
            return this.height;
        }

        public StartCloudRecordRequestPanesImages setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesImages setPaneImageCropMode(Integer paneImageCropMode) {
            this.paneImageCropMode = paneImageCropMode;
            return this;
        }
        public Integer getPaneImageCropMode() {
            return this.paneImageCropMode;
        }

        public StartCloudRecordRequestPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartCloudRecordRequestPanesImages setWidth(Double width) {
            this.width = width;
            return this;
        }
        public Double getWidth() {
            return this.width;
        }

        public StartCloudRecordRequestPanesImages setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesImages setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesTextsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestPanesTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTextsBoxColor self = new StartCloudRecordRequestPanesTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestPanesTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestPanesTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestPanesTextsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestPanesTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTextsFontColor self = new StartCloudRecordRequestPanesTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestPanesTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestPanesTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestPanesTexts extends TeaModel {
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
        public StartCloudRecordRequestPanesTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>backup</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartCloudRecordRequestPanesTextsFontColor fontColor;

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

        public static StartCloudRecordRequestPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesTexts self = new StartCloudRecordRequestPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestPanesTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestPanesTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestPanesTexts setBoxColor(StartCloudRecordRequestPanesTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestPanesTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestPanesTexts setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public StartCloudRecordRequestPanesTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestPanesTexts setFontColor(StartCloudRecordRequestPanesTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestPanesTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestPanesTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestPanesTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestPanesTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordRequestPanesTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestPanesTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

    public static class StartCloudRecordRequestPanesWhiteboard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("WhiteboardId")
        public String whiteboardId;

        public static StartCloudRecordRequestPanesWhiteboard build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanesWhiteboard self = new StartCloudRecordRequestPanesWhiteboard();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanesWhiteboard setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

    }

    public static class StartCloudRecordRequestPanes extends TeaModel {
        @NameInMap("Backgrounds")
        public java.util.List<StartCloudRecordRequestPanesBackgrounds> backgrounds;

        @NameInMap("Images")
        public java.util.List<StartCloudRecordRequestPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PaneCropMode")
        public Integer paneCropMode;

        /**
         * <p>paneId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("ReservePaneForOfflineUser")
        public Boolean reservePaneForOfflineUser;

        /**
         * <p>source</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>sourceType</p>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<StartCloudRecordRequestPanesTexts> texts;

        /**
         * <strong>example:</strong>
         * <p>cameraFirst</p>
         */
        @NameInMap("VideoOrder")
        public String videoOrder;

        @NameInMap("Whiteboard")
        public StartCloudRecordRequestPanesWhiteboard whiteboard;

        public static StartCloudRecordRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestPanes self = new StartCloudRecordRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestPanes setBackgrounds(java.util.List<StartCloudRecordRequestPanesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public StartCloudRecordRequestPanes setImages(java.util.List<StartCloudRecordRequestPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesImages> getImages() {
            return this.images;
        }

        public StartCloudRecordRequestPanes setPaneCropMode(Integer paneCropMode) {
            this.paneCropMode = paneCropMode;
            return this;
        }
        public Integer getPaneCropMode() {
            return this.paneCropMode;
        }

        public StartCloudRecordRequestPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartCloudRecordRequestPanes setReservePaneForOfflineUser(Boolean reservePaneForOfflineUser) {
            this.reservePaneForOfflineUser = reservePaneForOfflineUser;
            return this;
        }
        public Boolean getReservePaneForOfflineUser() {
            return this.reservePaneForOfflineUser;
        }

        public StartCloudRecordRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartCloudRecordRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartCloudRecordRequestPanes setTexts(java.util.List<StartCloudRecordRequestPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartCloudRecordRequestPanesTexts> getTexts() {
            return this.texts;
        }

        public StartCloudRecordRequestPanes setVideoOrder(String videoOrder) {
            this.videoOrder = videoOrder;
            return this;
        }
        public String getVideoOrder() {
            return this.videoOrder;
        }

        public StartCloudRecordRequestPanes setWhiteboard(StartCloudRecordRequestPanesWhiteboard whiteboard) {
            this.whiteboard = whiteboard;
            return this;
        }
        public StartCloudRecordRequestPanesWhiteboard getWhiteboard() {
            return this.whiteboard;
        }

    }

    public static class StartCloudRecordRequestRegionColor extends TeaModel {
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

        public static StartCloudRecordRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestRegionColor self = new StartCloudRecordRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("StreamType")
        public String streamType;

        /**
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("Type")
        public String type;

        public static StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams self = new StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setStreamType(String streamType) {
            this.streamType = streamType;
            return this;
        }
        public String getStreamType() {
            return this.streamType;
        }

        public StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio extends TeaModel {
        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio self = new StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecordTranscodingParameters extends TeaModel {
        @NameInMap("Audio")
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio audio;

        @NameInMap("Container")
        public String container;

        public static StartCloudRecordRequestSingleStreamingRecordTranscodingParameters build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecordTranscodingParameters self = new StartCloudRecordRequestSingleStreamingRecordTranscodingParameters();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters setAudio(StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio audio) {
            this.audio = audio;
            return this;
        }
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParametersAudio getAudio() {
            return this.audio;
        }

        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

    }

    public static class StartCloudRecordRequestSingleStreamingRecord extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SpecifiedStreams")
        public java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> specifiedStreams;

        @NameInMap("TranscodingParameters")
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters transcodingParameters;

        public static StartCloudRecordRequestSingleStreamingRecord build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestSingleStreamingRecord self = new StartCloudRecordRequestSingleStreamingRecord();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestSingleStreamingRecord setSpecifiedStreams(java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> specifiedStreams) {
            this.specifiedStreams = specifiedStreams;
            return this;
        }
        public java.util.List<StartCloudRecordRequestSingleStreamingRecordSpecifiedStreams> getSpecifiedStreams() {
            return this.specifiedStreams;
        }

        public StartCloudRecordRequestSingleStreamingRecord setTranscodingParameters(StartCloudRecordRequestSingleStreamingRecordTranscodingParameters transcodingParameters) {
            this.transcodingParameters = transcodingParameters;
            return this;
        }
        public StartCloudRecordRequestSingleStreamingRecordTranscodingParameters getTranscodingParameters() {
            return this.transcodingParameters;
        }

    }

    public static class StartCloudRecordRequestStorageConfig extends TeaModel {
        /**
         * <p>accessKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAX***</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>bucket</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket-for-recording</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyuns.dalian.oss.com">https://aliyuns.dalian.oss.com</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>region</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>secretKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APb6qWYEzKtYxE***</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>vendor</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static StartCloudRecordRequestStorageConfig build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestStorageConfig self = new StartCloudRecordRequestStorageConfig();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestStorageConfig setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public StartCloudRecordRequestStorageConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public StartCloudRecordRequestStorageConfig setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public StartCloudRecordRequestStorageConfig setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public StartCloudRecordRequestStorageConfig setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public StartCloudRecordRequestStorageConfig setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class StartCloudRecordRequestTextsBoxColor extends TeaModel {
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

        public static StartCloudRecordRequestTextsBoxColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTextsBoxColor self = new StartCloudRecordRequestTextsBoxColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTextsBoxColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestTextsBoxColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestTextsBoxColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestTextsFontColor extends TeaModel {
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

        public static StartCloudRecordRequestTextsFontColor build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTextsFontColor self = new StartCloudRecordRequestTextsFontColor();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTextsFontColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartCloudRecordRequestTextsFontColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartCloudRecordRequestTextsFontColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartCloudRecordRequestTexts extends TeaModel {
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
        public StartCloudRecordRequestTextsBoxColor boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Font")
        public Integer font;

        @NameInMap("FontColor")
        public StartCloudRecordRequestTextsFontColor fontColor;

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

        public static StartCloudRecordRequestTexts build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTexts self = new StartCloudRecordRequestTexts();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTexts setAlpha(Double alpha) {
            this.alpha = alpha;
            return this;
        }
        public Double getAlpha() {
            return this.alpha;
        }

        public StartCloudRecordRequestTexts setBoxAlpha(Double boxAlpha) {
            this.boxAlpha = boxAlpha;
            return this;
        }
        public Double getBoxAlpha() {
            return this.boxAlpha;
        }

        public StartCloudRecordRequestTexts setBoxBorderw(Integer boxBorderw) {
            this.boxBorderw = boxBorderw;
            return this;
        }
        public Integer getBoxBorderw() {
            return this.boxBorderw;
        }

        public StartCloudRecordRequestTexts setBoxColor(StartCloudRecordRequestTextsBoxColor boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public StartCloudRecordRequestTextsBoxColor getBoxColor() {
            return this.boxColor;
        }

        public StartCloudRecordRequestTexts setFont(Integer font) {
            this.font = font;
            return this;
        }
        public Integer getFont() {
            return this.font;
        }

        public StartCloudRecordRequestTexts setFontColor(StartCloudRecordRequestTextsFontColor fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public StartCloudRecordRequestTextsFontColor getFontColor() {
            return this.fontColor;
        }

        public StartCloudRecordRequestTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartCloudRecordRequestTexts setHasBox(Boolean hasBox) {
            this.hasBox = hasBox;
            return this;
        }
        public Boolean getHasBox() {
            return this.hasBox;
        }

        public StartCloudRecordRequestTexts setLayer(Integer layer) {
            this.layer = layer;
            return this;
        }
        public Integer getLayer() {
            return this.layer;
        }

        public StartCloudRecordRequestTexts setTexture(String texture) {
            this.texture = texture;
            return this;
        }
        public String getTexture() {
            return this.texture;
        }

        public StartCloudRecordRequestTexts setX(Double x) {
            this.x = x;
            return this;
        }
        public Double getX() {
            return this.x;
        }

        public StartCloudRecordRequestTexts setY(Double y) {
            this.y = y;
            return this;
        }
        public Double getY() {
            return this.y;
        }

    }

}
