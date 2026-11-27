// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppRecordingFilesResponseBody extends TeaModel {
    /**
     * <p>List of recording files.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAppRecordingFilesResponseBodyItems> items;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    public static DescribeAppRecordingFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppRecordingFilesResponseBody self = new DescribeAppRecordingFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppRecordingFilesResponseBody setItems(java.util.List<DescribeAppRecordingFilesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAppRecordingFilesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAppRecordingFilesResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAppRecordingFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppRecordingFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppRecordingFilesResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeAppRecordingFilesResponseBodyItems extends TeaModel {
        /**
         * <p>User-defined bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>rtc-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testchannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>Recording file creation timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1712376032000</p>
         */
        @NameInMap("FileCreateTs")
        public Long fileCreateTs;

        /**
         * <p>Recording file duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("FileDuration")
        public Integer fileDuration;

        /**
         * <p>Path where the recording file is stored. Use the SDK of your cloud provider&quot;s Object Storage Service to access the file. For Alibaba Cloud OSS, see <a href="https://help.aliyun.com/zh/oss/user-guide/how-to-obtain-the-url-of-a-single-object-or-the-urls-of-multiple-objects">here</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>record/appid/12_task_local1/1712279809158_1712279844691/playlist.mp4</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>Recording file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("FileSize")
        public Integer fileSize;

        /**
         * <p>See region used in the recording task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <p>Recording task start timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1712376012000</p>
         */
        @NameInMap("StartTs")
        public Long startTs;

        /**
         * <p>Recording task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>See vendor used when starting the recording task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static DescribeAppRecordingFilesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppRecordingFilesResponseBodyItems self = new DescribeAppRecordingFilesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAppRecordingFilesResponseBodyItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeAppRecordingFilesResponseBodyItems setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeAppRecordingFilesResponseBodyItems setFileCreateTs(Long fileCreateTs) {
            this.fileCreateTs = fileCreateTs;
            return this;
        }
        public Long getFileCreateTs() {
            return this.fileCreateTs;
        }

        public DescribeAppRecordingFilesResponseBodyItems setFileDuration(Integer fileDuration) {
            this.fileDuration = fileDuration;
            return this;
        }
        public Integer getFileDuration() {
            return this.fileDuration;
        }

        public DescribeAppRecordingFilesResponseBodyItems setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DescribeAppRecordingFilesResponseBodyItems setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public DescribeAppRecordingFilesResponseBodyItems setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public DescribeAppRecordingFilesResponseBodyItems setStartTs(Long startTs) {
            this.startTs = startTs;
            return this;
        }
        public Long getStartTs() {
            return this.startTs;
        }

        public DescribeAppRecordingFilesResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeAppRecordingFilesResponseBodyItems setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
