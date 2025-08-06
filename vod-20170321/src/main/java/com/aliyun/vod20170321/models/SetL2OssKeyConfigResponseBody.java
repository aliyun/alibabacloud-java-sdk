// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetL2OssKeyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetL2OssKeyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetL2OssKeyConfigResponseBody self = new SetL2OssKeyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetL2OssKeyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
