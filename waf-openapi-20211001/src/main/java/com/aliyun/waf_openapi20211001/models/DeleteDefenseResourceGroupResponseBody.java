// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25BE1169-9AE4-5D7D-8293-C33242ABB549</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDefenseResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseResourceGroupResponseBody self = new DeleteDefenseResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
