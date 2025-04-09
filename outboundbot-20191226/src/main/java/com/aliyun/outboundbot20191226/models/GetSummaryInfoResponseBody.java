// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetSummaryInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AgentBotInstanceSummaryList")
    public java.util.List<GetSummaryInfoResponseBodyAgentBotInstanceSummaryList> agentBotInstanceSummaryList;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryInfoResponseBody self = new GetSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSummaryInfoResponseBody setAgentBotInstanceSummaryList(java.util.List<GetSummaryInfoResponseBodyAgentBotInstanceSummaryList> agentBotInstanceSummaryList) {
        this.agentBotInstanceSummaryList = agentBotInstanceSummaryList;
        return this;
    }
    public java.util.List<GetSummaryInfoResponseBodyAgentBotInstanceSummaryList> getAgentBotInstanceSummaryList() {
        return this.agentBotInstanceSummaryList;
    }

    public GetSummaryInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSummaryInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSummaryInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSummaryInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSummaryInfoResponseBodyAgentBotInstanceSummaryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalCallCount")
        public Long totalCallCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCallTime")
        public Long totalCallTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedRecordingStorageSpace")
        public Integer usedRecordingStorageSpace;

        public static GetSummaryInfoResponseBodyAgentBotInstanceSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetSummaryInfoResponseBodyAgentBotInstanceSummaryList self = new GetSummaryInfoResponseBodyAgentBotInstanceSummaryList();
            return TeaModel.build(map, self);
        }

        public GetSummaryInfoResponseBodyAgentBotInstanceSummaryList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSummaryInfoResponseBodyAgentBotInstanceSummaryList setTotalCallCount(Long totalCallCount) {
            this.totalCallCount = totalCallCount;
            return this;
        }
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        public GetSummaryInfoResponseBodyAgentBotInstanceSummaryList setTotalCallTime(Long totalCallTime) {
            this.totalCallTime = totalCallTime;
            return this;
        }
        public Long getTotalCallTime() {
            return this.totalCallTime;
        }

        public GetSummaryInfoResponseBodyAgentBotInstanceSummaryList setUsedRecordingStorageSpace(Integer usedRecordingStorageSpace) {
            this.usedRecordingStorageSpace = usedRecordingStorageSpace;
            return this;
        }
        public Integer getUsedRecordingStorageSpace() {
            return this.usedRecordingStorageSpace;
        }

    }

}
