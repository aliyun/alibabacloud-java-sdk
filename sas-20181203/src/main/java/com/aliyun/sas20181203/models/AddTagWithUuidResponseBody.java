// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddTagWithUuidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddTagWithUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagWithUuidResponseBody self = new AddTagWithUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagWithUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
