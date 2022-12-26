// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableCustomBlockRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomBlockRecordResponseBody self = new DisableCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
