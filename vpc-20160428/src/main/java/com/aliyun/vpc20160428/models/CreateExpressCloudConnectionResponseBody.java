// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the ECC instance.</p>
     */
    @NameInMap("EccId")
    public String eccId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExpressCloudConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressCloudConnectionResponseBody self = new CreateExpressCloudConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExpressCloudConnectionResponseBody setEccId(String eccId) {
        this.eccId = eccId;
        return this;
    }
    public String getEccId() {
        return this.eccId;
    }

    public CreateExpressCloudConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
