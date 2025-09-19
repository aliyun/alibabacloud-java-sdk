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
     * <p>Custom check item to validate input parameters.</p>
     */
    @NameInMap("CustomCheckConfig")
    public VerifyCheckCustomConfigRequestCustomCheckConfig customCheckConfig;

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
         * <p>Instance ID of the asset.</p>
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
         * <p>Define rules for custom inspection items.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AssociatedData&quot;:{&quot;ToDataList&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Instance&quot;,&quot;PropertyPath&quot;:&quot;InstanceId&quot;,&quot;FromPropertyPath&quot;:&quot;InstanceId&quot;}]},&quot;MatchProperty&quot;:{&quot;Operator&quot;:&quot;AND&quot;,&quot;MatchProperties&quot;:[{&quot;DataName&quot;:&quot;ACS_ECS_Disk&quot;,&quot;PropertyPath&quot;:&quot;DiskId&quot;,&quot;MatchOperator&quot;:&quot;EQ&quot;,&quot;MatchPropertyValue&quot;:&quot;testId&quot;}]}}</p>
         */
        @NameInMap("CheckRule")
        public String checkRule;

        /**
         * <p>Asset instance that requires testing rules</p>
         */
        @NameInMap("CloudAssetInstance")
        public VerifyCheckCustomConfigRequestCustomCheckConfigCloudAssetInstance cloudAssetInstance;

        /**
         * <p>Asset subtype of the cloud product</p>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>Asset types of cloud products. Values:</p>
         * <ul>
         * <li><strong>ECS</strong>: Elastic Compute Service </li>
         * <li><strong>SLB</strong>: Server Load Balancer </li>
         * <li><strong>RDS</strong>: Relational Database Service </li>
         * <li><strong>MONGODB</strong>: MongoDB Database </li>
         * <li><strong>KVSTORE</strong>: Redis Database </li>
         * <li><strong>ACR</strong>: Container Registry </li>
         * <li><strong>CSK</strong>: CSK </li>
         * <li><strong>VPC</strong>: Virtual Private Cloud </li>
         * <li><strong>ACTIONTRAIL</strong>: Action Trail </li>
         * <li><strong>CDN</strong>: Content Delivery Network </li>
         * <li><strong>CAS</strong>: Digital Certificate Management Service [formerly SSL Certificates] </li>
         * <li><strong>RDC</strong>: DevOps </li>
         * <li><strong>RAM</strong>: Resource Access Management </li>
         * <li><strong>DDOS</strong>: Distributed Denial of Service </li>
         * <li><strong>WAF</strong>: Web Application Firewall </li>
         * <li><strong>OSS</strong>: Object Storage Service </li>
         * <li><strong>POLARDB</strong>: POLARDB </li>
         * <li><strong>POSTGRESQL</strong>: PostgreSQL </li>
         * <li><strong>MSE</strong>: MSE </li>
         * <li><strong>NAS</strong>: Network Attached Storage </li>
         * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection </li>
         * <li><strong>EIP</strong>: Elastic IP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Cloud asset vendor. Values: </p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud </li>
         * <li><strong>Tencent</strong>: Tencent Cloud </li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud </li>
         * <li><strong>Azure</strong>: Microsoft </li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
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
