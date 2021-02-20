// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRecordFilesResponseBody extends TeaModel {
    @NameInMap("TotalNum")
    public Long totalNum;

    @NameInMap("TotalPage")
    public Long totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecordFiles")
    public java.util.List<DescribeRecordFilesResponseBodyRecordFiles> recordFiles;

    public static DescribeRecordFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordFilesResponseBody self = new DescribeRecordFilesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeRecordFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordFilesResponseBody setRecordFiles(java.util.List<DescribeRecordFilesResponseBodyRecordFiles> recordFiles) {
        this.recordFiles = recordFiles;
        return this;
    }
    public java.util.List<DescribeRecordFilesResponseBodyRecordFiles> getRecordFiles() {
        return this.recordFiles;
    }

    public static class DescribeRecordFilesResponseBodyRecordFiles extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("Url")
        public String url;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("StopTime")
        public String stopTime;

        public static DescribeRecordFilesResponseBodyRecordFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecordFilesResponseBodyRecordFiles self = new DescribeRecordFilesResponseBodyRecordFiles();
            return TeaModel.build(map, self);
        }

        public DescribeRecordFilesResponseBodyRecordFiles setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public DescribeRecordFilesResponseBodyRecordFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeRecordFilesResponseBodyRecordFiles setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

}
