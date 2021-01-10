// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeArtifactsmanagementRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeArtifactsmanagementRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeArtifactsmanagementRequest self = new DeleteLinkeantcodeAntcodeArtifactsmanagementRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeArtifactsmanagementRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeArtifactsmanagementRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeArtifactsmanagementRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
