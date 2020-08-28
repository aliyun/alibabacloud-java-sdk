// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponse self = new DeletePolicyResponse();
        return TeaModel.build(map, self);
    }

}
