// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeUserModelListRequest extends TeaModel {
    /**
     * <p>Authorization type.</p>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Model name.</p>
     * 
     * <strong>example:</strong>
     * <p>StudyX</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Pagination parameter: number of items per page, default value 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeUserModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserModelListRequest self = new DescribeUserModelListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserModelListRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeUserModelListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserModelListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeUserModelListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
