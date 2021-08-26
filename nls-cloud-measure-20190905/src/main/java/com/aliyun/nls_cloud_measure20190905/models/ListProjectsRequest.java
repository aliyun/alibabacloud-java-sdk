// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_measure20190905.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Integer projectId;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

}
