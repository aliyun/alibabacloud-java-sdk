// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetMessageCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackResponse self = new SetMessageCallbackResponse();
        return TeaModel.build(map, self);
    }

}
