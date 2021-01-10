// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutCeasingRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static CheckLinkeBahamutCeasingRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutCeasingRequest self = new CheckLinkeBahamutCeasingRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutCeasingRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
