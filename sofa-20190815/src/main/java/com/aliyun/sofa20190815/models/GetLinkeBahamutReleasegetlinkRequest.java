// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasegetlinkRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static GetLinkeBahamutReleasegetlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasegetlinkRequest self = new GetLinkeBahamutReleasegetlinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasegetlinkRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
