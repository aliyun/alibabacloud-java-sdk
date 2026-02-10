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
         * <li><strong>INSTANCE</strong></li>
         * <li><strong>DISK</strong></li>
         * <li><strong>SECURITY_GROUP</strong></li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
         * <li><strong>REPOSITORY_PERSON</strong></li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceTypeName</strong> is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>ALIAS</strong></li>
         * <li><strong>USER</strong></li>
         * <li><strong>POLICY</strong></li>
         * <li><strong>GROUP</strong></li>
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
         * <li><strong>0</strong>: Elastic Compute Service (ECS) instance.</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB) instance.</li>
         * <li><strong>2</strong>: NAT gateway.</li>
         * <li><strong>3</strong>: ApsaraDB RDS instance.</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB (MongoDB) instance.</li>
         * <li><strong>5</strong>: Tair (Redis OSS-compatible) (Tair) instance.</li>
         * <li><strong>6</strong>: container image.</li>
         * <li><strong>7</strong>: container.</li>
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
         * <li><strong>ECS</strong>: ECS.</li>
         * <li><strong>SLB</strong>: SLB.</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
         * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>KVSTORE</strong>: Tair.</li>
         * <li><strong>ACR</strong>: Container Registry.</li>
         * <li><strong>CSK</strong>: Container Service for Kubernetes (ACK).</li>
         * <li><strong>VPC</strong>: Virtual Private Cloud (VPC).</li>
         * <li><strong>ACTIONTRAIL</strong>: ActionTrail.</li>
         * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</li>
         * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service).</li>
         * <li><strong>RDC</strong>: Alibaba Cloud DevOps.</li>
         * <li><strong>RAM</strong>: Resource Access Management (RAM).</li>
         * <li><strong>DDOS</strong>: Anti-DDoS.</li>
         * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS).</li>
         * <li><strong>POLARDB</strong>: PolarDB.</li>
         * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL.</li>
         * <li><strong>MSE</strong>: Microservices Engine (MSE).</li>
         * <li><strong>NAS</strong>: File Storage NAS (NAS).</li>
         * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP).</li>
         * <li><strong>EIP</strong>: Elastic IP Address (EIP).</li>
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
         * <li><strong>ALIYUN</strong>: Alibaba Cloud.</li>
         * <li><strong>TENCENT</strong>: Tencent Cloud.</li>
         * <li><strong>MICROSOFT</strong>: Microsoft Azure.</li>
         * <li><strong>AWS</strong>: AWS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
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
         * <li><strong>user</strong>: the top five users that are granted excessive permissions.</li>
         * <li><strong>role</strong>: the top five roles that are granted excessive permissions.</li>
         * <li><strong>instance</strong>: the top five cloud services on which risks are detected.</li>
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
