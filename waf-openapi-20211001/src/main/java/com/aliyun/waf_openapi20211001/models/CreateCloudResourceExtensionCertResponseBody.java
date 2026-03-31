// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceExtensionCertResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudResourceExtensionCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceExtensionCertResponseBody self = new CreateCloudResourceExtensionCertResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceExtensionCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
