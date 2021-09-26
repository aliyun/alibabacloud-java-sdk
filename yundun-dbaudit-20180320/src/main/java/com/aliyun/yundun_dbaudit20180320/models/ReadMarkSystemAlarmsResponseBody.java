// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ReadMarkSystemAlarmsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReadMarkSystemAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMarkSystemAlarmsResponseBody self = new ReadMarkSystemAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMarkSystemAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
