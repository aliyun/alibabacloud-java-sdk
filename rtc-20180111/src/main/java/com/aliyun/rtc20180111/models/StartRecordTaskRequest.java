// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartRecordTaskRequest extends TeaModel {
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

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    @NameInMap("UserPanes")
    public java.util.List<StartRecordTaskRequestUserPanes> userPanes;

    public static StartRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRecordTaskRequest self = new StartRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartRecordTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartRecordTaskRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
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

    public StartRecordTaskRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public StartRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartRecordTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public StartRecordTaskRequest setUserPanes(java.util.List<StartRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<StartRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class StartRecordTaskRequestUserPanesImages extends TeaModel {
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

        public static StartRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            StartRecordTaskRequestUserPanesImages self = new StartRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public StartRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public StartRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public StartRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public StartRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public StartRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartRecordTaskRequestUserPanesTexts extends TeaModel {
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

        public static StartRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            StartRecordTaskRequestUserPanesTexts self = new StartRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public StartRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public StartRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public StartRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public StartRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public StartRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public StartRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public StartRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class StartRecordTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<StartRecordTaskRequestUserPanesImages> images;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Texts")
        public java.util.List<StartRecordTaskRequestUserPanesTexts> texts;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("PaneId")
        public Integer paneId;

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

        public StartRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public StartRecordTaskRequestUserPanes setTexts(java.util.List<StartRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<StartRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public StartRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public StartRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

    }

}
