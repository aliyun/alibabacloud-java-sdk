// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordTemplatesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2A7497D0-BEAE-58E7-B13A-751BD8EAE4C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeAppRecordTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeAppRecordTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordTemplatesResponseBody self = new DescribeAppRecordTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppRecordTemplatesResponseBody setTemplates(java.util.List<DescribeAppRecordTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeAppRecordTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public DescribeAppRecordTemplatesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeAppRecordTemplatesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppRecordTemplatesResponseBodyTemplates extends TeaModel {
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
        public Long delayStopTime;

        /**
         * <strong>example:</strong>
         * <p>record/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("FilePrefix")
        public String filePrefix;

        /**
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("FileSplitInterval")
        public Long fileSplitInterval;

        @NameInMap("Formats")
        public java.util.List<String> formats;

        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>wv7N****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeAppRecordTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppRecordTemplatesResponseBodyTemplates self = new DescribeAppRecordTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setDelayStopTime(Long delayStopTime) {
            this.delayStopTime = delayStopTime;
            return this;
        }
        public Long getDelayStopTime() {
            return this.delayStopTime;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setFilePrefix(String filePrefix) {
            this.filePrefix = filePrefix;
            return this;
        }
        public String getFilePrefix() {
            return this.filePrefix;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setFileSplitInterval(Long fileSplitInterval) {
            this.fileSplitInterval = fileSplitInterval;
            return this;
        }
        public Long getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setFormats(java.util.List<String> formats) {
            this.formats = formats;
            return this;
        }
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setLayoutIds(java.util.List<String> layoutIds) {
            this.layoutIds = layoutIds;
            return this;
        }
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setMediaEncode(Integer mediaEncode) {
            this.mediaEncode = mediaEncode;
            return this;
        }
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppRecordTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
