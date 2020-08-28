// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveTagsFromResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromResourceResponse self = new RemoveTagsFromResourceResponse();
        return TeaModel.build(map, self);
    }

}
