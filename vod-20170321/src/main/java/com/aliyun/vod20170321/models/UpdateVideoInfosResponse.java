// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistVideoIds")
    @Validation(required = true)
    public java.util.List<String> nonExistVideoIds;

    @NameInMap("ForbiddenVideoIds")
    @Validation(required = true)
    public java.util.List<String> forbiddenVideoIds;

    public static UpdateVideoInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosResponse self = new UpdateVideoInfosResponse();
        return TeaModel.build(map, self);
    }

}
