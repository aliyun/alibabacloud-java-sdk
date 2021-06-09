// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class UntagResourcesSystemTagsRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("All")
    public Boolean all;

    @NameInMap("TagOwnerUid")
    public Long tagOwnerUid;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesSystemTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesSystemTagsRequest self = new UntagResourcesSystemTagsRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesSystemTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesSystemTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UntagResourcesSystemTagsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesSystemTagsRequest setTagOwnerUid(Long tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public UntagResourcesSystemTagsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesSystemTagsRequest setTagKey(java.util.List<String> tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

}
