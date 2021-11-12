// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class DeleteTagsRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TagInfo")
    public java.util.List<DeleteTagsRequestTagInfo> tagInfo;

    public static DeleteTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsRequest self = new DeleteTagsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteTagsRequest setTagInfo(java.util.List<DeleteTagsRequestTagInfo> tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }
    public java.util.List<DeleteTagsRequestTagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public static class DeleteTagsRequestTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DeleteTagsRequestTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DeleteTagsRequestTagInfo self = new DeleteTagsRequestTagInfo();
            return TeaModel.build(map, self);
        }

        public DeleteTagsRequestTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DeleteTagsRequestTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
