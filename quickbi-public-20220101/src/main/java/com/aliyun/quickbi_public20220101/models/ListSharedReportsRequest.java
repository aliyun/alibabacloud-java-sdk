// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListSharedReportsRequest extends TeaModel {
    /**
     * <p>Keyword of the name of the work.</p>
     * 
     * <strong>example:</strong>
     * <p>Test report</p>
     */
    @NameInMap("Keyword")
    public String keyword;

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
     * <p>The UserID of the user to be queried in the Quick BI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b5d8fd9348cc4327****afb604</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListSharedReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSharedReportsRequest self = new ListSharedReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListSharedReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListSharedReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSharedReportsRequest setTreeType(String treeType) {
        this.treeType = treeType;
        return this;
    }
    public String getTreeType() {
        return this.treeType;
    }

    public ListSharedReportsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
