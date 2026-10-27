// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckTypesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the baseline.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to query the IDs of baselines.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>Whether to query the check item list. The default value is false. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Not Query</li>
     * <li><strong>true</strong>: Query</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowChecks")
    public Boolean showChecks;

    /**
     * <p>The data source. Default value: <strong>default</strong>. Valid values:</p>
     * <ul>
     * <li><strong>agentless</strong>: The check items of baselines for agentless detection.</li>
     * <li><strong>default</strong>: The check items of baselines for hosts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>293b07cb-db2d-4f39-941f-b2e4abb8****</p>
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
