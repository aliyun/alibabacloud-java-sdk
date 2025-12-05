// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsSceneResponseBody extends TeaModel {
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
     * <p>DD6F2ED8-E31B-497F-85AB-C4E358A5F667</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned scenarios.</p>
     */
    @NameInMap("SceneViewList")
    public java.util.List<ListPtsSceneResponseBodySceneViewList> sceneViewList;

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

    public static ListPtsSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsSceneResponseBody self = new ListPtsSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsSceneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPtsSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsSceneResponseBody setSceneViewList(java.util.List<ListPtsSceneResponseBodySceneViewList> sceneViewList) {
        this.sceneViewList = sceneViewList;
        return this;
    }
    public java.util.List<ListPtsSceneResponseBodySceneViewList> getSceneViewList() {
        return this.sceneViewList;
    }

    public ListPtsSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsSceneResponseBodySceneViewList extends TeaModel {
        /**
         * <p>The time when the PTS scenario was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-26 15:28:39</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DFGVS3S</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scenario name.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the PTS scenario. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Draft WaitStart Debugging Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListPtsSceneResponseBodySceneViewList build(java.util.Map<String, ?> map) throws Exception {
            ListPtsSceneResponseBodySceneViewList self = new ListPtsSceneResponseBodySceneViewList();
            return TeaModel.build(map, self);
        }

        public ListPtsSceneResponseBodySceneViewList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPtsSceneResponseBodySceneViewList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListPtsSceneResponseBodySceneViewList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListPtsSceneResponseBodySceneViewList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
