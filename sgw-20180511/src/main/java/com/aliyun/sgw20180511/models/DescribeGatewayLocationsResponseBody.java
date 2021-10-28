// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLocationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Locations")
    public String locations;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayLocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLocationsResponseBody self = new DescribeGatewayLocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLocationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayLocationsResponseBody setLocations(String locations) {
        this.locations = locations;
        return this;
    }
    public String getLocations() {
        return this.locations;
    }

    public DescribeGatewayLocationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayLocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayLocationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
