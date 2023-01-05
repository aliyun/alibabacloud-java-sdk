// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTagGroupsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScriptId")
    public String scriptId;

    @NameInMap("TagGroups")
    public String tagGroups;

    @NameInMap("Tags")
    public String tags;

    public static ModifyTagGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagGroupsRequest self = new ModifyTagGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTagGroupsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyTagGroupsRequest setTagGroups(String tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }
    public String getTagGroups() {
        return this.tagGroups;
    }

    public ModifyTagGroupsRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
