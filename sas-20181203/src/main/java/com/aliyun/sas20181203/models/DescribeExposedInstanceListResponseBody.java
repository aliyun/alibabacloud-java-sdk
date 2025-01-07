// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponseBody extends TeaModel {
    /**
     * <p>The details of the exposures.</p>
     */
    @NameInMap("ExposedInstances")
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeExposedInstanceListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>598A4A61-ABA7-456B-8725-7378258276D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExposedInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListResponseBody self = new DescribeExposedInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListResponseBody setExposedInstances(java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances) {
        this.exposedInstances = exposedInstances;
        return this;
    }
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> getExposedInstances() {
        return this.exposedInstances;
    }

    public DescribeExposedInstanceListResponseBody setPageInfo(DescribeExposedInstanceListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeExposedInstanceListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeExposedInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExposedInstanceListResponseBodyExposedInstances extends TeaModel {
        /**
         * <p>The number of high-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AsapVulCount")
        public Integer asapVulCount;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an ECS instance.</li>
         * <li><strong>1</strong>: a SLB instance.</li>
         * <li><strong>2</strong>: a NAT gateway.</li>
         * <li><strong>3</strong>: an ApsaraDB RDS instance.</li>
         * <li><strong>4</strong>: an ApsaraDB for MongoDB instance.</li>
         * <li><strong>5</strong>: an ApsaraDB for Redis instance.</li>
         * <li><strong>6</strong>: a container image.</li>
         * <li><strong>7</strong>: a container.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The JSON string that specifies the information about a database asset, which contains the following fields.</p>
         * <ul>
         * <li>assetSubType: the asset subtype.</li>
         * <li>assetSubTypeName: the name of the asset subtype.</li>
         * <li>assetType: the type of the asset.</li>
         * <li>assetTypeName: the name of the asset type.</li>
         * <li>vendor: the service provider of the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{assetSubTypeName&quot;:&quot;INSTANCE&quot;,&quot;assetType&quot;:3,&quot;assetTypeName&quot;:&quot;RDS&quot;,&quot;vendor&quot;:0}</p>
         */
        @NameInMap("CloudAssetInfo")
        public String cloudAssetInfo;

        /**
         * <p>The number of CSPM risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CspmAlarmCount")
        public Integer cspmAlarmCount;

        /**
         * <p>The number of weak password risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExploitHealthCount")
        public Integer exploitHealthCount;

        /**
         * <p>The server component that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>openssl,openssh</p>
         */
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        /**
         * <p>The public IP address that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>116.12.XX.XX</p>
         */
        @NameInMap("ExposureIp")
        public String exposureIp;

        /**
         * <p>The port that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ExposurePort")
        public String exposurePort;

        /**
         * <p>The resource from which the asset is exposed. Valid values:</p>
         * <ul>
         * <li><strong>INTERNET_IP</strong>: the public IP address of an ECS instance.</li>
         * <li><strong>SLB</strong>: the public IP address of a Server Load Balancer (SLB) instance.</li>
         * <li><strong>EIP</strong>: an elastic IP address (EIP).</li>
         * <li><strong>DNAT</strong>: the NAT gateway that connects to the Internet by using the Destination Network Address Translation (DNAT) feature.</li>
         * <li><strong>DB_CONNECTION</strong>: the public endpoint of a database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET_IP</p>
         */
        @NameInMap("ExposureType")
        public String exposureType;

        /**
         * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.</p>
         * <ul>
         * <li>If the value of the ExposureType parameter is <strong>INTERNET_IP</strong>, this parameter is empty.</li>
         * <li>If the value of the ExposureType parameter is <strong>SLB</strong>, the value of this parameter is the ID of the SLB instance.</li>
         * <li>If the value of the ExposureType parameter is <strong>EIP</strong>, the value of this parameter is the ID of the EIP.</li>
         * <li>If the value of the ExposureType parameter is <strong>DNAT</strong>, the value of this parameter is the ID of the NAT gateway.</li>
         * <li>If the value of the ExposureType parameter is <strong>DB_CONNECTION</strong>, the value of this parameter is the ID of the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-ew11313a****</p>
         */
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>9469268</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1g6wxdwps7s9dz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>abc_centos7.2_005</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>116.12.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of medium-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LaterVulCount")
        public Integer laterVulCount;

        /**
         * <p>The number of low-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NntfVulCount")
        public Integer nntfVulCount;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The total number of vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalVulCount")
        public Integer totalVulCount;

        /**
         * <p>The UUID of the server or the instance ID of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>dd803d9e-a337-4add-9c5b-7d503e08****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedInstanceListResponseBodyExposedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceListResponseBodyExposedInstances self = new DescribeExposedInstanceListResponseBodyExposedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setAsapVulCount(Integer asapVulCount) {
            this.asapVulCount = asapVulCount;
            return this;
        }
        public Integer getAsapVulCount() {
            return this.asapVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setCloudAssetInfo(String cloudAssetInfo) {
            this.cloudAssetInfo = cloudAssetInfo;
            return this;
        }
        public String getCloudAssetInfo() {
            return this.cloudAssetInfo;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setCspmAlarmCount(Integer cspmAlarmCount) {
            this.cspmAlarmCount = cspmAlarmCount;
            return this;
        }
        public Integer getCspmAlarmCount() {
            return this.cspmAlarmCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExploitHealthCount(Integer exploitHealthCount) {
            this.exploitHealthCount = exploitHealthCount;
            return this;
        }
        public Integer getExploitHealthCount() {
            return this.exploitHealthCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureComponent(String exposureComponent) {
            this.exposureComponent = exposureComponent;
            return this;
        }
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureIp(String exposureIp) {
            this.exposureIp = exposureIp;
            return this;
        }
        public String getExposureIp() {
            return this.exposureIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposurePort(String exposurePort) {
            this.exposurePort = exposurePort;
            return this;
        }
        public String getExposurePort() {
            return this.exposurePort;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureType(String exposureType) {
            this.exposureType = exposureType;
            return this;
        }
        public String getExposureType() {
            return this.exposureType;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureTypeId(String exposureTypeId) {
            this.exposureTypeId = exposureTypeId;
            return this;
        }
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setLaterVulCount(Integer laterVulCount) {
            this.laterVulCount = laterVulCount;
            return this;
        }
        public Integer getLaterVulCount() {
            return this.laterVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setNntfVulCount(Integer nntfVulCount) {
            this.nntfVulCount = nntfVulCount;
            return this;
        }
        public Integer getNntfVulCount() {
            return this.nntfVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setTotalVulCount(Integer totalVulCount) {
            this.totalVulCount = totalVulCount;
            return this;
        }
        public Integer getTotalVulCount() {
            return this.totalVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeExposedInstanceListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeExposedInstanceListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceListResponseBodyPageInfo self = new DescribeExposedInstanceListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
