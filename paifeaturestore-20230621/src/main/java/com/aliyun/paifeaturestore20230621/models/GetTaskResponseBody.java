// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The task configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;mode&quot;: &quot;overwrite&quot;,
     *     &quot;partitions&quot;: {
     *         &quot;dt&quot;: &quot;20230820&quot;
     *     },
     *     &quot;event_time&quot;: &quot;&quot;,
     *     &quot;config&quot;: {},
     *     &quot;offline_to_online&quot;: true
     * }</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The execution time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtExecutedTime")
    public String gmtExecutedTime;

    /**
     * <p>The completion time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtFinishedTime")
    public String gmtFinishedTime;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-04T11:26:09.036+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The ID of the target object.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The type of the target object.</p>
     * <ul>
     * <li><p>ModelFeature: model feature</p>
     * </li>
     * <li><p>FeatureView: feature view</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ModelFeature</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The project name.</p>
     * 
     * <strong>example:</strong>
     * <p>project_1</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>37D19490-AB69-567D-A852-407C94E510E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task runtime configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>DROP TABLE IF EXISTS public.fsxxx</p>
     */
    @NameInMap("RunningConfig")
    public String runningConfig;

    /**
     * <p>The status of the task.</p>
     * <ul>
     * <li><p>Initializing: The task is initializing.</p>
     * </li>
     * <li><p>Running: The task is running.</p>
     * </li>
     * <li><p>Success: The task completed successfully.</p>
     * </li>
     * <li><p>Failure: The task failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task type.</p>
     * <ul>
     * <li><p>OfflineToOnline: offline-to-online data synchronization</p>
     * </li>
     * <li><p>ExportTrainingSet: training sample table export</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OfflineToOnline</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetTaskResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTaskResponseBody setGmtExecutedTime(String gmtExecutedTime) {
        this.gmtExecutedTime = gmtExecutedTime;
        return this;
    }
    public String getGmtExecutedTime() {
        return this.gmtExecutedTime;
    }

    public GetTaskResponseBody setGmtFinishedTime(String gmtFinishedTime) {
        this.gmtFinishedTime = gmtFinishedTime;
        return this;
    }
    public String getGmtFinishedTime() {
        return this.gmtFinishedTime;
    }

    public GetTaskResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetTaskResponseBody setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public GetTaskResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public GetTaskResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetTaskResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setRunningConfig(String runningConfig) {
        this.runningConfig = runningConfig;
        return this;
    }
    public String getRunningConfig() {
        return this.runningConfig;
    }

    public GetTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTaskResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
