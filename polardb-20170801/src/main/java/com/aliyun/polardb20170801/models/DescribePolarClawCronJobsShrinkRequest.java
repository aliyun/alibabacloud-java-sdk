// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawCronJobsShrinkRequest extends TeaModel {
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
    public String jobIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RunLimit")
    public Integer runLimit;

    public static DescribePolarClawCronJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawCronJobsShrinkRequest self = new DescribePolarClawCronJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawCronJobsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawCronJobsShrinkRequest setIncludeDisabled(Boolean includeDisabled) {
        this.includeDisabled = includeDisabled;
        return this;
    }
    public Boolean getIncludeDisabled() {
        return this.includeDisabled;
    }

    public DescribePolarClawCronJobsShrinkRequest setIncludeRuns(Boolean includeRuns) {
        this.includeRuns = includeRuns;
        return this;
    }
    public Boolean getIncludeRuns() {
        return this.includeRuns;
    }

    public DescribePolarClawCronJobsShrinkRequest setJobIdListShrink(String jobIdListShrink) {
        this.jobIdListShrink = jobIdListShrink;
        return this;
    }
    public String getJobIdListShrink() {
        return this.jobIdListShrink;
    }

    public DescribePolarClawCronJobsShrinkRequest setRunLimit(Integer runLimit) {
        this.runLimit = runLimit;
        return this;
    }
    public Integer getRunLimit() {
        return this.runLimit;
    }

}
