// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitScriptReviewRequest extends TeaModel {
    /**
     * <p>Description</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>第一版本提交审核</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Source of review submission</p>
     * 
     * <strong>example:</strong>
     * <p>MAINSITE</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Script ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static SubmitScriptReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitScriptReviewRequest self = new SubmitScriptReviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitScriptReviewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitScriptReviewRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SubmitScriptReviewRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitScriptReviewRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
