// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckRecallManagementServiceRequest extends TeaModel {
    /**
     * <p>The context parameters.</p>
     */
    @NameInMap("ContextParams")
    public java.util.Map<String, ?> contextParams;

    /**
     * <p>The exposure list.</p>
     */
    @NameInMap("ExposureList")
    public java.util.List<String> exposureList;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>learn-pairec-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The recall management service version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    /**
     * <p>The recall data details.</p>
     */
    @NameInMap("Recalls")
    public java.util.Map<String, ?> recalls;

    /**
     * <p>The retained fields.</p>
     */
    @NameInMap("RetainFields")
    public java.util.List<String> retainFields;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static CheckRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRecallManagementServiceRequest self = new CheckRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public CheckRecallManagementServiceRequest setContextParams(java.util.Map<String, ?> contextParams) {
        this.contextParams = contextParams;
        return this;
    }
    public java.util.Map<String, ?> getContextParams() {
        return this.contextParams;
    }

    public CheckRecallManagementServiceRequest setExposureList(java.util.List<String> exposureList) {
        this.exposureList = exposureList;
        return this;
    }
    public java.util.List<String> getExposureList() {
        return this.exposureList;
    }

    public CheckRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckRecallManagementServiceRequest setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public CheckRecallManagementServiceRequest setRecalls(java.util.Map<String, ?> recalls) {
        this.recalls = recalls;
        return this;
    }
    public java.util.Map<String, ?> getRecalls() {
        return this.recalls;
    }

    public CheckRecallManagementServiceRequest setRetainFields(java.util.List<String> retainFields) {
        this.retainFields = retainFields;
        return this;
    }
    public java.util.List<String> getRetainFields() {
        return this.retainFields;
    }

    public CheckRecallManagementServiceRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
