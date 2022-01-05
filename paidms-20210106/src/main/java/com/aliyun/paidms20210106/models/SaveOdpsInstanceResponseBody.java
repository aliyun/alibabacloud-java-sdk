// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveOdpsInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveOdpsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOdpsInstanceResponseBody self = new SaveOdpsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOdpsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
