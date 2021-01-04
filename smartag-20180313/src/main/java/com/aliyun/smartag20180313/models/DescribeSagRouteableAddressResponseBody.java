// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagRouteableAddressResponseBody extends TeaModel {
    @NameInMap("Origin")
    public String origin;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteableAddress")
    public String routeableAddress;

    public static DescribeSagRouteableAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagRouteableAddressResponseBody self = new DescribeSagRouteableAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagRouteableAddressResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeSagRouteableAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagRouteableAddressResponseBody setRouteableAddress(String routeableAddress) {
        this.routeableAddress = routeableAddress;
        return this;
    }
    public String getRouteableAddress() {
        return this.routeableAddress;
    }

}
