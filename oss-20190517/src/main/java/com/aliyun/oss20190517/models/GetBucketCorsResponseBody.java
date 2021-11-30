// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketCorsResponseBody extends TeaModel {
    @NameInMap("CORSRule")
    public java.util.List<CORSRule> CORSRule;

    @NameInMap("ResponseVary")
    public Boolean responseVary;

    public static GetBucketCorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketCorsResponseBody self = new GetBucketCorsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketCorsResponseBody setCORSRule(java.util.List<CORSRule> CORSRule) {
        this.CORSRule = CORSRule;
        return this;
    }
    public java.util.List<CORSRule> getCORSRule() {
        return this.CORSRule;
    }

    public GetBucketCorsResponseBody setResponseVary(Boolean responseVary) {
        this.responseVary = responseVary;
        return this;
    }
    public Boolean getResponseVary() {
        return this.responseVary;
    }

}
