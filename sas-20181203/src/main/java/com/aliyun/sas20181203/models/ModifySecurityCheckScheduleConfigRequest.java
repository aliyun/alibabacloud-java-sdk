// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigRequest extends TeaModel {
    /**
     * <p>The days on which the automatic configuration check runs. You can specify multiple days. Separate multiple days with commas (,). Valid values:</p>
     * <br>
     * <p>*   **1**: Monday</p>
     * <p>*   **2**: Tuesday</p>
     * <p>*   **3**: Wednesday</p>
     * <p>*   **4**: Thursday</p>
     * <p>*   **5**: Friday</p>
     * <p>*   **6**: Saturday</p>
     * <p>*   **7**: Sunday</p>
     */
    @NameInMap("DaysOfWeek")
    public String daysOfWeek;

    /**
     * <p>The time period during which the automatic configuration check ends. Valid values:</p>
     * <br>
     * <p>*   **0**: 00:00 to 06:00</p>
     * <p>*   **6**: 06:00 to 12:00</p>
     * <p>*   **12**: 12:00 to 18:00</p>
     * <p>*   **18**: 18:00 to 24:00</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The time period during which the automatic configuration check starts. Valid values:</p>
     * <br>
     * <p>*   **0**: 00:00 to 06:00</p>
     * <p>*   **6**: 06:00 to 12:00</p>
     * <p>*   **12**: 12:00 to 18:00</p>
     * <p>*   **18**: 18:00 to 24:00</p>
     */
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
