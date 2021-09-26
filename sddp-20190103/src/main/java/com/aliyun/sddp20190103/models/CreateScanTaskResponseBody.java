// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskResponseBody extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScanTaskResponseBody self = new CreateScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScanTaskResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
