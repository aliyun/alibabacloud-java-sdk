// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddSceneRequest extends TeaModel {
    @NameInMap("CustomerUid")
    public String customerUid;

    // 场景名称
    @NameInMap("Name")
    public String name;

    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 场景类型 3D模型：MODEL_3D  全景图片：PIC  全景视频：VIDEO 混合：MIX
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
