// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHotspotAnalysisResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetHotspotAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotAnalysisResponseBody self = new GetHotspotAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotspotAnalysisResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetHotspotAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotAnalysisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
