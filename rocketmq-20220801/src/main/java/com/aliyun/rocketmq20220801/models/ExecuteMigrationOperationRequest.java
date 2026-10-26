// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ExecuteMigrationOperationRequest extends TeaModel {
    /**
     * <p>The operation parameter.</p>
     */
    @NameInMap("operationParam")
    public ExecuteMigrationOperationRequestOperationParam operationParam;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rmq-cn-x0r37kel***</p>
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
         * <p>The parameter information. The parameter type is a JSON string. See the examples below.</p>
         * <p>The valid values for the action field are as follows:</p>
         * <ul>
         * <li>MIGRATE_FORWARD (migrate forward)</li>
         * <li>MIGRATE_BACKWARD (migrate backward)</li>
         * </ul>
         * <p>The valid values for the targetStage field are as follows:</p>
         * <ul>
         * <li>MIGRATE_WAIT (read from and write to the source cluster)</li>
         * <li>DOUBLE_READ (write to the source cluster with redundant reads)</li>
         * <li>SWITCH_WRITE (write to the destination cluster with redundant reads)</li>
         * <li>MIGRATE_FINISH (read from and write to the destination cluster)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For migration forward, you can only advance one stage at a time in order.</li>
         * <li>For migration rollback, you can roll back to any previous stage.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Migrate forward: {&quot;action&quot;:&quot;MIGRATE_FORWARD&quot;,&quot;targetStage&quot;:&quot;MIGRATE_FINISH&quot;}</p>
         * <p>Migrate backward: {&quot;action&quot;:&quot;MIGRATE_BACKWARD&quot;,&quot;targetStage&quot;:&quot;MIGRATE_WAIT&quot;}</p>
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
