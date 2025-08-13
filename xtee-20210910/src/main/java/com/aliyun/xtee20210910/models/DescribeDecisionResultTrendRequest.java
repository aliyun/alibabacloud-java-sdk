// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultTrendRequest extends TeaModel {
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
     * <p>Start timestamp, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1737101348000</p>
     */
    @NameInMap("beginTime")
    public Long beginTime;

    /**
     * <p>End time, accurate to milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>1747101348000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Event code.</p>
     * 
     * <strong>example:</strong>
     * <p>de_ahqhsw7665,de_agbzfi5134</p>
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
