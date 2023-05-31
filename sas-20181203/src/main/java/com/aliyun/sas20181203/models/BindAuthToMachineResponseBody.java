// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    /**
     * <p>The number of bound servers.</p>
     */
    @NameInMap("BindCount")
    public Integer bindCount;

    /**
     * <p>The shortage in the quota for cores of servers that can be protected.</p>
     */
    @NameInMap("InsufficientCoreCount")
    public Integer insufficientCoreCount;

    /**
     * <p>The shortage in the quota for servers that can be protected.</p>
     */
    @NameInMap("InsufficientEcsCount")
    public Integer insufficientEcsCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code that indicates the result. Valid values:</p>
     * <br>
     * <p>*   **0**: The servers are bound to or unbound from Security Center.</p>
     * <p>*   **1**: The values that you specified for the parameters are invalid.</p>
     * <p>*   **2**: The quota for servers that can be protected is insufficient.</p>
     * <p>*   **3**: The quota for cores of servers that can be protected is insufficient.</p>
     */
    @NameInMap("ResultCode")
    public Integer resultCode;

    /**
     * <p>The number of unbound servers.</p>
     */
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
