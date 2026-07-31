// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceCertResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A47D2DC0-7151-51EF-BFB7-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudResourceCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceCertResponseBody self = new ModifyCloudResourceCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
