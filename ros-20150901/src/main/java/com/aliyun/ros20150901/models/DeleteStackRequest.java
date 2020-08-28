// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    public DeleteStackQuery query;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

}
