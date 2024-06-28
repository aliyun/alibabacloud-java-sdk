// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateExpressCloudConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the ECC instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecc-jg************</p>
     */
    @NameInMap("EccId")
    public String eccId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C004F022-1CC2-4958-9937-675513A2CD7E</p>
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
