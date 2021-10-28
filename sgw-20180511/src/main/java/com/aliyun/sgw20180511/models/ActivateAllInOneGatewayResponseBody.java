// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ActivateAllInOneGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("LicenseContent")
    public String licenseContent;

    @NameInMap("Message")
    public String message;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ActivateAllInOneGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateAllInOneGatewayResponseBody self = new ActivateAllInOneGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateAllInOneGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActivateAllInOneGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ActivateAllInOneGatewayResponseBody setLicenseContent(String licenseContent) {
        this.licenseContent = licenseContent;
        return this;
    }
    public String getLicenseContent() {
        return this.licenseContent;
    }

    public ActivateAllInOneGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActivateAllInOneGatewayResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ActivateAllInOneGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivateAllInOneGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
