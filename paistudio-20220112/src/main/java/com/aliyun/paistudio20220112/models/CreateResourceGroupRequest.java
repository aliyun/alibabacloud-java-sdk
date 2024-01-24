// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    @NameInMap("ComputingResourceProvider")
    public String computingResourceProvider;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<CreateResourceGroupRequestTag> tag;

    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static CreateResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGroupRequest self = new CreateResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceGroupRequest setComputingResourceProvider(String computingResourceProvider) {
        this.computingResourceProvider = computingResourceProvider;
        return this;
    }
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    public CreateResourceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateResourceGroupRequest setTag(java.util.List<CreateResourceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateResourceGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateResourceGroupRequest setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static class CreateResourceGroupRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
