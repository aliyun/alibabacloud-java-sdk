// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelChangeAccountEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelChangeAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelChangeAccountEmailResponseBody self = new CancelChangeAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelChangeAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
