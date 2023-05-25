// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartOmsOpenAPIProjectRequest extends TeaModel {
    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static StartOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        StartOmsOpenAPIProjectRequest self = new StartOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public StartOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public StartOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StartOmsOpenAPIProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StartOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
