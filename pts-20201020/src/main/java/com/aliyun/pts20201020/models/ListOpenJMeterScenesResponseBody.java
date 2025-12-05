// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListOpenJMeterScenesResponseBody extends TeaModel {
    /**
     * <p>The system status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The scenarios.</p>
     */
    @NameInMap("JMeterScene")
    public java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> JMeterScene;

    /**
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of returned scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
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
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListOpenJMeterScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenJMeterScenesResponseBody self = new ListOpenJMeterScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenJMeterScenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOpenJMeterScenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOpenJMeterScenesResponseBody setJMeterScene(java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> JMeterScene) {
        this.JMeterScene = JMeterScene;
        return this;
    }
    public java.util.List<ListOpenJMeterScenesResponseBodyJMeterScene> getJMeterScene() {
        return this.JMeterScene;
    }

    public ListOpenJMeterScenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOpenJMeterScenesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOpenJMeterScenesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOpenJMeterScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenJMeterScenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOpenJMeterScenesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListOpenJMeterScenesResponseBodyJMeterScene extends TeaModel {
        /**
         * <p>The stress testing duration.</p>
         * 
         * <strong>example:</strong>
         * <p>10分钟</p>
         */
        @NameInMap("DurationStr")
        public String durationStr;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DYYPZIH</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the scenario. Valid values:</p>
         * <ul>
         * <li>PREPARING: The scenario is being prepared.</li>
         * <li>PREPARED: The scenario has been prepared.</li>
         * <li>STARTING: The scenario is starting.</li>
         * <li>RUNNING: The scenario is running.</li>
         * <li>STOPPING: The scenario is being stopped.</li>
         * <li>STOPPED: The scenario waits for startup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOPPED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListOpenJMeterScenesResponseBodyJMeterScene build(java.util.Map<String, ?> map) throws Exception {
            ListOpenJMeterScenesResponseBodyJMeterScene self = new ListOpenJMeterScenesResponseBodyJMeterScene();
            return TeaModel.build(map, self);
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setDurationStr(String durationStr) {
            this.durationStr = durationStr;
            return this;
        }
        public String getDurationStr() {
            return this.durationStr;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListOpenJMeterScenesResponseBodyJMeterScene setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
