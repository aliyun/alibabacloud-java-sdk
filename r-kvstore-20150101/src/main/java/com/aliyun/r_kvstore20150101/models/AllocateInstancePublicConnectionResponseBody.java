// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20C8341E-B5AD-4B24-BD82-D73241522ABF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateInstancePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponseBody self = new AllocateInstancePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
