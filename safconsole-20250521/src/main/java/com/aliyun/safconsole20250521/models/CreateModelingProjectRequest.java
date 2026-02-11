// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateModelingProjectRequest extends TeaModel {
    /**
     * <p>Instance specification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SECURE_ENV_LITE</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>Project name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Remark.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static CreateModelingProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelingProjectRequest self = new CreateModelingProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelingProjectRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateModelingProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateModelingProjectRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
