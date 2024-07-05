// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsStreamsNotifyUrlConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4C747C97-7ECD-4C61-8A92-67AD806331FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVsStreamsNotifyUrlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVsStreamsNotifyUrlConfigResponseBody self = new DeleteVsStreamsNotifyUrlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVsStreamsNotifyUrlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
