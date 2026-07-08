// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class MoveHiveEdgeWorkersResponseBody extends TeaModel {
    /**
     * <p>The number of instances that failed to move.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    /**
     * <p>Details of the instances that failed to move.</p>
     */
    @NameInMap("FailedInstances")
    public java.util.List<MoveHiveEdgeWorkersResponseBodyFailedInstances> failedInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of successfully moved instances.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SuccessInstanceCount")
    public Integer successInstanceCount;

    /**
     * <p>Details of the successfully moved instances.</p>
     */
    @NameInMap("SuccessInstances")
    public java.util.List<MoveHiveEdgeWorkersResponseBodySuccessInstances> successInstances;

    public static MoveHiveEdgeWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveHiveEdgeWorkersResponseBody self = new MoveHiveEdgeWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveHiveEdgeWorkersResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public MoveHiveEdgeWorkersResponseBody setFailedInstances(java.util.List<MoveHiveEdgeWorkersResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<MoveHiveEdgeWorkersResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public MoveHiveEdgeWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveHiveEdgeWorkersResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public MoveHiveEdgeWorkersResponseBody setSuccessInstances(java.util.List<MoveHiveEdgeWorkersResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<MoveHiveEdgeWorkersResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class MoveHiveEdgeWorkersResponseBodyFailedInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ew-1226d588c69449209ee963161c067b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Error 1062 (23000): Duplicate entry \&quot;hive-4fbf3928d40e43948b98acdb4fb5aaed-ew-1226d588c69449209ee9631\&quot; for key \&quot;PRIMARY\&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        public static MoveHiveEdgeWorkersResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            MoveHiveEdgeWorkersResponseBodyFailedInstances self = new MoveHiveEdgeWorkersResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public MoveHiveEdgeWorkersResponseBodyFailedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MoveHiveEdgeWorkersResponseBodyFailedInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class MoveHiveEdgeWorkersResponseBodySuccessInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ew-1226d588c69449209ee963161c067b04</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The result message. For a successful operation, the value is typically <code>SUCCESS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Message")
        public String message;

        public static MoveHiveEdgeWorkersResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            MoveHiveEdgeWorkersResponseBodySuccessInstances self = new MoveHiveEdgeWorkersResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public MoveHiveEdgeWorkersResponseBodySuccessInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MoveHiveEdgeWorkersResponseBodySuccessInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
