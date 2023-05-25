// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopOmsOpenAPIProjectRequest extends TeaModel {
    /**
     * <p>The suggestions (old).</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Contact the administrator.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Alibaba Cloud CLI</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static StopOmsOpenAPIProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        StopOmsOpenAPIProjectRequest self = new StopOmsOpenAPIProjectRequest();
        return TeaModel.build(map, self);
    }

    public StopOmsOpenAPIProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public StopOmsOpenAPIProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StopOmsOpenAPIProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public StopOmsOpenAPIProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
