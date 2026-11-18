// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateCalendarRequest extends TeaModel {
    /**
     * <p>The calendar name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("CalendarName")
    public String calendarName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>D0DE9C33-992A-580B-89C4-B609A292748D</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether the update is incremental. Default value: false. Valid values:</p>
     * <ul>
     * <li>false: Updates the data for the specified months and deletes the configurations for other months.</li>
     * <li>true: Updates only the data for the specified months and retains the existing configurations for other months.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Incremental")
    public Boolean incremental;

    /**
     * <p>The months.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},{&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},{&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},{&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},{&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},{&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},{&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},{&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},{&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},{&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},{&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},{&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}]</p>
     */
    @NameInMap("Months")
    public String months;

    /**
     * <p>The year.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static UpdateCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCalendarRequest self = new UpdateCalendarRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCalendarRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public UpdateCalendarRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCalendarRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateCalendarRequest setIncremental(Boolean incremental) {
        this.incremental = incremental;
        return this;
    }
    public Boolean getIncremental() {
        return this.incremental;
    }

    public UpdateCalendarRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

    public UpdateCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
