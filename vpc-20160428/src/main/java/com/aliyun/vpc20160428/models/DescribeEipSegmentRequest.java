// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipSegmentRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SegmentInstanceId")
    public String segmentInstanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeEipSegmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipSegmentRequest self = new DescribeEipSegmentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipSegmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeEipSegmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEipSegmentRequest setSegmentInstanceId(String segmentInstanceId) {
        this.segmentInstanceId = segmentInstanceId;
        return this;
    }
    public String getSegmentInstanceId() {
        return this.segmentInstanceId;
    }

    public DescribeEipSegmentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipSegmentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
