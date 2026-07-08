// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyProductionsRequest extends TeaModel {
    /**
     * <p>The page number of the results to return. Pages are 1-indexed. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Comfy task whose productions you want to list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c8234f4-d1e1-4cea-b08b-7926fbdea144</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeComfyProductionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyProductionsRequest self = new DescribeComfyProductionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyProductionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyProductionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyProductionsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
