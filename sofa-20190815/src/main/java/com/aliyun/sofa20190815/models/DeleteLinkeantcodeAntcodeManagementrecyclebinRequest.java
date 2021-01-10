// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeManagementrecyclebinRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeManagementrecyclebinRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeManagementrecyclebinRequest self = new DeleteLinkeantcodeAntcodeManagementrecyclebinRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeManagementrecyclebinRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeManagementrecyclebinRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeManagementrecyclebinRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
