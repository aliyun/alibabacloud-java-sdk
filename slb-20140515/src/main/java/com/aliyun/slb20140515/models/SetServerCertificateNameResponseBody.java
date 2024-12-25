// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetServerCertificateNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FE7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetServerCertificateNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetServerCertificateNameResponseBody self = new SetServerCertificateNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetServerCertificateNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
