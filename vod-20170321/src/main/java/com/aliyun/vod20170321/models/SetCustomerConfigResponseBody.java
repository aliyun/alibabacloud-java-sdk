// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCustomerConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCustomerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCustomerConfigResponseBody self = new SetCustomerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCustomerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
