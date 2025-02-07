// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOpenStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;gmtModified&quot;:&quot;2021-07-27T04:00:00.000+00:00&quot;,&quot;mpStatus&quot;:1,&quot;id&quot;:11,&quot;pk&quot;:&quot;1084126944995576&quot;,&quot;gmtCreate&quot;:&quot;2021-07-27T04:00:00.000+00:00&quot;,&quot;parentPk&quot;:&quot;1084126944995576&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EB-FCAC-1B78-BBB8-500ED951E9EB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpenStatusResponseBody self = new GetOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpenStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetOpenStatusResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetOpenStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpenStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
