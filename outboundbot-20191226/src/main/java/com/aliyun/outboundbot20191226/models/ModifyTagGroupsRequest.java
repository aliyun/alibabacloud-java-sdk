// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyTagGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd560e89-0459-4c8a-ad98-47d713e4abd6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>365b955d-6f4d-4ab5-a6e1-9a301307f4b1</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The tag groups to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;TagName&quot;:&quot;111&quot;,&quot;TagGroup&quot;:&quot;多层次&quot;,&quot;ScriptId&quot;:&quot;b4d0dcc8-892d-4323-8c9d-3568e5faa62f&quot;,&quot;showInput&quot;:true,&quot;Id&quot;:&quot;a683fa32-91c5-457e-9ddf-aa8549d14ce0&quot;}]</p>
     */
    @NameInMap("TagGroups")
    public String tagGroups;

    /**
     * <p>The list of tags.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;TagGroup&quot;:&quot;多层次&quot;,&quot;ScriptId&quot;:&quot;b4d0dcc8-892d-43234-987c9d-3568e5faa62f&quot;,&quot;TagGroupIndex&quot;:0,&quot;Id&quot;:&quot;56728a30-c392-453a-a287-31af8301150f&quot;}]</p>
     */
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
