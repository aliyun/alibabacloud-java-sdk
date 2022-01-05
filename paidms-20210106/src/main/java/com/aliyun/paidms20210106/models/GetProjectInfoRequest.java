// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class GetProjectInfoRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetProjectInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectInfoRequest self = new GetProjectInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
