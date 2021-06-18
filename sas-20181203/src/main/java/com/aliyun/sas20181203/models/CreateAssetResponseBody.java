// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAssetResponseBody extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetResponseBody self = new CreateAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssetResponseBody setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
