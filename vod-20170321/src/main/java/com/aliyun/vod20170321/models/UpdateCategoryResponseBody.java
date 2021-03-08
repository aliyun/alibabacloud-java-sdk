// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryResponseBody self = new UpdateCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
