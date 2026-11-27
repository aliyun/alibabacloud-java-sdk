// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class AddRecordTemplateRequest extends TeaModel {
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
     * <p>The background color in RGB format. Default value: 0 (black). The calculation formula is R + G × 256 + B × 65536. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackgroundColor")
    public Integer backgroundColor;

    /**
     * <p>The list of background images.</p>
     */
    @NameInMap("Backgrounds")
    public java.util.List<AddRecordTemplateRequestBackgrounds> backgrounds;

    /**
     * <p>The list of clocks.</p>
     */
    @NameInMap("ClockWidgets")
    public java.util.List<AddRecordTemplateRequestClockWidgets> clockWidgets;

    /**
     * <p>The delay time before stopping the recording. Unit: seconds. Default value: <strong>180</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("DelayStopTime")
    public Integer delayStopTime;

    /**
     * <p>Specifies whether to add the timestamp of the TS file to the recorded M3U8 file.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableM3u8DateTime")
    public Boolean enableM3u8DateTime;

    /**
     * <p>The splitting duration of the recording file. The value must be greater than or equal to 1800. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("FileSplitInterval")
    public Integer fileSplitInterval;

    /**
     * <p>The list of recording file formats.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("Formats")
    public java.util.List<String> formats;

    /**
     * <p>The HTTP callback URL for recording events.</p>
     * <blockquote>
     * <p>You must specify either this parameter or MnsQueue. You cannot specify both or neither.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("HttpCallbackUrl")
    public String httpCallbackUrl;

    /**
     * <p>The list of layout IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LayoutIds")
    public java.util.List<Long> layoutIds;

    /**
     * <p>The encoding option. For more information, see the MediaEncode enum values below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MediaEncode")
    public Integer mediaEncode;

    /**
     * <p>The MSMQ for recording event callbacks.</p>
     * <blockquote>
     * <p>You must specify either this parameter or HttpCallbackUrl. You cannot specify both or neither.</p>
     * </blockquote>
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
     * <blockquote>
     * <p>Only OSS buckets in the China (Shanghai) region are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtc-record-oss</p>
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
     * <blockquote>
     * <p>To ensure the uniqueness of recording file names, the naming rule is record/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}.</p>
     * </blockquote>
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
     * <p>The billing configuration of the task. You are charged based on your settings. For more information, see the TaskProfile enum values below.</p>
     * <blockquote>
     * <ul>
     * <li>The resolution of the MediaEncode encoding option must be less than or equal to the resolution of TaskProfile.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The maximum number of layout panes must be less than or equal to the number of input channels of TaskProfile.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4IN_1080P</p>
     */
    @NameInMap("TaskProfile")
    public String taskProfile;

    /**
     * <p>The list of watermarks.</p>
     */
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
         * <p>Specifies whether to display the background image. Valid values:</p>
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
         * <p>The height of the background image pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Height")
        public Float height;

        /**
         * <p>The HTTP or HTTPS URL of the background image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/image.jpg">https://www.example.com/image.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width of the background image pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-coordinate of the background image, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate of the background image, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The Z-order of the background image. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
         * 
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
         * <p>The text color of the clock in RGB format.</p>
         * <p>The calculation formula is <code>R + G × 256 + B × 65536</code>. Valid values for R (red), G (green), and B (blue): <strong>0</strong> to <strong>255</strong>.</p>
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
         * <li><strong>0</strong> (default): NOTO_SERIF_CJKSC_REGULAR.</li>
         * <li><strong>1</strong>: ALIBABA_PUHUITI_REGULAR.</li>
         * <li><strong>2</strong>: ALIBABA_PUHUITI_BOLD.</li>
         * <li><strong>3</strong>: ALIBABA_PUHUITI_Heavy.</li>
         * <li><strong>4</strong>: ALIBABA_PUHUITI_LIGHT.</li>
         * <li><strong>5</strong>: ALIBABA_PUHUITI_MEDIUM.</li>
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
         * <p>The transparency of the watermark. A value of 0.0 indicates fully transparent, and a value of 1.0 indicates fully opaque.</p>
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
         * <p>The height of the watermark pane, as a normalized percentage.</p>
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
         * <p>The width of the watermark pane, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2456</p>
         */
        @NameInMap("Width")
        public Float width;

        /**
         * <p>The X-coordinate of the watermark, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <p>The Y-coordinate of the watermark, as a normalized percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7576</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <p>The Z-order of the watermark. A value of 0 indicates the bottom layer. A value of 1 indicates the layer above 0, and so on.</p>
         * 
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
