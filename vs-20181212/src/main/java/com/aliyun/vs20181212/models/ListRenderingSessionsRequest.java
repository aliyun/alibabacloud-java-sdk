// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingSessionsRequest extends TeaModel {
    /**
     * <p>Cloud application ID</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Unique ID of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>ae7990f4-203d-494b-a5ea-e0babe9fa13d</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>Time range filter parameter. Represented in ISO8601 standard and must use UTC time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-31T22:20:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Page number, starting from 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows per page set for paged queries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Cloud application patch ID.</p>
     * <ol>
     * <li>When you enter origin, only sessions that started the original version of the app are filtered.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b6a966b063d9d309b4</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>Project ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Cloud application service instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>session-i205217481741918129226</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>Time range filter parameter. Represented in ISO8601 standard and must use UTC time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-25T02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Session state. Valid values:</p>
     * <ol>
     * <li><p>SessionStarting: The session is starting.</p>
     * </li>
     * <li><p>SessionStartSuspended: Session startup is paused. Retry by initiating start again.</p>
     * </li>
     * <li><p>SessionStarted: The session has started/is in use.</p>
     * </li>
     * <li><p>SessionStartFailed: Session startup failed.</p>
     * </li>
     * <li><p>SessionAbnormal: The session is abnormal after successful startup.</p>
     * </li>
     * <li><p>SessionStopping: The session is stopping.</p>
     * </li>
     * <li><p>SessionStopFailed: Session stop failed.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>SessionStarting</p>
     */
    @NameInMap("State")
    public String state;

    public static ListRenderingSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingSessionsRequest self = new ListRenderingSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingSessionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListRenderingSessionsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ListRenderingSessionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRenderingSessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingSessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRenderingSessionsRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public ListRenderingSessionsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListRenderingSessionsRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListRenderingSessionsRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListRenderingSessionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRenderingSessionsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
