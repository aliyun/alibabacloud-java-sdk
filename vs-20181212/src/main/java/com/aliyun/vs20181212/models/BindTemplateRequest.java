// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindTemplateRequest extends TeaModel {
    /**
     * <p>Whether to apply the template to all streams in the scope. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ApplyAll")
    public Boolean applyAll;

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
     * <p>Whether to replace an existing binding. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Replace")
    public Boolean replace;

    /**
     * <p>The ID of the template.</p>
     * <p>This parameter is required.</p>
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

    public static BindTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        BindTemplateRequest self = new BindTemplateRequest();
        return TeaModel.build(map, self);
    }

    public BindTemplateRequest setApplyAll(Boolean applyAll) {
        this.applyAll = applyAll;
        return this;
    }
    public Boolean getApplyAll() {
        return this.applyAll;
    }

    public BindTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BindTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public BindTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindTemplateRequest setReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    public Boolean getReplace() {
        return this.replace;
    }

    public BindTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public BindTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
