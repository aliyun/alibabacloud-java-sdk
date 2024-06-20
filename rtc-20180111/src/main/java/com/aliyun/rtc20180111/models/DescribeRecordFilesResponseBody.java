// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordFilesResponseBody extends TeaModel {
    @NameInMap("RecordFiles")
    public java.util.List<DescribeRecordFilesResponseBodyRecordFiles> recordFiles;

    /**
     * <strong>example:</strong>
     * <p>760bad53276431c499e30dc36f6b****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public static DescribeRecordFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFilesResponseBody self = new DescribeRecordFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordFilesResponseBody setRecordFiles(java.util.List<DescribeRecordFilesResponseBodyRecordFiles> recordFiles) {
        this.recordFiles = recordFiles;
        return this;
    }
    public java.util.List<DescribeRecordFilesResponseBodyRecordFiles> getRecordFiles() {
        return this.recordFiles;
    }

    public DescribeRecordFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordFilesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeRecordFilesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeRecordFilesResponseBodyRecordFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yourAppId</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>yourChannelId</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>2020-10-02T17:36:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <strong>example:</strong>
         * <p>2020-11-01T17:36:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>2020-11-02T17:36:00Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Url")
        public String url;

        public static DescribeRecordFilesResponseBodyRecordFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordFilesResponseBodyRecordFiles self = new DescribeRecordFilesResponseBodyRecordFiles();
            return TeaModel.build(map, self);
        }

        public DescribeRecordFilesResponseBodyRecordFiles setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
