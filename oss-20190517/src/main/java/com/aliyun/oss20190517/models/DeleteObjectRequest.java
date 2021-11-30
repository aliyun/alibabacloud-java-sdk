// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class DeleteObjectRequest extends TeaModel {
    @NameInMap("versionId")
    public String versionId;

    public static DeleteObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteObjectRequest self = new DeleteObjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteObjectRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
