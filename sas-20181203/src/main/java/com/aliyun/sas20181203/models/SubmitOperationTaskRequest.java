// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitOperationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The task dimension for the submitted operation task. Valid values:</p>
     * <ul>
     * <li>INSTANCE: instance dimension</li>
     * <li>CHECK_ID: check item dimension</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CHECK_ID</p>
     */
    @NameInMap("DimensionType")
    public String dimensionType;

    /**
     * <p>The asset information required to submit instance tasks.</p>
     */
    @NameInMap("OperationTaskInstances")
    public java.util.List<SubmitOperationTaskRequestOperationTaskInstances> operationTaskInstances;

    /**
     * <p>The relation key associated with cross-page selection when submitting the operation.</p>
     * <blockquote>
     * <p>Call the <a href="~~CreateAssetSelectionConfig~~">CreateAssetSelectionConfig</a> operation and use the BusinessType field to obtain the relation key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CSPM_OPERATION_RELATION_KEY_173***</p>
     */
    @NameInMap("RelationKey")
    public String relationKey;

    /**
     * <p>The temporary parameters required for the remediation task.</p>
     */
    @NameInMap("RepairTempParam")
    public java.util.List<SubmitOperationTaskRequestRepairTempParam> repairTempParam;

    /**
     * <p>The task type for the submitted task. Valid values:</p>
     * <ul>
     * <li>REPAIR: remediation task</li>
     * <li>ROLLBACK: rollback task</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REPAIR</p>
     */
    @NameInMap("Type")
    public String type;

    public static SubmitOperationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationTaskRequest self = new SubmitOperationTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitOperationTaskRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public SubmitOperationTaskRequest setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }
    public String getDimensionType() {
        return this.dimensionType;
    }

    public SubmitOperationTaskRequest setOperationTaskInstances(java.util.List<SubmitOperationTaskRequestOperationTaskInstances> operationTaskInstances) {
        this.operationTaskInstances = operationTaskInstances;
        return this;
    }
    public java.util.List<SubmitOperationTaskRequestOperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    public SubmitOperationTaskRequest setRelationKey(String relationKey) {
        this.relationKey = relationKey;
        return this;
    }
    public String getRelationKey() {
        return this.relationKey;
    }

    public SubmitOperationTaskRequest setRepairTempParam(java.util.List<SubmitOperationTaskRequestRepairTempParam> repairTempParam) {
        this.repairTempParam = repairTempParam;
        return this;
    }
    public java.util.List<SubmitOperationTaskRequestRepairTempParam> getRepairTempParam() {
        return this.repairTempParam;
    }

    public SubmitOperationTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class SubmitOperationTaskRequestOperationTaskInstances extends TeaModel {
        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6533m4vuo3oa33****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The task ID to roll back when performing a rollback task.</p>
         * 
         * <strong>example:</strong>
         * <p>7d0b10e35e80c9e5ebac5f1054****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: asset outside the cloud</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: asset from another cloud provider</li>
         * <li><strong>8</strong>: lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static SubmitOperationTaskRequestOperationTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            SubmitOperationTaskRequestOperationTaskInstances self = new SubmitOperationTaskRequestOperationTaskInstances();
            return TeaModel.build(map, self);
        }

        public SubmitOperationTaskRequestOperationTaskInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SubmitOperationTaskRequestOperationTaskInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SubmitOperationTaskRequestOperationTaskInstances setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SubmitOperationTaskRequestOperationTaskInstances setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class SubmitOperationTaskRequestRepairTempParam extends TeaModel {
        /**
         * <p>The name of the temporary remediation parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>IPPort</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the temporary remediation parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1XX.1XX</p>
         */
        @NameInMap("Value")
        public String value;

        public static SubmitOperationTaskRequestRepairTempParam build(java.util.Map<String, ?> map) throws Exception {
            SubmitOperationTaskRequestRepairTempParam self = new SubmitOperationTaskRequestRepairTempParam();
            return TeaModel.build(map, self);
        }

        public SubmitOperationTaskRequestRepairTempParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitOperationTaskRequestRepairTempParam setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
