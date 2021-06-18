// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAssetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAssetResponseBody self = new DeleteAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
