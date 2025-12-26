// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ClearAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>276D7566-31C9-4192-9DD1-51B10D*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClearAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearAddressResponseBody self = new ClearAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
