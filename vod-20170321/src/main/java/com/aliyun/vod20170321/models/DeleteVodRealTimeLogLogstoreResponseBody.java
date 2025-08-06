// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealTimeLogLogstoreResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVodRealTimeLogLogstoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealTimeLogLogstoreResponseBody self = new DeleteVodRealTimeLogLogstoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealTimeLogLogstoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
