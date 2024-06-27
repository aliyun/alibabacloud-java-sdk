// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleBarChartRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("eventCodes")
    public String eventCodes;

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
