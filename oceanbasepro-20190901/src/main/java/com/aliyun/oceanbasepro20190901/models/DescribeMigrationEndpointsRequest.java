// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMigrationEndpointsRequest extends TeaModel {
    @NameInMap("EndpointIds")
    public String endpointIds;

    @NameInMap("EndpointName")
    public String endpointName;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMigrationEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationEndpointsRequest self = new DescribeMigrationEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationEndpointsRequest setEndpointIds(String endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public String getEndpointIds() {
        return this.endpointIds;
    }

    public DescribeMigrationEndpointsRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public DescribeMigrationEndpointsRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public DescribeMigrationEndpointsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMigrationEndpointsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
