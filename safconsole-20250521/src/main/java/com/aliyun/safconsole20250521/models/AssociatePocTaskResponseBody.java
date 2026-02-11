// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class AssociatePocTaskResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResultObject")
    public Boolean resultObject;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AssociatePocTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociatePocTaskResponseBody self = new AssociatePocTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociatePocTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AssociatePocTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociatePocTaskResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public AssociatePocTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
