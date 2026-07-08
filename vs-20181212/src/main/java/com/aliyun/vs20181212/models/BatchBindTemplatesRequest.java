// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplatesRequest extends TeaModel {
    /**
     * <p>Specifies whether to apply the template to all streams in the scope. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ApplyAll")
    public Boolean applyAll;

    /**
     * <p>The instance ID.</p>
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
     * <p>stream</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to replace existing bindings. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Replace")
    public Boolean replace;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****998-cn-qingdao</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li><p>record (recording)</p>
     * </li>
     * <li><p>snapshot (snapshotting)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>timeshift</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static BatchBindTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplatesRequest self = new BatchBindTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplatesRequest setApplyAll(Boolean applyAll) {
        this.applyAll = applyAll;
        return this;
    }
    public Boolean getApplyAll() {
        return this.applyAll;
    }

    public BatchBindTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchBindTemplatesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public BatchBindTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchBindTemplatesRequest setReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    public Boolean getReplace() {
        return this.replace;
    }

    public BatchBindTemplatesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public BatchBindTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
