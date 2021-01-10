// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationPackageDownloadUrlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("VersionId")
    public String versionId;

    public static GetCASApplicationPackageDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationPackageDownloadUrlRequest self = new GetCASApplicationPackageDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationPackageDownloadUrlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCASApplicationPackageDownloadUrlRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
