// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateResourceGroupRequest extends TeaModel {
    /**
     * <p>The compute resource type of the ResourceGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ComputingResourceProvider")
    public String computingResourceProvider;

    /**
     * <p>The description of the ResourceGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>test_api_report</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the ResourceGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>testResourceGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The resource type list. Valid values:</p>
     * <ul>
     * <li>Ecs: general computing resources</li>
     * <li>Lingjun: Lingjun AI Compute resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ecs</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags to add, containing up to 20 entries.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateResourceGroupRequestTag> tag;

    /**
     * <p>The VPC peering information of the ResourceGroup.</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    /**
     * <p>The resource group version. This parameter only takes effect when the resource type is ECS.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

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

    public CreateResourceGroupRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class CreateResourceGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance. The value of N ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance. The value of N ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
