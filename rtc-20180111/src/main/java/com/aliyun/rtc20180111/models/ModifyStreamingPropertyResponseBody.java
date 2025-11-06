// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyStreamingPropertyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E7C44674-9065-5BBA-AB77-A5F20908E73B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyStreamingPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingPropertyResponseBody self = new ModifyStreamingPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
