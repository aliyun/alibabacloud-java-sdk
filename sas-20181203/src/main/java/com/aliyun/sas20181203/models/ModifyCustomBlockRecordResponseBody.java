// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCustomBlockRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomBlockRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomBlockRecordResponseBody self = new ModifyCustomBlockRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomBlockRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
