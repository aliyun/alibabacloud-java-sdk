// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class TestRuleV4Request extends TeaModel {
    /**
     * <p>Whether this is the new quality check version. Valid values: 0 (legacy version) and 1 (new version). Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsSchemeData")
    public Integer isSchemeData;

    /**
     * <p>JSON request parameters for rule testing. For details, see the supplemental description of request parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ruleList&quot;:[9771],&quot;dialogues&quot;:[{&quot;begin&quot;:0,&quot;end&quot;:760,&quot;hourMinSec&quot;:&quot;00:00&quot;,&quot;role&quot;:&quot;客户&quot;,&quot;identity&quot;:&quot;客户&quot;,&quot;words&quot;:&quot;123&quot;},{&quot;begin&quot;:21004,&quot;end&quot;:21494,&quot;hourMinSec&quot;:&quot;00:21&quot;,&quot;role&quot;:&quot;客服&quot;,&quot;identity&quot;:&quot;客服&quot;,&quot;words&quot;:&quot;123&quot;}]}</p>
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
