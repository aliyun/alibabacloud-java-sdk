// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifySearchParametersResponseBody extends TeaModel {
    /**
     * <p>The request ID. A successful response indicates that the parameter modification task has been accepted, but does not indicate that the parameters have taken effect.</p>
     * 
     * <strong>example:</strong>
     * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySearchParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchParametersResponseBody self = new ModifySearchParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySearchParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
