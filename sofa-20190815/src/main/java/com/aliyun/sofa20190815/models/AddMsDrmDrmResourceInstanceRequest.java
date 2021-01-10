// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDrmResourceInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Params")
    public String params;

    @NameInMap("TplId")
    public Long tplId;

    public static AddMsDrmDrmResourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDrmResourceInstanceRequest self = new AddMsDrmDrmResourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDrmResourceInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsDrmDrmResourceInstanceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public AddMsDrmDrmResourceInstanceRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
