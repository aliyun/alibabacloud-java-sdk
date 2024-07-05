// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamInfoConfigResponseBody extends TeaModel {
    @NameInMap("LiveAppRecordList")
    public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList liveAppRecordList;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsPullStreamInfoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamInfoConfigResponseBody self = new DescribeVsPullStreamInfoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamInfoConfigResponseBody setLiveAppRecordList(DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList liveAppRecordList) {
        this.liveAppRecordList = liveAppRecordList;
        return this;
    }
    public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordList getLiveAppRecordList() {
        return this.liveAppRecordList;
    }

    public DescribeVsPullStreamInfoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxApp</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>2016-05-15T07:30:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://test">http://test</a></p>
         */
        @NameInMap("SourceUrl")
        public String sourceUrl;

        /**
         * <strong>example:</strong>
         * <p>2016-05-15T01:30:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>xxxStream</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord self = new DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord();
            return TeaModel.build(map, self);
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsPullStreamInfoConfigResponseBodyLiveAppRecordListLiveAppRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
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
