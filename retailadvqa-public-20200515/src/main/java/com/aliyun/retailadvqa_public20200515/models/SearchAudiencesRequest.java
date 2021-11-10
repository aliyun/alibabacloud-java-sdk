// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SearchAudiencesRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchAudiencesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAudiencesRequest self = new SearchAudiencesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAudiencesRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SearchAudiencesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SearchAudiencesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public SearchAudiencesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAudiencesRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public SearchAudiencesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
