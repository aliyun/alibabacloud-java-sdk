// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRecordsResponseBody extends TeaModel {
    /**
     * <p>The start time to query the next record.</p>
     * <blockquote>
     * <p>Applies only to snapshot queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-12-10T11:00:00Z</p>
     */
    @NameInMap("NextStartTime")
    public String nextStartTime;

    /**
     * <p>The total number of pages.</p>
     * <blockquote>
     * <p>Applies only to recording queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p>Applies only to recording queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The page size.</p>
     * <blockquote>
     * <p>Applies only to recording queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The list of stored records.</p>
     */
    @NameInMap("Records")
    public java.util.List<DescribeRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of stored records.</p>
     * <blockquote>
     * <p>Applies only to recording queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordsResponseBody self = new DescribeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordsResponseBody setNextStartTime(String nextStartTime) {
        this.nextStartTime = nextStartTime;
        return this;
    }
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    public DescribeRecordsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeRecordsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRecordsResponseBody setRecords(java.util.List<DescribeRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The end time of the stored record.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-23T18:33:48</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The format of the stored file. Valid values:</p>
         * <ul>
         * <li><p>mp4</p>
         * </li>
         * <li><p>flv</p>
         * </li>
         * <li><p>hls</p>
         * </li>
         * <li><p>jpg</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hls</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <p>The ID of the stored record.</p>
         * <blockquote>
         * <p>Applies only to recording queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2be2a673-6033-4874-b6f2-f2bc0a1*****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The bucket where the file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>my_oss_bucket</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        /**
         * <p>The OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-qingdao.aliyuncs.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <p>The object of the stored file.</p>
         * 
         * <strong>example:</strong>
         * <p>record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8</p>
         */
        @NameInMap("OssObject")
        public String ossObject;

        /**
         * <p>The start time of the stored record.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-23T18:19:32</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The stream ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        @NameInMap("StreamId")
        public String streamId;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>388*****204-cn-qingdao</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the stored record. Valid values:</p>
         * <ul>
         * <li><p>record</p>
         * </li>
         * <li><p>snapshot</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the stored file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://my_oss_bucket.oss-cn-qingdao.aliyuncs.com/record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8">http://my_oss_bucket.oss-cn-qingdao.aliyuncs.com/record/live/310*****007/2021-11-23-18-19-38_2021-11-23-18-33-48.m3u8</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Long width;

        public static DescribeRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordsResponseBodyRecords self = new DescribeRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRecordsResponseBodyRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRecordsResponseBodyRecords setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public DescribeRecordsResponseBodyRecords setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeRecordsResponseBodyRecords setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeRecordsResponseBodyRecords setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public DescribeRecordsResponseBodyRecords setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeRecordsResponseBodyRecords setOssObject(String ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public String getOssObject() {
            return this.ossObject;
        }

        public DescribeRecordsResponseBodyRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRecordsResponseBodyRecords setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

        public DescribeRecordsResponseBodyRecords setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public DescribeRecordsResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRecordsResponseBodyRecords setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordsResponseBodyRecords setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
