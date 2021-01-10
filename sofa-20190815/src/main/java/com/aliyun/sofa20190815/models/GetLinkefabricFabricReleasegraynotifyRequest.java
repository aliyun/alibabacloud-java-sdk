// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkefabricFabricReleasegraynotifyRequest extends TeaModel {
    @NameInMap("GrayReleaseStatus")
    public String grayReleaseStatus;

    @NameInMap("ProjectId")
    public String projectId;

    public static GetLinkefabricFabricReleasegraynotifyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkefabricFabricReleasegraynotifyRequest self = new GetLinkefabricFabricReleasegraynotifyRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkefabricFabricReleasegraynotifyRequest setGrayReleaseStatus(String grayReleaseStatus) {
        this.grayReleaseStatus = grayReleaseStatus;
        return this;
    }
    public String getGrayReleaseStatus() {
        return this.grayReleaseStatus;
    }

    public GetLinkefabricFabricReleasegraynotifyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
