// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTaskRequest extends TeaModel {
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

    @NameInMap("CropMode")
    public Long cropMode;

    /**
     * <p>The array of layout IDs.</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    @NameInMap("MediaEncode")
    public Long mediaEncode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies the users whose audio streams are subscribed to in the channel.</p>
     */
    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera streams are subscribed to in the channel.</p>
     */
    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing streams are subscribed to in the channel.</p>
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
     * <p>The task ID. Only a single ID is supported. The value must be the same as the TaskId request parameter of <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

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
     */
    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    /**
     * <p>Specifies the users whose camera streams are not subscribed to in the channel.</p>
     */
    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    /**
     * <p>Specifies the users whose screen sharing streams are not subscribed to in the channel.</p>
     */
    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

    /**
     * <p>The list of layout parameters.</p>
     */
    @NameInMap("UserPanes")
    public java.util.List<UpdateRecordTaskRequestUserPanes> userPanes;

    public static UpdateRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTaskRequest self = new UpdateRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateRecordTaskRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateRecordTaskRequest setCropMode(Long cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Long getCropMode() {
        return this.cropMode;
    }

    public UpdateRecordTaskRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateRecordTaskRequest setMediaEncode(Long mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Long getMediaEncode() {
        return this.mediaEncode;
    }

    public UpdateRecordTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRecordTaskRequest setSubSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
        this.subSpecAudioUsers = subSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    public UpdateRecordTaskRequest setSubSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
        this.subSpecCameraUsers = subSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    public UpdateRecordTaskRequest setSubSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
        this.subSpecShareScreenUsers = subSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    public UpdateRecordTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public UpdateRecordTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateRecordTaskRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public UpdateRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateRecordTaskRequest setUnsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
        this.unsubSpecAudioUsers = unsubSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    public UpdateRecordTaskRequest setUnsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
        this.unsubSpecCameraUsers = unsubSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    public UpdateRecordTaskRequest setUnsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
        this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    public UpdateRecordTaskRequest setUserPanes(java.util.List<UpdateRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<UpdateRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class UpdateRecordTaskRequestUserPanesImages extends TeaModel {
        /**
         * <p>Specifies whether to display the image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (None): Not displayed.</li>
         * <li><strong>1</strong> (Always): Always displayed.</li>
         * <li><strong>2</strong> (Backup): Displayed when the current user has no video stream.</li>
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
         * <p>The Z-order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTaskRequestUserPanesImages self = new UpdateRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateRecordTaskRequestUserPanesTexts extends TeaModel {
        /**
         * <p>The text color in RGB format. The calculation formula is R + G × 256 + B × 65536. Valid values of R (red), G (green), and B (blue): <strong>0 to 255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The Z-order. 0 indicates the bottom layer, 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTaskRequestUserPanesTexts self = new UpdateRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateRecordTaskRequestUserPanes extends TeaModel {
        /**
         * <p>The list of image panes in the current layout.</p>
         */
        @NameInMap("Images")
        public java.util.List<UpdateRecordTaskRequestUserPanesImages> images;

        /**
         * <p>The pane ID. Valid values of N: <strong>1 to 16</strong>. Valid values of PaneId: <strong>0 to 15</strong>.</p>
         * <blockquote>
         * <p>If the user specified by PaneId is not found, other streams are displayed by default. The streams are determined based on the order in which users join the channel.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <p>The video input source of the user corresponding to the layout. Valid values:</p>
         * <ul>
         * <li><strong>camera</strong> (default): the video stream.</li>
         * <li><strong>shareScreen</strong>: the screen sharing stream.</li>
         * </ul>
         * <p>Valid values of N: <strong>1 to 16</strong>.</p>
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
        public java.util.List<UpdateRecordTaskRequestUserPanesTexts> texts;

        /**
         * <p>The ID of the user corresponding to the layout pane. Valid values of N: <strong>1 to 16</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestId</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateRecordTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTaskRequestUserPanes self = new UpdateRecordTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTaskRequestUserPanes setImages(java.util.List<UpdateRecordTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateRecordTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public UpdateRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateRecordTaskRequestUserPanes setTexts(java.util.List<UpdateRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
