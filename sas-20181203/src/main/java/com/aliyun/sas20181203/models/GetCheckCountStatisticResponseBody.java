// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckCountStatisticResponseBody extends TeaModel {
    /**
     * <p>The risk item statistics.</p>
     */
    @NameInMap("CheckCountStatisticDTO")
    public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO checkCountStatisticDTO;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckCountStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckCountStatisticResponseBody self = new GetCheckCountStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckCountStatisticResponseBody setCheckCountStatisticDTO(GetCheckCountStatisticResponseBodyCheckCountStatisticDTO checkCountStatisticDTO) {
        this.checkCountStatisticDTO = checkCountStatisticDTO;
        return this;
    }
    public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO getCheckCountStatisticDTO() {
        return this.checkCountStatisticDTO;
    }

    public GetCheckCountStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems extends TeaModel {
        /**
         * <p>Check item display name</p>
         * 
         * <strong>example:</strong>
         * <p>开启公网访问</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The number of the CPU cores used by the host instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The instance ID of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9bpxyu6t74qn9g****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>launch-advisor-2021****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The subtype of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceSubType")
        public Integer instanceSubType;

        /**
         * <p>The asset subtype of the cloud service. Valid values:</p>
         * <ul>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><p><strong>INSTANCE</strong></p>
         * </li>
         * <li><p><strong>DISK</strong></p>
         * </li>
         * <li><p><strong>SECURITY_GROUP</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><p><strong>REPOSITORY_ENTERPRISE</strong></p>
         * </li>
         * <li><p><strong>REPOSITORY_PERSON</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><p><strong>ALIAS</strong></p>
         * </li>
         * <li><p><strong>USER</strong></p>
         * </li>
         * <li><p><strong>POLICY</strong></p>
         * </li>
         * <li><p><strong>GROUP</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>WAF</strong>, this parameter supports the following valid value:</p>
         * <ul>
         * <li><strong>DOMAIN</strong></li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to other values, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("InstanceSubTypeName")
        public String instanceSubTypeName;

        /**
         * <p>The asset type. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>1</strong>: Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p><strong>2</strong>: NAT gateway.</p>
         * </li>
         * <li><p><strong>3</strong>: ApsaraDB RDS instance.</p>
         * </li>
         * <li><p><strong>4</strong>: ApsaraDB for MongoDB (MongoDB) instance.</p>
         * </li>
         * <li><p><strong>5</strong>: Tair (Redis OSS-compatible) (Tair) instance.</p>
         * </li>
         * <li><p><strong>6</strong>: container image.</p>
         * </li>
         * <li><p><strong>7</strong>: container.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstanceType")
        public Integer instanceType;

        /**
         * <p>The asset type of the cloud service. Valid values:</p>
         * <ul>
         * <li><p><strong>ECS</strong>: ECS.</p>
         * </li>
         * <li><p><strong>SLB</strong>: SLB.</p>
         * </li>
         * <li><p><strong>RDS</strong>: ApsaraDB RDS.</p>
         * </li>
         * <li><p><strong>MONGODB</strong>: ApsaraDB for MongoDB.</p>
         * </li>
         * <li><p><strong>KVSTORE</strong>: Tair.</p>
         * </li>
         * <li><p><strong>ACR</strong>: Container Registry.</p>
         * </li>
         * <li><p><strong>CSK</strong>: Container Service for Kubernetes (ACK).</p>
         * </li>
         * <li><p><strong>VPC</strong>: Virtual Private Cloud (VPC).</p>
         * </li>
         * <li><p><strong>ACTIONTRAIL</strong>: ActionTrail.</p>
         * </li>
         * <li><p><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</p>
         * </li>
         * <li><p><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service).</p>
         * </li>
         * <li><p><strong>RDC</strong>: Alibaba Cloud DevOps.</p>
         * </li>
         * <li><p><strong>RAM</strong>: Resource Access Management (RAM).</p>
         * </li>
         * <li><p><strong>DDOS</strong>: Anti-DDoS.</p>
         * </li>
         * <li><p><strong>WAF</strong>: Web Application Firewall (WAF).</p>
         * </li>
         * <li><p><strong>OSS</strong>: Object Storage Service (OSS).</p>
         * </li>
         * <li><p><strong>POLARDB</strong>: PolarDB.</p>
         * </li>
         * <li><p><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL.</p>
         * </li>
         * <li><p><strong>MSE</strong>: Microservices Engine (MSE).</p>
         * </li>
         * <li><p><strong>NAS</strong>: File Storage NAS (NAS).</p>
         * </li>
         * <li><p><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP).</p>
         * </li>
         * <li><p><strong>EIP</strong>: Elastic IP Address (EIP).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceTypeName")
        public String instanceTypeName;

        /**
         * <p>The public IP address of the host instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the host instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The version of the operating system that the host instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <p>The UUID of the host instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c9107c04-942f-40c1-981a-f1c1****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><p><strong>ALIYUN</strong>: Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>TENCENT</strong>: Tencent Cloud.</p>
         * </li>
         * <li><p><strong>MICROSOFT</strong>: Microsoft Azure.</p>
         * </li>
         * <li><p><strong>AWS</strong>: AWS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>Vendor name</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        @NameInMap("VendorShowName")
        public String vendorShowName;

        /**
         * <p>The ID of the VPC to which the host instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf60agqq65bs98zoo****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems build(java.util.Map<String, ?> map) throws Exception {
            GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems self = new GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems();
            return TeaModel.build(map, self);
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceSubType(Integer instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public Integer getInstanceSubType() {
            return this.instanceSubType;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceSubTypeName(String instanceSubTypeName) {
            this.instanceSubTypeName = instanceSubTypeName;
            return this;
        }
        public String getInstanceSubTypeName() {
            return this.instanceSubTypeName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceType(Integer instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Integer getInstanceType() {
            return this.instanceType;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setVendorShowName(String vendorShowName) {
            this.vendorShowName = vendorShowName;
            return this;
        }
        public String getVendorShowName() {
            return this.vendorShowName;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class GetCheckCountStatisticResponseBodyCheckCountStatisticDTO extends TeaModel {
        /**
         * <p>The risk item statistics.</p>
         */
        @NameInMap("CheckCountStatisticItems")
        public java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> checkCountStatisticItems;

        /**
         * <p>The type of the statistics. Valid values:</p>
         * <ul>
         * <li><p><strong>user</strong>: the top five users that are granted excessive permissions.</p>
         * </li>
         * <li><p><strong>role</strong>: the top five roles that are granted excessive permissions.</p>
         * </li>
         * <li><p><strong>instance</strong>: the top five cloud services on which risks are detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("StatisticType")
        public String statisticType;

        public static GetCheckCountStatisticResponseBodyCheckCountStatisticDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCheckCountStatisticResponseBodyCheckCountStatisticDTO self = new GetCheckCountStatisticResponseBodyCheckCountStatisticDTO();
            return TeaModel.build(map, self);
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO setCheckCountStatisticItems(java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> checkCountStatisticItems) {
            this.checkCountStatisticItems = checkCountStatisticItems;
            return this;
        }
        public java.util.List<GetCheckCountStatisticResponseBodyCheckCountStatisticDTOCheckCountStatisticItems> getCheckCountStatisticItems() {
            return this.checkCountStatisticItems;
        }

        public GetCheckCountStatisticResponseBodyCheckCountStatisticDTO setStatisticType(String statisticType) {
            this.statisticType = statisticType;
            return this;
        }
        public String getStatisticType() {
            return this.statisticType;
        }

    }

}
