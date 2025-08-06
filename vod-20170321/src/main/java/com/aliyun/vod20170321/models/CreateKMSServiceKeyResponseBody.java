// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateKMSServiceKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateKMSServiceKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKMSServiceKeyResponseBody self = new CreateKMSServiceKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKMSServiceKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
