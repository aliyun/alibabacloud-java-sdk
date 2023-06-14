// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateTagsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the tag value.</p>
     * <br>
     * <p>Valid values of N: 1 to 10.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("TagKeyValueParamList")
    public java.util.List<CreateTagsRequestTagKeyValueParamList> tagKeyValueParamList;

    public static CreateTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagsRequest self = new CreateTagsRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTagsRequest setTagKeyValueParamList(java.util.List<CreateTagsRequestTagKeyValueParamList> tagKeyValueParamList) {
        this.tagKeyValueParamList = tagKeyValueParamList;
        return this;
    }
    public java.util.List<CreateTagsRequestTagKeyValueParamList> getTagKeyValueParamList() {
        return this.tagKeyValueParamList;
    }

    public static class CreateTagsRequestTagKeyValueParamListTagValueParamList extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTagsRequestTagKeyValueParamListTagValueParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateTagsRequestTagKeyValueParamListTagValueParamList self = new CreateTagsRequestTagKeyValueParamListTagValueParamList();
            return TeaModel.build(map, self);
        }

        public CreateTagsRequestTagKeyValueParamListTagValueParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagsRequestTagKeyValueParamListTagValueParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTagsRequestTagKeyValueParamList extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the tag key.</p>
         * <br>
         * <p>Valid values of N: 1 to 10.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("TagValueParamList")
        public java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> tagValueParamList;

        public static CreateTagsRequestTagKeyValueParamList build(java.util.Map<String, ?> map) throws Exception {
            CreateTagsRequestTagKeyValueParamList self = new CreateTagsRequestTagKeyValueParamList();
            return TeaModel.build(map, self);
        }

        public CreateTagsRequestTagKeyValueParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagsRequestTagKeyValueParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTagsRequestTagKeyValueParamList setTagValueParamList(java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> tagValueParamList) {
            this.tagValueParamList = tagValueParamList;
            return this;
        }
        public java.util.List<CreateTagsRequestTagKeyValueParamListTagValueParamList> getTagValueParamList() {
            return this.tagValueParamList;
        }

    }

}
