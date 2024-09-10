// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasTrialResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D22BDB7-C0**328A2B2E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSasTrialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSasTrialResponseBody self = new CreateSasTrialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSasTrialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
