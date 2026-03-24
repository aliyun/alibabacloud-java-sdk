// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackEventDashboardRequest extends TeaModel {
    /**
     * <p>Timestamp of the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1753153137284</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Language type for request and response messages. Default value is <strong>zh</strong>. Values:</p>
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
     * <p>Timestamp of the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1752548337284</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetAttackEventDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackEventDashboardRequest self = new GetAttackEventDashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackEventDashboardRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAttackEventDashboardRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAttackEventDashboardRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
