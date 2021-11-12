// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class BindInstance2VpcResponseBody extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("RequestId")
    public String requestId;

    public static BindInstance2VpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInstance2VpcResponseBody self = new BindInstance2VpcResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInstance2VpcResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BindInstance2VpcResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public BindInstance2VpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
