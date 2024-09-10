// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishCronRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0 5 10 * * ?</p>
     */
    @NameInMap("Cron")
    public String cron;

    /**
     * <strong>example:</strong>
     * <p>SUN</p>
     */
    @NameInMap("CronDay")
    public String cronDay;

    /**
     * <strong>example:</strong>
     * <p>1657407600000</p>
     */
    @NameInMap("CronTime")
    public Long cronTime;

    /**
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("CronType")
    public String cronType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    public static UpdatePublishCronRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishCronRequest self = new UpdatePublishCronRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublishCronRequest setCron(String cron) {
        this.cron = cron;
        return this;
    }
    public String getCron() {
        return this.cron;
    }

    public UpdatePublishCronRequest setCronDay(String cronDay) {
        this.cronDay = cronDay;
        return this;
    }
    public String getCronDay() {
        return this.cronDay;
    }

    public UpdatePublishCronRequest setCronTime(Long cronTime) {
        this.cronTime = cronTime;
        return this;
    }
    public Long getCronTime() {
        return this.cronTime;
    }

    public UpdatePublishCronRequest setCronType(String cronType) {
        this.cronType = cronType;
        return this;
    }
    public String getCronType() {
        return this.cronType;
    }

    public UpdatePublishCronRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

}
