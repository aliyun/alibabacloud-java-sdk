// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResourceTypes")
    @Validation(required = true)
    public java.util.List<String> resourceTypes;

    public static ListResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponse self = new ListResourceTypesResponse();
        return TeaModel.build(map, self);
    }

}
