// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<GetScheduledInstancesResponseBodyInstances> instances;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetScheduledInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledInstancesResponseBody self = new GetScheduledInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduledInstancesResponseBody setInstances(java.util.List<GetScheduledInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetScheduledInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetScheduledInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduledInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetScheduledInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetScheduledInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduledInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetScheduledInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetScheduledInstancesResponseBodyInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("InstanceDesc")
        public String instanceDesc;

        /**
         * <strong>example:</strong>
         * <p>rm-2zep6e5u6l2yu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetScheduledInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetScheduledInstancesResponseBodyInstances self = new GetScheduledInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetScheduledInstancesResponseBodyInstances setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetScheduledInstancesResponseBodyInstances setInstanceDesc(String instanceDesc) {
            this.instanceDesc = instanceDesc;
            return this;
        }
        public String getInstanceDesc() {
            return this.instanceDesc;
        }

        public GetScheduledInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetScheduledInstancesResponseBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetScheduledInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
