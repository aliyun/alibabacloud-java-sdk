// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleBarChartRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Query start time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1739841750000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1750904603000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Event codes, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse_pro,account_abuse</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeRuleBarChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleBarChartRequest self = new DescribeRuleBarChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRuleBarChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRuleBarChartRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeRuleBarChartRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRuleBarChartRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeRuleBarChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
