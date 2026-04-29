// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawCronJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDisabled")
    public Boolean includeDisabled;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRuns")
    public Boolean includeRuns;

    /**
     * <strong>example:</strong>
     * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e,1ee00f56-f467-4d41-858c-ca4ede2c770f</p>
     */
    @NameInMap("JobIdList")
    public java.util.List<String> jobIdList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RunLimit")
    public Integer runLimit;

    public static DescribePolarClawCronJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawCronJobsRequest self = new DescribePolarClawCronJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawCronJobsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawCronJobsRequest setIncludeDisabled(Boolean includeDisabled) {
        this.includeDisabled = includeDisabled;
        return this;
    }
    public Boolean getIncludeDisabled() {
        return this.includeDisabled;
    }

    public DescribePolarClawCronJobsRequest setIncludeRuns(Boolean includeRuns) {
        this.includeRuns = includeRuns;
        return this;
    }
    public Boolean getIncludeRuns() {
        return this.includeRuns;
    }

    public DescribePolarClawCronJobsRequest setJobIdList(java.util.List<String> jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public java.util.List<String> getJobIdList() {
        return this.jobIdList;
    }

    public DescribePolarClawCronJobsRequest setRunLimit(Integer runLimit) {
        this.runLimit = runLimit;
        return this;
    }
    public Integer getRunLimit() {
        return this.runLimit;
    }

}
