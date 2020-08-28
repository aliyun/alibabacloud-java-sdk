// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DoActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DoActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DoActionsResponse self = new DoActionsResponse();
        return TeaModel.build(map, self);
    }

}
