// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("ForwardTableIds")
    @Validation(required = true)
    public CreateNatGatewayResponseForwardTableIds forwardTableIds;

    @NameInMap("SnatTableIds")
    @Validation(required = true)
    public CreateNatGatewayResponseSnatTableIds snatTableIds;

    @NameInMap("BandwidthPackageIds")
    @Validation(required = true)
    public CreateNatGatewayResponseBandwidthPackageIds bandwidthPackageIds;

    public static CreateNatGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponse self = new CreateNatGatewayResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateNatGatewayResponseForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static CreateNatGatewayResponseForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseForwardTableIds self = new CreateNatGatewayResponseForwardTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNatGatewayResponseSnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        @Validation(required = true)
        public java.util.List<String> snatTableId;

        public static CreateNatGatewayResponseSnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseSnatTableIds self = new CreateNatGatewayResponseSnatTableIds();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateNatGatewayResponseBandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static CreateNatGatewayResponseBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBandwidthPackageIds self = new CreateNatGatewayResponseBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

    }

}
