// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutReleaseappRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseId")
    public String releaseId;

    public static DeleteLinkeBahamutReleaseappRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutReleaseappRequest self = new DeleteLinkeBahamutReleaseappRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutReleaseappRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLinkeBahamutReleaseappRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
