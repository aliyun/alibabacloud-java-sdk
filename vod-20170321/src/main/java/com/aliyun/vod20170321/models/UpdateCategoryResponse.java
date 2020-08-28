// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryResponse self = new UpdateCategoryResponse();
        return TeaModel.build(map, self);
    }

}
