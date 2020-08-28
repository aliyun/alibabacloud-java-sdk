// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatermarkResponse self = new DeleteWatermarkResponse();
        return TeaModel.build(map, self);
    }

}
