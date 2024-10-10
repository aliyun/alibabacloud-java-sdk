// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultRequest extends TeaModel {
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The key that you want to use to search for check items in fuzzy match mode.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("CheckKey")
    public String checkKey;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the check item supports custom parameters. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CustomParam")
    public Boolean customParam;

    /**
     * <p>The instance IDs of the cloud services that you want to query. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The asset type of the cloud services. Valid values:</p>
     * <ul>
     * <li><strong>ECS</strong>: Elastic Compute Service (ECS)</li>
     * <li><strong>SLB</strong>: Server Load Balancer (SLB)</li>
     * <li><strong>RDS</strong>: ApsaraDB RDS</li>
     * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB (MongoDB)</li>
     * <li><strong>KVSTORE</strong>: ApsaraDB for Redis (Redis)</li>
     * <li><strong>ACR</strong>: Container Registry</li>
     * <li><strong>CSK</strong>: Container Service for Kubernetes (ACK)</li>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC)</li>
     * <li><strong>ACTIONTRAIL</strong>: ActionTrail</li>
     * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN)</li>
     * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
     * <li><strong>RDC</strong>: Apsara Devops</li>
     * <li><strong>RAM</strong>: Resource Access Management (RAM)</li>
     * <li><strong>DDOS</strong>: Anti-DDoS</li>
     * <li><strong>WAF</strong>: Web Application Firewall (WAF)</li>
     * <li><strong>OSS</strong>: Object Storage Service (OSS)</li>
     * <li><strong>POLARDB</strong>: PolarDB</li>
     * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL</li>
     * <li><strong>MSE</strong>: Microservices Engine (MSE)</li>
     * <li><strong>NAS</strong>: Apsara File Storage NAS (NAS)</li>
     * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP)</li>
     * <li><strong>EIP</strong>: Elastic IP Address (EIP)</li>
     * </ul>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperationTypes")
    public java.util.List<String> operationTypes;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: International</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of requirement items.</p>
     */
    @NameInMap("RequirementIds")
    public java.util.List<Long> requirementIds;

    /**
     * <p>The risk levels of check items. Separate multiple risk levels with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>HIGH</strong></li>
     * <li><strong>MEDIUM</strong></li>
     * <li><strong>LOW</strong></li>
     * </ul>
     */
    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    /**
     * <p>The types of the conditions based on which check items are sorted. Valid values:</p>
     * <ul>
     * <li><strong>RISK_LEVEL</strong>: risk level</li>
     * <li><strong>STATUS</strong>: status</li>
     * </ul>
     */
    @NameInMap("SortTypes")
    public java.util.List<String> sortTypes;

    /**
     * <p>The IDs of standards.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The statuses of check items. Separate multiple statuses with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>PASS</strong></li>
     * <li><strong>NOT_PASS</strong></li>
     * <li><strong>CHECKING</strong></li>
     * <li><strong>NOT_CHECK</strong></li>
     * <li><strong>WHITELIST</strong></li>
     * </ul>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    /**
     * <p>The types of check standards.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    /**
     * <p>The cloud service providers. Valid value:</p>
     * <ul>
     * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
     * </ul>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ListCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultRequest self = new ListCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckResultRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
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

    public ListCheckResultRequest setCustomParam(Boolean customParam) {
        this.customParam = customParam;
        return this;
    }
    public Boolean getCustomParam() {
        return this.customParam;
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

    public ListCheckResultRequest setOperationTypes(java.util.List<String> operationTypes) {
        this.operationTypes = operationTypes;
        return this;
    }
    public java.util.List<String> getOperationTypes() {
        return this.operationTypes;
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
