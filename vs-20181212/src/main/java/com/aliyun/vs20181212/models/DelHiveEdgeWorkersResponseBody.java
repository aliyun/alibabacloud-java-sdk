// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DelHiveEdgeWorkersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    @NameInMap("FailedInstances")
    public java.util.List<DelHiveEdgeWorkersResponseBodyFailedInstances> failedInstances;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public Integer successInstanceCount;

    @NameInMap("SuccessInstances")
    public java.util.List<DelHiveEdgeWorkersResponseBodySuccessInstances> successInstances;

    public static DelHiveEdgeWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelHiveEdgeWorkersResponseBody self = new DelHiveEdgeWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public DelHiveEdgeWorkersResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public DelHiveEdgeWorkersResponseBody setFailedInstances(java.util.List<DelHiveEdgeWorkersResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<DelHiveEdgeWorkersResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public DelHiveEdgeWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelHiveEdgeWorkersResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public DelHiveEdgeWorkersResponseBody setSuccessInstances(java.util.List<DelHiveEdgeWorkersResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<DelHiveEdgeWorkersResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class DelHiveEdgeWorkersResponseBodyFailedInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ew-1226d588c69449209ee963161c067b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Error 1062 (23000): Duplicate entry \&quot;hive-4fbf3928d40e43948b98acdb4fb5aaed-ew-1226d588c69449209ee9631\&quot; for key \&quot;PRIMARY\&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        public static DelHiveEdgeWorkersResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            DelHiveEdgeWorkersResponseBodyFailedInstances self = new DelHiveEdgeWorkersResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public DelHiveEdgeWorkersResponseBodyFailedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DelHiveEdgeWorkersResponseBodyFailedInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DelHiveEdgeWorkersResponseBodySuccessInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ew-1226d588c69449209ee963161c067b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        public static DelHiveEdgeWorkersResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            DelHiveEdgeWorkersResponseBodySuccessInstances self = new DelHiveEdgeWorkersResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public DelHiveEdgeWorkersResponseBodySuccessInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DelHiveEdgeWorkersResponseBodySuccessInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
