// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryFilterListRequest extends TeaModel {
    // 指定筛选模板id查询
    @NameInMap("filterId")
    public Long filterId;

    // 当前查询的第几页，从1开始
    @NameInMap("pageNow")
    public Long pageNow;

    // 查询每页的数据量
    @NameInMap("pageSize")
    public Long pageSize;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    public static QueryFilterListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFilterListRequest self = new QueryFilterListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFilterListRequest setFilterId(Long filterId) {
        this.filterId = filterId;
        return this;
    }
    public Long getFilterId() {
        return this.filterId;
    }

    public QueryFilterListRequest setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public QueryFilterListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryFilterListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFilterListRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
