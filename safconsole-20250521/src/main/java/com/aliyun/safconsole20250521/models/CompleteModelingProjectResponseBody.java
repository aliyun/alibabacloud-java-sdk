// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CompleteModelingProjectResponseBody extends TeaModel {
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
     * <p>055f1546-f465-4c92-a2da-bfb86abe6f56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result, indicating whether the creation was successful:</p>
     * <ul>
     * <li>true: Success</li>
     * <li>false: Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ResultObject")
    public String resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
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

    public static CompleteModelingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteModelingProjectResponseBody self = new CompleteModelingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteModelingProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CompleteModelingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompleteModelingProjectResponseBody setResultObject(String resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public String getResultObject() {
        return this.resultObject;
    }

    public CompleteModelingProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
