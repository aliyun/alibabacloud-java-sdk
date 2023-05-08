// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    @NameInMap("BindCount")
    public Integer bindCount;

    @NameInMap("InsufficientCoreCount")
    public Integer insufficientCoreCount;

    @NameInMap("InsufficientEcsCount")
    public Integer insufficientEcsCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public Integer resultCode;

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
