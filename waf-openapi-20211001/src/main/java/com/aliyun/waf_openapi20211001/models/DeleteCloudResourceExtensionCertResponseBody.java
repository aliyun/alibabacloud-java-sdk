// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteCloudResourceExtensionCertResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>56B40D30-4960-4F19-B7D5-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCloudResourceExtensionCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudResourceExtensionCertResponseBody self = new DeleteCloudResourceExtensionCertResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudResourceExtensionCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
