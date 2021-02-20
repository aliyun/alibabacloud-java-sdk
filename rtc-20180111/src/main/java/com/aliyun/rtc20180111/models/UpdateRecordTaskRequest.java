// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTaskRequest extends TeaModel {
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

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    @NameInMap("UserPanes")
    public java.util.List<UpdateRecordTaskRequestUserPanes> userPanes;

    public static UpdateRecordTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTaskRequest self = new UpdateRecordTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRecordTaskRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
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

    public UpdateRecordTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateRecordTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateRecordTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public UpdateRecordTaskRequest setUserPanes(java.util.List<UpdateRecordTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<UpdateRecordTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public static class UpdateRecordTaskRequestUserPanesImages extends TeaModel {
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

        public static UpdateRecordTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTaskRequestUserPanesImages self = new UpdateRecordTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateRecordTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateRecordTaskRequestUserPanesTexts extends TeaModel {
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

        public static UpdateRecordTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTaskRequestUserPanesTexts self = new UpdateRecordTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateRecordTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateRecordTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateRecordTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateRecordTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateRecordTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateRecordTaskRequestUserPanesImages> images;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Texts")
        public java.util.List<UpdateRecordTaskRequestUserPanesTexts> texts;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("PaneId")
        public Integer paneId;

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

        public UpdateRecordTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateRecordTaskRequestUserPanes setTexts(java.util.List<UpdateRecordTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateRecordTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateRecordTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateRecordTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

    }

}
