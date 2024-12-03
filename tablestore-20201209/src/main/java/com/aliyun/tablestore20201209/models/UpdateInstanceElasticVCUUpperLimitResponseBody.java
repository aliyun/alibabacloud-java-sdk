// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceElasticVCUUpperLimitResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B37BBA04-D827-55C8-B901-5264B904E8C6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateInstanceElasticVCUUpperLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceElasticVCUUpperLimitResponseBody self = new UpdateInstanceElasticVCUUpperLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceElasticVCUUpperLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
