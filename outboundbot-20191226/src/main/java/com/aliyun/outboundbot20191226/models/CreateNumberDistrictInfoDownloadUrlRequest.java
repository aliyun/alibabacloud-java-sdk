// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberDistrictInfoDownloadUrlRequest extends TeaModel {
    @NameInMap("VersionId")
    public String versionId;

    public static CreateNumberDistrictInfoDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberDistrictInfoDownloadUrlRequest self = new CreateNumberDistrictInfoDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateNumberDistrictInfoDownloadUrlRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
