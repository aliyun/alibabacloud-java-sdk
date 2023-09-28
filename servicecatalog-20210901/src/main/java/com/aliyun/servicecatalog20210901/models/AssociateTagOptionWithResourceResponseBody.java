// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociateTagOptionWithResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateTagOptionWithResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateTagOptionWithResourceResponseBody self = new AssociateTagOptionWithResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateTagOptionWithResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
