// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5D69B341-4F97-58E7-9E16-1B17FE7A9E98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDefenseResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceGroupResponseBody self = new CreateDefenseResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
