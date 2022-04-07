// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeEipResourcesRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeEipResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipResourcesRequest self = new DescribeEipResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipResourcesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeEipResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipResourcesRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
