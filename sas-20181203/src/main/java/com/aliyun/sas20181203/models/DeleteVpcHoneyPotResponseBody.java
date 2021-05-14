// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVpcHoneyPotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcHoneyPotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcHoneyPotResponseBody self = new DeleteVpcHoneyPotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcHoneyPotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
