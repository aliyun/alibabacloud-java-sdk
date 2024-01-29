// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    /**
     * <p>The display name of the resource group.</p>
     * <br>
     * <p>The name must be 1 to 50 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The unique identifier of the resource group.</p>
     * <br>
     * <p>The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateResourceGroupRequestTag> tag;

    public static CreateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupRequest self = new CreateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateResourceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceGroupRequest setTag(java.util.List<CreateResourceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateResourceGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateResourceGroupRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. </p>
         * <br>
         * <p>The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. </p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateResourceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceGroupRequestTag self = new CreateResourceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateResourceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
