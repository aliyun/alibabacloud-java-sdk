// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetVersionDownloadUrlRequest extends TeaModel {
    @NameInMap("VersionName")
    public String versionName;

    public static GetVersionDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVersionDownloadUrlRequest self = new GetVersionDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetVersionDownloadUrlRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
