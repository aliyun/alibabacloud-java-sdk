// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatTableIds")
    public CreateNatGatewayResponseBodySnatTableIds snatTableIds;

    @NameInMap("ForwardTableIds")
    public CreateNatGatewayResponseBodyForwardTableIds forwardTableIds;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNatGatewayResponseBody setSnatTableIds(CreateNatGatewayResponseBodySnatTableIds snatTableIds) {
        this.snatTableIds = snatTableIds;
        return this;
    }
    public CreateNatGatewayResponseBodySnatTableIds getSnatTableIds() {
        return this.snatTableIds;
    }

    public CreateNatGatewayResponseBody setForwardTableIds(CreateNatGatewayResponseBodyForwardTableIds forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public CreateNatGatewayResponseBodyForwardTableIds getForwardTableIds() {
        return this.forwardTableIds;
    }

    public CreateNatGatewayResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static class CreateNatGatewayResponseBodySnatTableIds extends TeaModel {
        @NameInMap("SnatTableId")
        public java.util.List<String> snatTableId;

        public static CreateNatGatewayResponseBodySnatTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBodySnatTableIds self = new CreateNatGatewayResponseBodySnatTableIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBodySnatTableIds setSnatTableId(java.util.List<String> snatTableId) {
            this.snatTableId = snatTableId;
            return this;
        }
        public java.util.List<String> getSnatTableId() {
            return this.snatTableId;
        }

    }

    public static class CreateNatGatewayResponseBodyForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        public java.util.List<String> forwardTableId;

        public static CreateNatGatewayResponseBodyForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBodyForwardTableIds self = new CreateNatGatewayResponseBodyForwardTableIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBodyForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

}
