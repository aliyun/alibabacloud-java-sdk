// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCycleTaskResponseBody extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>86CFF42E-E00A-57A3-8656-22291EFB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCycleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCycleTaskResponseBody self = new CreateCycleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCycleTaskResponseBody setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public CreateCycleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
