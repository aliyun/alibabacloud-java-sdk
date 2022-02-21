// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeClustersRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersRequest self = new DescribeClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClustersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeClustersRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeClustersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
