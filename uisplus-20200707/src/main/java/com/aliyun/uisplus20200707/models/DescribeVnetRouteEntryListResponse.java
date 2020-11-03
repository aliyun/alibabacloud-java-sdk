// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeVnetRouteEntryListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Vnets")
    @Validation(required = true)
    public java.util.List<DescribeVnetRouteEntryListResponseVnets> vnets;

    public static DescribeVnetRouteEntryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVnetRouteEntryListResponse self = new DescribeVnetRouteEntryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVnetRouteEntryListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVnetRouteEntryListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVnetRouteEntryListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVnetRouteEntryListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVnetRouteEntryListResponse setVnets(java.util.List<DescribeVnetRouteEntryListResponseVnets> vnets) {
        this.vnets = vnets;
        return this;
    }
    public java.util.List<DescribeVnetRouteEntryListResponseVnets> getVnets() {
        return this.vnets;
    }

    public static class DescribeVnetRouteEntryListResponseVnets extends TeaModel {
        @NameInMap("UisId")
        @Validation(required = true)
        public String uisId;

        @NameInMap("VnetId")
        @Validation(required = true)
        public String vnetId;

        @NameInMap("Destination")
        @Validation(required = true)
        public String destination;

        @NameInMap("NexthopType")
        @Validation(required = true)
        public String nexthopType;

        @NameInMap("Nexthop")
        @Validation(required = true)
        public String nexthop;

        public static DescribeVnetRouteEntryListResponseVnets build(java.util.Map<String, ?> map) throws Exception {
            DescribeVnetRouteEntryListResponseVnets self = new DescribeVnetRouteEntryListResponseVnets();
            return TeaModel.build(map, self);
        }

        public DescribeVnetRouteEntryListResponseVnets setUisId(String uisId) {
            this.uisId = uisId;
            return this;
        }
        public String getUisId() {
            return this.uisId;
        }

        public DescribeVnetRouteEntryListResponseVnets setVnetId(String vnetId) {
            this.vnetId = vnetId;
            return this;
        }
        public String getVnetId() {
            return this.vnetId;
        }

        public DescribeVnetRouteEntryListResponseVnets setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public DescribeVnetRouteEntryListResponseVnets setNexthopType(String nexthopType) {
            this.nexthopType = nexthopType;
            return this;
        }
        public String getNexthopType() {
            return this.nexthopType;
        }

        public DescribeVnetRouteEntryListResponseVnets setNexthop(String nexthop) {
            this.nexthop = nexthop;
            return this;
        }
        public String getNexthop() {
            return this.nexthop;
        }

    }

}
