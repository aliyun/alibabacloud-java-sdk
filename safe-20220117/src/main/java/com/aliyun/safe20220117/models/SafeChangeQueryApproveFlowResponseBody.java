// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeQueryApproveFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<SafeChangeQueryApproveFlowResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SafeChangeQueryApproveFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeQueryApproveFlowResponseBody self = new SafeChangeQueryApproveFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public SafeChangeQueryApproveFlowResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SafeChangeQueryApproveFlowResponseBody setData(java.util.List<SafeChangeQueryApproveFlowResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SafeChangeQueryApproveFlowResponseBodyData> getData() {
        return this.data;
    }

    public SafeChangeQueryApproveFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SafeChangeQueryApproveFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SafeChangeQueryApproveFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SafeChangeQueryApproveFlowResponseBodyData extends TeaModel {
        @NameInMap("ApproveStrategy")
        public String approveStrategy;

        @NameInMap("Approver")
        public String approver;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        public static SafeChangeQueryApproveFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SafeChangeQueryApproveFlowResponseBodyData self = new SafeChangeQueryApproveFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SafeChangeQueryApproveFlowResponseBodyData setApproveStrategy(String approveStrategy) {
            this.approveStrategy = approveStrategy;
            return this;
        }
        public String getApproveStrategy() {
            return this.approveStrategy;
        }

        public SafeChangeQueryApproveFlowResponseBodyData setApprover(String approver) {
            this.approver = approver;
            return this;
        }
        public String getApprover() {
            return this.approver;
        }

        public SafeChangeQueryApproveFlowResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public SafeChangeQueryApproveFlowResponseBodyData setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

    }

}
