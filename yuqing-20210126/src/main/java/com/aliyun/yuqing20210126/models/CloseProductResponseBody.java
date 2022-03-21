// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class CloseProductResponseBody extends TeaModel {
    // 关闭结果id
    @NameInMap("id")
    public Long id;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CloseProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseProductResponseBody self = new CloseProductResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseProductResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CloseProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
