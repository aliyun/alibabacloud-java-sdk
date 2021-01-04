// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateEnterpriseCodeResponseBody extends TeaModel {
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
