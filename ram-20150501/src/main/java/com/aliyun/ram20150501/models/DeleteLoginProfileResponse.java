// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoginProfileResponse self = new DeleteLoginProfileResponse();
        return TeaModel.build(map, self);
    }

}
