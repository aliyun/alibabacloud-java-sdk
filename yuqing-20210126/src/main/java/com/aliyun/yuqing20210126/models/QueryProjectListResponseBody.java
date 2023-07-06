// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryProjectListResponseBody extends TeaModel {
    @NameInMap("projectList")
    public java.util.List<Project> projectList;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListResponseBody self = new QueryProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectListResponseBody setProjectList(java.util.List<Project> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<Project> getProjectList() {
        return this.projectList;
    }

    public QueryProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
