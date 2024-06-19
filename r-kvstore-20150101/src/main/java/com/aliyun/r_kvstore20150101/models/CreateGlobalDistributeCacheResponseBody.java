// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E681E498-5A0D-44F2-B1A7-912DC3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalDistributeCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheResponseBody self = new CreateGlobalDistributeCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
