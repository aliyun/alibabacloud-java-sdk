// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateNetworkDomainResponseBody extends TeaModel {
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

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
