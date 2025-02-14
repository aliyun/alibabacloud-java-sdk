// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyHybridProxyPolicyResponseBody extends TeaModel {
    /**
     * <p>The message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>clusterName data not exist</p>
     */
    @NameInMap("Messgae")
    public String messgae;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHybridProxyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridProxyPolicyResponseBody self = new ModifyHybridProxyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridProxyPolicyResponseBody setMessgae(String messgae) {
        this.messgae = messgae;
        return this;
    }
    public String getMessgae() {
        return this.messgae;
    }

    public ModifyHybridProxyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
