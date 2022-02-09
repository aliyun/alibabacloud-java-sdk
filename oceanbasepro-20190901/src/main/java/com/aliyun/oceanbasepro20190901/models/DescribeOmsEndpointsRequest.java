// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointsRequest extends TeaModel {
    @NameInMap("DbTypes")
    public String dbTypes;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Sorter")
    public String sorter;

    public static DescribeOmsEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointsRequest self = new DescribeOmsEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointsRequest setDbTypes(String dbTypes) {
        this.dbTypes = dbTypes;
        return this;
    }
    public String getDbTypes() {
        return this.dbTypes;
    }

    public DescribeOmsEndpointsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOmsEndpointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsEndpointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsEndpointsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeOmsEndpointsRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

}
