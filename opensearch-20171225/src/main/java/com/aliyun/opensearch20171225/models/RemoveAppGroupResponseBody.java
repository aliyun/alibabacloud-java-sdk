// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("result")
    @Validation(required = true)
    public java.util.List<Integer> result;

    public static RemoveAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppGroupResponseBody self = new RemoveAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

}
