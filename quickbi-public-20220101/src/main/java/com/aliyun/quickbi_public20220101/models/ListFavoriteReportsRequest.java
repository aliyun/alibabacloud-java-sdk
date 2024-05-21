// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TreeType")
    public String treeType;

    /**
     * <p>This parameter is required.</p>
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
