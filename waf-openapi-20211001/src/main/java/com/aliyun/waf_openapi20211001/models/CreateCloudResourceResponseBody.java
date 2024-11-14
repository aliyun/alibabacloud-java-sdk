// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the resource that is added to WAF. The ID is automatically generated.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-***</p>
     */
    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-ER12-WE34-23PO-301469*****E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceResponseBody self = new CreateCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceResponseBody setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public CreateCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
