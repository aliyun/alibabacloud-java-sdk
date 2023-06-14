// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceTDEResponseBody extends TeaModel {
    /**
     * <p>$.parameters[2].schema.enumValueTitles</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceTDEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTDEResponseBody self = new ModifyInstanceTDEResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTDEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
