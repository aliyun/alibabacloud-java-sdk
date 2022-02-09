// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointsV2Request extends TeaModel {
    @NameInMap("DbTypes")
    public String dbTypes;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Sorter")
    public String sorter;

    public static DescribeOmsEndpointsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointsV2Request self = new DescribeOmsEndpointsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointsV2Request setDbTypes(String dbTypes) {
        this.dbTypes = dbTypes;
        return this;
    }
    public String getDbTypes() {
        return this.dbTypes;
    }

    public DescribeOmsEndpointsV2Request setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOmsEndpointsV2Request setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsEndpointsV2Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsEndpointsV2Request setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeOmsEndpointsV2Request setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

}
