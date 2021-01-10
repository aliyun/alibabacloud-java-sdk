// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectidsprintsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    public static GetLinkeBahamutAoneinternalprojectidsprintsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectidsprintsRequest self = new GetLinkeBahamutAoneinternalprojectidsprintsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectidsprintsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
