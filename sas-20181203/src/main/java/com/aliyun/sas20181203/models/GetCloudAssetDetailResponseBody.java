// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailResponseBody extends TeaModel {
    /**
     * <p>The number of instances in the list of cloud assets returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array that consists of the details of the cloud assets.</p>
     */
    @NameInMap("Instances")
    public java.util.List<GetCloudAssetDetailResponseBodyInstances> instances;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CB45CAED-31C3-517A-8619-10F632D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetDetailResponseBody self = new GetCloudAssetDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetDetailResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetCloudAssetDetailResponseBody setInstances(java.util.List<GetCloudAssetDetailResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetCloudAssetDetailResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetCloudAssetDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetDetailResponseBodyInstances extends TeaModel {
        /**
         * <p>Indicates whether alerts are generated for the current cloud asset. Valid values:</p>
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
         * <p>The subtype of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The name of the cloud asset subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: ECS.</li>
         * <li><strong>1</strong>: SLB.</li>
         * <li><strong>3</strong>: ApsaraDB RDS.</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB.</li>
         * <li><strong>5</strong>: ApsaraDB for Redis.</li>
         * <li><strong>6</strong>: Container Registry.</li>
         * <li><strong>8</strong>: Container Service for Kubernetes.</li>
         * <li><strong>9</strong>: VPC.</li>
         * <li><strong>11</strong>: ActionTrail.</li>
         * <li><strong>12</strong>: CDN.</li>
         * <li><strong>13</strong>: Certificate Management Service.</li>
         * <li><strong>14</strong>: Apsara Devops.</li>
         * <li><strong>15</strong>: RAM.</li>
         * <li><strong>16</strong>: Anti-DDoS.</li>
         * <li><strong>17</strong>: WAF.</li>
         * <li><strong>18</strong>: OSS.</li>
         * <li><strong>19</strong>: PolarDB.</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL.</li>
         * <li><strong>21</strong>: MSE.</li>
         * <li><strong>22</strong>: NAS.</li>
         * <li><strong>23</strong>: DSC.</li>
         * <li><strong>24</strong>: EIP.</li>
         * <li><strong>25</strong>: IDaaS-EIAM.</li>
         * <li><strong>26</strong>: PolarDB-X.</li>
         * <li><strong>27</strong>: Elasticsearch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The name of the cloud asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The time when the instance was created. The value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1607365213000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The detailed address of the cloud asset.</p>
         */
        @NameInMap("DetailLink")
        public String detailLink;

        /**
         * <p>The instance ID of the cloud asset.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6t6u05n6g48****</p>
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
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("OriginalAssetInfo")
        public String originalAssetInfo;

        /**
         * <p>The region in which the cloud asset resides.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether risks are detected on the current cloud asset. Valid values:</p>
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
         * <p>{\&quot;seriousNum\&quot;:0,\&quot;appNum\&quot;:0,\&quot;baselineMedium\&quot;:0,\&quot;remindNum\&quot;:0,\&quot;imageVulNntf\&quot;:0,\&quot;cveNum\&quot;:0,\&quot;vul\&quot;:0,\&quot;uuid\&quot;:\&quot;rm-uf6t6u05n6g485o70\&quot;,\&quot;emgNum\&quot;:0,\&quot;weakPWNum\&quot;:0,\&quot;imageMaliciousFileRemind\&quot;:0,\&quot;imageBaselineMedium\&quot;:0,\&quot;laterVulCount\&quot;:0,\&quot;cmsNum\&quot;:0,\&quot;imageMaliciousFileSerious\&quot;:0,\&quot;agentlessMalicious\&quot;:0,\&quot;suspNum\&quot;:0,\&quot;imageBaselineHigh\&quot;:0,\&quot;asapVulCount\&quot;:0,\&quot;imageVulLater\&quot;:0,\&quot;agentlessAll\&quot;:0,\&quot;sysNum\&quot;:0,\&quot;containerLater\&quot;:0,\&quot;containerSuspicious\&quot;:0,\&quot;imageBaselineNum\&quot;:0,\&quot;newSuspicious\&quot;:0,\&quot;nntfVulCount\&quot;:0,\&quot;scaNum\&quot;:0,\&quot;containerNntf\&quot;:0,\&quot;health\&quot;:0,\&quot;trojan\&quot;:0,\&quot;suspicious\&quot;:0,\&quot;imageMaliciousFileSuspicious\&quot;:0,\&quot;containerRemind\&quot;:0,\&quot;baselineLow\&quot;:0,\&quot;imageVulAsap\&quot;:0,\&quot;imageBaselineLow\&quot;:0,\&quot;containerAsap\&quot;:0,\&quot;agentlessBaseline\&quot;:0,\&quot;agentlessVulSca\&quot;:0,\&quot;agentlessVulCve\&quot;:0,\&quot;containerSerious\&quot;:0,\&quot;baselineHigh\&quot;:0,\&quot;account\&quot;:0,\&quot;baselineNum\&quot;:6}</p>
         */
        @NameInMap("SecurityInfo")
        public String securityInfo;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud.</li>
         * <li><strong>1</strong>: service provider that is unrecognized.</li>
         * <li><strong>2</strong>: data center.</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: third-party service provider.</li>
         * <li><strong>8</strong>: simple application server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        @NameInMap("VendorUid")
        public String vendorUid;

        @NameInMap("VendorUserName")
        public String vendorUserName;

        public static GetCloudAssetDetailResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetDetailResponseBodyInstances self = new GetCloudAssetDetailResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetDetailResponseBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetSubTypeName(String assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
            return this;
        }
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public GetCloudAssetDetailResponseBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetCloudAssetDetailResponseBodyInstances setDetailLink(String detailLink) {
            this.detailLink = detailLink;
            return this;
        }
        public String getDetailLink() {
            return this.detailLink;
        }

        public GetCloudAssetDetailResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAssetDetailResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetCloudAssetDetailResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetCloudAssetDetailResponseBodyInstances setOriginalAssetInfo(String originalAssetInfo) {
            this.originalAssetInfo = originalAssetInfo;
            return this;
        }
        public String getOriginalAssetInfo() {
            return this.originalAssetInfo;
        }

        public GetCloudAssetDetailResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCloudAssetDetailResponseBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public GetCloudAssetDetailResponseBodyInstances setSecurityInfo(String securityInfo) {
            this.securityInfo = securityInfo;
            return this;
        }
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        public GetCloudAssetDetailResponseBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public GetCloudAssetDetailResponseBodyInstances setVendorUid(String vendorUid) {
            this.vendorUid = vendorUid;
            return this;
        }
        public String getVendorUid() {
            return this.vendorUid;
        }

        public GetCloudAssetDetailResponseBodyInstances setVendorUserName(String vendorUserName) {
            this.vendorUserName = vendorUserName;
            return this;
        }
        public String getVendorUserName() {
            return this.vendorUserName;
        }

    }

}
