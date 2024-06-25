// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamScopeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ipam-scope-glfmcyldpm8lsy****</p>
     */
    @NameInMap("IpamScopeId")
    public String ipamScopeId;

    /**
     * <strong>example:</strong>
     * <p>E897D16A-50EB-543F-B002-C5A26AB818FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpamScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamScopeResponseBody self = new CreateIpamScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamScopeResponseBody setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
        return this;
    }
    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    public CreateIpamScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
