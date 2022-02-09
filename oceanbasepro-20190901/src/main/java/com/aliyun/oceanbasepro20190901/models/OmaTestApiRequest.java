// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaTestApiRequest extends TeaModel {
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

    public static OmaTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        OmaTestApiRequest self = new OmaTestApiRequest();
        return TeaModel.build(map, self);
    }

    public OmaTestApiRequest setDbTypes(String dbTypes) {
        this.dbTypes = dbTypes;
        return this;
    }
    public String getDbTypes() {
        return this.dbTypes;
    }

    public OmaTestApiRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public OmaTestApiRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public OmaTestApiRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OmaTestApiRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public OmaTestApiRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

}
