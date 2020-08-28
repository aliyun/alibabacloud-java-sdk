// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionResponse self = new DeletePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

}
