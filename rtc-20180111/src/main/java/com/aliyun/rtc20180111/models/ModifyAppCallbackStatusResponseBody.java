// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppCallbackStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F80AAC02-87BD-5D9C-B925-8AB40171BA1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppCallbackStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppCallbackStatusResponseBody self = new ModifyAppCallbackStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppCallbackStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
