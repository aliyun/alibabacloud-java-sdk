// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the bastion hosts to which you want to create and add tags.</p>
     * <br>
     * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>An array that consists of IDs of bastion hosts.</p>
     * <br>
     * <p>Valid values: 1 to 20.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query IDs of bastion hosts.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>Set the value to **INSTANCE**, which indicates that the resource is a bastion host.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>An array that consists of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The value can be up to 128 characters in length but cannot be an empty string.</p>
         * <br>
         * <p>*   The value cannot start with **aliyun** or **acs:**. The value cannot contain **http://** or **https://**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.\</p>
         * <p>Valid values of N: 1 to 20.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The value can be up to 128 characters in length or an empty string.</p>
         * <br>
         * <p>*   The value cannot start with **aliyun** or **acs:**. The value cannot contain **http://** or **https://**.</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
