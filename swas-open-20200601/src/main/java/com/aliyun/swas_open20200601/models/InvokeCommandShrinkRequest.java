// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class InvokeCommandShrinkRequest extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Parameters")
    public String parametersShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Username")
    public String username;

    public static InvokeCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeCommandShrinkRequest self = new InvokeCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InvokeCommandShrinkRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public InvokeCommandShrinkRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public InvokeCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public InvokeCommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InvokeCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
