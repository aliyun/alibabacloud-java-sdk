// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C292B80E-5175-4BA4-8CC292B80E-5175-4BA4-8C1E-2ABEC4D7C2FE1E-2ABEC4D7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeRecordTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeRecordTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordTemplatesResponseBody self = new DescribeRecordTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordTemplatesResponseBody setTemplates(java.util.List<DescribeRecordTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeRecordTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeRecordTemplatesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeRecordTemplatesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRecordTemplatesResponseBodyTemplatesBackgrounds extends TeaModel {
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

        public static DescribeRecordTemplatesResponseBodyTemplatesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplatesBackgrounds self = new DescribeRecordTemplatesResponseBodyTemplatesBackgrounds();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplatesClockWidgets extends TeaModel {
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

        public static DescribeRecordTemplatesResponseBodyTemplatesClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplatesClockWidgets self = new DescribeRecordTemplatesResponseBodyTemplatesClockWidgets();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplatesWatermarks extends TeaModel {
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

        public static DescribeRecordTemplatesResponseBodyTemplatesWatermarks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplatesWatermarks self = new DescribeRecordTemplatesResponseBodyTemplatesWatermarks();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setAlpha(Float alpha) {
            this.alpha = alpha;
            return this;
        }
        public Float getAlpha() {
            return this.alpha;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackgroundColor")
        public Integer backgroundColor;

        @NameInMap("Backgrounds")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesBackgrounds> backgrounds;

        @NameInMap("ClockWidgets")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> clockWidgets;

        /**
         * <strong>example:</strong>
         * <p>2020-09-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

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
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("FileSplitInterval")
        public Integer fileSplitInterval;

        @NameInMap("Formats")
        public java.util.List<String> formats;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
         */
        @NameInMap("HttpCallbackUrl")
        public String httpCallbackUrl;

        @NameInMap("LayoutIds")
        public java.util.List<Long> layoutIds;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <strong>example:</strong>
         * <p>record-callback-queue</p>
         */
        @NameInMap("MnsQueue")
        public String mnsQueue;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rtc-record-oss</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <strong>example:</strong>
         * <p>record/pre/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("OssFilePrefix")
        public String ossFilePrefix;

        /**
         * <strong>example:</strong>
         * <p>4IN_1080P</p>
         */
        @NameInMap("TaskProfile")
        public String taskProfile;

        /**
         * <strong>example:</strong>
         * <p>1ca698e2-57fa-4314-8e11-00d950d4****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Watermarks")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> watermarks;

        public static DescribeRecordTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplates self = new DescribeRecordTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplates setBackgroundColor(Integer backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }
        public Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setBackgrounds(java.util.List<DescribeRecordTemplatesResponseBodyTemplatesBackgrounds> backgrounds) {
            this.backgrounds = backgrounds;
            return this;
        }
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesBackgrounds> getBackgrounds() {
            return this.backgrounds;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setClockWidgets(java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> clockWidgets) {
            this.clockWidgets = clockWidgets;
            return this;
        }
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> getClockWidgets() {
            return this.clockWidgets;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setDelayStopTime(Integer delayStopTime) {
            this.delayStopTime = delayStopTime;
            return this;
        }
        public Integer getDelayStopTime() {
            return this.delayStopTime;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setEnableM3u8DateTime(Boolean enableM3u8DateTime) {
            this.enableM3u8DateTime = enableM3u8DateTime;
            return this;
        }
        public Boolean getEnableM3u8DateTime() {
            return this.enableM3u8DateTime;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setFileSplitInterval(Integer fileSplitInterval) {
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }
        public Integer getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setFormats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setHttpCallbackUrl(String httpCallbackUrl) {
            this.httpCallbackUrl = httpCallbackUrl;
            return this;
        }
        public String getHttpCallbackUrl() {
            return this.httpCallbackUrl;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setLayoutIds(java.util.List<Long> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<Long> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setMnsQueue(String mnsQueue) {
            this.mnsQueue = mnsQueue;
            return this;
        }
        public String getMnsQueue() {
            return this.mnsQueue;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setOssFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }
        public String getOssFilePrefix() {
            return this.ossFilePrefix;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setWatermarks(java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

}
