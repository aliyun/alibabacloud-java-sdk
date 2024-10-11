// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobAttemptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:&quot;success&quot;, &quot;createTime&quot;:&quot;2021-05-27 11:00:00&quot;, &quot;timeZone&quot;:&quot;Asia/Shanghai&quot;}</p>
     */
    @NameInMap("Condition")
    public java.util.Map<String, ?> condition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>j202105272322hangzhou5d64f1560000128</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>release-test</p>
     */
    @NameInMap("VcName")
    public String vcName;

    public static ListSparkJobAttemptRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobAttemptRequest self = new ListSparkJobAttemptRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkJobAttemptRequest setCondition(java.util.Map<String, ?> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.Map<String, ?> getCondition() {
        return this.condition;
    }

    public ListSparkJobAttemptRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListSparkJobAttemptRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkJobAttemptRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSparkJobAttemptRequest setVcName(String vcName) {
        this.vcName = vcName;
        return this;
    }
    public String getVcName() {
        return this.vcName;
    }

}
