// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTaskAssignRuleResponseBody extends TeaModel {
    /**
     * <p>Result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ID of the created rule.</p>
     * 
     * <strong>example:</strong>
     * <p>54</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Error details if the request fails. Returns &quot;successful&quot; on success.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. A value of true means success. A value of false or null means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTaskAssignRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskAssignRuleResponseBody self = new CreateTaskAssignRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTaskAssignRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTaskAssignRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateTaskAssignRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTaskAssignRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTaskAssignRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
