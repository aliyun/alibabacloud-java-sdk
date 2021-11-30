// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectAclRequest extends TeaModel {
    // The version of a object
    @NameInMap("versionId")
    public String versionId;

    public static GetObjectAclRequest build(java.util.Map<String, ?> map) throws Exception {
        GetObjectAclRequest self = new GetObjectAclRequest();
        return TeaModel.build(map, self);
    }

    public GetObjectAclRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
