// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID of the Service Mesh (ASM) instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the ASM instances.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. Set the value to `servicemesh`.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags.</p>
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
         * <p>The tag keys.</p>
         * <br>
         * <p>The following limits apply:</p>
         * <br>
         * <p>*   The key of tag N cannot be an empty string.</p>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   The tag key can be up to 128 characters in length.</p>
         * <p>*   The tag key cannot start with `aliyun` or `acs:`.</p>
         * <p>*   The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <br>
         * <p>The following limits apply:</p>
         * <br>
         * <p>*   The value of tag N cannot be an empty string.</p>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   The tag value can be up to 128 characters in length.</p>
         * <p>*   The tag value cannot contain `http://` or `https://`.</p>
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
