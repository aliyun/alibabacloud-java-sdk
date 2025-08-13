// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRiskTagsLineChartRequest extends TeaModel {
    /**
     * <p>Start time of the query, in milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1729563800605</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1729563800605</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Event code</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("EventCodes")
    public String eventCodes;

    /**
     * <p>Sets the language type for the request and response messages. Default value is <strong>zh</strong>. Values: </p>
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
    @NameInMap("RegId")
    public String regId;

    public static DescribeRiskTagsLineChartRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskTagsLineChartRequest self = new DescribeRiskTagsLineChartRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskTagsLineChartRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeRiskTagsLineChartRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRiskTagsLineChartRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeRiskTagsLineChartRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskTagsLineChartRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
