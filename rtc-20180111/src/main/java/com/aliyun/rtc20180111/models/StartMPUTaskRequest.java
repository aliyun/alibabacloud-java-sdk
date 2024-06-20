// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<StartMPUTaskRequestBackgrounds> backgrounds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ClockWidgets")
    public java.util.List<StartMPUTaskRequestClockWidgets> clockWidgets;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("EnhancedParam")
    public StartMPUTaskRequestEnhancedParam enhancedParam;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PayloadType")
    public Integer payloadType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportVad")
    public Integer reportVad;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RtpExtInfo")
    public Integer rtpExtInfo;

    /**
     * <strong>example:</strong>
     * <p>camera</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    /**
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <strong>example:</strong>
     * <p>audioUserID</p>
     */
    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    @NameInMap("SubSpecShareScreenUsers")
    public java.util.List<String> subSpecShareScreenUsers;

    /**
     * <strong>example:</strong>
     * <p>userID</p>
     */
    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    /**
     * <strong>example:</strong>
     * <p>15273582735</p>
     */
    @NameInMap("TimeStampRef")
    public Long timeStampRef;

    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

    @NameInMap("UserPanes")
    public java.util.List<StartMPUTaskRequestUserPanes> userPanes;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("VadInterval")
    public Long vadInterval;

    @NameInMap("Watermarks")
    public java.util.List<StartMPUTaskRequestWatermarks> watermarks;

    public static StartMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMPUTaskRequest self = new StartMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartMPUTaskRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public StartMPUTaskRequest setBackgrounds(java.util.List<StartMPUTaskRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<StartMPUTaskRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public StartMPUTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartMPUTaskRequest setClockWidgets(java.util.List<StartMPUTaskRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<StartMPUTaskRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public StartMPUTaskRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartMPUTaskRequest setEnhancedParam(StartMPUTaskRequestEnhancedParam enhancedParam) {
        this.enhancedParam = enhancedParam;
        return this;
    }
    public StartMPUTaskRequestEnhancedParam getEnhancedParam() {
        return this.enhancedParam;
    }

    public StartMPUTaskRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public StartMPUTaskRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public StartMPUTaskRequest setMixMode(Integer mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public Integer getMixMode() {
        return this.mixMode;
    }

    public StartMPUTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public StartMPUTaskRequest setStreamURL(String streamURL) {
        this.streamURL = streamURL;
        return this;
    }
    public String getStreamURL() {
        return this.streamURL;
    }

    public StartMPUTaskRequest setSubSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
        this.subSpecAudioUsers = subSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    public StartMPUTaskRequest setSubSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
        this.subSpecCameraUsers = subSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    public StartMPUTaskRequest setSubSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
        this.subSpecShareScreenUsers = subSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    public StartMPUTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public StartMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartMPUTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public StartMPUTaskRequest setTimeStampRef(Long timeStampRef) {
        this.timeStampRef = timeStampRef;
        return this;
    }
    public Long getTimeStampRef() {
        return this.timeStampRef;
    }

    public StartMPUTaskRequest setUnsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
        this.unsubSpecAudioUsers = unsubSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    public StartMPUTaskRequest setUnsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
        this.unsubSpecCameraUsers = unsubSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    public StartMPUTaskRequest setUnsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
        this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    public StartMPUTaskRequest setUserPanes(java.util.List<StartMPUTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<StartMPUTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public StartMPUTaskRequest setVadInterval(Long vadInterval) {
        this.vadInterval = vadInterval;
        return this;
    }
    public Long getVadInterval() {
        return this.vadInterval;
    }

    public StartMPUTaskRequest setWatermarks(java.util.List<StartMPUTaskRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<StartMPUTaskRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class StartMPUTaskRequestBackgrounds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartMPUTaskRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestBackgrounds self = new StartMPUTaskRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartMPUTaskRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartMPUTaskRequestClockWidgets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderColor")
        public Long borderColor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Box")
        public Boolean box;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxColor")
        public Long boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontType")
        public Integer fontType;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartMPUTaskRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestClockWidgets self = new StartMPUTaskRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestClockWidgets setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public StartMPUTaskRequestClockWidgets setBorderColor(Long borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public Long getBorderColor() {
            return this.borderColor;
        }

        public StartMPUTaskRequestClockWidgets setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public StartMPUTaskRequestClockWidgets setBox(Boolean box) {
            this.box = box;
            return this;
        }
        public Boolean getBox() {
            return this.box;
        }

        public StartMPUTaskRequestClockWidgets setBoxBorderWidth(Integer boxBorderWidth) {
            this.boxBorderWidth = boxBorderWidth;
            return this;
        }
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        public StartMPUTaskRequestClockWidgets setBoxColor(Long boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public Long getBoxColor() {
            return this.boxColor;
        }

        public StartMPUTaskRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartMPUTaskRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartMPUTaskRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartMPUTaskRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
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

    }

    public static class StartMPUTaskRequestEnhancedParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePortraitSegmentation")
        public Boolean enablePortraitSegmentation;

        public static StartMPUTaskRequestEnhancedParam build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestEnhancedParam self = new StartMPUTaskRequestEnhancedParam();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestEnhancedParam setEnablePortraitSegmentation(Boolean enablePortraitSegmentation) {
            this.enablePortraitSegmentation = enablePortraitSegmentation;
            return this;
        }
        public Boolean getEnablePortraitSegmentation() {
            return this.enablePortraitSegmentation;
        }

    }

    public static class StartMPUTaskRequestUserPanesImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartMPUTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestUserPanesImages self = new StartMPUTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartMPUTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartMPUTaskRequestUserPanesTexts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderColor")
        public Long borderColor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Box")
        public Boolean box;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxColor")
        public Long boxColor;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontType")
        public Integer fontType;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static StartMPUTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartMPUTaskRequestUserPanesTexts self = new StartMPUTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartMPUTaskRequestUserPanesTexts setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public StartMPUTaskRequestUserPanesTexts setBorderColor(Long borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public Long getBorderColor() {
            return this.borderColor;
        }

        public StartMPUTaskRequestUserPanesTexts setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public StartMPUTaskRequestUserPanesTexts setBox(Boolean box) {
            this.box = box;
            return this;
        }
        public Boolean getBox() {
            return this.box;
        }

        public StartMPUTaskRequestUserPanesTexts setBoxBorderWidth(Integer boxBorderWidth) {
            this.boxBorderWidth = boxBorderWidth;
            return this;
        }
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        public StartMPUTaskRequestUserPanesTexts setBoxColor(Long boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public Long getBoxColor() {
            return this.boxColor;
        }

        public StartMPUTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartMPUTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartMPUTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartMPUTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public StartMPUTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartMPUTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartMPUTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<StartMPUTaskRequestUserPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SegmentType")
        public Integer segmentType;

        /**
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<StartMPUTaskRequestUserPanesTexts> texts;

        /**
         * <strong>example:</strong>
         * <p>TestId</p>
         */
        @NameInMap("UserId")
        public String userId;

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

        public StartMPUTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartMPUTaskRequestUserPanes setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public StartMPUTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartMPUTaskRequestUserPanes setTexts(java.util.List<StartMPUTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartMPUTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public StartMPUTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class StartMPUTaskRequestWatermarks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

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

        public StartMPUTaskRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartMPUTaskRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartMPUTaskRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartMPUTaskRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartMPUTaskRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartMPUTaskRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartMPUTaskRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
