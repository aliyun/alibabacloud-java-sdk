// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateColdStorageInstanceResponseBody extends TeaModel {
    @NameInMap("ColdStorageInstanceId")
    public String coldStorageInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateColdStorageInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateColdStorageInstanceResponseBody self = new CreateColdStorageInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateColdStorageInstanceResponseBody setColdStorageInstanceId(String coldStorageInstanceId) {
        this.coldStorageInstanceId = coldStorageInstanceId;
        return this;
    }
    public String getColdStorageInstanceId() {
        return this.coldStorageInstanceId;
    }

    public CreateColdStorageInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
