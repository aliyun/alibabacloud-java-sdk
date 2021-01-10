// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXTransactionChartResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetDTXTransactionChartResponseBodyData data;

    public static GetDTXTransactionChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDTXTransactionChartResponseBody self = new GetDTXTransactionChartResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDTXTransactionChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDTXTransactionChartResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDTXTransactionChartResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDTXTransactionChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDTXTransactionChartResponseBody setData(GetDTXTransactionChartResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDTXTransactionChartResponseBodyData getData() {
        return this.data;
    }

    public static class GetDTXTransactionChartResponseBodyDataEdges extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsError")
        public Boolean isError;

        @NameInMap("Source")
        public Long source;

        @NameInMap("Target")
        public Long target;

        @NameInMap("Type")
        public String type;

        public static GetDTXTransactionChartResponseBodyDataEdges build(java.util.Map<String, ?> map) throws Exception {
            GetDTXTransactionChartResponseBodyDataEdges self = new GetDTXTransactionChartResponseBodyDataEdges();
            return TeaModel.build(map, self);
        }

        public GetDTXTransactionChartResponseBodyDataEdges setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setIsError(Boolean isError) {
            this.isError = isError;
            return this;
        }
        public Boolean getIsError() {
            return this.isError;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setSource(Long source) {
            this.source = source;
            return this;
        }
        public Long getSource() {
            return this.source;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setTarget(Long target) {
            this.target = target;
            return this;
        }
        public Long getTarget() {
            return this.target;
        }

        public GetDTXTransactionChartResponseBodyDataEdges setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDTXTransactionChartResponseBodyDataNodes extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsEnd")
        public Boolean isEnd;

        @NameInMap("Label")
        public String label;

        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

        @NameInMap("StartTime")
        public String startTime;

        public static GetDTXTransactionChartResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetDTXTransactionChartResponseBodyDataNodes self = new GetDTXTransactionChartResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetDTXTransactionChartResponseBodyDataNodes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setIsEnd(Boolean isEnd) {
            this.isEnd = isEnd;
            return this;
        }
        public Boolean getIsEnd() {
            return this.isEnd;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetDTXTransactionChartResponseBodyDataNodes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetDTXTransactionChartResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Cost")
        public Long cost;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("LastHandleTime")
        public String lastHandleTime;

        @NameInMap("LowerLineCount")
        public Long lowerLineCount;

        @NameInMap("ParticipatorNum")
        public Long participatorNum;

        @NameInMap("StarterIp")
        public String starterIp;

        @NameInMap("StarterName")
        public String starterName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("TxId")
        public String txId;

        @NameInMap("UpperLineCount")
        public Long upperLineCount;

        @NameInMap("Edges")
        public java.util.List<GetDTXTransactionChartResponseBodyDataEdges> edges;

        @NameInMap("Nodes")
        public java.util.List<GetDTXTransactionChartResponseBodyDataNodes> nodes;

        public static GetDTXTransactionChartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDTXTransactionChartResponseBodyData self = new GetDTXTransactionChartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDTXTransactionChartResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetDTXTransactionChartResponseBodyData setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetDTXTransactionChartResponseBodyData setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public GetDTXTransactionChartResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDTXTransactionChartResponseBodyData setLastHandleTime(String lastHandleTime) {
            this.lastHandleTime = lastHandleTime;
            return this;
        }
        public String getLastHandleTime() {
            return this.lastHandleTime;
        }

        public GetDTXTransactionChartResponseBodyData setLowerLineCount(Long lowerLineCount) {
            this.lowerLineCount = lowerLineCount;
            return this;
        }
        public Long getLowerLineCount() {
            return this.lowerLineCount;
        }

        public GetDTXTransactionChartResponseBodyData setParticipatorNum(Long participatorNum) {
            this.participatorNum = participatorNum;
            return this;
        }
        public Long getParticipatorNum() {
            return this.participatorNum;
        }

        public GetDTXTransactionChartResponseBodyData setStarterIp(String starterIp) {
            this.starterIp = starterIp;
            return this;
        }
        public String getStarterIp() {
            return this.starterIp;
        }

        public GetDTXTransactionChartResponseBodyData setStarterName(String starterName) {
            this.starterName = starterName;
            return this;
        }
        public String getStarterName() {
            return this.starterName;
        }

        public GetDTXTransactionChartResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDTXTransactionChartResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetDTXTransactionChartResponseBodyData setTxId(String txId) {
            this.txId = txId;
            return this;
        }
        public String getTxId() {
            return this.txId;
        }

        public GetDTXTransactionChartResponseBodyData setUpperLineCount(Long upperLineCount) {
            this.upperLineCount = upperLineCount;
            return this;
        }
        public Long getUpperLineCount() {
            return this.upperLineCount;
        }

        public GetDTXTransactionChartResponseBodyData setEdges(java.util.List<GetDTXTransactionChartResponseBodyDataEdges> edges) {
            this.edges = edges;
            return this;
        }
        public java.util.List<GetDTXTransactionChartResponseBodyDataEdges> getEdges() {
            return this.edges;
        }

        public GetDTXTransactionChartResponseBodyData setNodes(java.util.List<GetDTXTransactionChartResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetDTXTransactionChartResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
