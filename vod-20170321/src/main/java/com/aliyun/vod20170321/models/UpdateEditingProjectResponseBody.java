// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateEditingProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEditingProjectResponseBody self = new UpdateEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
