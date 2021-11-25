// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeCameraForInstanceRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 当前页序号
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 每页显示多少条数据
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeCameraForInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCameraForInstanceRequest self = new DescribeCameraForInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCameraForInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCameraForInstanceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCameraForInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
