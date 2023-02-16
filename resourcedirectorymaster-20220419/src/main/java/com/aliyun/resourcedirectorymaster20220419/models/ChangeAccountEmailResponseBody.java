// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ChangeAccountEmailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeAccountEmailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountEmailResponseBody self = new ChangeAccountEmailResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeAccountEmailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
