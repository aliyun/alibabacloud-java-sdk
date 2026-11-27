// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartMPUTaskRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID is supported.</p>
     * <p>You can create and query it in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The RGB value of the background color. Default value: <strong>0</strong> (black).</p>
     * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): 0 to 255.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    /**
     * <p>The canvas background image panes.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<StartMPUTaskRequestBackgrounds> backgrounds;

    /**
     * <p>The channel ID. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The clock widgets.</p>
     */
    @NameInMap("ClockWidgets")
    public java.util.List<StartMPUTaskRequestClockWidgets> clockWidgets;

    /**
     * <p>The video cropping mode. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: crop while keeping the aspect ratio.</p>
     * </li>
     * <li><p><strong>2</strong>: keep the aspect ratio and add padding (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    /**
     * <p>The enhanced parameters.</p>
     */
    @NameInMap("EnhancedParam")
    public StartMPUTaskRequestEnhancedParam enhancedParam;

    /**
     * <p>The layout IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>The encoding options. For more information, see the MediaEncode enum values below.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <p>The mixed streaming mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: single-stream relay. The original single stream is relayed without mixed-stream transcoding. You do not need to configure mixed-stream transcoding parameters.</li>
     * <li><strong>1</strong>: mixed-stream transcoding (default). Mixed-stream transcoding output is supported.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Valid parameters in single-stream relay mode: <strong>StreamType</strong>, <strong>SourceType</strong>, and <strong>SubSpecUsers</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Valid parameters in mixed-stream transcoding mode: <strong>MediaEncode</strong>, <strong>LayoutIds</strong>, <strong>BackgroundColor</strong>, <strong>SubSpecUsers</strong>, <strong>CropMode</strong>, <strong>UserPanes</strong>, <strong>Backgrounds</strong>, and <strong>Watermarks</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The payload type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: do not use a payload.</li>
     * <li><strong>1</strong>: use VideoSEI.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PayloadType")
    public Integer payloadType;

    /**
     * <p>The voice activity detection (VAD) flag. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: do not pass VAD information.</li>
     * <li><strong>1</strong>: pass VAD information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportVad")
    public Integer reportVad;

    /**
     * <p>The RTP extension header information. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: do not pass.</li>
     * <li><strong>1</strong>: pass.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RtpExtInfo")
    public Integer rtpExtInfo;

    /**
     * <p>The user video input stream in single-stream relay mode. Valid values:</p>
     * <ul>
     * <li><strong>camera</strong>: camera.</li>
     * <li><strong>shareScreen</strong>: screen sharing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>camera</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The stream type to relay in single-stream relay mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: relay the original stream.</li>
     * <li><strong>1</strong>: relay only the audio stream.</li>
     * <li><strong>2</strong>: relay only the video stream.</li>
     * </ul>
     * <p>By default, the original stream is relayed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    /**
     * <p>The live streaming ingest URL. Only a single URL is supported. For more information about the generation rules, see <a href="https://help.aliyun.com/document_detail/199339.html">Ingest and streaming URLs</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For domain names with hotlink protection authentication enabled, the ingest URL must include an authentication string.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The same StreamURL cannot be used simultaneously in different tasks.</li>
     * <li>The same StreamURL cannot be used within 10 seconds after a task is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp://example.com/live/stream</p>
     */
    @NameInMap("StreamURL")
    public String streamURL;

    /**
     * <p>Specifies the users whose audio streams are subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>audioUserID</p>
     */
    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera video streams are subscribed to in the channel.</p>
     */
    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing video streams are subscribed to in the channel.</p>
     */
    @NameInMap("SubSpecShareScreenUsers")
    public java.util.List<String> subSpecShareScreenUsers;

    /**
     * <p>Specifies the list of users to which the task subscribes.</p>
     * 
     * <strong>example:</strong>
     * <p>userID</p>
     */
    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    /**
     * <p>The task ID. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
     * <blockquote>
     * <p>This ID identifies the bypass live streaming task and must be unique.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The media processing type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: bypass live streaming task.</li>
     * <li><strong>1</strong>: MCU mixed-stream low-latency distribution task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>15273582735</p>
     */
    @NameInMap("TimeStampRef")
    public Long timeStampRef;

    /**
     * <p>Specifies the users whose audio streams are not subscribed to in the channel.</p>
     */
    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera video streams are not subscribed to in the channel.</p>
     */
    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing video streams are not subscribed to in the channel.</p>
     */
    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

    /**
     * <p>The layout parameters.</p>
     */
    @NameInMap("UserPanes")
    public java.util.List<StartMPUTaskRequestUserPanes> userPanes;

    /**
     * <p>The callback interval for voice activity detection.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("VadInterval")
    public Long vadInterval;

    /**
     * <p>The watermark image panes.</p>
     */
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
         * <p>Specifies whether to display the image. Valid values:</p>
         * <ul>
         * <li><strong>0 (None)</strong>: not displayed.</li>
         * <li><strong>1 (Always)</strong>: always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>The height of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The HTTP or HTTPS URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
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
         * <p>The transparency of the text box and text. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <p>The text stroke color in RGB format.
         * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderColor")
        public Long borderColor;

        /**
         * <p>The text stroke width, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>Specifies whether to display the text box. Valid values:</p>
         * <ul>
         * <li>false (default): not displayed.</li>
         * <li>true: displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Box")
        public Boolean box;

        /**
         * <p>The text box border width, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        /**
         * <p>The text box color in RGB format.
         * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxColor")
        public Long boxColor;

        /**
         * <p>The text color in RGB format.</p>
         * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The font type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: NOTO_SERIF_CJKSC_REGULAR (default).</li>
         * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
         * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
         * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
         * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
         * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontType")
        public Integer fontType;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
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
         * <p>Specifies whether to enable the portrait segmentation feature (in closed beta). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong> (default): disabled.</li>
         * </ul>
         * 
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
         * <p>Specifies whether to display the image. Valid values:</p>
         * <ul>
         * <li><strong>0 (None)</strong>: not displayed.</li>
         * <li><strong>1 (Always)</strong>: always displayed.</li>
         * <li><strong>2 (Backup)</strong>: displayed when the current user has no video stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>The height of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The HTTP or HTTPS URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
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
         * <p>The transparency of the text box and text. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <p>The text stroke color in RGB format.
         * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BorderColor")
        public Long borderColor;

        /**
         * <p>The text stroke width, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BorderWidth")
        public Integer borderWidth;

        /**
         * <p>Specifies whether to display the text box. Valid values:</p>
         * <ul>
         * <li>false (default): not displayed.</li>
         * <li>true: displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Box")
        public Boolean box;

        /**
         * <p>The text box border width, in pixels. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        /**
         * <p>The text box color in RGB format.
         * The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BoxColor")
        public Long boxColor;

        /**
         * <p>The text color in RGB format.</p>
         * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <p>The font size. Valid values: <strong>0</strong> to <strong>72</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The font type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: NOTO_SERIF_CJKSC_REGULAR (default).</li>
         * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
         * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
         * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
         * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
         * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontType")
        public Integer fontType;

        /**
         * <p>The text content.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
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
        /**
         * <p>The image panes in the current layout.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartMPUTaskRequestUserPanesImages> images;

        /**
         * <p>The pane ID. Valid values: <strong>0</strong> to <strong>15</strong>.</p>
         * <blockquote>
         * <p>If the user specified by PaneId is not found, the system displays other streams by default. The streams are determined based on the order in which users join the channel.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>The portrait segmentation type. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: no portrait segmentation (default).</p>
         * </li>
         * <li><p><strong>1</strong>: portrait segmentation. This value takes effect only after the portrait segmentation feature is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SegmentType")
        public Integer segmentType;

        /**
         * <p>The user video input corresponding to the layout. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong>: video stream (default).</li>
         * <li><strong>shareScreen</strong>: screen sharing stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The text panes in the current layout.</p>
         */
        @NameInMap("Texts")
        public java.util.List<StartMPUTaskRequestUserPanesTexts> texts;

        /**
         * <p>The ID of the user corresponding to the layout pane. Valid values: <strong>1</strong> to <strong>16</strong>.</p>
         * 
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
         * <p>The transparency. A value of 0.0 indicates fully transparent, and 1.0 indicates fully opaque.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <p>Specifies whether to display the image. Valid values:</p>
         * <ul>
         * <li><strong>0 (None)</strong>: not displayed.</li>
         * <li><strong>1 (Always)</strong>: always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>The height of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The HTTP or HTTPS URL of the image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width of the pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The stacking order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
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
