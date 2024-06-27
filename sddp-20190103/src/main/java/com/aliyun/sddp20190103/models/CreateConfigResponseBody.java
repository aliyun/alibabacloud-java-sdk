// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the common alert configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigResponseBody self = new CreateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
