// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateNetworkOptimizationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("NetworkOptId")
    public String networkOptId;

    @NameInMap("Name")
    public String name;

    public static CreateNetworkOptimizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkOptimizationResponseBody self = new CreateNetworkOptimizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNetworkOptimizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNetworkOptimizationResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateNetworkOptimizationResponseBody setNetworkOptId(String networkOptId) {
        this.networkOptId = networkOptId;
        return this;
    }
    public String getNetworkOptId() {
        return this.networkOptId;
    }

    public CreateNetworkOptimizationResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
