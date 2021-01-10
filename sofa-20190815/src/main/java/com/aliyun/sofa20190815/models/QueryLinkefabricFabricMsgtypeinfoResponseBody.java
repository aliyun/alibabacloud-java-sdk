// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgtypeinfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<QueryLinkefabricFabricMsgtypeinfoResponseBodyData> data;

    public static QueryLinkefabricFabricMsgtypeinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgtypeinfoResponseBody self = new QueryLinkefabricFabricMsgtypeinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricMsgtypeinfoResponseBody setData(java.util.List<QueryLinkefabricFabricMsgtypeinfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricMsgtypeinfoResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricMsgtypeinfoResponseBodyData extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("MsgSize")
        public String msgSize;

        @NameInMap("MsgTotal")
        public String msgTotal;

        @NameInMap("NormalTps")
        public String normalTps;

        @NameInMap("PeakTotal")
        public String peakTotal;

        @NameInMap("PeakTps")
        public String peakTps;

        @NameInMap("Pgroup")
        public String pgroup;

        @NameInMap("ReadPartition")
        public String readPartition;

        @NameInMap("ReliabilityReq")
        public String reliabilityReq;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TypeDesc")
        public String typeDesc;

        @NameInMap("UseCase")
        public String useCase;

        @NameInMap("WritePartition")
        public String writePartition;

        public static QueryLinkefabricFabricMsgtypeinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricMsgtypeinfoResponseBodyData self = new QueryLinkefabricFabricMsgtypeinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setMsgSize(String msgSize) {
            this.msgSize = msgSize;
            return this;
        }
        public String getMsgSize() {
            return this.msgSize;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setMsgTotal(String msgTotal) {
            this.msgTotal = msgTotal;
            return this;
        }
        public String getMsgTotal() {
            return this.msgTotal;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setNormalTps(String normalTps) {
            this.normalTps = normalTps;
            return this;
        }
        public String getNormalTps() {
            return this.normalTps;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setPeakTotal(String peakTotal) {
            this.peakTotal = peakTotal;
            return this;
        }
        public String getPeakTotal() {
            return this.peakTotal;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setPeakTps(String peakTps) {
            this.peakTps = peakTps;
            return this;
        }
        public String getPeakTps() {
            return this.peakTps;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setPgroup(String pgroup) {
            this.pgroup = pgroup;
            return this;
        }
        public String getPgroup() {
            return this.pgroup;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setReadPartition(String readPartition) {
            this.readPartition = readPartition;
            return this;
        }
        public String getReadPartition() {
            return this.readPartition;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setReliabilityReq(String reliabilityReq) {
            this.reliabilityReq = reliabilityReq;
            return this;
        }
        public String getReliabilityReq() {
            return this.reliabilityReq;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }
        public String getTypeDesc() {
            return this.typeDesc;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setUseCase(String useCase) {
            this.useCase = useCase;
            return this;
        }
        public String getUseCase() {
            return this.useCase;
        }

        public QueryLinkefabricFabricMsgtypeinfoResponseBodyData setWritePartition(String writePartition) {
            this.writePartition = writePartition;
            return this;
        }
        public String getWritePartition() {
            return this.writePartition;
        }

    }

}
