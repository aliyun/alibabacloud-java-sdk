// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    // The number of bound servers.
    @NameInMap("BindCount")
    public Integer bindCount;

    // The shortage in the quota for cores of servers that can be protected.
    @NameInMap("InsufficientCoreCount")
    public Integer insufficientCoreCount;

    // The shortage in the quota for servers that can be protected.
    @NameInMap("InsufficientEcsCount")
    public Integer insufficientEcsCount;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The status code that indicates the result. Valid values:
    // 
    // *   **0**: The servers are bound to or unbound from Security Center.
    // *   **1**: The values that you specified for the parameters are invalid.
    // *   **2**: The quota for servers that can be protected is insufficient.
    // *   **3**: The quota for cores of servers that can be protected is insufficient.
    @NameInMap("ResultCode")
    public Integer resultCode;

    // The number of unbound servers.
    @NameInMap("UnBindCount")
    public Integer unBindCount;

    public static BindAuthToMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAuthToMachineResponseBody self = new BindAuthToMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAuthToMachineResponseBody setBindCount(Integer bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Integer getBindCount() {
        return this.bindCount;
    }

    public BindAuthToMachineResponseBody setInsufficientCoreCount(Integer insufficientCoreCount) {
        this.insufficientCoreCount = insufficientCoreCount;
        return this;
    }
    public Integer getInsufficientCoreCount() {
        return this.insufficientCoreCount;
    }

    public BindAuthToMachineResponseBody setInsufficientEcsCount(Integer insufficientEcsCount) {
        this.insufficientEcsCount = insufficientEcsCount;
        return this;
    }
    public Integer getInsufficientEcsCount() {
        return this.insufficientEcsCount;
    }

    public BindAuthToMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAuthToMachineResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public BindAuthToMachineResponseBody setUnBindCount(Integer unBindCount) {
        this.unBindCount = unBindCount;
        return this;
    }
    public Integer getUnBindCount() {
        return this.unBindCount;
    }

}
