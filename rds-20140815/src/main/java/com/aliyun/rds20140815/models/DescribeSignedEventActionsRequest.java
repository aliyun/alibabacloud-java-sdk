// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSignedEventActionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BeginEventId")
    public Integer beginEventId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSignedEventActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedEventActionsRequest self = new DescribeSignedEventActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSignedEventActionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSignedEventActionsRequest setBeginEventId(Integer beginEventId) {
        this.beginEventId = beginEventId;
        return this;
    }
    public Integer getBeginEventId() {
        return this.beginEventId;
    }

    public DescribeSignedEventActionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
