// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckCustomConfigRequest extends TeaModel {
    /**
     * <p>Check item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>List of custom configuration items for the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<VerifyCheckCustomConfigRequestCustomConfigs> customConfigs;

    /**
     * <p>Repair parameters supported by the check item\&quot;s repair function.</p>
     */
    @NameInMap("RepairConfigs")
    public java.util.List<VerifyCheckCustomConfigRequestRepairConfigs> repairConfigs;

    public static VerifyCheckCustomConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckCustomConfigRequest self = new VerifyCheckCustomConfigRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckCustomConfigRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public VerifyCheckCustomConfigRequest setCustomConfigs(java.util.List<VerifyCheckCustomConfigRequestCustomConfigs> customConfigs) {
        this.customConfigs = customConfigs;
        return this;
    }
    public java.util.List<VerifyCheckCustomConfigRequestCustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    public VerifyCheckCustomConfigRequest setRepairConfigs(java.util.List<VerifyCheckCustomConfigRequestRepairConfigs> repairConfigs) {
        this.repairConfigs = repairConfigs;
        return this;
    }
    public java.util.List<VerifyCheckCustomConfigRequestRepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    public static class VerifyCheckCustomConfigRequestCustomConfigs extends TeaModel {
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

        public static VerifyCheckCustomConfigRequestCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigRequestCustomConfigs self = new VerifyCheckCustomConfigRequestCustomConfigs();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigRequestCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyCheckCustomConfigRequestCustomConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public VerifyCheckCustomConfigRequestCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class VerifyCheckCustomConfigRequestRepairConfigs extends TeaModel {
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

        public static VerifyCheckCustomConfigRequestRepairConfigs build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigRequestRepairConfigs self = new VerifyCheckCustomConfigRequestRepairConfigs();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigRequestRepairConfigs setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public VerifyCheckCustomConfigRequestRepairConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyCheckCustomConfigRequestRepairConfigs setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public VerifyCheckCustomConfigRequestRepairConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
