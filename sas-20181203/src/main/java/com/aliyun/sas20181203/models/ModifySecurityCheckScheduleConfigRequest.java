// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigRequest extends TeaModel {
    // The days on which the automatic configuration check runs. You can specify multiple days. Separate multiple days with commas (,). Valid values:
    // 
    // *   **1**: Monday
    // *   **2**: Tuesday
    // *   **3**: Wednesday
    // *   **4**: Thursday
    // *   **5**: Friday
    // *   **6**: Saturday
    // *   **7**: Sunday
    @NameInMap("DaysOfWeek")
    public String daysOfWeek;

    // The time period during which the automatic configuration check ends. Valid values:
    // 
    // *   **0**: 00:00 to 06:00
    // *   **6**: 06:00 to 12:00
    // *   **12**: 12:00 to 18:00
    // *   **18**: 18:00 to 24:00
    @NameInMap("EndTime")
    public Integer endTime;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The time period during which the automatic configuration check starts. Valid values:
    // 
    // *   **0**: 00:00 to 06:00
    // *   **6**: 06:00 to 12:00
    // *   **12**: 12:00 to 18:00
    // *   **18**: 18:00 to 24:00
    @NameInMap("StartTime")
    public Integer startTime;

    public static ModifySecurityCheckScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigRequest self = new ModifySecurityCheckScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigRequest setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public ModifySecurityCheckScheduleConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ModifySecurityCheckScheduleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifySecurityCheckScheduleConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityCheckScheduleConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifySecurityCheckScheduleConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
