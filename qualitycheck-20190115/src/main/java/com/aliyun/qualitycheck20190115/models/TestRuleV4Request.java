// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    /**
     * <p>This parameter is required.</p>
     */
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
