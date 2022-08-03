// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CORSConfiguration extends TeaModel {
    @NameInMap("CORSRule")
    public java.util.List<CORSRule> CORSRule;

    @NameInMap("ResponseVary")
    public Boolean responseVary;

    public static CORSConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CORSConfiguration self = new CORSConfiguration();
        return TeaModel.build(map, self);
    }

    public CORSConfiguration setCORSRule(java.util.List<CORSRule> CORSRule) {
        this.CORSRule = CORSRule;
        return this;
    }
    public java.util.List<CORSRule> getCORSRule() {
        return this.CORSRule;
    }

    public CORSConfiguration setResponseVary(Boolean responseVary) {
        this.responseVary = responseVary;
        return this;
    }
    public Boolean getResponseVary() {
        return this.responseVary;
    }

}
