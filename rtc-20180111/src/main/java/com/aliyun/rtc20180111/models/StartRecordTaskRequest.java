// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartRecordTaskRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CropMode")
    public Long cropMode;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("OwnerId")
    public Long ownerId;

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
     * <p>1</p>
     */
    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
     * <p>4IN_1080P</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

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
         * <strong>example:</strong>
         * <p>1</p>
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
        @NameInMap("Images")
        public java.util.List<StartRecordTaskRequestUserPanesImages> images;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
        public java.util.List<StartRecordTaskRequestUserPanesTexts> texts;

        /**
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
