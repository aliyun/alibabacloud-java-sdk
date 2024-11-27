// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateNetworkDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the network domain.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A2873E9C-A7EA-5735-845C-65D3792623D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNetworkDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkDomainResponseBody self = new CreateNetworkDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkDomainResponseBody setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public CreateNetworkDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
