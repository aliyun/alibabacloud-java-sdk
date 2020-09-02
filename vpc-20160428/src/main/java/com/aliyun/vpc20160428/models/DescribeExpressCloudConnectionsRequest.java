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

    public DescribeExpressCloudConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExpressCloudConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExpressCloudConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExpressCloudConnectionsRequest setFilter(java.util.List<DescribeExpressCloudConnectionsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeExpressCloudConnectionsRequestFilter> getFilter() {
        return this.filter;
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

        public DescribeExpressCloudConnectionsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressCloudConnectionsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
