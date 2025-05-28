// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserListRequest extends TeaModel {
    /**
     * <p>The keyword of the username or nickname of the organization member.</p>
     * 
     * <strong>example:</strong>
     * <p>Test user</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Current page number for organization member list:</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of rows per page in a paged query.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * <li>Maximum value: 1,000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListRequest self = new QueryUserListRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryUserListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryUserListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
