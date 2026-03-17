// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateEnterpriseCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FBDB18D8-E91E-4978-8D6C-6E2E3EE10133</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseCodeResponseBody self = new CreateEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
