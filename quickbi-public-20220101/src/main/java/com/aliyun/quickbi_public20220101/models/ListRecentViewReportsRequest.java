// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsRequest extends TeaModel {
    /**
     * <p>Keyword of the name of the work.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial Statements</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of days to query data in the last few days. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OffsetDay")
    public Integer offsetDay;

    /**
     * <p>Query the number of rows in the work list:</p>
     * <ul>
     * <li>Default value: 10.</li>
     * <li>Maximum value: 9999</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query mode. Valid values:</p>
     * <ul>
     * <li>1: Sort by number of visits</li>
     * <li>2: Sort by Last Access Time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>Query the type of the work (fill in the blank to query all types). Valid values:</p>
     * <ul>
     * <li>DATAPRODUCT: BI portal</li>
     * <li>PAGE: Dashboard</li>
     * <li>REPORT: workbook</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("TreeType")
    public String treeType;

    /**
     * <p>The UserID of the user in the Quick BI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b5d8fd9348cc4327****afb604</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListRecentViewReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentViewReportsRequest self = new ListRecentViewReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentViewReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRecentViewReportsRequest setOffsetDay(Integer offsetDay) {
        this.offsetDay = offsetDay;
        return this;
    }
    public Integer getOffsetDay() {
        return this.offsetDay;
    }

    public ListRecentViewReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecentViewReportsRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public ListRecentViewReportsRequest setTreeType(String treeType) {
        this.treeType = treeType;
        return this;
    }
    public String getTreeType() {
        return this.treeType;
    }

    public ListRecentViewReportsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
