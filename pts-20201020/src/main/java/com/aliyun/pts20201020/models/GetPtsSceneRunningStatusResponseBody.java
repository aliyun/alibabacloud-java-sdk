// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsSceneRunningStatusResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the operation is successful, this parameter is not returned</p>
     * 
     * <strong>example:</strong>
     * <p>4001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the scenario was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-01 16:05:56</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The request status code. If the operation is successful, this parameter is not returned</p>
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
     * <p>The last modification time of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03-26 16:03:56</p>
     */
    @NameInMap("ModifiedTime")
    public String modifiedTime;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E3177-6745-4925-B423-4E89VV34221A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the scenario.</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <p>The status of the scenario. Valid values:</p>
     * <ul>
     * <li>CREATED</li>
     * <li>SYNCING</li>
     * <li>SYNC_DONE</li>
     * <li>UPLOADING</li>
     * <li>UPLOADED</li>
     * <li>PREPARING</li>
     * <li>READY</li>
     * <li>RUNNING</li>
     * <li>STOPPING</li>
     * <li>STOPPED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

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

    public static GetPtsSceneRunningStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPtsSceneRunningStatusResponseBody self = new GetPtsSceneRunningStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPtsSceneRunningStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPtsSceneRunningStatusResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetPtsSceneRunningStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPtsSceneRunningStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPtsSceneRunningStatusResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public GetPtsSceneRunningStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPtsSceneRunningStatusResponseBody setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public GetPtsSceneRunningStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetPtsSceneRunningStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
