// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7C3AC882-E5A8-4855-BE77-B6837B695EF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataLimitResponseBody self = new ModifyDataLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
