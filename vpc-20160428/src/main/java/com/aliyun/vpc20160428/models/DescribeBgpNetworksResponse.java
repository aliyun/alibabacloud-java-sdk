// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpNetworksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BgpNetworks")
    @Validation(required = true)
    public DescribeBgpNetworksResponseBgpNetworks bgpNetworks;

    public static DescribeBgpNetworksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpNetworksResponse self = new DescribeBgpNetworksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpNetworksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpNetworksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBgpNetworksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpNetworksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpNetworksResponse setBgpNetworks(DescribeBgpNetworksResponseBgpNetworks bgpNetworks) {
        this.bgpNetworks = bgpNetworks;
        return this;
    }
    public DescribeBgpNetworksResponseBgpNetworks getBgpNetworks() {
        return this.bgpNetworks;
    }

    public static class DescribeBgpNetworksResponseBgpNetworksBgpNetwork extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("DstCidrBlock")
        @Validation(required = true)
        public String dstCidrBlock;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeBgpNetworksResponseBgpNetworksBgpNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpNetworksResponseBgpNetworksBgpNetwork self = new DescribeBgpNetworksResponseBgpNetworksBgpNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeBgpNetworksResponseBgpNetworksBgpNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeBgpNetworksResponseBgpNetworksBgpNetwork setDstCidrBlock(String dstCidrBlock) {
            this.dstCidrBlock = dstCidrBlock;
            return this;
        }
        public String getDstCidrBlock() {
            return this.dstCidrBlock;
        }

        public DescribeBgpNetworksResponseBgpNetworksBgpNetwork setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpNetworksResponseBgpNetworksBgpNetwork setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBgpNetworksResponseBgpNetworks extends TeaModel {
        @NameInMap("BgpNetwork")
        @Validation(required = true)
        public java.util.List<DescribeBgpNetworksResponseBgpNetworksBgpNetwork> bgpNetwork;

        public static DescribeBgpNetworksResponseBgpNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpNetworksResponseBgpNetworks self = new DescribeBgpNetworksResponseBgpNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeBgpNetworksResponseBgpNetworks setBgpNetwork(java.util.List<DescribeBgpNetworksResponseBgpNetworksBgpNetwork> bgpNetwork) {
            this.bgpNetwork = bgpNetwork;
            return this;
        }
        public java.util.List<DescribeBgpNetworksResponseBgpNetworksBgpNetwork> getBgpNetwork() {
            return this.bgpNetwork;
        }

    }

}
