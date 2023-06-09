// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatGatewayResponseBody extends TeaModel {
    /**
     * <p>The list of DNAT entries.</p>
     */
    @NameInMap("ForwardTableIds")
    public CreateNatGatewayResponseBodyForwardTableIds forwardTableIds;

    /**
     * <p>The list of FULLNAT entries.</p>
     */
    @NameInMap("FullNatTableIds")
    public CreateNatGatewayResponseBodyFullNatTableIds fullNatTableIds;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of SNAT entries.</p>
     */
    @NameInMap("SnatTableIds")
    public CreateNatGatewayResponseBodySnatTableIds snatTableIds;

    public static CreateNatGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayResponseBody self = new CreateNatGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayResponseBody setForwardTableIds(CreateNatGatewayResponseBodyForwardTableIds forwardTableIds) {
        this.forwardTableIds = forwardTableIds;
        return this;
    }
    public CreateNatGatewayResponseBodyForwardTableIds getForwardTableIds() {
        return this.forwardTableIds;
    }

    public CreateNatGatewayResponseBody setFullNatTableIds(CreateNatGatewayResponseBodyFullNatTableIds fullNatTableIds) {
        this.fullNatTableIds = fullNatTableIds;
        return this;
    }
    public CreateNatGatewayResponseBodyFullNatTableIds getFullNatTableIds() {
        return this.fullNatTableIds;
    }

    public CreateNatGatewayResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public static class CreateNatGatewayResponseBodyFullNatTableIds extends TeaModel {
        @NameInMap("FullNatTableId")
        public java.util.List<String> fullNatTableId;

        public static CreateNatGatewayResponseBodyFullNatTableIds build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayResponseBodyFullNatTableIds self = new CreateNatGatewayResponseBodyFullNatTableIds();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayResponseBodyFullNatTableIds setFullNatTableId(java.util.List<String> fullNatTableId) {
            this.fullNatTableId = fullNatTableId;
            return this;
        }
        public java.util.List<String> getFullNatTableId() {
            return this.fullNatTableId;
        }

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

}
