// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class CancelUpdateStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static CancelUpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackResponse self = new CancelUpdateStackResponse();
        return TeaModel.build(map, self);
    }

}
