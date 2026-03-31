// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class AddAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAddressResponseBody self = new AddAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
