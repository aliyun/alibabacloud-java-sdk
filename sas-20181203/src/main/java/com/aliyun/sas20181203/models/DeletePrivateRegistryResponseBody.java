// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeletePrivateRegistryResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateRegistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateRegistryResponseBody self = new DeletePrivateRegistryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateRegistryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeletePrivateRegistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
