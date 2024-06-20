// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class AddRecordTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    @NameInMap("Backgrounds")
    public java.util.List<AddRecordTemplateRequestBackgrounds> backgrounds;

    @NameInMap("ClockWidgets")
    public java.util.List<AddRecordTemplateRequestClockWidgets> clockWidgets;

    /**
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayStopTime")
    public Integer delayStopTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableM3u8DateTime")
    public Boolean enableM3u8DateTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("FileSplitInterval")
    public Integer fileSplitInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("Formats")
    public java.util.List<String> formats;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("HttpCallbackUrl")
    public String httpCallbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <strong>example:</strong>
     * <p>record-callback-queue</p>
     */
    @NameInMap("MnsQueue")
    public String mnsQueue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-record-oss</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>record/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
     */
    @NameInMap("OssFilePrefix")
    public String ossFilePrefix;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4IN_1080P</p>
     */
    @NameInMap("TaskProfile")
    public String taskProfile;

    @NameInMap("Watermarks")
    public java.util.List<AddRecordTemplateRequestWatermarks> watermarks;

    public static AddRecordTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecordTemplateRequest self = new AddRecordTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddRecordTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddRecordTemplateRequest setBackgroundColor(Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }
    public Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public AddRecordTemplateRequest setBackgrounds(java.util.List<AddRecordTemplateRequestBackgrounds> backgrounds) {
        this.backgrounds = backgrounds;
        return this;
    }
    public java.util.List<AddRecordTemplateRequestBackgrounds> getBackgrounds() {
        return this.backgrounds;
    }

    public AddRecordTemplateRequest setClockWidgets(java.util.List<AddRecordTemplateRequestClockWidgets> clockWidgets) {
        this.clockWidgets = clockWidgets;
        return this;
    }
    public java.util.List<AddRecordTemplateRequestClockWidgets> getClockWidgets() {
        return this.clockWidgets;
    }

    public AddRecordTemplateRequest setDelayStopTime(Integer delayStopTime) {
        this.delayStopTime = delayStopTime;
        return this;
    }
    public Integer getDelayStopTime() {
        return this.delayStopTime;
    }

    public AddRecordTemplateRequest setEnableM3u8DateTime(Boolean enableM3u8DateTime) {
        this.enableM3u8DateTime = enableM3u8DateTime;
        return this;
    }
    public Boolean getEnableM3u8DateTime() {
        return this.enableM3u8DateTime;
    }

    public AddRecordTemplateRequest setFileSplitInterval(Integer fileSplitInterval) {
        this.fileSplitInterval = fileSplitInterval;
        return this;
    }
    public Integer getFileSplitInterval() {
        return this.fileSplitInterval;
    }

    public AddRecordTemplateRequest setFormats(java.util.List<String> formats) {
        this.formats = formats;
        return this;
    }
    public java.util.List<String> getFormats() {
        return this.formats;
    }

    public AddRecordTemplateRequest setHttpCallbackUrl(String httpCallbackUrl) {
        this.httpCallbackUrl = httpCallbackUrl;
        return this;
    }
    public String getHttpCallbackUrl() {
        return this.httpCallbackUrl;
    }

    public AddRecordTemplateRequest setLayoutIds(java.util.List<Long> layoutIds) {
        this.layoutIds = layoutIds;
        return this;
    }
    public java.util.List<Long> getLayoutIds() {
        return this.layoutIds;
    }

    public AddRecordTemplateRequest setMediaEncode(Integer mediaEncode) {
        this.mediaEncode = mediaEncode;
        return this;
    }
    public Integer getMediaEncode() {
        return this.mediaEncode;
    }

    public AddRecordTemplateRequest setMnsQueue(String mnsQueue) {
        this.mnsQueue = mnsQueue;
        return this;
    }
    public String getMnsQueue() {
        return this.mnsQueue;
    }

    public AddRecordTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddRecordTemplateRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public AddRecordTemplateRequest setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
        return this;
    }
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    public AddRecordTemplateRequest setOssFilePrefix(String ossFilePrefix) {
        this.ossFilePrefix = ossFilePrefix;
        return this;
    }
    public String getOssFilePrefix() {
        return this.ossFilePrefix;
    }

    public AddRecordTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddRecordTemplateRequest setTaskProfile(String taskProfile) {
        this.taskProfile = taskProfile;
        return this;
    }
    public String getTaskProfile() {
        return this.taskProfile;
    }

    public AddRecordTemplateRequest setWatermarks(java.util.List<AddRecordTemplateRequestWatermarks> watermarks) {
        this.watermarks = watermarks;
        return this;
    }
    public java.util.List<AddRecordTemplateRequestWatermarks> getWatermarks() {
        return this.watermarks;
    }

    public static class AddRecordTemplateRequestBackgrounds extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
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

        public static AddRecordTemplateRequestBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            AddRecordTemplateRequestBackgrounds self = new AddRecordTemplateRequestBackgrounds();
            return TeaModel.build(map, self);
        }

        public AddRecordTemplateRequestBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public AddRecordTemplateRequestBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public AddRecordTemplateRequestBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddRecordTemplateRequestBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public AddRecordTemplateRequestBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AddRecordTemplateRequestBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public AddRecordTemplateRequestBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class AddRecordTemplateRequestClockWidgets extends TeaModel {
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

        public static AddRecordTemplateRequestClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            AddRecordTemplateRequestClockWidgets self = new AddRecordTemplateRequestClockWidgets();
            return TeaModel.build(map, self);
        }

        public AddRecordTemplateRequestClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public AddRecordTemplateRequestClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public AddRecordTemplateRequestClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public AddRecordTemplateRequestClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AddRecordTemplateRequestClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public AddRecordTemplateRequestClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class AddRecordTemplateRequestWatermarks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <strong>example:</strong>
         * <p>0</p>
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

        public static AddRecordTemplateRequestWatermarks build(java.util.Map<String, ?> map) throws Exception {
            AddRecordTemplateRequestWatermarks self = new AddRecordTemplateRequestWatermarks();
            return TeaModel.build(map, self);
        }

        public AddRecordTemplateRequestWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public AddRecordTemplateRequestWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public AddRecordTemplateRequestWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public AddRecordTemplateRequestWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public AddRecordTemplateRequestWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public AddRecordTemplateRequestWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public AddRecordTemplateRequestWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public AddRecordTemplateRequestWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

}
