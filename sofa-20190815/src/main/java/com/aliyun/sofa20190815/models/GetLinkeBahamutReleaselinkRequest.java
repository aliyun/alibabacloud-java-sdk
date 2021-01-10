// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaselinkRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static GetLinkeBahamutReleaselinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaselinkRequest self = new GetLinkeBahamutReleaselinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaselinkRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
