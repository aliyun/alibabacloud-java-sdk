// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UnbindAgentStorage2VpcResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>18DD77BF-F967-576D-80D1-79121399AB53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindAgentStorage2VpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAgentStorage2VpcResponseBody self = new UnbindAgentStorage2VpcResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAgentStorage2VpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
