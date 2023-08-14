// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardSharedUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TensorboardSharedUrl")
    public String tensorboardSharedUrl;

    public static GetTensorboardSharedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardSharedUrlResponseBody self = new GetTensorboardSharedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTensorboardSharedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTensorboardSharedUrlResponseBody setTensorboardSharedUrl(String tensorboardSharedUrl) {
        this.tensorboardSharedUrl = tensorboardSharedUrl;
        return this;
    }
    public String getTensorboardSharedUrl() {
        return this.tensorboardSharedUrl;
    }

}
