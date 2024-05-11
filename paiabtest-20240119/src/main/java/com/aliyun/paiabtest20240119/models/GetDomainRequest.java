// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static GetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainRequest self = new GetDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
