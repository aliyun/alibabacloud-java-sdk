// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionPieChartRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("beginTime")
    public Long beginTime;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("eventType")
    public String eventType;

    @NameInMap("regId")
    public String regId;

    public static DescribeScoreSectionPieChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionPieChartRequest self = new DescribeScoreSectionPieChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionPieChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeScoreSectionPieChartRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeScoreSectionPieChartRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeScoreSectionPieChartRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeScoreSectionPieChartRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeScoreSectionPieChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
