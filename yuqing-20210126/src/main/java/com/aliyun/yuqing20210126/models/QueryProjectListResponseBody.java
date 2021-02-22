// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryProjectListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 舆情项目列表,参考Project对象
    @NameInMap("projectList")
    public java.util.List<Project> projectList;

    // 总记录数
    @NameInMap("totalCount")
    public Long totalCount;

    public static QueryProjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectListResponseBody self = new QueryProjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectListResponseBody setProjectList(java.util.List<Project> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<Project> getProjectList() {
        return this.projectList;
    }

    public QueryProjectListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
