// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionPieChartRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
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
     * <p>Start time, accurate to milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1751249559000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1740535600000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Event type.</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
