// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class WaitConditionsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public WaitConditionsQuery query;

    public static WaitConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        WaitConditionsRequest self = new WaitConditionsRequest();
        return TeaModel.build(map, self);
    }

}
