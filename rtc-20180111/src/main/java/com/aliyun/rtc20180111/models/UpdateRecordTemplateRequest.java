// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TaskProfile")
    public String taskProfile;

    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("MnsQueue")
    public String mnsQueue;

    @NameInMap("HttpCallbackUrl")
    public String httpCallbackUrl;

    @NameInMap("FileSplitInterval")
    public Integer fileSplitInterval;

    @NameInMap("DelayStopTime")
    public Integer delayStopTime;

    @NameInMap("LayoutIds")
    public java.util.List<Integer> layoutIds;

    @NameInMap("Formats")
    public java.util.List<String> formats;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateRecordTemplateRequestBackgrounds> backgrounds;

    @NameInMap("Watermarks")
    public java.util.List<UpdateRecordTemplateRequestWatermarks> watermarks;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateRecordTemplateRequestClockWidgets> clockWidgets;

    public static UpdateRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTemplateRequest self = new UpdateRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRecordTemplateRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public UpdateRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateRecordTemplateRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public UpdateRecordTemplateRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public UpdateRecordTemplateRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateRecordTemplateRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdateRecordTemplateRequest setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public UpdateRecordTemplateRequest setMnsQueue(String mnsQueue) {
        this.mnsQueue = mnsQueue;
        return this;
    }
    public String getMnsQueue() {
        return this.mnsQueue;
    }

    public UpdateRecordTemplateRequest setHttpCallbackUrl(String httpCallbackUrl) {
        this.httpCallbackUrl = httpCallbackUrl;
        return this;
    }
    public String getHttpCallbackUrl() {
        return this.httpCallbackUrl;
    }

    public UpdateRecordTemplateRequest setFileSplitInterval(Integer fileSplitInterval) {
        this.fileSplitInterval = fileSplitInterval;
        return this;
    }
    public Integer getFileSplitInterval() {
        return this.fileSplitInterval;
    }

    public UpdateRecordTemplateRequest setDelayStopTime(Integer delayStopTime) {
        this.delayStopTime = delayStopTime;
        return this;
    }
    public Integer getDelayStopTime() {
        return this.delayStopTime;
    }

    public UpdateRecordTemplateRequest setLayoutIds(java.util.List<Integer> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Integer> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateRecordTemplateRequest setFormats(java.util.List<String> formats) {
        this.formats = formats;
        return this;
    }
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    public UpdateRecordTemplateRequest setBackgrounds(java.util.List<UpdateRecordTemplateRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateRecordTemplateRequest setWatermarks(java.util.List<UpdateRecordTemplateRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public UpdateRecordTemplateRequest setClockWidgets(java.util.List<UpdateRecordTemplateRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public static class UpdateRecordTemplateRequestBackgrounds extends TeaModel {
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

        public static UpdateRecordTemplateRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTemplateRequestBackgrounds self = new UpdateRecordTemplateRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTemplateRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTemplateRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTemplateRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTemplateRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTemplateRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTemplateRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateRecordTemplateRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateRecordTemplateRequestWatermarks extends TeaModel {
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

        public static UpdateRecordTemplateRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTemplateRequestWatermarks self = new UpdateRecordTemplateRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTemplateRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public UpdateRecordTemplateRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTemplateRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTemplateRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTemplateRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTemplateRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTemplateRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateRecordTemplateRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class UpdateRecordTemplateRequestClockWidgets extends TeaModel {
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

        public static UpdateRecordTemplateRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTemplateRequestClockWidgets self = new UpdateRecordTemplateRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTemplateRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateRecordTemplateRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateRecordTemplateRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTemplateRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public UpdateRecordTemplateRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateRecordTemplateRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

    }

}
