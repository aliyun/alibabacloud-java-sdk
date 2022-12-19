// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultRequest extends TeaModel {
    // The key that you want to use to search for check items in fuzzy match mode.
    @NameInMap("CheckKey")
    public String checkKey;

    // The number of the page to return.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    // The asset types of cloud services. Valid values:
    // 
    // *   **ECS**: Elastic Compute Service (ECS)
    // *   **SLB**: Server Load Balancer (SLB)
    // *   **RDS**: ApsaraDB RDS
    // *   **MONGODB**: ApsaraDB for MongoDB (MongoDB)
    // *   **KVSTORE**: ApsaraDB for Redis (Redis)
    // *   **ACR**: Container Registry
    // *   **CSK**: Container Service for Kubernetes (ACK)
    // *   **VPC**: Virtual Private Cloud (VPC)
    // *   **ACTIONTRAIL**: ActionTrail
    // *   **CDN**: Alibaba Cloud CDN (CDN)
    // *   **CAS**: Certificate Management Service (formerly SSL Certificates Service)
    // *   **RDC**: Apsara Devops
    // *   **RAM**: Resource Access Management (RAM)
    // *   **DDOS**: Anti-DDoS
    // *   **WAF**: Web Application Firewall (WAF)
    // *   **OSS**: Object Storage Service (OSS)
    // *   **POLARDB**: PolarDB
    // *   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL
    // *   **MSE**: Microservices Engine (MSE)
    // *   **NAS**: Apsara File Storage NAS (NAS)
    // *   **SDDP**: Sensitive Data Discovery and Protection (SDDP)
    // *   **EIP**: Elastic IP Address (EIP)
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    // The language of the content within the request and the response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The IDs of requirement items.
    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    // The severities of check items. Separate multiple severities with commas (,). Valid values:
    // 
    // *   **HIGH**
    // *   **MEDIUM**
    // *   **LOW**
    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    // The types of the conditions based on which check items are sorted. Valid values:
    // 
    // *   **RISK_LEVEL**: risk level
    // *   **STATUS**: state
    @NameInMap("SortTypes")
    public java.util.List<String> sortTypes;

    // The IDs of standards.
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    // The states of check items. Separate multiple states with commas (,). Valid values:
    // 
    // *   **PASS**
    // *   **NOT_PASS**
    // *   **CHECKING**
    // *   **NOT_CHECK**
    // *   **WHITELIST**
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    // The cloud service providers. Valid values:
    // 
    // *   **ALIYUN**: Alibaba Cloud
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

    public ListCheckResultRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

}
