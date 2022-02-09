// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmadsqlfilesumResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    public static OmadsqlfilesumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OmadsqlfilesumResponseBody self = new OmadsqlfilesumResponseBody();
        return TeaModel.build(map, self);
    }

    public OmadsqlfilesumResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public OmadsqlfilesumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
