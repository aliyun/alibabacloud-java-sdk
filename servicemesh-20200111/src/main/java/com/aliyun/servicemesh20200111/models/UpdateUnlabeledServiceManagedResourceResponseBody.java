// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateUnlabeledServiceManagedResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUnlabeledServiceManagedResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnlabeledServiceManagedResourceResponseBody self = new UpdateUnlabeledServiceManagedResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUnlabeledServiceManagedResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
