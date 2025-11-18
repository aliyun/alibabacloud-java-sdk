// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceConfigResponseBody self = new ModifyInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
