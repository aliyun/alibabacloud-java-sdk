// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****994-cn-qingdao</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the instance. Valid values:</p>
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
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****998-cn-qingdao</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The type of the template. Valid values:</p>
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

    public static UnbindTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindTemplateRequest self = new UnbindTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UnbindTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public UnbindTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UnbindTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
