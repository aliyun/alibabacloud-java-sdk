// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCheckResultRequest extends TeaModel {
    /**
     * <p>Fuzzy search key for check items.</p>
     * 
     * <strong>example:</strong>
     * <p>container</p>
     */
    @NameInMap("CheckKey")
    public String checkKey;

    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c3aaf6c8085f84791882eef200cd2****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Page number for the current page in a paginated query. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Language type for requests and responses. The default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Number of records to display per page when performing a paginated query. The default value is <strong>20</strong>, indicating 20 records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of risk levels.</p>
     */
    @NameInMap("RiskLevels")
    public java.util.List<String> riskLevels;

    /**
     * <p>Custom sorting type. Values:</p>
     * <ul>
     * <li><strong>RISK_LEVEL</strong>: Risk level.</li>
     * <li><strong>STATUS</strong>: Check item status.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STATUS</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>List of check item statuses.</p>
     */
    @NameInMap("Statuses")
    public java.util.List<String> statuses;

    public static ListClusterCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCheckResultRequest self = new ListClusterCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterCheckResultRequest setCheckKey(String checkKey) {
        this.checkKey = checkKey;
        return this;
    }
    public String getCheckKey() {
        return this.checkKey;
    }

    public ListClusterCheckResultRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClusterCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListClusterCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterCheckResultRequest setRiskLevels(java.util.List<String> riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public java.util.List<String> getRiskLevels() {
        return this.riskLevels;
    }

    public ListClusterCheckResultRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListClusterCheckResultRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

}
