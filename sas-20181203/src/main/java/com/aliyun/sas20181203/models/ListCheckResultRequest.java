// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultRequest extends TeaModel {
    /**
     * <p>The key that you want to use to search for check items in fuzzy match mode.</p>
     */
    @NameInMap("CheckKey")
    public String checkKey;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The asset types of cloud services. Valid values:</p>
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
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of requirement items.</p>
     */
    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    /**
     * <p>The risk levels of check items. Separate multiple risk levels with commas (,). Valid values:</p>
     * <br>
     * <p>*   **HIGH**</p>
     * <p>*   **MEDIUM**</p>
     * <p>*   **LOW**</p>
     */
    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    /**
     * <p>The types of the conditions based on which check items are sorted. Valid values:</p>
     * <br>
     * <p>*   **RISK_LEVEL**: risk level</p>
     * <p>*   **STATUS**: status</p>
     */
    @NameInMap("SortTypes")
    public java.util.List<String> sortTypes;

    /**
     * <p>The IDs of standards.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The status of check items. Separate multiple status with commas (,). Valid values:</p>
     * <br>
     * <p>*   **PASS**</p>
     * <p>*   **NOT_PASS**</p>
     * <p>*   **CHECKING**</p>
     * <p>*   **NOT_CHECK**</p>
     * <p>*   **WHITELIST**</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The cloud service providers. Valid values:</p>
     * <br>
     * <p>*   **ALIYUN**: Alibaba Cloud</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ListCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultRequest self = new ListCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckResultRequest setCheckKey(String checkKey) {
        this.checkKey = checkKey;
        return this;
    }
    public String getCheckKey() {
        return this.checkKey;
    }

    public ListCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListCheckResultRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCheckResultRequest setRequirementIds(java.util.List<Long> requirementIds) {
        this.requirementIds = requirementIds;
        return this;
    }
    public java.util.List<Long> getRequirementIds() {
        return this.requirementIds;
    }

    public ListCheckResultRequest setRiskLevels(java.util.List<String> riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public java.util.List<String> getRiskLevels() {
        return this.riskLevels;
    }

    public ListCheckResultRequest setSortTypes(java.util.List<String> sortTypes) {
        this.sortTypes = sortTypes;
        return this;
    }
    public java.util.List<String> getSortTypes() {
        return this.sortTypes;
    }

    public ListCheckResultRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ListCheckResultRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public ListCheckResultRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public ListCheckResultRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
