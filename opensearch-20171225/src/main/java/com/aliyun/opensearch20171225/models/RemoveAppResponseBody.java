// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<Integer> result;

    public static RemoveAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppResponseBody self = new RemoveAppResponseBody();
        return TeaModel.build(map, self);
    }

}
