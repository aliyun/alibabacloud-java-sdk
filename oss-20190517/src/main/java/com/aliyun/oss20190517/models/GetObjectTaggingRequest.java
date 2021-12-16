// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectTaggingRequest extends TeaModel {
    @NameInMap("versionId")
    public String versionId;

    public static GetObjectTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTaggingRequest self = new GetObjectTaggingRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectTaggingRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
