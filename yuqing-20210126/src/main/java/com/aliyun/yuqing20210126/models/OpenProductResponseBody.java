// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class OpenProductResponseBody extends TeaModel {
    // 开通结果id
    @NameInMap("id")
    public Long id;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static OpenProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenProductResponseBody self = new OpenProductResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenProductResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public OpenProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
