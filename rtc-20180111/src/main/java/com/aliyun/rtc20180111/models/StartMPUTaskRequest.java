// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskProfile")
    public String taskProfile;

    @NameInMap("TaskMode")
    public Integer taskMode;

    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("StreamURL")
    public String streamURL;

    @NameInMap("PayloadType")
    public Integer payloadType;

    @NameInMap("ReportVad")
    public Integer reportVad;

    @NameInMap("RtpExtInfo")
    public Integer rtpExtInfo;

    @NameInMap("TimeStampRef")
    public Long timeStampRef;

    @NameInMap("VadInterval")
    public Long vadInterval;

    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    @NameInMap("LayoutIds")
    public java.util.List<Integer> layoutIds;

    @NameInMap("UserPanes")
    public java.util.List<StartMPUTaskRequestUserPanes> userPanes;

    @NameInMap("Backgrounds")
    public java.util.List<StartMPUTaskRequestBackgrounds> backgrounds;

    @NameInMap("Watermarks")
    public java.util.List<StartMPUTaskRequestWatermarks> watermarks;

    @NameInMap("ClockWidgets")
    public java.util.List<StartMPUTaskRequestClockWidgets> clockWidgets;

    public static StartMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMPUTaskRequest self = new StartMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartMPUTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartMPUTaskRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public StartMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartMPUTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartMPUTaskRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public StartMPUTaskRequest setTaskMode(Integer taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public Integer getTaskMode() {
        return this.taskMode;
    }

    public StartMPUTaskRequest setMixMode(Integer mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public Integer getMixMode() {
        return this.mixMode;
    }

    public StartMPUTaskRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartMPUTaskRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public StartMPUTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public StartMPUTaskRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public StartMPUTaskRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public StartMPUTaskRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public StartMPUTaskRequest setPayloadType(Integer payloadType) {
        this.payloadType = payloadType;
        return this;
    }
    public Integer getPayloadType() {
        return this.payloadType;
    }

    public StartMPUTaskRequest setReportVad(Integer reportVad) {
        this.reportVad = reportVad;
        return this;
    }
    public Integer getReportVad() {
        return this.reportVad;
    }

    public StartMPUTaskRequest setRtpExtInfo(Integer rtpExtInfo) {
        this.rtpExtInfo = rtpExtInfo;
        return this;
    }
    public Integer getRtpExtInfo() {
        return this.rtpExtInfo;
    }

    public StartMPUTaskRequest setTimeStampRef(Long timeStampRef) {
        this.timeStampRef = timeStampRef;
        return this;
    }
    public Long getTimeStampRef() {
        return this.timeStampRef;
    }

    public StartMPUTaskRequest setVadInterval(Long vadInterval) {
        this.vadInterval = vadInterval;
        return this;
    }
    public Long getVadInterval() {
        return this.vadInterval;
    }

    public StartMPUTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public StartMPUTaskRequest setSubSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
        this.subSpecAudioUsers = subSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    public StartMPUTaskRequest setLayoutIds(java.util.List<Integer> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Integer> getLayoutIds() {
        return this.layoutIds;
    }

    public StartMPUTaskRequest setUserPanes(java.util.List<StartMPUTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<StartMPUTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public StartMPUTaskRequest setBackgrounds(java.util.List<StartMPUTaskRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartMPUTaskRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartMPUTaskRequest setWatermarks(java.util.List<StartMPUTaskRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<StartMPUTaskRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public StartMPUTaskRequest setClockWidgets(java.util.List<StartMPUTaskRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartMPUTaskRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public static class StartMPUTaskRequestUserPanesImages extends TeaModel {
        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Url")
        public String url;

        @NameInMap("Display")
        public Integer display;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("X")
        public Float x;

        public static StartMPUTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestUserPanesImages self = new StartMPUTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartMPUTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartMPUTaskRequestUserPanesTexts extends TeaModel {
        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Text")
        public String text;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("X")
        public Float x;

        public static StartMPUTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestUserPanesTexts self = new StartMPUTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartMPUTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartMPUTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public StartMPUTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartMPUTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartMPUTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartMPUTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<StartMPUTaskRequestUserPanesImages> images;

        @NameInMap("SegmentType")
        public Integer segmentType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Texts")
        public java.util.List<StartMPUTaskRequestUserPanesTexts> texts;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("PaneId")
        public Integer paneId;

        public static StartMPUTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestUserPanes self = new StartMPUTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestUserPanes setImages(java.util.List<StartMPUTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartMPUTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public StartMPUTaskRequestUserPanes setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public StartMPUTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartMPUTaskRequestUserPanes setTexts(java.util.List<StartMPUTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartMPUTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public StartMPUTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartMPUTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

    }

    public static class StartMPUTaskRequestBackgrounds extends TeaModel {
        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Url")
        public String url;

        @NameInMap("Display")
        public Integer display;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("X")
        public Float x;

        public static StartMPUTaskRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestBackgrounds self = new StartMPUTaskRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartMPUTaskRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartMPUTaskRequestWatermarks extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

        @NameInMap("Width")
        public Float width;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Url")
        public String url;

        @NameInMap("Display")
        public Integer display;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("X")
        public Float x;

        public static StartMPUTaskRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestWatermarks self = new StartMPUTaskRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public StartMPUTaskRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartMPUTaskRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartMPUTaskRequestClockWidgets extends TeaModel {
        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        @NameInMap("X")
        public Float x;

        @NameInMap("FontSize")
        public Integer fontSize;

        public static StartMPUTaskRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestClockWidgets self = new StartMPUTaskRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartMPUTaskRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartMPUTaskRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartMPUTaskRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartMPUTaskRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

    }

}
