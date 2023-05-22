// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class CloseProductResponseBody extends TeaModel {
    @NameInMap("data")
    public Long data;

    @NameInMap("requestId")
    public String requestId;

    public static CloseProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseProductResponseBody self = new CloseProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseProductResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CloseProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
