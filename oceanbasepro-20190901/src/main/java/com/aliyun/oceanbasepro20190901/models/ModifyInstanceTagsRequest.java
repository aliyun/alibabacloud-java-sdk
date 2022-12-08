// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTagsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tags")
    public String tags;

    public static ModifyInstanceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTagsRequest self = new ModifyInstanceTagsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceTagsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
