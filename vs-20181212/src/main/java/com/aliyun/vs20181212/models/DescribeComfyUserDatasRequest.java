// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDatasRequest extends TeaModel {
    /**
     * <p>The name of the file to query, or the folder to query. For a folder, provide the path ending with a forward slash (/).</p>
     * 
     * <strong>example:</strong>
     * <p>myfile</p>
     */
    @NameInMap("FileName")
    public String fileName;

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

    public static DescribeComfyUserDatasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDatasRequest self = new DescribeComfyUserDatasRequest();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDatasRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeComfyUserDatasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyUserDatasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
