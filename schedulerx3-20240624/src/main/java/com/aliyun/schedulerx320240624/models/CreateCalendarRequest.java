// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateCalendarRequest extends TeaModel {
    /**
     * <p>The name of the calendar.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>workday</p>
     */
    @NameInMap("CalendarName")
    public String calendarName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client and make sure that the value is unique across different requests. The client token supports only ASCII characters. Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cluster. You can call <a href="https://help.aliyun.com/document_detail/28147.html">ListClusters</a> to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-b6ec1xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The calendar for each month in JSON array format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {&quot;month&quot;:1,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
     *   {&quot;month&quot;:2,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
     *   {&quot;month&quot;:3,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
     *   {&quot;month&quot;:4,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30]},
     *   {&quot;month&quot;:5,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,22,23,26,27,28,29,30]},
     *   {&quot;month&quot;:6,&quot;days&quot;:[2,3,4,5,6,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30]},
     *   {&quot;month&quot;:7,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
     *   {&quot;month&quot;:8,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]},
     *   {&quot;month&quot;:9,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30]},
     *   {&quot;month&quot;:10,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
     *   {&quot;month&quot;:11,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28]},
     *   {&quot;month&quot;:12,&quot;days&quot;:[1,2,3,4,5,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]}
     * ]</p>
     */
    @NameInMap("Months")
    public String months;

    /**
     * <p>The year.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026</p>
     */
    @NameInMap("Year")
    public Integer year;

    public static CreateCalendarRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCalendarRequest self = new CreateCalendarRequest();
        return TeaModel.build(map, self);
    }

    public CreateCalendarRequest setCalendarName(String calendarName) {
        this.calendarName = calendarName;
        return this;
    }
    public String getCalendarName() {
        return this.calendarName;
    }

    public CreateCalendarRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCalendarRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateCalendarRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

    public CreateCalendarRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
