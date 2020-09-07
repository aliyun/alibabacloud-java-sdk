// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("proxyId")
    public String proxyId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Tag")
    public java.util.List<AddTagsToResourceRequestTag> tag;

    public static AddTagsToResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceRequest self = new AddTagsToResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsToResourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddTagsToResourceRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
    }

    public AddTagsToResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsToResourceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AddTagsToResourceRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public AddTagsToResourceRequest setTag(java.util.List<AddTagsToResourceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddTagsToResourceRequestTag> getTag() {
        return this.tag;
    }

    public static class AddTagsToResourceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static AddTagsToResourceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsToResourceRequestTag self = new AddTagsToResourceRequestTag();
            return TeaModel.build(map, self);
        }

        public AddTagsToResourceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddTagsToResourceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
