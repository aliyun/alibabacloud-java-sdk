// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C78E2AD2-5985-515B-BAD2-31A248AFC263</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogResponseBody self = new GetLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetLogResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
