// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ExpandGatewayNetworkBandwidthResponseBody extends TeaModel {
    @NameInMap("BuyURL")
    public String buyURL;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static ExpandGatewayNetworkBandwidthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExpandGatewayNetworkBandwidthResponseBody self = new ExpandGatewayNetworkBandwidthResponseBody();
        return TeaModel.build(map, self);
    }

    public ExpandGatewayNetworkBandwidthResponseBody setBuyURL(String buyURL) {
        this.buyURL = buyURL;
        return this;
    }
    public String getBuyURL() {
        return this.buyURL;
    }

    public ExpandGatewayNetworkBandwidthResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExpandGatewayNetworkBandwidthResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExpandGatewayNetworkBandwidthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExpandGatewayNetworkBandwidthResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExpandGatewayNetworkBandwidthResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
