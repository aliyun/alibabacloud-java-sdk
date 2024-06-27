// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListSharedReportsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>PAGE</p>
     */
    @NameInMap("TreeType")
    public String treeType;

    /**
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
