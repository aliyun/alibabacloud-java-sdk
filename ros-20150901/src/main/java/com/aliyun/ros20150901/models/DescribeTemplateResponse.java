// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DescribeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResponse self = new DescribeTemplateResponse();
        return TeaModel.build(map, self);
    }

}
