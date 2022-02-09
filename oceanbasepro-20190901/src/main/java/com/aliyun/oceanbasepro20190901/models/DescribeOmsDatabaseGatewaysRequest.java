// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsDatabaseGatewaysRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeOmsDatabaseGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsDatabaseGatewaysRequest self = new DescribeOmsDatabaseGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsDatabaseGatewaysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsDatabaseGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
