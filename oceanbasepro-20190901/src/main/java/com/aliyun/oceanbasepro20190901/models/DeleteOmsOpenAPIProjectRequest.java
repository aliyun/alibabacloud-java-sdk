// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsOpenAPIProjectRequest extends TeaModel {
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

    public static DeleteOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsOpenAPIProjectRequest self = new DeleteOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DeleteOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DeleteOmsOpenAPIProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
