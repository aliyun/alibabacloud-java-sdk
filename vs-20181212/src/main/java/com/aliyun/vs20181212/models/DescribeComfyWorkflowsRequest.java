// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyWorkflowsRequest extends TeaModel {
    /**
     * <p>The name of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>Image-to-video workflow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the list to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeComfyWorkflowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyWorkflowsRequest self = new DescribeComfyWorkflowsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyWorkflowsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeComfyWorkflowsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyWorkflowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
