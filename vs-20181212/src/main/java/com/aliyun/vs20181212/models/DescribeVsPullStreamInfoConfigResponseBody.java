// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveAppRecordList")
    public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList liveAppRecordList;

    public static DescribeVsPullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamInfoConfigResponseBody self = new DescribeVsPullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVsPullStreamInfoConfigResponseBody setLiveAppRecordList(DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public static class DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("SourceUrl")
        public String sourceUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StreamName")
        public String streamName;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList extends TeaModel {
        @NameInMap("LiveAppRecord")
        public java.util.List<DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord;

        public static DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList self = new DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList();
            return TeaModel.build(map, self);
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList setLiveAppRecord(java.util.List<DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord> liveAppRecord) {
            this.liveAppRecord = liveAppRecord;
            return this;
        }
        public java.util.List<DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord> getLiveAppRecord() {
            return this.liveAppRecord;
        }

    }

}
