// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the resource that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-xxx-80-clb7</p>
     */
    @NameInMap("CloudResource")
    public String cloudResource;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceResponseBody self = new ModifyCloudResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceResponseBody setCloudResource(String cloudResource) {
        this.cloudResource = cloudResource;
        return this;
    }
    public String getCloudResource() {
        return this.cloudResource;
    }

    public ModifyCloudResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
