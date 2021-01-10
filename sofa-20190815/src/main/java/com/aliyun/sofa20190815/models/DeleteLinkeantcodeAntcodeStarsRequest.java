// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeStarsRequest extends TeaModel {
    @NameInMap("ProjectIdOrPath")
    public String projectIdOrPath;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static DeleteLinkeantcodeAntcodeStarsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeStarsRequest self = new DeleteLinkeantcodeAntcodeStarsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeStarsRequest setProjectIdOrPath(String projectIdOrPath) {
        this.projectIdOrPath = projectIdOrPath;
        return this;
    }
    public String getProjectIdOrPath() {
        return this.projectIdOrPath;
    }

    public DeleteLinkeantcodeAntcodeStarsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
