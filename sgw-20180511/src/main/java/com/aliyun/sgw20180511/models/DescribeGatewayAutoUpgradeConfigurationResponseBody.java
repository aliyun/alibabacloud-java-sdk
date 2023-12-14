// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAutoUpgradeConfigurationResponseBody extends TeaModel {
    @NameInMap("AutoUpgradeEndHour")
    public Integer autoUpgradeEndHour;

    @NameInMap("AutoUpgradeStartHour")
    public Integer autoUpgradeStartHour;

    @NameInMap("Code")
    public String code;

    @NameInMap("IsAutoUpgrade")
    public Boolean isAutoUpgrade;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayAutoUpgradeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAutoUpgradeConfigurationResponseBody self = new DescribeGatewayAutoUpgradeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setAutoUpgradeEndHour(Integer autoUpgradeEndHour) {
        this.autoUpgradeEndHour = autoUpgradeEndHour;
        return this;
    }
    public Integer getAutoUpgradeEndHour() {
        return this.autoUpgradeEndHour;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setAutoUpgradeStartHour(Integer autoUpgradeStartHour) {
        this.autoUpgradeStartHour = autoUpgradeStartHour;
        return this;
    }
    public Integer getAutoUpgradeStartHour() {
        return this.autoUpgradeStartHour;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setIsAutoUpgrade(Boolean isAutoUpgrade) {
        this.isAutoUpgrade = isAutoUpgrade;
        return this;
    }
    public Boolean getIsAutoUpgrade() {
        return this.isAutoUpgrade;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayAutoUpgradeConfigurationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
