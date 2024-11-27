// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsInstanceDeleteResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A07E3902-B92E-44A6-B6C5-6AA111111****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsInstanceDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsInstanceDeleteResponseBody self = new OnsInstanceDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsInstanceDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
