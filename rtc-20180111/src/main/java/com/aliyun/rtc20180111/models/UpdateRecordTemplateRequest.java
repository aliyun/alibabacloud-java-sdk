// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<UpdateRecordTemplateRequestBackgrounds> backgrounds;

    @NameInMap("ClockWidgets")
    public java.util.List<UpdateRecordTemplateRequestClockWidgets> clockWidgets;

    @NameInMap("DelayStopTime")
    public Integer delayStopTime;

    @NameInMap("EnableM3u8DateTime")
    public Boolean enableM3u8DateTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSplitInterval")
    public Integer fileSplitInterval;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Formats")
    public java.util.List<String> formats;

    @NameInMap("HttpCallbackUrl")
    public String httpCallbackUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    @NameInMap("MnsQueue")
    public String mnsQueue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskProfile")
    public String taskProfile;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Watermarks")
    public java.util.List<UpdateRecordTemplateRequestWatermarks> watermarks;

    public static UpdateRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordTemplateRequest self = new UpdateRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateRecordTemplateRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public UpdateRecordTemplateRequest setBackgrounds(java.util.List<UpdateRecordTemplateRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public UpdateRecordTemplateRequest setClockWidgets(java.util.List<UpdateRecordTemplateRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public UpdateRecordTemplateRequest setDelayStopTime(Integer delayStopTime) {
        this.delayStopTime = delayStopTime;
        return this;
    }
    public Integer getDelayStopTime() {
        return this.delayStopTime;
    }

    public UpdateRecordTemplateRequest setEnableM3u8DateTime(Boolean enableM3u8DateTime) {
        this.enableM3u8DateTime = enableM3u8DateTime;
        return this;
    }
    public Boolean getEnableM3u8DateTime() {
        return this.enableM3u8DateTime;
    }

    public UpdateRecordTemplateRequest setFileSplitInterval(Integer fileSplitInterval) {
        this.fileSplitInterval = fileSplitInterval;
        return this;
    }
    public Integer getFileSplitInterval() {
        return this.fileSplitInterval;
    }

    public UpdateRecordTemplateRequest setFormats(java.util.List<String> formats) {
        this.formats = formats;
        return this;
    }
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    public UpdateRecordTemplateRequest setHttpCallbackUrl(String httpCallbackUrl) {
        this.httpCallbackUrl = httpCallbackUrl;
        return this;
    }
    public String getHttpCallbackUrl() {
        return this.httpCallbackUrl;
    }

    public UpdateRecordTemplateRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public UpdateRecordTemplateRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public UpdateRecordTemplateRequest setMnsQueue(String mnsQueue) {
        this.mnsQueue = mnsQueue;
        return this;
    }
    public String getMnsQueue() {
        return this.mnsQueue;
    }

    public UpdateRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRecordTemplateRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public UpdateRecordTemplateRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public UpdateRecordTemplateRequest setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public UpdateRecordTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRecordTemplateRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public UpdateRecordTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateRecordTemplateRequest setWatermarks(java.util.List<UpdateRecordTemplateRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<UpdateRecordTemplateRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class UpdateRecordTemplateRequestBackgrounds extends TeaModel {
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

        public static UpdateRecordTemplateRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTemplateRequestBackgrounds self = new UpdateRecordTemplateRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTemplateRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTemplateRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTemplateRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTemplateRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTemplateRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateRecordTemplateRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTemplateRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateRecordTemplateRequestClockWidgets extends TeaModel {
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

        public static UpdateRecordTemplateRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordTemplateRequestClockWidgets self = new UpdateRecordTemplateRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public UpdateRecordTemplateRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public UpdateRecordTemplateRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public UpdateRecordTemplateRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public UpdateRecordTemplateRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
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

    }

    public static class UpdateRecordTemplateRequestWatermarks extends TeaModel {
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

        public UpdateRecordTemplateRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public UpdateRecordTemplateRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public UpdateRecordTemplateRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateRecordTemplateRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public UpdateRecordTemplateRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public UpdateRecordTemplateRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public UpdateRecordTemplateRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
