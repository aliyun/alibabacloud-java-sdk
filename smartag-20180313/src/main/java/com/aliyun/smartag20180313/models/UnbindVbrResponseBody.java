// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindVbrResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>61C33444-D8C5-4018-A06C-BA8C8812BEF6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindVbrResponseBody self = new UnbindVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
