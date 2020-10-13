// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static AddDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponse self = new AddDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDomainResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddDomainResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
