// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPULayoutRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("LayoutIds")
    public java.util.List<Integer> layoutIds;

    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    @NameInMap("UserPanes")
    public java.util.List<UpdateMPULayoutRequestUserPanes> userPanes;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateMPULayoutRequestBackgrounds> backgrounds;

    @NameInMap("Watermarks")
    public java.util.List<UpdateMPULayoutRequestWatermarks> watermarks;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateMPULayoutRequestClockWidgets> clockWidgets;

    public static UpdateMPULayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPULayoutRequest self = new UpdateMPULayoutRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMPULayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMPULayoutRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public UpdateMPULayoutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMPULayoutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateMPULayoutRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public UpdateMPULayoutRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateMPULayoutRequest setLayoutIds(java.util.List<Integer> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Integer> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateMPULayoutRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public UpdateMPULayoutRequest setUserPanes(java.util.List<UpdateMPULayoutRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<UpdateMPULayoutRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public UpdateMPULayoutRequest setBackgrounds(java.util.List<UpdateMPULayoutRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateMPULayoutRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateMPULayoutRequest setWatermarks(java.util.List<UpdateMPULayoutRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<UpdateMPULayoutRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public UpdateMPULayoutRequest setClockWidgets(java.util.List<UpdateMPULayoutRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateMPULayoutRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public static class UpdateMPULayoutRequestUserPanesImages extends TeaModel {
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

        public static UpdateMPULayoutRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestUserPanesImages self = new UpdateMPULayoutRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPULayoutRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPULayoutRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPULayoutRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPULayoutRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPULayoutRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateMPULayoutRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateMPULayoutRequestUserPanesTexts extends TeaModel {
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

        public static UpdateMPULayoutRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestUserPanesTexts self = new UpdateMPULayoutRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateMPULayoutRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateMPULayoutRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPULayoutRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateMPULayoutRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateMPULayoutRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateMPULayoutRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateMPULayoutRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateMPULayoutRequestUserPanesImages> images;

        @NameInMap("SegmentType")
        public Integer segmentType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Texts")
        public java.util.List<UpdateMPULayoutRequestUserPanesTexts> texts;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("PaneId")
        public Integer paneId;

        public static UpdateMPULayoutRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestUserPanes self = new UpdateMPULayoutRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestUserPanes setImages(java.util.List<UpdateMPULayoutRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateMPULayoutRequestUserPanesImages> getImages() {
            return this.images;
        }

        public UpdateMPULayoutRequestUserPanes setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public UpdateMPULayoutRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateMPULayoutRequestUserPanes setTexts(java.util.List<UpdateMPULayoutRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateMPULayoutRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateMPULayoutRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateMPULayoutRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

    }

    public static class UpdateMPULayoutRequestBackgrounds extends TeaModel {
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

        public static UpdateMPULayoutRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestBackgrounds self = new UpdateMPULayoutRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPULayoutRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPULayoutRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPULayoutRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPULayoutRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPULayoutRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateMPULayoutRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateMPULayoutRequestWatermarks extends TeaModel {
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

        public static UpdateMPULayoutRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestWatermarks self = new UpdateMPULayoutRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateMPULayoutRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPULayoutRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPULayoutRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPULayoutRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPULayoutRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPULayoutRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateMPULayoutRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateMPULayoutRequestClockWidgets extends TeaModel {
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

        public static UpdateMPULayoutRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPULayoutRequestClockWidgets self = new UpdateMPULayoutRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateMPULayoutRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateMPULayoutRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateMPULayoutRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPULayoutRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateMPULayoutRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPULayoutRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

    }

}
