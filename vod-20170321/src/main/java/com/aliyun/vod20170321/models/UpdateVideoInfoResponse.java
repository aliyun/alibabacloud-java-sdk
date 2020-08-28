// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateVideoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoResponse self = new UpdateVideoInfoResponse();
        return TeaModel.build(map, self);
    }

}
