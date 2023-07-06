// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryProjectListRequest extends TeaModel {
    @NameInMap("pageNow")
    public Long pageNow;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projectGroupId")
    public Long projectGroupId;

    @NameInMap("projectId")
    public Long projectId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

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

    public QueryProjectListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectListRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
