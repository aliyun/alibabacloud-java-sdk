// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindTemplateRequest extends TeaModel {
    /**
     * <p>Apply to all streams within the scope. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ApplyAll")
    public Boolean applyAll;

    /**
     * <p>Instance ID. Separate multiple values with commas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****994-cn-qingdao</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Instance type. Valid values:</p>
     * <ul>
     * <li><p>group (space)</p>
     * </li>
     * <li><p>stream (stream)</p>
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
     * <p>Replace existing bindings. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Replace")
    public Boolean replace;

    /**
     * <p>Template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>323*****998-cn-qingdao</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static BatchBindTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchBindTemplateRequest self = new BatchBindTemplateRequest();
        return TeaModel.build(map, self);
    }

    public BatchBindTemplateRequest setApplyAll(Boolean applyAll) {
        this.applyAll = applyAll;
        return this;
    }
    public Boolean getApplyAll() {
        return this.applyAll;
    }

    public BatchBindTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchBindTemplateRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public BatchBindTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchBindTemplateRequest setReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }
    public Boolean getReplace() {
        return this.replace;
    }

    public BatchBindTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
