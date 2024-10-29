// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateWorkgroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C8B26B44-0189-443E-9816-D951F59623A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workgroup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-***</p>
     */
    @NameInMap("WorkgroupId")
    public String workgroupId;

    public static CreateWorkgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkgroupResponseBody self = new CreateWorkgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkgroupResponseBody setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

}
