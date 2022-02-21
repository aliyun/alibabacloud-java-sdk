// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamConfigResponseBody extends TeaModel {
    @NameInMap("LiveAppRecordList")
    public DescribeVsPullStreamConfigResponseBodyLiveAppRecordList liveAppRecordList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsPullStreamConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamConfigResponseBody self = new DescribeVsPullStreamConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamConfigResponseBody setLiveAppRecordList(DescribeVsPullStreamConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeVsPullStreamConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public DescribeVsPullStreamConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        public static DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class DescribeVsPullStreamConfigResponseBodyLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        public java.util.List<DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeVsPullStreamConfigResponseBodyLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsPullStreamConfigResponseBodyLiveAppRecordList self = new DescribeVsPullStreamConfigResponseBodyLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeVsPullStreamConfigResponseBodyLiveAppRecordList setLiveAppRecord(java.util.List<DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeVsPullStreamConfigResponseBodyLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}
