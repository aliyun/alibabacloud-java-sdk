// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerJStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetMqSofamqConsumerJStackResponseBodyData data;

    public static GetMqSofamqConsumerJStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerJStackResponseBody self = new GetMqSofamqConsumerJStackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerJStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqConsumerJStackResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqConsumerJStackResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMqSofamqConsumerJStackResponseBody setData(GetMqSofamqConsumerJStackResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqSofamqConsumerJStackResponseBodyData getData() {
        return this.data;
    }

    public static class GetMqSofamqConsumerJStackResponseBodyDataJstack extends TeaModel {
        @NameInMap("Thread")
        public String thread;

        @NameInMap("TrackList")
        public java.util.List<String> trackList;

        public static GetMqSofamqConsumerJStackResponseBodyDataJstack build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerJStackResponseBodyDataJstack self = new GetMqSofamqConsumerJStackResponseBodyDataJstack();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerJStackResponseBodyDataJstack setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

        public GetMqSofamqConsumerJStackResponseBodyDataJstack setTrackList(java.util.List<String> trackList) {
            this.trackList = trackList;
            return this;
        }
        public java.util.List<String> getTrackList() {
            return this.trackList;
        }

    }

    public static class GetMqSofamqConsumerJStackResponseBodyData extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Jstack")
        public java.util.List<GetMqSofamqConsumerJStackResponseBodyDataJstack> jstack;

        public static GetMqSofamqConsumerJStackResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerJStackResponseBodyData self = new GetMqSofamqConsumerJStackResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerJStackResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetMqSofamqConsumerJStackResponseBodyData setJstack(java.util.List<GetMqSofamqConsumerJStackResponseBodyDataJstack> jstack) {
            this.jstack = jstack;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerJStackResponseBodyDataJstack> getJstack() {
            return this.jstack;
        }

    }

}
