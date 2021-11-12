// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertTagsRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TagInfo")
    public java.util.List<InsertTagsRequestTagInfo> tagInfo;

    public static InsertTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTagsRequest self = new InsertTagsRequest();
        return TeaModel.build(map, self);
    }

    public InsertTagsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public InsertTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public InsertTagsRequest setTagInfo(java.util.List<InsertTagsRequestTagInfo> tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }
    public java.util.List<InsertTagsRequestTagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public static class InsertTagsRequestTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static InsertTagsRequestTagInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertTagsRequestTagInfo self = new InsertTagsRequestTagInfo();
            return TeaModel.build(map, self);
        }

        public InsertTagsRequestTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public InsertTagsRequestTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
