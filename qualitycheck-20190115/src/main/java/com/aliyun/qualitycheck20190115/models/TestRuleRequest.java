// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static TestRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        TestRuleRequest self = new TestRuleRequest();
        return TeaModel.build(map, self);
    }

    public TestRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
