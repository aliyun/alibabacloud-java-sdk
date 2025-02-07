// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class ModifyInstancePropertiesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstancePropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancePropertiesResponseBody self = new ModifyInstancePropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstancePropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
