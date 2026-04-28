// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetModelOperatorOrderResponseBody extends TeaModel {
    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetModelOperatorOrderResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Request result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetModelOperatorOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelOperatorOrderResponseBody self = new GetModelOperatorOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelOperatorOrderResponseBody setData(GetModelOperatorOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelOperatorOrderResponseBodyData getData() {
        return this.data;
    }

    public GetModelOperatorOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelOperatorOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelOperatorOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelOperatorOrderResponseBodyDataInstanceList extends TeaModel {
        /**
         * <p>The instance end time (format: Timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1775145600000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>instance type</p>
         * 
         * <strong>example:</strong>
         * <p>xlarge</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance start time (format: Timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1772439028000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>active/creating</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetModelOperatorOrderResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetModelOperatorOrderResponseBodyDataInstanceList self = new GetModelOperatorOrderResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public GetModelOperatorOrderResponseBodyDataInstanceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetModelOperatorOrderResponseBodyDataInstanceList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public GetModelOperatorOrderResponseBodyDataInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetModelOperatorOrderResponseBodyDataInstanceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetModelOperatorOrderResponseBodyDataInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetModelOperatorOrderResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether a valid order exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasValidOrder")
        public Boolean hasValidOrder;

        /**
         * <p>The instance list.</p>
         */
        @NameInMap("InstanceList")
        public java.util.List<GetModelOperatorOrderResponseBodyDataInstanceList> instanceList;

        public static GetModelOperatorOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelOperatorOrderResponseBodyData self = new GetModelOperatorOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelOperatorOrderResponseBodyData setHasValidOrder(Boolean hasValidOrder) {
            this.hasValidOrder = hasValidOrder;
            return this;
        }
        public Boolean getHasValidOrder() {
            return this.hasValidOrder;
        }

        public GetModelOperatorOrderResponseBodyData setInstanceList(java.util.List<GetModelOperatorOrderResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<GetModelOperatorOrderResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
