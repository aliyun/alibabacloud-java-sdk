// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectStepsRequest extends TeaModel {
    /**
     * <p>The read RT baseline of the source data source.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The read/write RPS baseline of the destination data source.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The read/write RT baseline of the destination data source.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The read RT baseline of the source data source.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static DescribeOmsOpenAPIProjectStepsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectStepsRequest self = new DescribeOmsOpenAPIProjectStepsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectStepsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsOpenAPIProjectStepsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsOpenAPIProjectStepsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeOmsOpenAPIProjectStepsRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
