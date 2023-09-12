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
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the check item.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the check item. The value is a JSON string.</p>
         */
        @NameInMap("TypeDefine")
        public String typeDefine;

        /**
         * <p>The specified value of the check item. The value is a string.</p>
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
         * <br>
         * <p>*   **text**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The content of the description for the check item when the Type parameter is text.</p>
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
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

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
         * <p>The asset subtype of the cloud service. Valid value:</p>
         * <br>
         * <p>*   If **InstanceType** is set to **ECS**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **INSTANCE**</p>
         * <p>    *   **DISK**</p>
         * <p>    *   **SECURITY_GROUP**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **ACR**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **REPOSITORY_ENTERPRISE**</p>
         * <p>    *   **REPOSITORY_PERSON**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **RAM**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **ALIAS**</p>
         * <p>    *   **USER**</p>
         * <p>    *   **POLICY**</p>
         * <p>    *   **GROUP**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **WAF**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **DOMAIN**</p>
         * <br>
         * <p>*   If **InstanceType** is set to other values, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **INSTANCE**</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud service. Valid value:</p>
         * <br>
         * <p>*   **ECS**: Elastic Compute Service (ECS)</p>
         * <p>*   **SLB**: Server Load Balancer (SLB)</p>
         * <p>*   **RDS**: ApsaraDB RDS</p>
         * <p>*   **MONGODB**: ApsaraDB for MongoDB (MongoDB)</p>
         * <p>*   **KVSTORE**: ApsaraDB for Redis (Redis)</p>
         * <p>*   **ACR**: Container Registry</p>
         * <p>*   **CSK**: Container Service for Kubernetes (ACK)</p>
         * <p>*   **VPC**: Virtual Private Cloud (VPC)</p>
         * <p>*   **ACTIONTRAIL**: ActionTrail</p>
         * <p>*   **CDN**: Alibaba Cloud CDN (CDN)</p>
         * <p>*   **CAS**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <p>*   **RDC**: Apsara Devops</p>
         * <p>*   **RAM**: Resource Access Management (RAM)</p>
         * <p>*   **DDOS**: Anti-DDoS</p>
         * <p>*   **WAF**: Web Application Firewall (WAF)</p>
         * <p>*   **OSS**: Object Storage Service (OSS)</p>
         * <p>*   **POLARDB**: PolarDB</p>
         * <p>*   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL</p>
         * <p>*   **MSE**: Microservices Engine (MSE)</p>
         * <p>*   **NAS**: Apsara File Storage NAS (NAS)</p>
         * <p>*   **SDDP**: Sensitive Data Discovery and Protection (SDDP)</p>
         * <p>*   **EIP**: Elastic IP Address (EIP)</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The risk level of the check item. Valid value:</p>
         * <br>
         * <p>*   **HIGH**</p>
         * <p>*   **MEDIUM**</p>
         * <p>*   **LOW**</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The IDs of the sections associated with the check items.</p>
         */
        @NameInMap("SectionIds")
        public java.util.List<Long> sectionIds;

        /**
         * <p>The type of the cloud asset. Valid value:</p>
         * <br>
         * <p>*   **0**: an asset provided by Alibaba Cloud</p>
         * <p>*   **1**: a third-party cloud asset</p>
         * <p>*   **2**: an asset in a data center</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
         * <p>*   **8**: a simple application server</p>
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
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
