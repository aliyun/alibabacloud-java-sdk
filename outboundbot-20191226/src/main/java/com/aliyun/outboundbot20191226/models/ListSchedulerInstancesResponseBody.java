// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListSchedulerInstancesResponseBody extends TeaModel {
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

    @NameInMap("SchedulerInstances")
    public java.util.List<ListSchedulerInstancesResponseBodySchedulerInstances> schedulerInstances;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSchedulerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchedulerInstancesResponseBody self = new ListSchedulerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchedulerInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSchedulerInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSchedulerInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSchedulerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchedulerInstancesResponseBody setSchedulerInstances(java.util.List<ListSchedulerInstancesResponseBodySchedulerInstances> schedulerInstances) {
        this.schedulerInstances = schedulerInstances;
        return this;
    }
    public java.util.List<ListSchedulerInstancesResponseBodySchedulerInstances> getSchedulerInstances() {
        return this.schedulerInstances;
    }

    public ListSchedulerInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSchedulerInstancesResponseBodySchedulerInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BaseStrategy")
        public String baseStrategy;

        /**
         * <strong>example:</strong>
         * <p>CLOUD_CODE_PUBLISHER</p>
         */
        @NameInMap("Business")
        public String business;

        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <strong>example:</strong>
         * <p>234852938</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        public static ListSchedulerInstancesResponseBodySchedulerInstances build(java.util.Map<String, ?> map) throws Exception {
            ListSchedulerInstancesResponseBodySchedulerInstances self = new ListSchedulerInstancesResponseBodySchedulerInstances();
            return TeaModel.build(map, self);
        }

        public ListSchedulerInstancesResponseBodySchedulerInstances setBaseStrategy(String baseStrategy) {
            this.baseStrategy = baseStrategy;
            return this;
        }
        public String getBaseStrategy() {
            return this.baseStrategy;
        }

        public ListSchedulerInstancesResponseBodySchedulerInstances setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListSchedulerInstancesResponseBodySchedulerInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSchedulerInstancesResponseBodySchedulerInstances setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListSchedulerInstancesResponseBodySchedulerInstances setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

    }

}
