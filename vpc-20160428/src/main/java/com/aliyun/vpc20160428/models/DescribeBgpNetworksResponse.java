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

    }

    public static class DescribeBgpNetworksResponseBgpNetworks extends TeaModel {
        @NameInMap("BgpNetwork")
        @Validation(required = true)
        public java.util.List<DescribeBgpNetworksResponseBgpNetworksBgpNetwork> bgpNetwork;

        public static DescribeBgpNetworksResponseBgpNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpNetworksResponseBgpNetworks self = new DescribeBgpNetworksResponseBgpNetworks();
            return TeaModel.build(map, self);
        }

    }

}
