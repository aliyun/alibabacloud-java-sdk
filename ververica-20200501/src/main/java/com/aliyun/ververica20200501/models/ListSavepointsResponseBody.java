// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListSavepointsResponseBody extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    public static ListSavepointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsResponseBody self = new ListSavepointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSavepointsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListSavepointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
