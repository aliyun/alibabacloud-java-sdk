// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("Status")
    public String status;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tag")
    public java.util.List<DescribeVpnGatewaysRequestTag> tag;

    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    public static DescribeVpnGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewaysRequest self = new DescribeVpnGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public static class DescribeVpnGatewaysRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpnGatewaysRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewaysRequestTag self = new DescribeVpnGatewaysRequestTag();
            return TeaModel.build(map, self);
        }

    }

}
