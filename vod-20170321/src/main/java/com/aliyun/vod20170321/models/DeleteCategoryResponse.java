// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCategoryResponse self = new DeleteCategoryResponse();
        return TeaModel.build(map, self);
    }

}
