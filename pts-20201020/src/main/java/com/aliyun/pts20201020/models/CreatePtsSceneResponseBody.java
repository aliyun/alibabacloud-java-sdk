// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the request was successful, no data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. If the request was successful, no data is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
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
     * <p>4F7D2CE0-AE4C-4143-955A-8E4595AF86A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>SDR3CX</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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

    public static CreatePtsSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePtsSceneResponseBody self = new CreatePtsSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePtsSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePtsSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePtsSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePtsSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePtsSceneResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreatePtsSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
