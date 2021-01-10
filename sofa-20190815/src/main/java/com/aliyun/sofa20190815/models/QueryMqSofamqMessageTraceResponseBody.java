// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryMqSofamqMessageTraceResponseBodyData data;

    public static QueryMqSofamqMessageTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageTraceResponseBody self = new QueryMqSofamqMessageTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMqSofamqMessageTraceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMqSofamqMessageTraceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMqSofamqMessageTraceResponseBody setData(QueryMqSofamqMessageTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMqSofamqMessageTraceResponseBodyData getData() {
        return this.data;
    }

    public static class QueryMqSofamqMessageTraceResponseBodyDataTrackList extends TeaModel {
        @NameInMap("ConsumerGroup")
        public String consumerGroup;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TrackType")
        public String trackType;

        public static QueryMqSofamqMessageTraceResponseBodyDataTrackList build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageTraceResponseBodyDataTrackList self = new QueryMqSofamqMessageTraceResponseBodyDataTrackList();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageTraceResponseBodyDataTrackList setConsumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            return this;
        }
        public String getConsumerGroup() {
            return this.consumerGroup;
        }

        public QueryMqSofamqMessageTraceResponseBodyDataTrackList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMqSofamqMessageTraceResponseBodyDataTrackList setTrackType(String trackType) {
            this.trackType = trackType;
            return this;
        }
        public String getTrackType() {
            return this.trackType;
        }

    }

    public static class QueryMqSofamqMessageTraceResponseBodyData extends TeaModel {
        @NameInMap("TrackList")
        public java.util.List<QueryMqSofamqMessageTraceResponseBodyDataTrackList> trackList;

        public static QueryMqSofamqMessageTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMqSofamqMessageTraceResponseBodyData self = new QueryMqSofamqMessageTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMqSofamqMessageTraceResponseBodyData setTrackList(java.util.List<QueryMqSofamqMessageTraceResponseBodyDataTrackList> trackList) {
            this.trackList = trackList;
            return this;
        }
        public java.util.List<QueryMqSofamqMessageTraceResponseBodyDataTrackList> getTrackList() {
            return this.trackList;
        }

    }

}
