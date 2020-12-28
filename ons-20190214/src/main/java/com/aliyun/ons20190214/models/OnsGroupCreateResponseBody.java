// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupCreateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static OnsGroupCreateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupCreateResponseBody self = new OnsGroupCreateResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupCreateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
