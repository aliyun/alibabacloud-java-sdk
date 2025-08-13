// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleHitRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Execution time</p>
     * 
     * <strong>example:</strong>
     * <p>1752571330000</p>
     */
    @NameInMap("requestTime")
    public Long requestTime;

    /**
     * <p>Rule ID</p>
     * 
     * <strong>example:</strong>
     * <p>102059</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("ruleSnapshotId")
    public String ruleSnapshotId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>60C97040-D5D5-4906-9522-B9B413730CAA</p>
     */
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

    public DescribeRuleHitRequest setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public Long getRequestTime() {
        return this.requestTime;
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
