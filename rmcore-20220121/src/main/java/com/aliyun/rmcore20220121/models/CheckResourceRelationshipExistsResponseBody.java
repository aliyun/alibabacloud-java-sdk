// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CheckResourceRelationshipExistsResponseBody extends TeaModel {
    @NameInMap("Exists")
    public Boolean exists;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CheckResourceRelationshipExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRelationshipExistsResponseBody self = new CheckResourceRelationshipExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceRelationshipExistsResponseBody setExists(Boolean exists) {
        this.exists = exists;
        return this;
    }
    public Boolean getExists() {
        return this.exists;
    }

    public CheckResourceRelationshipExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
