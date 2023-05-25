// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResetOmsOpenAPIProjectRequest extends TeaModel {
    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The error level. Valid values: CRITICAL, ERROR, and WARN.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static ResetOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetOmsOpenAPIProjectRequest self = new ResetOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public ResetOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ResetOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ResetOmsOpenAPIProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ResetOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
