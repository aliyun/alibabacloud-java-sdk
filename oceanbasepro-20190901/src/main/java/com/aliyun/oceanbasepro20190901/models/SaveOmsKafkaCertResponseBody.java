// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SaveOmsKafkaCertResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static SaveOmsKafkaCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOmsKafkaCertResponseBody self = new SaveOmsKafkaCertResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOmsKafkaCertResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveOmsKafkaCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
