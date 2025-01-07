// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the cloud assets.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListCloudAssetInstancesResponseBodyInstances> instances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCloudAssetInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6BF880</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCloudAssetInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetInstancesResponseBody self = new ListCloudAssetInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetInstancesResponseBody setInstances(java.util.List<ListCloudAssetInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListCloudAssetInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListCloudAssetInstancesResponseBody setPageInfo(ListCloudAssetInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCloudAssetInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCloudAssetInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAssetInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCloudAssetInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>Indicates whether alerts are generated for the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The subtype of the cloud service. The subtype of the cloud asset. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: ECS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * <li><strong>1</strong>: disk (storage)</li>
         * <li><strong>2</strong>: security group</li>
         * </ul>
         * </li>
         * <li><p><strong>1</strong>: SLB</p>
         * <ul>
         * <li><strong>0</strong>: SLB</li>
         * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
         * </ul>
         * </li>
         * <li><p><strong>3</strong>: ApsaraDB RDS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>4</strong>: ApsaraDB for MongoDB</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>5</strong>: ApsaraDB for Redis</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>6</strong>: Container Registry</p>
         * <ul>
         * <li><strong>1</strong>: Enterprise Edition</li>
         * <li><strong>2</strong>: Personal Edition</li>
         * </ul>
         * </li>
         * <li><p><strong>8</strong>: ACK</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>9</strong>: VPC</p>
         * <ul>
         * <li><strong>0</strong>: NAT gateway</li>
         * <li><strong>1</strong>: EIP</li>
         * <li><strong>2</strong>: VPN</li>
         * <li><strong>3</strong>: FLOW_LOG</li>
         * </ul>
         * </li>
         * <li><p><strong>11</strong>: ActionTrail</p>
         * <ul>
         * <li><strong>0</strong>: trail</li>
         * </ul>
         * </li>
         * <li><p><strong>12</strong>: Alibaba Cloud CDN</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <ul>
         * <li><strong>0</strong>: certificate</li>
         * </ul>
         * </li>
         * <li><p><strong>14</strong>: Apsara Devops</p>
         * <ul>
         * <li><strong>0</strong>: organization</li>
         * </ul>
         * </li>
         * <li><p><strong>16</strong>: Anti-DDoS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>17</strong>: WAF</p>
         * <ul>
         * <li><strong>0</strong>: domain name</li>
         * </ul>
         * </li>
         * <li><p><strong>18</strong>: OSS</p>
         * <ul>
         * <li><strong>0</strong>: bucket</li>
         * </ul>
         * </li>
         * <li><p><strong>19</strong>: PolarDB</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>20</strong>: ApsaraDB RDS for PostgreSQL</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>21</strong>: MSE</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>22</strong>: NAS</p>
         * <ul>
         * <li><strong>0</strong>: file system</li>
         * </ul>
         * </li>
         * <li><p><strong>23</strong>: DSC</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>24</strong>: EIP</p>
         * <ul>
         * <li><strong>0</strong>: Anycast EIP</li>
         * </ul>
         * </li>
         * <li><p><strong>25</strong>: IDaaS EIAM</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>26</strong>: PolarDB-X</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>27</strong>: Elasticsearch</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public String assetSubType;

        /**
         * <p>The subtype name of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURITY_GROUP</p>
         */
        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>3</strong>: ApsaraDB RDS</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB</li>
         * <li><strong>5</strong>: ApsaraDB for Redis</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Apsara Devops</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: File Storage NAS (NAS)</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM)</li>
         * <li><strong>26</strong>: PolarDB-X</li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The type name of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1607365213000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The instance ID of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>d-uf60vevzkztnflx7cny5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>yztest-l***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The ID of the region to which the cloud asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether risks are detected on the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The security information about the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;seriousNum&quot;:0,&quot;appNum&quot;:0,&quot;baselineMedium&quot;:0,&quot;remindNum&quot;:0,&quot;imageVulNntf&quot;:0,&quot;cveNum&quot;:0,&quot;vul&quot;:0,&quot;uuid&quot;:&quot;yuejia-test&quot;,&quot;emgNum&quot;:0,&quot;weakPWNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;laterVulCount&quot;:0,&quot;cmsNum&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;agentlessMalicious&quot;:0,&quot;suspNum&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;asapVulCount&quot;:0,&quot;imageVulLater&quot;:0,&quot;agentlessAll&quot;:0,&quot;sysNum&quot;:0,&quot;containerLater&quot;:0,&quot;containerSuspicious&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;scaNum&quot;:0,&quot;containerNntf&quot;:0,&quot;health&quot;:0,&quot;trojan&quot;:0,&quot;suspicious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;containerRemind&quot;:0,&quot;baselineLow&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;containerAsap&quot;:0,&quot;agentlessBaseline&quot;:0,&quot;agentlessVulSca&quot;:0,&quot;agentlessVulCve&quot;:0,&quot;containerSerious&quot;:0,&quot;baselineHigh&quot;:0,&quot;account&quot;:0,&quot;baselineNum&quot;:5}</p>
         */
        @NameInMap("SecurityInfo")
        public String securityInfo;

        /**
         * <p>The service provider (SP) of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: a third-party cloud asset</li>
         * <li><strong>2</strong>: a cloud asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
         * <li><strong>8</strong>: a lightweight cloud asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListCloudAssetInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesResponseBodyInstances self = new ListCloudAssetInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesResponseBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetSubType(String assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public String getAssetSubType() {
            return this.assetSubType;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetSubTypeName(String assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
            return this;
        }
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCloudAssetInstancesResponseBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCloudAssetInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListCloudAssetInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCloudAssetInstancesResponseBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public ListCloudAssetInstancesResponseBodyInstances setSecurityInfo(String securityInfo) {
            this.securityInfo = securityInfo;
            return this;
        }
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        public ListCloudAssetInstancesResponseBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class ListCloudAssetInstancesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of cloud assets.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCloudAssetInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetInstancesResponseBodyPageInfo self = new ListCloudAssetInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCloudAssetInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
