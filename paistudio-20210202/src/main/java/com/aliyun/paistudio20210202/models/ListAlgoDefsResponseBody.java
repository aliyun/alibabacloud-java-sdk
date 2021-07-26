// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListAlgoDefsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    public static ListAlgoDefsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlgoDefsResponseBody self = new ListAlgoDefsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlgoDefsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlgoDefsResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

}
