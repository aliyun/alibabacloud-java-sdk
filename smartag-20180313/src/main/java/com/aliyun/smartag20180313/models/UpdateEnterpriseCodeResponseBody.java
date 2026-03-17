// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FBDB18D8-E91E-4978-8D6C-6E2E3EE10133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseCodeResponseBody self = new UpdateEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
