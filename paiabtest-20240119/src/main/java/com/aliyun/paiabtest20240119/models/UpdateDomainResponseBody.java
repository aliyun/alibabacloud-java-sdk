// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainResponseBody self = new UpdateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
