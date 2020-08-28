// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter;

    public static DescribeVirtualBorderRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersRequest self = new DescribeVirtualBorderRoutersRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeVirtualBorderRoutersRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribeVirtualBorderRoutersRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersRequestFilter self = new DescribeVirtualBorderRoutersRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
