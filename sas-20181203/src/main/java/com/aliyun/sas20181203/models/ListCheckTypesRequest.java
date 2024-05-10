// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckTypesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the baseline.</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarningSummary](https://help.aliyun.com/document_detail/116179.html) operation to query the IDs of baselines.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>Whether to query the check item list. The default value is false. Valid values:</p>
     * <br>
     * <p>- **false**: Not Query</p>
     * <p>- **true**: Query</p>
     */
    @NameInMap("ShowChecks")
    public Boolean showChecks;

    /**
     * <p>The data source. Default value: **default**. Valid values:</p>
     * <br>
     * <p>*   **agentless**: The check items of baselines for agentless detection.</p>
     * <p>*   **default**: The check items of baselines for hosts.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The UUID of the server.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListCheckTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckTypesRequest self = new ListCheckTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckTypesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckTypesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckTypesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckTypesRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public ListCheckTypesRequest setShowChecks(Boolean showChecks) {
        this.showChecks = showChecks;
        return this;
    }
    public Boolean getShowChecks() {
        return this.showChecks;
    }

    public ListCheckTypesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListCheckTypesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
