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

    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<DescribeAppRecordTemplatesResponseBodyTemplates> templates;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
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
         * <p>The creation time. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The delay time before stopping the recording. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DelayStopTime")
        public Long delayStopTime;

        /**
         * <p>The naming rule for recording files.</p>
         * <blockquote>
         * <p>To ensure the uniqueness of recording file names, the current naming rule is record/{AppId}/{ChannelId}<em>{TaskId}/{EscapedStartTime}</em>{EscapedEndTime}.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>record/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
         */
        @NameInMap("FilePrefix")
        public String filePrefix;

        /**
         * <p>The splitting duration of the recording file. The value must be greater than or equal to 1800. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("FileSplitInterval")
        public Long fileSplitInterval;

        /**
         * <p>The formats of the recording file. Valid values: .m3u8, .mp4, and .flv.</p>
         * <blockquote>
         * <p>Only lowercase letters are supported for file formats.</p>
         * </blockquote>
         */
        @NameInMap("Formats")
        public java.util.List<String> formats;

        /**
         * <p>The list of layout IDs.</p>
         */
        @NameInMap("LayoutIds")
        public java.util.List<String> layoutIds;

        /**
         * <p>The encoding options.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MediaEncode")
        public Integer mediaEncode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template ID.</p>
         * 
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
