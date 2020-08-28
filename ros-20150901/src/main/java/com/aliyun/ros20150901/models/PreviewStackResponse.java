// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class PreviewStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static PreviewStackResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponse self = new PreviewStackResponse();
        return TeaModel.build(map, self);
    }

}
