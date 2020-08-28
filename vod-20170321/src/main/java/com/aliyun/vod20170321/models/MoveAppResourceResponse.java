// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistResourceIds")
    @Validation(required = true)
    public java.util.List<String> nonExistResourceIds;

    @NameInMap("FailedResourceIds")
    @Validation(required = true)
    public java.util.List<String> failedResourceIds;

    public static MoveAppResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceResponse self = new MoveAppResourceResponse();
        return TeaModel.build(map, self);
    }

}
