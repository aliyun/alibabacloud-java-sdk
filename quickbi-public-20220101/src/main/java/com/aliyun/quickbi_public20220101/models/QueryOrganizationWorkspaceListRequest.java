// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserId")
    public String userId;

    public static QueryOrganizationWorkspaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationWorkspaceListRequest self = new QueryOrganizationWorkspaceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationWorkspaceListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryOrganizationWorkspaceListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOrganizationWorkspaceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrganizationWorkspaceListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
