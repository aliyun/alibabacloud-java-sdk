// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamResponse self = new DeleteStreamResponse();
        return TeaModel.build(map, self);
    }

}
