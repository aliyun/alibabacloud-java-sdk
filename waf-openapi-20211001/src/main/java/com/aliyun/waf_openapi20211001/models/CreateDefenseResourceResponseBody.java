// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1738C613-D054-5191-888B-DC0CF4C3A4A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the protected object that is created.</p>
     * 
     * <strong>example:</strong>
     * <p>cdX.XXX-call.cn-alb</p>
     */
    @NameInMap("Resource")
    public String resource;

    public static CreateDefenseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceResponseBody self = new CreateDefenseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefenseResourceResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
