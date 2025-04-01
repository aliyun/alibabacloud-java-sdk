// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DebugModelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E7B7D598-B080-5C8E-AA35-D43EC0D5F886</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DebugModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugModelResponseBody self = new DebugModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
