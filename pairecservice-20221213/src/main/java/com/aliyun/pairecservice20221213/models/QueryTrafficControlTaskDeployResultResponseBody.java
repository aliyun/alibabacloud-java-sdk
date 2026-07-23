// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskDeployResultResponseBody extends TeaModel {
    /**
     * <p>The message returned for the Flink platform deployment operation.</p>
     * 
     * <strong>example:</strong>
     * <p>deploy job draft success</p>
     */
    @NameInMap("DeployMessage")
    public String deployMessage;

    /**
     * <p>The status of deploying the draft. Valid values:</p>
     * <ul>
     * <li>Failed: failed.</li>
     * <li>Running: running.</li>
     * <li>Success: succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("DeployStatus")
    public String deployStatus;

    /**
     * <p>The message returned for pushing the draft to Flink.</p>
     * 
     * <strong>example:</strong>
     * <p>push draft success</p>
     */
    @NameInMap("DraftMessage")
    public String draftMessage;

    /**
     * <p>The status of pushing the draft to Flink. Valid values:</p>
     * <ul>
     * <li>Failed: failed.</li>
     * <li>Running: running.</li>
     * <li>Success: succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("DraftStatus")
    public String draftStatus;

    /**
     * <p>The message returned for the preparation phase.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("PrepareMessage")
    public String prepareMessage;

    /**
     * <p>The status of the preparation phase. Valid values:</p>
     * <ul>
     * <li>Failed: failed.</li>
     * <li>Running: running.</li>
     * <li>Success: succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("PrepareStatus")
    public String prepareStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The message returned for starting the Flink task.</p>
     * 
     * <strong>example:</strong>
     * <p>start job success</p>
     */
    @NameInMap("StartMessage")
    public String startMessage;

    /**
     * <p>The status of starting the Flink task. Valid values:</p>
     * <ul>
     * <li>Failed: failed.</li>
     * <li>Running: running.</li>
     * <li>Success: succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("StartStatus")
    public String startStatus;

    /**
     * <p>The stop details.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("StopMessage")
    public String stopMessage;

    /**
     * <p>The stop status.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("StopStatus")
    public String stopStatus;

    /**
     * <p>The traffic control task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    public static QueryTrafficControlTaskDeployResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTrafficControlTaskDeployResultResponseBody self = new QueryTrafficControlTaskDeployResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTrafficControlTaskDeployResultResponseBody setDeployMessage(String deployMessage) {
        this.deployMessage = deployMessage;
        return this;
    }
    public String getDeployMessage() {
        return this.deployMessage;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setDeployStatus(String deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }
    public String getDeployStatus() {
        return this.deployStatus;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setDraftMessage(String draftMessage) {
        this.draftMessage = draftMessage;
        return this;
    }
    public String getDraftMessage() {
        return this.draftMessage;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setDraftStatus(String draftStatus) {
        this.draftStatus = draftStatus;
        return this;
    }
    public String getDraftStatus() {
        return this.draftStatus;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setPrepareMessage(String prepareMessage) {
        this.prepareMessage = prepareMessage;
        return this;
    }
    public String getPrepareMessage() {
        return this.prepareMessage;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setPrepareStatus(String prepareStatus) {
        this.prepareStatus = prepareStatus;
        return this;
    }
    public String getPrepareStatus() {
        return this.prepareStatus;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setStartMessage(String startMessage) {
        this.startMessage = startMessage;
        return this;
    }
    public String getStartMessage() {
        return this.startMessage;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setStartStatus(String startStatus) {
        this.startStatus = startStatus;
        return this;
    }
    public String getStartStatus() {
        return this.startStatus;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setStopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
        return this;
    }
    public String getStopMessage() {
        return this.stopMessage;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
        return this;
    }
    public String getStopStatus() {
        return this.stopStatus;
    }

    public QueryTrafficControlTaskDeployResultResponseBody setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

}
