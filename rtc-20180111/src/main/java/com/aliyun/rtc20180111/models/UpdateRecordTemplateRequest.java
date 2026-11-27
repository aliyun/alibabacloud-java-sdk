// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateRecordTemplateRequest extends TeaModel {
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
     * <p>The background color in RGB format. Default value: <strong>0</strong> (black). The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    /**
     * <p>The background image information.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<UpdateRecordTemplateRequestBackgrounds> backgrounds;

    /**
     * <p>The clock information.</p>
     */
    @NameInMap("ClockWidgets")
    public java.util.List<UpdateRecordTemplateRequestClockWidgets> clockWidgets;

    /**
     * <p>The delay before stopping the recording. Unit: seconds. Default value: <strong>180</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayStopTime")
    public Integer delayStopTime;

    /**
     * <p>Specifies whether to add the timestamp of TS files to the recorded M3U8 file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableM3u8DateTime")
    public Boolean enableM3u8DateTime;

    /**
     * <p>The interval at which recording files are split. The value must be greater than or equal to 1800. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("FileSplitInterval")
    public Integer fileSplitInterval;

    /**
     * <p>The recording file formats.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("Formats")
    public java.util.List<String> formats;

    /**
     * <p>The HTTP callback URL for recording events.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("HttpCallbackUrl")
    public String httpCallbackUrl;

    /**
     * <p>The layout IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>The encoding options.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <p>The MSMQ for recording event callbacks.</p>
     * 
     * <strong>example:</strong>
     * <p>record-callback-queue</p>
     */
    @NameInMap("MnsQueue")
    public String mnsQueue;

    /**
     * <p>The name of the recording configuration template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Recording template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS bucket where the recording files are stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-record-pre</p>
     */
    @NameInMap("OssBucket")
    public String ossBucket;

    /**
     * <p>The OSS endpoint of the region where the recording files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shanghai.aliyuncs.com</p>
     */
    @NameInMap("OssEndpoint")
    public String ossEndpoint;

    /**
     * <p>The naming rule for recording files.</p>
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
     * <p>The billing configuration of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4IN_1080P</p>
     */
    @NameInMap("TaskProfile")
    public String taskProfile;

    /**
     * <p>The configuration template ID. To obtain the template ID, call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76dasgb****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The watermark information.</p>
     */
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
        /**
         * <p>Specifies whether to display the image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (None): Not displayed.</li>
         * <li><strong>1</strong> (Always): Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The Z-order. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The text color of the clock in RGB format.</p>
         * <p>The formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontColor")
        public Integer fontColor;

        /**
         * <p>The font size of the clock. Valid values: <strong>(0, 72]</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FontSize")
        public Integer fontSize;

        /**
         * <p>The font type of the clock. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): NOTO_SERIF_CJKSC_REGULAR</li>
         * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR</li>
         * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD</li>
         * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy</li>
         * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT</li>
         * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FontType")
        public Integer fontType;

        /**
         * <p>The X-coordinate of the clock, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate of the clock, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The Z-order of the clock. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The transparency. A value of 0.0 indicates fully transparent, and a value of 1.0 indicates fully opaque.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Alpha")
        public Float alpha;

        /**
         * <p>Specifies whether to display the watermark. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (None): Not displayed.</li>
         * <li><strong>1</strong> (Always): Always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The HTTP or HTTPS URL of the watermark.</p>
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
         * <p>The Z-order. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
