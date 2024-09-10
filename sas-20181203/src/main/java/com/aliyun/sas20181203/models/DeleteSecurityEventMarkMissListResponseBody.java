// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSecurityEventMarkMissListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6BA51E2XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSecurityEventMarkMissListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityEventMarkMissListResponseBody self = new DeleteSecurityEventMarkMissListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityEventMarkMissListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
