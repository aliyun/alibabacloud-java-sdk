// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectMetaRequest extends TeaModel {
    @NameInMap("versionId")
    public String versionId;

    public static GetObjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectMetaRequest self = new GetObjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectMetaRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
