// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIStatisTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Types")
    public String types;

    public static ListAIStatisTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAIStatisTypeResponseBody self = new ListAIStatisTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAIStatisTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAIStatisTypeResponseBody setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
