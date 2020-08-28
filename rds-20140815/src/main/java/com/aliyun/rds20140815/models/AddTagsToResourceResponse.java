// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddTagsToResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceResponse self = new AddTagsToResourceResponse();
        return TeaModel.build(map, self);
    }

}
