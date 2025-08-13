// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckUsageVariableResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether it was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public Boolean resultObject;

    public static CheckUsageVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUsageVariableResponseBody self = new CheckUsageVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUsageVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUsageVariableResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
