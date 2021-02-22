// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryProjectListRequest extends TeaModel {
    // 当前页数，从1开始
    @NameInMap("pageNow")
    public Long pageNow;

    // 分页大小
    @NameInMap("pageSize")
    public Long pageSize;

    // 所属项目分组id
    @NameInMap("projectGroupId")
    public Long projectGroupId;

    // 指定舆情项目id
    @NameInMap("projectId")
    public Long projectId;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static QueryProjectListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListRequest self = new QueryProjectListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectListRequest setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public QueryProjectListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryProjectListRequest setProjectGroupId(Long projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public Long getProjectGroupId() {
        return this.projectGroupId;
    }

    public QueryProjectListRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public QueryProjectListRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public QueryProjectListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
