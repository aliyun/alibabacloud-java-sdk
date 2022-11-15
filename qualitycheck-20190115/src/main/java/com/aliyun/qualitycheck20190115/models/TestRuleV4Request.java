// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4Request extends TeaModel {
    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    @NameInMap("TestJson")
    public String testJson;

    public static TestRuleV4Request build(java.util.Map<String, ?> map) throws Exception {
        TestRuleV4Request self = new TestRuleV4Request();
        return TeaModel.build(map, self);
    }

    public TestRuleV4Request setIsSchemeData(Integer isSchemeData) {
        this.isSchemeData = isSchemeData;
        return this;
    }
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    public TestRuleV4Request setTestJson(String testJson) {
        this.testJson = testJson;
        return this;
    }
    public String getTestJson() {
        return this.testJson;
    }

}
