// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCallbackResponse self = new DeleteMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

}
