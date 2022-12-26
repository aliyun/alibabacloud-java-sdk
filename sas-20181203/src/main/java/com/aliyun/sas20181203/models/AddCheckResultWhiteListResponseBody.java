// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddCheckResultWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListResponseBody self = new AddCheckResultWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public AddCheckResultWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
