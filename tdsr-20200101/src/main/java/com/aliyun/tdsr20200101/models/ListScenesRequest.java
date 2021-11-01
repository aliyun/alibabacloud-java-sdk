// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListScenesRequest extends TeaModel {
    @NameInMap("IsPublishQuery")
    public Boolean isPublishQuery;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListScenesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenesRequest self = new ListScenesRequest();
        return TeaModel.build(map, self);
    }

    public ListScenesRequest setIsPublishQuery(Boolean isPublishQuery) {
        this.isPublishQuery = isPublishQuery;
        return this;
    }
    public Boolean getIsPublishQuery() {
        return this.isPublishQuery;
    }

    public ListScenesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
