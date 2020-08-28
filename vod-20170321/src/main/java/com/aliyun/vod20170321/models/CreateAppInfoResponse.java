// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static CreateAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoResponse self = new CreateAppInfoResponse();
        return TeaModel.build(map, self);
    }

}
