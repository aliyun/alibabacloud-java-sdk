// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardSharedUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://pai-dlc-proxy-xxx.alicyuncs.com/xxx/xxx/token/">http://pai-dlc-proxy-xxx.alicyuncs.com/xxx/xxx/token/</a></p>
     */
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
