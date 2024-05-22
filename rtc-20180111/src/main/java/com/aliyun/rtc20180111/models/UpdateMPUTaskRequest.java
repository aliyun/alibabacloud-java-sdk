// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPUTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateMPUTaskRequestBackgrounds> backgrounds;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateMPUTaskRequestClockWidgets> clockWidgets;

    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("MixMode")
    public Integer mixMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("SubSpecAudioUsers")
    public java.util.List<String> subSpecAudioUsers;

    @NameInMap("SubSpecCameraUsers")
    public java.util.List<String> subSpecCameraUsers;

    @NameInMap("SubSpecShareScreenUsers")
    public java.util.List<String> subSpecShareScreenUsers;

    @NameInMap("SubSpecUsers")
    public java.util.List<String> subSpecUsers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("UnsubSpecAudioUsers")
    public java.util.List<String> unsubSpecAudioUsers;

    @NameInMap("UnsubSpecCameraUsers")
    public java.util.List<String> unsubSpecCameraUsers;

    @NameInMap("UnsubSpecShareScreenUsers")
    public java.util.List<String> unsubSpecShareScreenUsers;

    @NameInMap("UserPanes")
    public java.util.List<UpdateMPUTaskRequestUserPanes> userPanes;

    @NameInMap("Watermarks")
    public java.util.List<UpdateMPUTaskRequestWatermarks> watermarks;

    public static UpdateMPUTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPUTaskRequest self = new UpdateMPUTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMPUTaskRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateMPUTaskRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateMPUTaskRequest setBackgrounds(java.util.List<UpdateMPUTaskRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateMPUTaskRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateMPUTaskRequest setClockWidgets(java.util.List<UpdateMPUTaskRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateMPUTaskRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateMPUTaskRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public UpdateMPUTaskRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateMPUTaskRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public UpdateMPUTaskRequest setMixMode(Integer mixMode) {
        this.mixMode = mixMode;
        return this;
    }
    public Integer getMixMode() {
        return this.mixMode;
    }

    public UpdateMPUTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMPUTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateMPUTaskRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public UpdateMPUTaskRequest setSubSpecAudioUsers(java.util.List<String> subSpecAudioUsers) {
        this.subSpecAudioUsers = subSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getSubSpecAudioUsers() {
        return this.subSpecAudioUsers;
    }

    public UpdateMPUTaskRequest setSubSpecCameraUsers(java.util.List<String> subSpecCameraUsers) {
        this.subSpecCameraUsers = subSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getSubSpecCameraUsers() {
        return this.subSpecCameraUsers;
    }

    public UpdateMPUTaskRequest setSubSpecShareScreenUsers(java.util.List<String> subSpecShareScreenUsers) {
        this.subSpecShareScreenUsers = subSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getSubSpecShareScreenUsers() {
        return this.subSpecShareScreenUsers;
    }

    public UpdateMPUTaskRequest setSubSpecUsers(java.util.List<String> subSpecUsers) {
        this.subSpecUsers = subSpecUsers;
        return this;
    }
    public java.util.List<String> getSubSpecUsers() {
        return this.subSpecUsers;
    }

    public UpdateMPUTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateMPUTaskRequest setUnsubSpecAudioUsers(java.util.List<String> unsubSpecAudioUsers) {
        this.unsubSpecAudioUsers = unsubSpecAudioUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecAudioUsers() {
        return this.unsubSpecAudioUsers;
    }

    public UpdateMPUTaskRequest setUnsubSpecCameraUsers(java.util.List<String> unsubSpecCameraUsers) {
        this.unsubSpecCameraUsers = unsubSpecCameraUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecCameraUsers() {
        return this.unsubSpecCameraUsers;
    }

    public UpdateMPUTaskRequest setUnsubSpecShareScreenUsers(java.util.List<String> unsubSpecShareScreenUsers) {
        this.unsubSpecShareScreenUsers = unsubSpecShareScreenUsers;
        return this;
    }
    public java.util.List<String> getUnsubSpecShareScreenUsers() {
        return this.unsubSpecShareScreenUsers;
    }

    public UpdateMPUTaskRequest setUserPanes(java.util.List<UpdateMPUTaskRequestUserPanes> userPanes) {
        this.userPanes = userPanes;
        return this;
    }
    public java.util.List<UpdateMPUTaskRequestUserPanes> getUserPanes() {
        return this.userPanes;
    }

    public UpdateMPUTaskRequest setWatermarks(java.util.List<UpdateMPUTaskRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<UpdateMPUTaskRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class UpdateMPUTaskRequestBackgrounds extends TeaModel {
        @NameInMap("Display")
        public Integer display;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Url")
        public String url;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateMPUTaskRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestBackgrounds self = new UpdateMPUTaskRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPUTaskRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPUTaskRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPUTaskRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPUTaskRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPUTaskRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPUTaskRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateMPUTaskRequestClockWidgets extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

        @NameInMap("BorderColor")
        public Long borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

        @NameInMap("Box")
        public Boolean box;

        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        @NameInMap("BoxColor")
        public Long boxColor;

        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateMPUTaskRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestClockWidgets self = new UpdateMPUTaskRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestClockWidgets setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateMPUTaskRequestClockWidgets setBorderColor(Long borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public Long getBorderColor() {
            return this.borderColor;
        }

        public UpdateMPUTaskRequestClockWidgets setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public UpdateMPUTaskRequestClockWidgets setBox(Boolean box) {
            this.box = box;
            return this;
        }
        public Boolean getBox() {
            return this.box;
        }

        public UpdateMPUTaskRequestClockWidgets setBoxBorderWidth(Integer boxBorderWidth) {
            this.boxBorderWidth = boxBorderWidth;
            return this;
        }
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        public UpdateMPUTaskRequestClockWidgets setBoxColor(Long boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public Long getBoxColor() {
            return this.boxColor;
        }

        public UpdateMPUTaskRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateMPUTaskRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateMPUTaskRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateMPUTaskRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPUTaskRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPUTaskRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateMPUTaskRequestUserPanesImages extends TeaModel {
        @NameInMap("Display")
        public Integer display;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Url")
        public String url;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateMPUTaskRequestUserPanesImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestUserPanesImages self = new UpdateMPUTaskRequestUserPanesImages();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestUserPanesImages setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPUTaskRequestUserPanesImages setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPUTaskRequestUserPanesImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPUTaskRequestUserPanesImages setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPUTaskRequestUserPanesImages setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPUTaskRequestUserPanesImages setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPUTaskRequestUserPanesImages setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateMPUTaskRequestUserPanesTexts extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

        @NameInMap("BorderColor")
        public Long borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

        @NameInMap("Box")
        public Boolean box;

        @NameInMap("BoxBorderWidth")
        public Integer boxBorderWidth;

        @NameInMap("BoxColor")
        public Long boxColor;

        @NameInMap("FontColor")
        public Integer fontColor;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("FontType")
        public Integer fontType;

        @NameInMap("Text")
        public String text;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateMPUTaskRequestUserPanesTexts build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestUserPanesTexts self = new UpdateMPUTaskRequestUserPanesTexts();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestUserPanesTexts setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateMPUTaskRequestUserPanesTexts setBorderColor(Long borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public Long getBorderColor() {
            return this.borderColor;
        }

        public UpdateMPUTaskRequestUserPanesTexts setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public UpdateMPUTaskRequestUserPanesTexts setBox(Boolean box) {
            this.box = box;
            return this;
        }
        public Boolean getBox() {
            return this.box;
        }

        public UpdateMPUTaskRequestUserPanesTexts setBoxBorderWidth(Integer boxBorderWidth) {
            this.boxBorderWidth = boxBorderWidth;
            return this;
        }
        public Integer getBoxBorderWidth() {
            return this.boxBorderWidth;
        }

        public UpdateMPUTaskRequestUserPanesTexts setBoxColor(Long boxColor) {
            this.boxColor = boxColor;
            return this;
        }
        public Long getBoxColor() {
            return this.boxColor;
        }

        public UpdateMPUTaskRequestUserPanesTexts setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateMPUTaskRequestUserPanesTexts setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateMPUTaskRequestUserPanesTexts setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateMPUTaskRequestUserPanesTexts setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateMPUTaskRequestUserPanesTexts setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPUTaskRequestUserPanesTexts setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPUTaskRequestUserPanesTexts setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateMPUTaskRequestUserPanes extends TeaModel {
        @NameInMap("Images")
        public java.util.List<UpdateMPUTaskRequestUserPanesImages> images;

        @NameInMap("PaneId")
        public Integer paneId;

        @NameInMap("SegmentType")
        public Integer segmentType;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Texts")
        public java.util.List<UpdateMPUTaskRequestUserPanesTexts> texts;

        @NameInMap("UserId")
        public String userId;

        public static UpdateMPUTaskRequestUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestUserPanes self = new UpdateMPUTaskRequestUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestUserPanes setImages(java.util.List<UpdateMPUTaskRequestUserPanesImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateMPUTaskRequestUserPanesImages> getImages() {
            return this.images;
        }

        public UpdateMPUTaskRequestUserPanes setPaneId(Integer paneId) {
            this.paneId = paneId;
            return this;
        }
        public Integer getPaneId() {
            return this.paneId;
        }

        public UpdateMPUTaskRequestUserPanes setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public UpdateMPUTaskRequestUserPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateMPUTaskRequestUserPanes setTexts(java.util.List<UpdateMPUTaskRequestUserPanesTexts> texts) {
            this.texts = texts;
            return this;
        }
        public java.util.List<UpdateMPUTaskRequestUserPanesTexts> getTexts() {
            return this.texts;
        }

        public UpdateMPUTaskRequestUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateMPUTaskRequestWatermarks extends TeaModel {
        @NameInMap("Alpha")
        public Float alpha;

        @NameInMap("Display")
        public Integer display;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Url")
        public String url;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateMPUTaskRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            UpdateMPUTaskRequestWatermarks self = new UpdateMPUTaskRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public UpdateMPUTaskRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateMPUTaskRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateMPUTaskRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateMPUTaskRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateMPUTaskRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateMPUTaskRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateMPUTaskRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateMPUTaskRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
