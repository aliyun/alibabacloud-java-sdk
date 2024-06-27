// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleHitRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("ruleSnapshotId")
    public String ruleSnapshotId;

    @NameInMap("sRequestId")
    public String sRequestId;

    public static DescribeRuleHitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleHitRequest self = new DescribeRuleHitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleHitRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRuleHitRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRuleHitRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeRuleHitRequest setRuleSnapshotId(String ruleSnapshotId) {
        this.ruleSnapshotId = ruleSnapshotId;
        return this;
    }
    public String getRuleSnapshotId() {
        return this.ruleSnapshotId;
    }

    public DescribeRuleHitRequest setSRequestId(String sRequestId) {
        this.sRequestId = sRequestId;
        return this;
    }
    public String getSRequestId() {
        return this.sRequestId;
    }

}
