// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DaysOfWeek")
    public String daysOfWeek;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    public static ModifySecurityCheckScheduleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigRequest self = new ModifySecurityCheckScheduleConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifySecurityCheckScheduleConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityCheckScheduleConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifySecurityCheckScheduleConfigRequest setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }
    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public ModifySecurityCheckScheduleConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ModifySecurityCheckScheduleConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

}
