// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryWorksByWorkspaceRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WorksType")
    public String worksType;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryWorksByWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByWorkspaceRequest self = new QueryWorksByWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksByWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryWorksByWorkspaceRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

    public QueryWorksByWorkspaceRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryWorksByWorkspaceRequest setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
        this.thirdPartAuthFlag = thirdPartAuthFlag;
        return this;
    }
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    public QueryWorksByWorkspaceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryWorksByWorkspaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
