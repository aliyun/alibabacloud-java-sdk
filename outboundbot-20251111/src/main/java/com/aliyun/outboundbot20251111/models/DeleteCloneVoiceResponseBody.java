// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteCloneVoiceResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=outb003</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCloneVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloneVoiceResponseBody self = new DeleteCloneVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloneVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCloneVoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteCloneVoiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteCloneVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCloneVoiceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DeleteCloneVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCloneVoiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
