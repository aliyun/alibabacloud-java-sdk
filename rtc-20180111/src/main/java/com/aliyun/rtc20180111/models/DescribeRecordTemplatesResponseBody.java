// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordTemplatesResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("TotalPage")
    public Long totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeRecordTemplatesResponseBodyTemplates> templates;

    public static DescribeRecordTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordTemplatesResponseBody self = new DescribeRecordTemplatesResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeRecordTemplatesResponseBodyTemplatesClockWidgets extends TeaModel {
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

        public static DescribeRecordTemplatesResponseBodyTemplatesClockWidgets build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplatesClockWidgets self = new DescribeRecordTemplatesResponseBodyTemplatesClockWidgets();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontType(Integer fontType) {
            this.fontType = fontType;
            return this;
        }
        public Integer getFontType() {
            return this.fontType;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontColor(Integer fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public Integer getFontColor() {
            return this.fontColor;
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

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesClockWidgets setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplatesBackgrounds extends TeaModel {
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

        public static DescribeRecordTemplatesResponseBodyTemplatesBackgrounds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplatesBackgrounds self = new DescribeRecordTemplatesResponseBodyTemplatesBackgrounds();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesBackgrounds setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplatesWatermarks extends TeaModel {
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

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

        public DescribeRecordTemplatesResponseBodyTemplatesWatermarks setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DescribeRecordTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("MnsQueue")
        public String mnsQueue;

        @NameInMap("OssFilePrefix")
        public String ossFilePrefix;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ClockWidgets")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> clockWidgets;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("DelayStopTime")
        public String delayStopTime;

        @NameInMap("LayoutIds")
        public java.util.List<Integer> layoutIds;

        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        @NameInMap("FileSplitInterval")
        public Integer fileSplitInterval;

        @NameInMap("HttpCallbackUrl")
        public String httpCallbackUrl;

        @NameInMap("Formats")
        public java.util.List<String> formats;

        @NameInMap("BackgroundColor")
        public Integer backgroundColor;

        @NameInMap("Backgrounds")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesBackgrounds> backgrounds;

        @NameInMap("Watermarks")
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> watermarks;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TaskProfile")
        public String taskProfile;

        public static DescribeRecordTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordTemplatesResponseBodyTemplates self = new DescribeRecordTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeRecordTemplatesResponseBodyTemplates setMnsQueue(String mnsQueue) {
            this.mnsQueue = mnsQueue;
            return this;
        }
        public String getMnsQueue() {
            return this.mnsQueue;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setOssFilePrefix(String ossFilePrefix) {
            this.ossFilePrefix = ossFilePrefix;
            return this;
        }
        public String getOssFilePrefix() {
            return this.ossFilePrefix;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setClockWidgets(java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> clockWidgets) {
            this.clockWidgets = clockWidgets;
            return this;
        }
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesClockWidgets> getClockWidgets() {
            return this.clockWidgets;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setDelayStopTime(String delayStopTime) {
            this.delayStopTime = delayStopTime;
            return this;
        }
        public String getDelayStopTime() {
            return this.delayStopTime;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setLayoutIds(java.util.List<Integer> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<Integer> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setFileSplitInterval(Integer fileSplitInterval) {
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }
        public Integer getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setHttpCallbackUrl(String httpCallbackUrl) {
            this.httpCallbackUrl = httpCallbackUrl;
            return this;
        }
        public String getHttpCallbackUrl() {
            return this.httpCallbackUrl;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setFormats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<String> getFormats() {
            return this.formats;
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

        public DescribeRecordTemplatesResponseBodyTemplates setWatermarks(java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<DescribeRecordTemplatesResponseBodyTemplatesWatermarks> getWatermarks() {
            return this.watermarks;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeRecordTemplatesResponseBodyTemplates setTaskProfile(String taskProfile) {
            this.taskProfile = taskProfile;
            return this;
        }
        public String getTaskProfile() {
            return this.taskProfile;
        }

    }

}
