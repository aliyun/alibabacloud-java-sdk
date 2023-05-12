// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointRequest extends TeaModel {
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeResolverEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointRequest self = new DescribeResolverEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeResolverEndpointRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
