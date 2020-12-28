// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePolicyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionResponseBody self = new DeletePolicyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
