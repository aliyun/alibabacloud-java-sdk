// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeRecyclebinRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeRecyclebinRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeRecyclebinRequest self = new DeleteLinkeantcodeAntcodeRecyclebinRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeRecyclebinRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeRecyclebinRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
