// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartRecordTaskRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

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
     * <p>The cropping mode of the video. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: crops the video while maintaining the aspect ratio.</li>
     * <li><strong>2</strong> (default): adds padding to the video while maintaining the aspect ratio.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CropMode")
    public Long cropMode;

    /**
     * <p>The list of layout IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>The encoding option. For more information, see the MediaEncode enum values below.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <p>The recording mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: single-stream recording. Task parameters cannot be modified during the recording process. You cannot call the UpdateRecordTask operation to modify task parameters.</li>
     * <li><strong>1</strong> (default): mixed-stream recording. Multiple video streams are mixed and output.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Valid parameters in single-stream recording mode: StreamType and SourceType.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Valid parameters in mixed-stream recording mode: TaskProfile, MediaEncode, LayoutIds, BackgroundColor, SubSpecUsers, CropMode, UserPanes, Backgrounds, Watermarks, and ClockWidgets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The video source in single-stream recording mode. Valid values:</p>
     * <ul>
     * <li><strong>camera</strong>: the camera.</li>
     * <li><strong>shareScreen</strong>: screen sharing.</li>
     * </ul>
     * <blockquote>
     * <p>If the video source is shareScreen and only the camera stream is ingested, the camera stream is recorded. If both the camera stream and the screen sharing stream are ingested, the screen sharing stream is recorded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>camera</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The single-stream recording mode. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): records the original stream.</li>
     * <li><strong>1</strong>: records only the audio stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    /**
     * <p>Specifies the users whose audio streams are subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera streams are subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing streams are subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The task ID. Only a single ID is supported and the ID must be unique. The ID must be 1 to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The billing configuration of the task. You are charged based on your settings. For more information, see the TaskProfile enum values below.</p>
     * <blockquote>
     * <ul>
     * <li>The resolution of the MediaEncode encoding option must be less than or equal to the resolution of TaskProfile.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The maximum number of panes in the layout must be less than or equal to the number of input streams specified by TaskProfile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4IN_1080P</p>
     */
    @NameInMap("TaskProfile")
    public String taskProfile;

    /**
     * <p>The configuration template ID. For more information about how to obtain the template ID, see <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Specifies the users whose audio streams are not subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera streams are not subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing streams are not subscribed to in the channel.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

    /**
     * <p>The list of layout parameters.</p>
     */
    @NameInMap("UserPanes")
    public java.util.List<StartRecordTaskRequestUserPanes> userPanes;

    public static StartRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRecordTaskRequest self = new StartRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartRecordTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRecordTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRecordTaskRequest setCropMode(Long cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Long getCropMode() {
        return this.cropMode;
    }

    public StartRecordTaskRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public StartRecordTaskRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public StartRecordTaskRequest setMixMode(Integer mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public Integer getMixMode() {
        return this.mixMode;
    }

    public StartRecordTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartRecordTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public StartRecordTaskRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public StartRecordTaskRequest setSubSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
        this.subSpecAudioUsers = subSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    public StartRecordTaskRequest setSubSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
        this.subSpecCameraUsers = subSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    public StartRecordTaskRequest setSubSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
        this.subSpecShareScreenUsers = subSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    public StartRecordTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public StartRecordTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartRecordTaskRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public StartRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartRecordTaskRequest setUnsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
        this.unsubSpecAudioUsers = unsubSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    public StartRecordTaskRequest setUnsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
        this.unsubSpecCameraUsers = unsubSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    public StartRecordTaskRequest setUnsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
        this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    public StartRecordTaskRequest setUserPanes(java.util.List<StartRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<StartRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class StartRecordTaskRequestUserPanesImages extends TeaModel {
        /**
         * <p>The display mode of the image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (None): The image is not displayed.</li>
         * <li><strong>1</strong> (Always): The image is always displayed.</li>
         * <li><strong>2</strong> (Backup): The image is displayed when the current user has no video stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>The height of the pane, represented as a normalized percentage.</p>
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
         * <p>The width of the pane, represented as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X coordinate, represented as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y coordinate, represented as a normalized percentage.</p>
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

        public static StartRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartRecordTaskRequestUserPanesImages self = new StartRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public StartRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartRecordTaskRequestUserPanesTexts extends TeaModel {
        /**
         * <p>The text color in RGB format. The calculation formula is R + G × 256 + B × 65536. Valid values of R (red), G (green), and B (blue): <strong>0 to 255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <p>The font size. Valid values: <strong>(0, 72]</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The font type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): NOTO_SERIF_CJKSC_REGULAR.</li>
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
         * <p>The X coordinate, represented as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y coordinate, represented as a normalized percentage.</p>
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

        public static StartRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartRecordTaskRequestUserPanesTexts self = new StartRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public StartRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public StartRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class StartRecordTaskRequestUserPanes extends TeaModel {
        /**
         * <p>The list of image panes in the current layout.</p>
         */
        @NameInMap("Images")
        public java.util.List<StartRecordTaskRequestUserPanesImages> images;

        /**
         * <p>The pane ID. Valid values: <strong>0</strong> to <strong>15</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If the user specified by PaneId is not found, other streams are displayed by default. The streams are determined based on the order in which users join the channel.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If a parameter related to UserPanes is required, all other related parameters are also required. Otherwise, none of them are required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>The user video input that corresponds to the layout. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong> (default): the video stream.</li>
         * <li><strong>shareScreen</strong>: the screen sharing stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The list of text panes in the current layout.</p>
         */
        @NameInMap("Texts")
        public java.util.List<StartRecordTaskRequestUserPanesTexts> texts;

        /**
         * <p>The ID of the user that corresponds to the layout pane. Valid values of N: <strong>1 to 16</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static StartRecordTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            StartRecordTaskRequestUserPanes self = new StartRecordTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public StartRecordTaskRequestUserPanes setImages(java.util.List<StartRecordTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<StartRecordTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public StartRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public StartRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartRecordTaskRequestUserPanes setTexts(java.util.List<StartRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public StartRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
