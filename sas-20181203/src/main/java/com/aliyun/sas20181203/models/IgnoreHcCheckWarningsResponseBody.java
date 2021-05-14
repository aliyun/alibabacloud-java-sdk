// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static IgnoreHcCheckWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IgnoreHcCheckWarningsResponseBody self = new IgnoreHcCheckWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public IgnoreHcCheckWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
