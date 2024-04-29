// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckCustomConfigRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <br>
     * <p>> You can call the [ListCheckResult](~~ListCheckResult~~) operation to query the IDs of check items.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The custom configuration items of the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> customConfigs;

    /**
     * <p>The region where the Security Center instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: International</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepairConfigs")
    public java.util.List<ChangeCheckCustomConfigRequestRepairConfigs> repairConfigs;

    public static ChangeCheckCustomConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckCustomConfigRequest self = new ChangeCheckCustomConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckCustomConfigRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ChangeCheckCustomConfigRequest setCustomConfigs(java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public ChangeCheckCustomConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckCustomConfigRequest setRepairConfigs(java.util.List<ChangeCheckCustomConfigRequestRepairConfigs> repairConfigs) {
        this.repairConfigs = repairConfigs;
        return this;
    }
    public java.util.List<ChangeCheckCustomConfigRequestRepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    public static class ChangeCheckCustomConfigRequestCustomConfigs extends TeaModel {
        /**
         * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation that you want to perform on the custom configuration item. This parameter is required only if you want to delete the custom configuration item. To delete the custom configuration item, set the value to DELETE.</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The value of the custom configuration item. The value is a string.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ChangeCheckCustomConfigRequestCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigRequestCustomConfigs self = new ChangeCheckCustomConfigRequestCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ChangeCheckCustomConfigRequestCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ChangeCheckCustomConfigRequestRepairConfigs extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public String value;

        public static ChangeCheckCustomConfigRequestRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckCustomConfigRequestRepairConfigs self = new ChangeCheckCustomConfigRequestRepairConfigs();
            return TeaModel.build(map, self);
        }

        public ChangeCheckCustomConfigRequestRepairConfigs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ChangeCheckCustomConfigRequestRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ChangeCheckCustomConfigRequestRepairConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ChangeCheckCustomConfigRequestRepairConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
