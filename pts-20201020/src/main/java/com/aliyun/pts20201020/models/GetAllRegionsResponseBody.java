// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponseBody extends TeaModel {
    @NameInMap("AllRegions")
    public java.util.Map<String, String> allRegions;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAllRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegionsResponseBody self = new GetAllRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllRegionsResponseBody setAllRegions(java.util.Map<String, String> allRegions) {
        this.allRegions = allRegions;
        return this;
    }
    public java.util.Map<String, String> getAllRegions() {
        return this.allRegions;
    }

    public GetAllRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAllRegionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAllRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
