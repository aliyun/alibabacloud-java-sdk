// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResumeOmsOpenAPIProjectRequest extends TeaModel {
    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The suggestions (old).</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static ResumeOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeOmsOpenAPIProjectRequest self = new ResumeOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public ResumeOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ResumeOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ResumeOmsOpenAPIProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResumeOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
