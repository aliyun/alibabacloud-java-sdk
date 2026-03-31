// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ReCreateCloudResourceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReCreateCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReCreateCloudResourceResponseBody self = new ReCreateCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReCreateCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
