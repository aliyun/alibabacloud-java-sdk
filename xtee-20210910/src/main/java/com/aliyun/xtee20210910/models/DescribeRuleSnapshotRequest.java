// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleSnapshotRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>101544</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Snapshot version.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
