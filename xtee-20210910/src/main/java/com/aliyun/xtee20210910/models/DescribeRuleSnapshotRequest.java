// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleSnapshotRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("snapshotVersion")
    public String snapshotVersion;

    public static DescribeRuleSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleSnapshotRequest self = new DescribeRuleSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleSnapshotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRuleSnapshotRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRuleSnapshotRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeRuleSnapshotRequest setSnapshotVersion(String snapshotVersion) {
        this.snapshotVersion = snapshotVersion;
        return this;
    }
    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

}
