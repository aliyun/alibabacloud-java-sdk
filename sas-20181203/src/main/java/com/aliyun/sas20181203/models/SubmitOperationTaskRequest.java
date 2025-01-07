// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitOperationTaskRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the ID of the check item.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The dimension of the task that you want to submit. Valid values:</p>
     * <ul>
     * <li>Instance dimension: INSTANCE</li>
     * <li>Check item dimension: CHECK_ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CHECK_ID</p>
     */
    @NameInMap("DimensionType")
    public String dimensionType;

    /**
     * <p>The asset information required to submit the tasks for instances.</p>
     */
    @NameInMap("OperationTaskInstances")
    public java.util.List<SubmitOperationTaskRequestOperationTaskInstances> operationTaskInstances;

    /**
     * <p>提交操作关联的跨页选择关联Key。</p>
     * <blockquote>
     * <p>您可调用<a href="~~CreateAssetSelectionConfig~~">CreateAssetSelectionConfig</a>接口BusinessType字段获取关联Key。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CSPM_OPERATION_RELATION_KEY_173***</p>
     */
    @NameInMap("RelationKey")
    public String relationKey;

    /**
     * <p>The temporary parameters required for the repair task.</p>
     */
    @NameInMap("RepairTempParam")
    public java.util.List<SubmitOperationTaskRequestRepairTempParam> repairTempParam;

    /**
     * <p>The type of the task that you want to submit. Valid values:</p>
     * <ul>
     * <li>Repair task: REPAIR</li>
     * <li>Rollback task: ROLLBACK</li>
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
         * <p>The ID of the task that you want to roll back</p>
         * 
         * <strong>example:</strong>
         * <p>7d0b10e35e80c9e5ebac5f1054****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The service provider of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
         * <li><strong>1</strong>: an asset outside Alibaba Cloud.</li>
         * <li><strong>2</strong>: an asset in a data center.</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset from a third-party cloud service provider.</li>
         * <li><strong>8</strong>: a lightweight asset.</li>
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
         * <p>The name of the temporary repair parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>IPPort</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the temporary repair parameter.</p>
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
