// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ExecuteMigrationOperationRequest extends TeaModel {
    @NameInMap("operationParam")
    public ExecuteMigrationOperationRequestOperationParam operationParam;

    /**
     * <strong>example:</strong>
     * <p>rmq-cn-x0r37kelk0o</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    public static ExecuteMigrationOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteMigrationOperationRequest self = new ExecuteMigrationOperationRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteMigrationOperationRequest setOperationParam(ExecuteMigrationOperationRequestOperationParam operationParam) {
        this.operationParam = operationParam;
        return this;
    }
    public ExecuteMigrationOperationRequestOperationParam getOperationParam() {
        return this.operationParam;
    }

    public ExecuteMigrationOperationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class ExecuteMigrationOperationRequestOperationParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("paramData")
        public Object paramData;

        public static ExecuteMigrationOperationRequestOperationParam build(java.util.Map<String, ?> map) throws Exception {
            ExecuteMigrationOperationRequestOperationParam self = new ExecuteMigrationOperationRequestOperationParam();
            return TeaModel.build(map, self);
        }

        public ExecuteMigrationOperationRequestOperationParam setParamData(Object paramData) {
            this.paramData = paramData;
            return this;
        }
        public Object getParamData() {
            return this.paramData;
        }

    }

}
