// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class RestoreRequest extends TeaModel {
    // description
    @NameInMap("Days")
    public Long days;

    // description
    @NameInMap("JobParameters")
    public JobParameters jobParameters;

    public static RestoreRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreRequest self = new RestoreRequest();
        return TeaModel.build(map, self);
    }

    public RestoreRequest setDays(Long days) {
        this.days = days;
        return this;
    }
    public Long getDays() {
        return this.days;
    }

    public RestoreRequest setJobParameters(JobParameters jobParameters) {
        this.jobParameters = jobParameters;
        return this;
    }
    public JobParameters getJobParameters() {
        return this.jobParameters;
    }

    public static class JobParameters extends TeaModel {
        // description
        @NameInMap("Tier")
        public String tier;

        public static JobParameters build(java.util.Map<String, ?> map) throws Exception {
            JobParameters self = new JobParameters();
            return TeaModel.build(map, self);
        }

        public JobParameters setTier(String tier) {
            this.tier = tier;
            return this;
        }
        public String getTier() {
            return this.tier;
        }

    }

}
