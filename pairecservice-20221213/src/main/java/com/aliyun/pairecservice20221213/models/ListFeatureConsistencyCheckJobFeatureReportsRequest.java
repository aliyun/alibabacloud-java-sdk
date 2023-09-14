// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobFeatureReportsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LogItemId")
    public String logItemId;

    @NameInMap("LogRequestId")
    public String logRequestId;

    @NameInMap("LogUserId")
    public String logUserId;

    public static ListFeatureConsistencyCheckJobFeatureReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobFeatureReportsRequest self = new ListFeatureConsistencyCheckJobFeatureReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobFeatureReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsRequest setLogItemId(String logItemId) {
        this.logItemId = logItemId;
        return this;
    }
    public String getLogItemId() {
        return this.logItemId;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsRequest setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
        return this;
    }
    public String getLogRequestId() {
        return this.logRequestId;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsRequest setLogUserId(String logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public String getLogUserId() {
        return this.logUserId;
    }

}
