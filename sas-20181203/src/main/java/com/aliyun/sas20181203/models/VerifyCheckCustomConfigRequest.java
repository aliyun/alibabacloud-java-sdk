// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckCustomConfigRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>76</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The input parameters for custom check item validation.</p>
     */
    @NameInMap("CustomCheckConfig")
    public VerifyCheckCustomConfigRequestCustomCheckConfig customCheckConfig;

    /**
     * <p>The list of custom parameter configuration items for the check item.</p>
     */
    @NameInMap("CustomConfigs")
    public java.util.List<VerifyCheckCustomConfigRequestCustomConfigs> customConfigs;

    /**
     * <p>The repair parameters supported by the repair feature of the check item.</p>
     */
    @NameInMap("RepairConfigs")
    public java.util.List<VerifyCheckCustomConfigRequestRepairConfigs> repairConfigs;

    /**
     * <p>The validation type for Threat Detection Service parameters. Valid values:</p>
     * <ul>
     * <li><strong>REPAIR_CONFIG</strong>: repair and custom parameter validation (default).</li>
     * <li><strong>CHECK_ITEM_CONFIG</strong>: custom check item validation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>REPAIR_CONFIG</p>
     */
    @NameInMap("Type")
    public String type;

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

    public VerifyCheckCustomConfigRequest setCustomCheckConfig(VerifyCheckCustomConfigRequestCustomCheckConfig customCheckConfig) {
        this.customCheckConfig = customCheckConfig;
        return this;
    }
    public VerifyCheckCustomConfigRequestCustomCheckConfig getCustomCheckConfig() {
        return this.customCheckConfig;
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

    public VerifyCheckCustomConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance extends TeaModel {
        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-0jl4mjgl261cfrz5****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance self = new VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class VerifyCheckCustomConfigRequestCustomCheckConfig extends TeaModel {
        /**
         * <p>The definition rule of the custom check item.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;DiskId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;}]}}</p>
         */
        @NameInMap("CheckRule")
        public String checkRule;

        /**
         * <p>The asset instance on which you want to test the rule.</p>
         */
        @NameInMap("CloudAssetInstance")
        public VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance cloudAssetInstance;

        /**
         * <p>The asset subtype of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: server</li>
         * <li><strong>SLB</strong>: load balancing</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS database</li>
         * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB database</li>
         * <li><strong>KVSTORE</strong>: ApsaraDB for Redis database</li>
         * <li><strong>ACR</strong>: ACR</li>
         * <li><strong>CSK</strong>: CSK</li>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>ACTIONTRAIL</strong>: ActionTrail</li>
         * <li><strong>CDN</strong>: CDN</li>
         * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>RDC</strong>: Apsara Devops</li>
         * <li><strong>RAM</strong>: RAM</li>
         * <li><strong>DDOS</strong>: distributed deny of service</li>
         * <li><strong>WAF</strong>: WAF</li>
         * <li><strong>OSS</strong>: access control</li>
         * <li><strong>POLARDB</strong>: POLARDB</li>
         * <li><strong>POSTGRESQL</strong>: PostgreSQL</li>
         * <li><strong>MSE</strong>: MSE</li>
         * <li><strong>NAS</strong>: NAS</li>
         * <li><strong>SDDP</strong>: SDDP</li>
         * <li><strong>EIP</strong>: EIP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The cloud asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Azure</strong>: Microsoft Azure</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static VerifyCheckCustomConfigRequestCustomCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckCustomConfigRequestCustomCheckConfig self = new VerifyCheckCustomConfigRequestCustomCheckConfig();
            return TeaModel.build(map, self);
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfig setCheckRule(String checkRule) {
            this.checkRule = checkRule;
            return this;
        }
        public String getCheckRule() {
            return this.checkRule;
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfig setCloudAssetInstance(VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance cloudAssetInstance) {
            this.cloudAssetInstance = cloudAssetInstance;
            return this;
        }
        public VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance getCloudAssetInstance() {
            return this.cloudAssetInstance;
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfig setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public VerifyCheckCustomConfigRequestCustomCheckConfig setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class VerifyCheckCustomConfigRequestCustomConfigs extends TeaModel {
        /**
         * <p>The name of the custom configuration item for the check item. The name is unique within the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPList</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type of the custom configuration item for the check item. Set this parameter to DELETE only for deletion operations. You do not need to specify this parameter for creation or update operations.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The user-configured value string of the custom configuration item for the check item.</p>
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
         * <p>The ID of the repair flow that corresponds to the repair operation.</p>
         * 
         * <strong>example:</strong>
         * <p>7fec0a3395b345c18f108ffc9fc0****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the repair parameter for the check item. The name is unique within the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPLists</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operation type of the custom configuration item for the check item. Set this parameter to DELETE only for deletion operations. You do not need to specify this parameter for creation or update operations.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The user-configured value string of the repair configuration item for the check item.</p>
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
