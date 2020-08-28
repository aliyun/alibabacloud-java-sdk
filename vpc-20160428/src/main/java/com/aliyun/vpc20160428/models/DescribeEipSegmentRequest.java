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

}
