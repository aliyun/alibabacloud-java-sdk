// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckCustomConfigShrinkRequest extends TeaModel {
    /**
     * <p>Check item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>Custom check item to validate input parameters.</p>
     */
    @NameInMap("CustomCheckConfig")
    public String customCheckConfigShrink;

    /**
     * <p>List of custom configuration items for the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<VerifyCheckCustomConfigShrinkRequestCustomConfigs> customConfigs;

    /**
     * <p>Repair parameters supported by the check item\&quot;s repair function.</p>
     */
    @NameInMap("RepairConfigs")
    public java.util.List<VerifyCheckCustomConfigShrinkRequestRepairConfigs> repairConfigs;

    /**
     * <p>Situation Awareness parameter validation types: </p>
     * <ul>
     * <li><strong>REPAIR_CONFIG</strong>: Repair and custom parameter validation (default) </li>
     * <li><strong>CHECK_ITEM_CONFIG</strong>: Custom check item validation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REPAIR_CONFIG</p>
     */
    @NameInMap("Type")
    public String type;

    public static VerifyCheckCustomConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckCustomConfigShrinkRequest self = new VerifyCheckCustomConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckCustomConfigShrinkRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public VerifyCheckCustomConfigShrinkRequest setCustomCheckConfigShrink(String customCheckConfigShrink) {
        this.customCheckConfigShrink = customCheckConfigShrink;
        return this;
    }
    public String getCustomCheckConfigShrink() {
        return this.customCheckConfigShrink;
    }

    public VerifyCheckCustomConfigShrinkRequest setCustomConfigs(java.util.List<VerifyCheckCustomConfigShrinkRequestCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<VerifyCheckCustomConfigShrinkRequestCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public VerifyCheckCustomConfigShrinkRequest setRepairConfigs(java.util.List<VerifyCheckCustomConfigShrinkRequestRepairConfigs> repairConfigs) {
        this.repairConfigs = repairConfigs;
        return this;
    }
    public java.util.List<VerifyCheckCustomConfigShrinkRequestRepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    public VerifyCheckCustomConfigShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class VerifyCheckCustomConfigShrinkRequestCustomConfigs extends TeaModel {
        /**
         * <p>Name of the custom configuration item for the check item, unique within the same check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPList</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>User-configured value string for the custom configuration item of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.4.XX</p>
         */
        @NameInMap("Value")
        public String value;

        public static VerifyCheckCustomConfigShrinkRequestCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigShrinkRequestCustomConfigs self = new VerifyCheckCustomConfigShrinkRequestCustomConfigs();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigShrinkRequestCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyCheckCustomConfigShrinkRequestCustomConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public VerifyCheckCustomConfigShrinkRequestCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class VerifyCheckCustomConfigShrinkRequestRepairConfigs extends TeaModel {
        /**
         * <p>ID of the repair process during the repair.</p>
         * 
         * <strong>example:</strong>
         * <p>7fec0a3395b345c18f108ffc9fc0****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Name of the repair parameter for the check item, unique within the same check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPLists</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>User-configured value string for the repair parameter of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>172.26.49.XX</p>
         */
        @NameInMap("Value")
        public String value;

        public static VerifyCheckCustomConfigShrinkRequestRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigShrinkRequestRepairConfigs self = new VerifyCheckCustomConfigShrinkRequestRepairConfigs();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigShrinkRequestRepairConfigs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public VerifyCheckCustomConfigShrinkRequestRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyCheckCustomConfigShrinkRequestRepairConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public VerifyCheckCustomConfigShrinkRequestRepairConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
