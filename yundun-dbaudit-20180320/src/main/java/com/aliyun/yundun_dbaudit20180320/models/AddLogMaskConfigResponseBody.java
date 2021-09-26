// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AddLogMaskConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLogMaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLogMaskConfigResponseBody self = new AddLogMaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLogMaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
