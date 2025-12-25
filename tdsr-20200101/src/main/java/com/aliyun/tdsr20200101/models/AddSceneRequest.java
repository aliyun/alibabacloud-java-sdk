// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSceneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2345****</p>
     */
    @NameInMap("CustomerUid")
    public String customerUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MODEL_3D</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSceneRequest self = new AddSceneRequest();
        return TeaModel.build(map, self);
    }

    public AddSceneRequest setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public String getCustomerUid() {
        return this.customerUid;
    }

    public AddSceneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSceneRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddSceneRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
