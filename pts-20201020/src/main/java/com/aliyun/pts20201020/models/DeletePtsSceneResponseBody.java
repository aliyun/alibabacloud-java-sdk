// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class DeletePtsSceneResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. If the operation is successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message. If the operation is successful, this parameter is not returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A3ED870E-C3BF-44F4-B460-A30785E0256B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeletePtsSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePtsSceneResponseBody self = new DeletePtsSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePtsSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeletePtsSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeletePtsSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePtsSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePtsSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
