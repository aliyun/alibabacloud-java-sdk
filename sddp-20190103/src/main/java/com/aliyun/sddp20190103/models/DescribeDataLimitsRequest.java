// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the security audit feature. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>The data detection status. Valid values:</p>
     * <br>
     * <p>*   **0**: The data detection is ready.</p>
     * <p>*   **1**: The data detection is running.</p>
     * <p>*   **2**: The connectivity test is in progress.</p>
     * <p>*   **3**: The connectivity test passed.</p>
     * <p>*   **4**: The connectivity test failed.</p>
     */
    @NameInMap("CheckStatus")
    public Integer checkStatus;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether DSC has the data de-identification permissions on the data asset. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("DatamaskStatus")
    public Integer datamaskStatus;

    /**
     * <p>Specifies whether DSC has the data detection permissions on the data asset. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The end of the time range to query The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the database engine. Valid values include **MySQL**, **SQLServer**, **Oracle**, **PostgreSQL**, and **MongoDB**.</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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

    /**
     * <p>The parent ID of the data asset to be queried. Valid values:</p>
     * <br>
     * <p>*   The name or ID of the MaxCompute project.</p>
     * <p>*   The name or ID of the OSS bucket.</p>
     * <p>*   The name or ID of the ApsaraDB RDS instance or database.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The type of the service to which the data asset to be queried belongs. Valid values:</p>
     * <br>
     * <p>*   **1**: MaxCompute</p>
     * <p>*   **2**: Object Storage Service (OSS)</p>
     * <p>*   **3**: AnalyticDB for MySQL</p>
     * <p>*   **4**: Tablestore</p>
     * <p>*   **5**: ApsaraDB RDS</p>
     * <p>*   **6**: self-managed database</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The region in which the data asset resides.</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The beginning of the time range to query The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDataLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsRequest self = new DescribeDataLimitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitsRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeDataLimitsRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeDataLimitsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataLimitsRequest setDatamaskStatus(Integer datamaskStatus) {
        this.datamaskStatus = datamaskStatus;
        return this;
    }
    public Integer getDatamaskStatus() {
        return this.datamaskStatus;
    }

    public DescribeDataLimitsRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public DescribeDataLimitsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataLimitsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeDataLimitsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataLimitsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDataLimitsRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public DescribeDataLimitsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataLimitsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
