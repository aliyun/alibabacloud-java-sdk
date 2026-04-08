// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryTrafficControlTaskDeployResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deploy job draft success</p>
     */
    @NameInMap("DeployMessage")
    public String deployMessage;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("DeployStatus")
    public String deployStatus;

    /**
     * <strong>example:</strong>
     * <p>push draft success</p>
     */
    @NameInMap("DraftMessage")
    public String draftMessage;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("DraftStatus")
    public String draftStatus;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("PrepareMessage")
    public String prepareMessage;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("PrepareStatus")
    public String prepareStatus;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>start job success</p>
     */
    @NameInMap("StartMessage")
    public String startMessage;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("StartStatus")
    public String startStatus;

    /**
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

    public QueryTrafficControlTaskDeployResultResponseBody setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

}
