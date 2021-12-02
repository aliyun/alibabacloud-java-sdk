// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpNetworksResponseBody extends TeaModel {
    @NameInMap("BgpNetworks")
    public DescribeBgpNetworksResponseBodyBgpNetworks bgpNetworks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBgpNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpNetworksResponseBody self = new DescribeBgpNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpNetworksResponseBody setBgpNetworks(DescribeBgpNetworksResponseBodyBgpNetworks bgpNetworks) {
        this.bgpNetworks = bgpNetworks;
        return this;
    }
    public DescribeBgpNetworksResponseBodyBgpNetworks getBgpNetworks() {
        return this.bgpNetworks;
    }

    public DescribeBgpNetworksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpNetworksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpNetworksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork extends TeaModel {
        @NameInMap("DstCidrBlock")
        public String dstCidrBlock;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork self = new DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeBgpNetworksResponseBodyBgpNetworks extends TeaModel {
        @NameInMap("BgpNetwork")
        public java.util.List<DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork> bgpNetwork;

        public static DescribeBgpNetworksResponseBodyBgpNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpNetworksResponseBodyBgpNetworks self = new DescribeBgpNetworksResponseBodyBgpNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeBgpNetworksResponseBodyBgpNetworks setBgpNetwork(java.util.List<DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork> bgpNetwork) {
            this.bgpNetwork = bgpNetwork;
            return this;
        }
        public java.util.List<DescribeBgpNetworksResponseBodyBgpNetworksBgpNetwork> getBgpNetwork() {
            return this.bgpNetwork;
        }

    }

}
