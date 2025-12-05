// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetAllRegionsResponseBody extends TeaModel {
    /**
     * <p>The supported regions.</p>
     */
    @NameInMap("AllRegions")
    public java.util.Map<String, String> allRegions;

    /**
     * <p>The system status code. If the request was successful, no data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, no data is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73D16B8D-0FCD-5596-B7BE-A47042989318</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
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
