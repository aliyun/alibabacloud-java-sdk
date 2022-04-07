// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RestoreObjectRequest extends TeaModel {
    @NameInMap("RestoreRequest")
    public RestoreRequest restoreRequest;

    @NameInMap("versionId")
    public String versionId;

    public static RestoreObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreObjectRequest self = new RestoreObjectRequest();
        return TeaModel.build(map, self);
    }

    public RestoreObjectRequest setRestoreRequest(RestoreRequest restoreRequest) {
        this.restoreRequest = restoreRequest;
        return this;
    }
    public RestoreRequest getRestoreRequest() {
        return this.restoreRequest;
    }

    public RestoreObjectRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
