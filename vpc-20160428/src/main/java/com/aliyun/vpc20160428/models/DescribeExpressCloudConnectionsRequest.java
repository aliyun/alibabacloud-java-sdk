// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressCloudConnectionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Filter")
    public java.util.List<DescribeExpressCloudConnectionsRequestFilter> filter;

    public static DescribeExpressCloudConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressCloudConnectionsRequest self = new DescribeExpressCloudConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeExpressCloudConnectionsRequestFilter extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<String> value;

        public static DescribeExpressCloudConnectionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressCloudConnectionsRequestFilter self = new DescribeExpressCloudConnectionsRequestFilter();
            return TeaModel.build(map, self);
        }

    }

}
