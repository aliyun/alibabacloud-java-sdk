// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutObjectAclRequest extends TeaModel {
    @NameInMap("versionId")
    public String versionId;

    public static PutObjectAclRequest build(java.util.Map<String, ?> map) throws Exception {
        PutObjectAclRequest self = new PutObjectAclRequest();
        return TeaModel.build(map, self);
    }

    public PutObjectAclRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
