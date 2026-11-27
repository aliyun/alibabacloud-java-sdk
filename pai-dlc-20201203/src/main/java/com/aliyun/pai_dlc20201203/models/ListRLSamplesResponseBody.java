// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLSamplesResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc5yfk7eyg95lac</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The effective page number. If pagination parameters are not specified, the default value 1 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The effective number of entries per page. If pagination parameters are not specified, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of trajectories on the current page.</p>
     */
    @NameInMap("Samples")
    public java.util.List<RLSample> samples;

    /**
     * <p>The total number of trajectories within the window before pagination. If Truncated is set to true, this value represents a lower bound rather than the exact total count.</p>
     * 
     * <strong>example:</strong>
     * <p>21596</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRLSamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRLSamplesResponseBody self = new ListRLSamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRLSamplesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListRLSamplesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRLSamplesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRLSamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRLSamplesResponseBody setSamples(java.util.List<RLSample> samples) {
        this.samples = samples;
        return this;
    }
    public java.util.List<RLSample> getSamples() {
        return this.samples;
    }

    public ListRLSamplesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
