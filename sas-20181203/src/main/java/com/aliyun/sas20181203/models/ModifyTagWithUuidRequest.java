// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidRequest extends TeaModel {
    /**
     * <p>The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: server</li>
     * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the tag that you want to manage.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the IDs of tags.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3897941</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The names of the tags that you want to manage. Separate multiple tag names with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the names of tags.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac,ad</p>
     */
    @NameInMap("TagList")
    public String tagList;

    /**
     * <p>The details of the server for which you want to manage the tag. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>Target</strong>: the UUID of the server that you want to add or remove.</p>
     * </li>
     * <li><p><strong>targetType</strong>: the method by which the server is added. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: by server</li>
     * <li><strong>groupId</strong>: by server group</li>
     * </ul>
     * </li>
     * <li><p><strong>flag</strong>: the operation that you want to perform on the server. Valid values:</p>
     * <ul>
     * <li><strong>del</strong>: removes the tag from the server.</li>
     * <li><strong>add</strong>: adds the tag to the server.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;target&quot;:&quot;inet-7c676676-06fa-442e-90fb-b802e5d6****&quot;,&quot;targetType&quot;:&quot;uuid&quot;,&quot;flag&quot;:&quot;add&quot;}]</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The UUIDs of the servers.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e2737dc3-78f4-4653-a986-dc5fad4b****,c189f0e3-df22-42d5-a73d-02c05667****</p>
     */
    @NameInMap("UuidList")
    public String uuidList;

    public static ModifyTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidRequest self = new ModifyTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public ModifyTagWithUuidRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ModifyTagWithUuidRequest setTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
    public String getTagList() {
        return this.tagList;
    }

    public ModifyTagWithUuidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
