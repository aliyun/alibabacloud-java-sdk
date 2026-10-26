// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsRequest extends TeaModel {
    /**
     * <p>Keyword of the work name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Number of rows in the work list to be queried:
     * Default value: 10
     * Maximum value: 9999</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Type of the work to be queried (leave blank to query all types). Value range:</p>
     * <ul>
     * <li>DATAPRODUCT: Data Portal</li>
     * <li>PAGE: Dashboard</li>
     * <li>REPORT: Spreadsheet</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("TreeType")
    public String treeType;

    /**
     * <p>The UserID of the user in Quick BI to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b5d8fd9348cc4327****afb604</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListFavoriteReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFavoriteReportsRequest self = new ListFavoriteReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFavoriteReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListFavoriteReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFavoriteReportsRequest setTreeType(String treeType) {
        this.treeType = treeType;
        return this;
    }
    public String getTreeType() {
        return this.treeType;
    }

    public ListFavoriteReportsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
