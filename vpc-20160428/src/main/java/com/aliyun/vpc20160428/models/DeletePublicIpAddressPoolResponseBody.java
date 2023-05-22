// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePublicIpAddressPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePublicIpAddressPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicIpAddressPoolResponseBody self = new DeletePublicIpAddressPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePublicIpAddressPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
