// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindVbrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindVbrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindVbrResponseBody self = new BindVbrResponseBody();
        return TeaModel.build(map, self);
    }

    public BindVbrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
