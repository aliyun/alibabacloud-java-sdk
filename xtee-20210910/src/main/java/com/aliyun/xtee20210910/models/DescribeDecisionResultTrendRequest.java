// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultTrendRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("beginTime")
    public Long beginTime;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("regId")
    public String regId;

    public static DescribeDecisionResultTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultTrendRequest self = new DescribeDecisionResultTrendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDecisionResultTrendRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeDecisionResultTrendRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDecisionResultTrendRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeDecisionResultTrendRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
