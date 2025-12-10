// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     * <p>arguments:
     *   parameters:</p>
     * <ul>
     * <li>name: &quot;execution_maxcompute&quot;
     * value:
     *   endpoint: &quot;<a href="http://service.cn-shanghai.maxcompute.aliyun.com/api">http://service.cn-shanghai.maxcompute.aliyun.com/api</a>&quot;
     *   odpsProject: &quot;xxxxxxx&quot;</li>
     * </ul>
     */
    @NameInMap("Arguments")
    public String arguments;

    /**
     * <strong>example:</strong>
     * <p>13266*******76250</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>EXECUTE_TO_HERE</p>
     */
    @NameInMap("ExecuteType")
    public String executeType;

    /**
     * <strong>example:</strong>
     * <p>draft-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>job-6xfhrofqx93y139fg3</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>id-xxxxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>node-5dzotrnwyzfxmbwwc8</p>
     */
    @NameInMap("PaiflowNodeId")
    public String paiflowNodeId;

    /**
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>flow-lcs8ez11961l6urc3m</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>apiVersion: &quot;core/v1&quot;
     * metadata:
     *   version: &quot;v1&quot;
     *   identifier: &quot;1de8f7c8-a9d8-4433-9e87-d95979ccab14&quot;
     *   annotations: {}
     * spec:
     *   inputs:
     *     artifacts: []
     *     parameters:
     *     - name: &quot;execution&quot;
     *       type: &quot;Map&quot;
     *   arguments:
     *     artifacts: []
     *     parameters: []
     *   dependencies: []
     *   initContainers: []
     *   sideCarContainers: []
     *   pipelines:</p>
     * <ul>
     * <li>apiVersion: &quot;core/v1&quot;
     * metadata:
     *   provider: &quot;pai&quot;
     *   name: &quot;id-2d88-1608982098027-91558&quot;
     *   version: &quot;v1&quot;
     *   identifier: &quot;type_transform&quot;
     *   annotations: {}</li>
     * </ul>
     */
    @NameInMap("RunInfo")
    public String runInfo;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Snapshot")
    public String snapshot;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>86995</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public GetJobResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetJobResponseBody setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public GetJobResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetJobResponseBody setPaiflowNodeId(String paiflowNodeId) {
        this.paiflowNodeId = paiflowNodeId;
        return this;
    }
    public String getPaiflowNodeId() {
        return this.paiflowNodeId;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetJobResponseBody setRunInfo(String runInfo) {
        this.runInfo = runInfo;
        return this;
    }
    public String getRunInfo() {
        return this.runInfo;
    }

    public GetJobResponseBody setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public GetJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
