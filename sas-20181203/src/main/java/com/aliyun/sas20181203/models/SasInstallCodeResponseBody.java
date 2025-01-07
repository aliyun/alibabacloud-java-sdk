// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SasInstallCodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B256A525-7E42-4BB9-A27C-9017FDDFF1A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The installation verification code that is used to run the installation command when you manually install the Security Center agent.</p>
     * 
     * <strong>example:</strong>
     * <p>eD****</p>
     */
    @NameInMap("data")
    public String data;

    public static SasInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SasInstallCodeResponseBody self = new SasInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SasInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SasInstallCodeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
