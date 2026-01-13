// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class BindInstance2VpcResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xu6666-mkdd-test.cn-hangzhou.vpc.ots.aliyuncs.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>172.<strong>.</strong>*.34</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>E734979F-5A44-5993-9CE5-C23103576923</p>
     */
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
