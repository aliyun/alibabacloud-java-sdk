// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplateRequest extends TeaModel {
    /**
     * <p>The instance ID. Separate multiple IDs with commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****994-cn-qingdao</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><p>group</p>
     * </li>
     * <li><p>stream</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The template ID. If omitted, all bindings that match the conditions on the instance are detached.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****998-cn-qingdao</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li><p>record</p>
     * </li>
     * <li><p>snapshot</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>record</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static BatchUnbindTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplateRequest self = new BatchUnbindTemplateRequest();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchUnbindTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public BatchUnbindTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchUnbindTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public BatchUnbindTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
