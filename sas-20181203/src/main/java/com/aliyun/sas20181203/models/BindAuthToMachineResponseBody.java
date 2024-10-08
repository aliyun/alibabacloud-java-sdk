// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindAuthToMachineResponseBody extends TeaModel {
    /**
     * <p>The number of bound servers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BindCount")
    public Integer bindCount;

    /**
     * <p>The shortage in the quota for cores of servers that can be protected.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InsufficientCoreCount")
    public Integer insufficientCoreCount;

    /**
     * <p>The shortage in the quota for servers that can be protected.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InsufficientEcsCount")
    public Integer insufficientEcsCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6BA51E212F80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code that indicates the result. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The servers are bound to or unbound from Security Center.</li>
     * <li><strong>1</strong>: The values that you specified for the parameters are invalid.</li>
     * <li><strong>2</strong>: The quota for servers that can be protected is insufficient.</li>
     * <li><strong>3</strong>: The quota for cores of servers that can be protected is insufficient.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ResultCode")
    public Integer resultCode;

    /**
     * <p>The number of unbound servers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
