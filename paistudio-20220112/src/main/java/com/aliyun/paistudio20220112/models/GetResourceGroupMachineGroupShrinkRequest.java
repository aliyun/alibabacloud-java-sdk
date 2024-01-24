// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupMachineGroupShrinkRequest extends TeaModel {
    @NameInMap("Tag")
    public String tagShrink;

    public static GetResourceGroupMachineGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupMachineGroupShrinkRequest self = new GetResourceGroupMachineGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupMachineGroupShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
