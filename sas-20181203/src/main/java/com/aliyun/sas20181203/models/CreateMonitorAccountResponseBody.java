// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMonitorAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMonitorAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAccountResponseBody self = new CreateMonitorAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
