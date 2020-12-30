// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetDomainCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Integer data;

    @NameInMap("Code")
    public Integer code;

    public static GetDomainCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainCountResponseBody self = new GetDomainCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainCountResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public GetDomainCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

}
