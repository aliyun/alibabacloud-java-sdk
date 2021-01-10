// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutSandboxdeploybyreleaseRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static ReleaseLinkeBahamutSandboxdeploybyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutSandboxdeploybyreleaseRequest self = new ReleaseLinkeBahamutSandboxdeploybyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutSandboxdeploybyreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
