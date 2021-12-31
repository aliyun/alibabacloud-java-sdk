// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppGroupDataReportResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeAppGroupDataReportResponseBodyResult result;

    public static DescribeAppGroupDataReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppGroupDataReportResponseBody self = new DescribeAppGroupDataReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppGroupDataReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppGroupDataReportResponseBody setResult(DescribeAppGroupDataReportResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppGroupDataReportResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage extends TeaModel {
        @NameInMap("arg1")
        public String arg1;

        @NameInMap("arg3")
        public String arg3;

        @NameInMap("args")
        public String args;

        @NameInMap("clientIp")
        public String clientIp;

        @NameInMap("eventId")
        public Integer eventId;

        @NameInMap("page")
        public String page;

        @NameInMap("sdkType")
        public String sdkType;

        @NameInMap("sdkVersion")
        public String sdkVersion;

        @NameInMap("sessionId")
        public String sessionId;

        @NameInMap("userId")
        public String userId;

        public static DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage self = new DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setArg1(String arg1) {
            this.arg1 = arg1;
            return this;
        }
        public String getArg1() {
            return this.arg1;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setArg3(String arg3) {
            this.arg3 = arg3;
            return this;
        }
        public String getArg3() {
            return this.arg3;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setEventId(Integer eventId) {
            this.eventId = eventId;
            return this;
        }
        public Integer getEventId() {
            return this.eventId;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setPage(String page) {
            this.page = page;
            return this;
        }
        public String getPage() {
            return this.page;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setSdkType(String sdkType) {
            this.sdkType = sdkType;
            return this;
        }
        public String getSdkType() {
            return this.sdkType;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeAppGroupDataReportResponseBodyResultReceivedSample extends TeaModel {
        @NameInMap("message")
        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage message;

        @NameInMap("receivedTimeMs")
        public Long receivedTimeMs;

        public static DescribeAppGroupDataReportResponseBodyResultReceivedSample build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupDataReportResponseBodyResultReceivedSample self = new DescribeAppGroupDataReportResponseBodyResultReceivedSample();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSample setMessage(DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage message) {
            this.message = message;
            return this;
        }
        public DescribeAppGroupDataReportResponseBodyResultReceivedSampleMessage getMessage() {
            return this.message;
        }

        public DescribeAppGroupDataReportResponseBodyResultReceivedSample setReceivedTimeMs(Long receivedTimeMs) {
            this.receivedTimeMs = receivedTimeMs;
            return this;
        }
        public Long getReceivedTimeMs() {
            return this.receivedTimeMs;
        }

    }

    public static class DescribeAppGroupDataReportResponseBodyResult extends TeaModel {
        @NameInMap("receivedCount")
        public Integer receivedCount;

        @NameInMap("receivedSample")
        public java.util.List<DescribeAppGroupDataReportResponseBodyResultReceivedSample> receivedSample;

        public static DescribeAppGroupDataReportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppGroupDataReportResponseBodyResult self = new DescribeAppGroupDataReportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppGroupDataReportResponseBodyResult setReceivedCount(Integer receivedCount) {
            this.receivedCount = receivedCount;
            return this;
        }
        public Integer getReceivedCount() {
            return this.receivedCount;
        }

        public DescribeAppGroupDataReportResponseBodyResult setReceivedSample(java.util.List<DescribeAppGroupDataReportResponseBodyResultReceivedSample> receivedSample) {
            this.receivedSample = receivedSample;
            return this;
        }
        public java.util.List<DescribeAppGroupDataReportResponseBodyResultReceivedSample> getReceivedSample() {
            return this.receivedSample;
        }

    }

}
