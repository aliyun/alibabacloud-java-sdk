// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemResponseBody extends TeaModel {
    /**
     * <p>The check items.</p>
     */
    @NameInMap("CheckItems")
    public java.util.List<ListCheckItemResponseBodyCheckItems> checkItems;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckItemResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F4E6157-9600-5588-86B9-38F09067****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemResponseBody self = new ListCheckItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckItemResponseBody setCheckItems(java.util.List<ListCheckItemResponseBodyCheckItems> checkItems) {
        this.checkItems = checkItems;
        return this;
    }
    public java.util.List<ListCheckItemResponseBodyCheckItems> getCheckItems() {
        return this.checkItems;
    }

    public ListCheckItemResponseBody setPageInfo(ListCheckItemResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckItemResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckItemResponseBodyCheckItemsCustomConfigs extends TeaModel {
        /**
         * <p>The default value of the check item. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPList</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IP列表</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the check item. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;LIST\&quot;,\&quot;range\&quot;:[1,512],\&quot;listType\&quot;:{\&quot;type\&quot;:\&quot;STRING\&quot;,\&quot;range\&quot;:[0,22]}}</p>
         */
        @NameInMap("TypeDefine")
        public String typeDefine;

        /**
         * <p>The specified value of the check item. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCheckItemResponseBodyCheckItemsCustomConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItemsCustomConfigs self = new ListCheckItemResponseBodyCheckItemsCustomConfigs();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setTypeDefine(String typeDefine) {
            this.typeDefine = typeDefine;
            return this;
        }
        public String getTypeDefine() {
            return this.typeDefine;
        }

        public ListCheckItemResponseBodyCheckItemsCustomConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCheckItemResponseBodyCheckItemsDescription extends TeaModel {
        /**
         * <p>The type of the description of the check item. Valid value:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the description for the check item when the Type parameter is text.</p>
         * 
         * <strong>example:</strong>
         * <p>Checks whether strict access control policies are configured. Requirements: 1. If no blacklists and whitelist are configured, configure a whitelist first. 2. If a blacklist is configured, find the blacklist in the list of access control policies. We recommend that you do not configure an empty blacklist. 3. If a whitelist is configured, find the whitelist in the list of access control policies. We recommend that you do not configure an empty whitelist. Make sure that the whitelist does not contain 0.0.0.0. You can add the following IP addresses to the whitelist: ${IPList}.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCheckItemResponseBodyCheckItemsDescription build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItemsDescription self = new ListCheckItemResponseBodyCheckItemsDescription();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItemsDescription setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCheckItemResponseBodyCheckItemsDescription setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCheckItemResponseBodyCheckItems extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4 Access Control</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The source type of the Situation Awareness check item:</p>
         * <ul>
         * <li><p><strong>CUSTOM</strong>: User-defined</p>
         * </li>
         * <li><p><strong>SYSTEM</strong>: Predefined by the Situation Awareness platform</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The check items.</p>
         */
        @NameInMap("CustomConfigs")
        public java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> customConfigs;

        /**
         * <p>The description of the check item.</p>
         */
        @NameInMap("Description")
        public ListCheckItemResponseBodyCheckItemsDescription description;

        /**
         * <p>The estimated quota that will be consumed by this check item.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EstimatedCount")
        public Integer estimatedCount;

        /**
         * <p>The asset subtype of the cloud service. Valid values:</p>
         * <ul>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><p><strong>INSTANCE</strong></p>
         * </li>
         * <li><p><strong>DISK</strong></p>
         * </li>
         * <li><p><strong>SECURITY_GROUP</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><p><strong>REPOSITORY_ENTERPRISE</strong></p>
         * </li>
         * <li><p><strong>REPOSITORY_PERSON</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceType</strong> is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
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
         * <li><p>If <strong>InstanceType</strong> is set to <strong>WAF</strong>, this parameter supports the following valid value:</p>
         * <ul>
         * <li><strong>DOMAIN</strong></li>
         * </ul>
         * </li>
         * <li><p>If <strong>InstanceType</strong> is set to other values, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud service. Valid values:</p>
         * <ul>
         * <li><p><strong>ECS</strong>: Elastic Compute Service (ECS).</p>
         * </li>
         * <li><p><strong>SLB</strong>: Server Load Balancer (SLB).</p>
         * </li>
         * <li><p><strong>RDS</strong>: ApsaraDB RDS.</p>
         * </li>
         * <li><p><strong>MONGODB</strong>: ApsaraDB for MongoDB (MongoDB).</p>
         * </li>
         * <li><p><strong>KVSTORE</strong>: ApsaraDB for Redis (Redis).</p>
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
         * <li><p><strong>RDC</strong>: Apsara Devops.</p>
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
         * <p>API_GATEWAY</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><p><strong>HIGH</strong></p>
         * </li>
         * <li><p><strong>MEDIUM</strong></p>
         * </li>
         * <li><p><strong>LOW</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The IDs of the sections associated with the check items.</p>
         */
        @NameInMap("SectionIds")
        public java.util.List<Long> sectionIds;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: an asset provided by Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>1</strong>: an asset outside Alibaba Cloud.</p>
         * </li>
         * <li><p><strong>2</strong>: an asset in a data center.</p>
         * </li>
         * <li><p><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset.</p>
         * </li>
         * <li><p><strong>8</strong>: a simple application server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ListCheckItemResponseBodyCheckItems build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyCheckItems self = new ListCheckItemResponseBodyCheckItems();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyCheckItems setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckItemResponseBodyCheckItems setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListCheckItemResponseBodyCheckItems setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListCheckItemResponseBodyCheckItems setCustomConfigs(java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> customConfigs) {
            this.customConfigs = customConfigs;
            return this;
        }
        public java.util.List<ListCheckItemResponseBodyCheckItemsCustomConfigs> getCustomConfigs() {
            return this.customConfigs;
        }

        public ListCheckItemResponseBodyCheckItems setDescription(ListCheckItemResponseBodyCheckItemsDescription description) {
            this.description = description;
            return this;
        }
        public ListCheckItemResponseBodyCheckItemsDescription getDescription() {
            return this.description;
        }

        public ListCheckItemResponseBodyCheckItems setEstimatedCount(Integer estimatedCount) {
            this.estimatedCount = estimatedCount;
            return this;
        }
        public Integer getEstimatedCount() {
            return this.estimatedCount;
        }

        public ListCheckItemResponseBodyCheckItems setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListCheckItemResponseBodyCheckItems setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCheckItemResponseBodyCheckItems setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListCheckItemResponseBodyCheckItems setSectionIds(java.util.List<Long> sectionIds) {
            this.sectionIds = sectionIds;
            return this;
        }
        public java.util.List<Long> getSectionIds() {
            return this.sectionIds;
        }

        public ListCheckItemResponseBodyCheckItems setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListCheckItemResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckItemResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemResponseBodyPageInfo self = new ListCheckItemResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckItemResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckItemResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckItemResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckItemResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
