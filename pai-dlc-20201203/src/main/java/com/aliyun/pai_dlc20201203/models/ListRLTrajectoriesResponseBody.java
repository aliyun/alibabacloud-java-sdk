// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLTrajectoriesResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The effective page number. If pagination parameters are not provided, the default value 1 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The effective number of entries per page. If pagination parameters are not provided, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sample UID.</p>
     * 
     * <strong>example:</strong>
     * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
     */
    @NameInMap("PromptUid")
    public String promptUid;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of trajectories under this UID before pagination. This is an exact value, and represents a lower bound only when Truncated is true.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of trajectories on the current page, sorted in ascending order by SampleIndex.</p>
     */
    @NameInMap("Trajectories")
    public java.util.List<RLTrajectory> trajectories;

    public static ListRLTrajectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRLTrajectoriesResponseBody self = new ListRLTrajectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRLTrajectoriesResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListRLTrajectoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRLTrajectoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRLTrajectoriesResponseBody setPromptUid(String promptUid) {
        this.promptUid = promptUid;
        return this;
    }
    public String getPromptUid() {
        return this.promptUid;
    }

    public ListRLTrajectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRLTrajectoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRLTrajectoriesResponseBody setTrajectories(java.util.List<RLTrajectory> trajectories) {
        this.trajectories = trajectories;
        return this;
    }
    public java.util.List<RLTrajectory> getTrajectories() {
        return this.trajectories;
    }

}
