// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateUisResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    public static CreateUisResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUisResponse self = new CreateUisResponse();
        return TeaModel.build(map, self);
    }

    public CreateUisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUisResponse setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

}
