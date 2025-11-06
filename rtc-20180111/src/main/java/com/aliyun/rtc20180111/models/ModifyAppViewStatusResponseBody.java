// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppViewStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>94D9A316-9750-5928-B18C-59DF182F6BF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAppViewStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppViewStatusResponseBody self = new ModifyAppViewStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAppViewStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
