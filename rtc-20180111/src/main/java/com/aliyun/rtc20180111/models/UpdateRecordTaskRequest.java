// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CropMode")
    public Long cropMode;

    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    @NameInMap("MediaEncode")
    public Long mediaEncode;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    @NameInMap("TaskProfile")
    public String taskProfile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

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
        @NameInMap("Images")
        public java.util.List<UpdateRecordTaskRequestUserPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PaneId")
        public Integer paneId;

        /**
         * <strong>example:</strong>
         * <p>camera</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<UpdateRecordTaskRequestUserPanesTexts> texts;

        /**
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
