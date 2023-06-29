// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateScanTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom scan task.</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The ID of the request.</p>
     */
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
