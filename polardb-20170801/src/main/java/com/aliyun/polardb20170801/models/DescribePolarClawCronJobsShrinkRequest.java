// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawCronJobsShrinkRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Specifies whether to include disabled jobs. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDisabled")
    public Boolean includeDisabled;

    /**
     * <p>Specifies whether to include the run history. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeRuns")
    public Boolean includeRuns;

    /**
     * <p>Filters the results by a list of job IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e,1ee00f56-f467-4d41-858c-ca4ede2c770f</p>
     */
    @NameInMap("JobIdList")
    public String jobIdListShrink;

    /**
     * <p>The maximum number of run history records per job. Default value: 10.</p>
     * 
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
