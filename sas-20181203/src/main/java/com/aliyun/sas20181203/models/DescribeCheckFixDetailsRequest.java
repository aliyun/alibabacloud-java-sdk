// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the risk item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the IDs of risk items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The ID of the baseline.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to query the IDs of baselines.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    public static DescribeCheckFixDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckFixDetailsRequest self = new DescribeCheckFixDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckFixDetailsRequest setCheckIds(String checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public String getCheckIds() {
        return this.checkIds;
    }

    public DescribeCheckFixDetailsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckFixDetailsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

}
