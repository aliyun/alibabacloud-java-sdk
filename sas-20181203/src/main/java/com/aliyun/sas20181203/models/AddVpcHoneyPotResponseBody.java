// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddVpcHoneyPotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddVpcHoneyPotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVpcHoneyPotResponseBody self = new AddVpcHoneyPotResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVpcHoneyPotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
