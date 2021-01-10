// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsDrmDrmResourceTplRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TplId")
    public Long tplId;

    public static DeleteMsDrmDrmResourceTplRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsDrmDrmResourceTplRequest self = new DeleteMsDrmDrmResourceTplRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMsDrmDrmResourceTplRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMsDrmDrmResourceTplRequest setTplId(Long tplId) {
        this.tplId = tplId;
        return this;
    }
    public Long getTplId() {
        return this.tplId;
    }

}
