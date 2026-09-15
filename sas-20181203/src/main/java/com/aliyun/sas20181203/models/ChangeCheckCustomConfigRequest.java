// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckCustomConfigRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The list of custom configuration items for the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<ChangeCheckCustomConfigRequestCustomConfigs> customConfigs;

    /**
     * <p>The region of the Security Center instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> China</li>
     * <li><strong>ap-southeast-1:</strong> Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The repair parameters supported by the repair feature of the check item.</p>
     */
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
         * <p>The name of the custom configuration item, which is unique within the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>SessionTimeMax</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type of the custom configuration item. Set this parameter to DELETE only when deleting a configuration item. You do not need to specify this parameter for create or update operations.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The user-configured value string of the custom configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
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
        /**
         * <p>The ID of the repair flow used during the repair process.</p>
         * 
         * <strong>example:</strong>
         * <p>ascgrmscyjgs*********</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the repair parameter, which is unique within the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Port</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type of the custom configuration item. Set this parameter to DELETE only when deleting a configuration item. You do not need to specify this parameter for create or update operations.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The user-configured value string of the repair configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
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
