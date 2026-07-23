// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobFeatureReportsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. To obtain the ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The item ID used for feature comparison.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9010</p>
     */
    @NameInMap("LogItemId")
    public String logItemId;

    /**
     * <p>The request ID used for feature comparison.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
    @NameInMap("LogRequestId")
    public String logRequestId;

    /**
     * <p>The user ID used for feature comparison.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1010</p>
     */
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
