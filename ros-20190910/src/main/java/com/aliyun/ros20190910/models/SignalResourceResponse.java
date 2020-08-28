// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SignalResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SignalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SignalResourceResponse self = new SignalResourceResponse();
        return TeaModel.build(map, self);
    }

}
