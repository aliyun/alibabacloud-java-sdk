// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateIPv6TranslatorResponseBody extends TeaModel {
    /**
     * <p>The ID of the IPv6 Translation Service instance.</p>
     */
    @NameInMap("Ipv6TranslatorId")
    public String ipv6TranslatorId;

    /**
     * <p>The name of the IPv6 Translation Service instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specification of the IPv6 Translation Service instance.</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static CreateIPv6TranslatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIPv6TranslatorResponseBody self = new CreateIPv6TranslatorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIPv6TranslatorResponseBody setIpv6TranslatorId(String ipv6TranslatorId) {
        this.ipv6TranslatorId = ipv6TranslatorId;
        return this;
    }
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
    }

    public CreateIPv6TranslatorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIPv6TranslatorResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateIPv6TranslatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIPv6TranslatorResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
