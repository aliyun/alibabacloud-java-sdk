// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyModelResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D39EE0F1-D7EF-5F46-B781-6BF4185308B0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ModifyModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelResponseBody self = new ModifyModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
