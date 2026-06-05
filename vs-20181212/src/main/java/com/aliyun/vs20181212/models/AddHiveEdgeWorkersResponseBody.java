// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class AddHiveEdgeWorkersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedInstanceCount")
    public Integer failedInstanceCount;

    @NameInMap("FailedInstances")
    public java.util.List<AddHiveEdgeWorkersResponseBodyFailedInstances> failedInstances;

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
    public java.util.List<AddHiveEdgeWorkersResponseBodySuccessInstances> successInstances;

    public static AddHiveEdgeWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHiveEdgeWorkersResponseBody self = new AddHiveEdgeWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHiveEdgeWorkersResponseBody setFailedInstanceCount(Integer failedInstanceCount) {
        this.failedInstanceCount = failedInstanceCount;
        return this;
    }
    public Integer getFailedInstanceCount() {
        return this.failedInstanceCount;
    }

    public AddHiveEdgeWorkersResponseBody setFailedInstances(java.util.List<AddHiveEdgeWorkersResponseBodyFailedInstances> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }
    public java.util.List<AddHiveEdgeWorkersResponseBodyFailedInstances> getFailedInstances() {
        return this.failedInstances;
    }

    public AddHiveEdgeWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHiveEdgeWorkersResponseBody setSuccessInstanceCount(Integer successInstanceCount) {
        this.successInstanceCount = successInstanceCount;
        return this;
    }
    public Integer getSuccessInstanceCount() {
        return this.successInstanceCount;
    }

    public AddHiveEdgeWorkersResponseBody setSuccessInstances(java.util.List<AddHiveEdgeWorkersResponseBodySuccessInstances> successInstances) {
        this.successInstances = successInstances;
        return this;
    }
    public java.util.List<AddHiveEdgeWorkersResponseBodySuccessInstances> getSuccessInstances() {
        return this.successInstances;
    }

    public static class AddHiveEdgeWorkersResponseBodyFailedInstances extends TeaModel {
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

        public static AddHiveEdgeWorkersResponseBodyFailedInstances build(java.util.Map<String, ?> map) throws Exception {
            AddHiveEdgeWorkersResponseBodyFailedInstances self = new AddHiveEdgeWorkersResponseBodyFailedInstances();
            return TeaModel.build(map, self);
        }

        public AddHiveEdgeWorkersResponseBodyFailedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddHiveEdgeWorkersResponseBodyFailedInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AddHiveEdgeWorkersResponseBodySuccessInstances extends TeaModel {
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

        public static AddHiveEdgeWorkersResponseBodySuccessInstances build(java.util.Map<String, ?> map) throws Exception {
            AddHiveEdgeWorkersResponseBodySuccessInstances self = new AddHiveEdgeWorkersResponseBodySuccessInstances();
            return TeaModel.build(map, self);
        }

        public AddHiveEdgeWorkersResponseBodySuccessInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddHiveEdgeWorkersResponseBodySuccessInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
