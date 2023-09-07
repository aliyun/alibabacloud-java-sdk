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
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
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
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The subtype of the cloud service. The subtype of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: ECS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <p>    *   **1**: disk (storage)</p>
         * <p>    *   **2**: security group</p>
         * <br>
         * <p>*   **1**: SLB</p>
         * <br>
         * <p>    *   **0**: SLB</p>
         * <p>    *   **1**: Application Load Balancer (ALB)</p>
         * <br>
         * <p>*   **3**: ApsaraDB RDS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **4**: ApsaraDB for MongoDB</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **5**: ApsaraDB for Redis</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **6**: Container Registry</p>
         * <br>
         * <p>    *   **1**: Enterprise Edition</p>
         * <p>    *   **2**: Personal Edition</p>
         * <br>
         * <p>*   **8**: ACK</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **9**: VPC</p>
         * <br>
         * <p>    *   **0**: NAT gateway</p>
         * <p>    *   **1**: EIP</p>
         * <p>    *   **2**: VPN</p>
         * <p>    *   **3**: FLOW_LOG</p>
         * <br>
         * <p>*   **11**: ActionTrail</p>
         * <br>
         * <p>    *   **0**: trail</p>
         * <br>
         * <p>*   **12**: Alibaba Cloud CDN</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **13**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <br>
         * <p>    *   **0**: certificate</p>
         * <br>
         * <p>*   **14**: Apsara Devops</p>
         * <br>
         * <p>    *   **0**: organization</p>
         * <br>
         * <p>*   **16**: Anti-DDoS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **17**: WAF</p>
         * <br>
         * <p>    *   **0**: domain name</p>
         * <br>
         * <p>*   **18**: OSS</p>
         * <br>
         * <p>    *   **0**: bucket</p>
         * <br>
         * <p>*   **19**: PolarDB</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **21**: MSE</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **22**: NAS</p>
         * <br>
         * <p>    *   **0**: file system</p>
         * <br>
         * <p>*   **23**: DSC</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **24**: EIP</p>
         * <br>
         * <p>    *   **0**: Anycast EIP</p>
         * <br>
         * <p>*   **25**: IDaaS EIAM</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **26**: PolarDB-X</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **27**: Elasticsearch</p>
         * <br>
         * <p>    *   **0**: instance</p>
         */
        @NameInMap("AssetSubType")
        public String assetSubType;

        /**
         * <p>The subtype name of the cloud asset.</p>
         */
        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: Elastic Compute Service (ECS)</p>
         * <p>*   **1**: Server Load Balancer (SLB)</p>
         * <p>*   **3**: ApsaraDB RDS</p>
         * <p>*   **4**: ApsaraDB for MongoDB</p>
         * <p>*   **5**: ApsaraDB for Redis</p>
         * <p>*   **6**: Container Registry</p>
         * <p>*   **8**: Container Service for Kubernetes (ACK)</p>
         * <p>*   **9**: Virtual Private Cloud (VPC)</p>
         * <p>*   **11**: ActionTrail</p>
         * <p>*   **12**: Alibaba Cloud CDN</p>
         * <p>*   **13**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <p>*   **14**: Apsara Devops</p>
         * <p>*   **16**: Anti-DDoS</p>
         * <p>*   **17**: Web Application Firewall (WAF)</p>
         * <p>*   **18**: Object Storage Service (OSS)</p>
         * <p>*   **19**: PolarDB</p>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL</p>
         * <p>*   **21**: Microservices Engine (MSE)</p>
         * <p>*   **22**: Apsara File Storage NAS (NAS)</p>
         * <p>*   **23**: Data Security Center (DSC)</p>
         * <p>*   **24**: Elastic IP Address (EIP)</p>
         * <p>*   **25**: Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM)</p>
         * <p>*   **26**: PolarDB-X</p>
         * <p>*   **27**: Elasticsearch</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The type name of the cloud asset.</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The instance ID of the cloud asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the cloud asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the cloud asset.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The ID of the region to which the cloud asset belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether risks are detected on the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The security information about the cloud asset.</p>
         */
        @NameInMap("SecurityInfo")
        public String securityInfo;

        /**
         * <p>The service provider (SP) of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: a cloud asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: a cloud asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a lightweight cloud asset</p>
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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of cloud assets.</p>
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
