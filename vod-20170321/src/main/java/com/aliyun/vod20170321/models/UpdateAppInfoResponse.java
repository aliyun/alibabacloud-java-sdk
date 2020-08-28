// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInfoResponse self = new UpdateAppInfoResponse();
        return TeaModel.build(map, self);
    }

}
