// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateProfileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Attributes")
    public java.util.List<CreateProfileRequestAttributes> attributes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>6e18191727f747ec9de06a2</p>
     */
    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jb5sabg80b4ts71g</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProfileRequest self = new CreateProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateProfileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateProfileRequest setAttributes(java.util.List<CreateProfileRequestAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<CreateProfileRequestAttributes> getAttributes() {
        return this.attributes;
    }

    public CreateProfileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProfileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProfileRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public CreateProfileRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateProfileRequestAttributes extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Immutable")
        public Boolean immutable;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateProfileRequestAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateProfileRequestAttributes self = new CreateProfileRequestAttributes();
            return TeaModel.build(map, self);
        }

        public CreateProfileRequestAttributes setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateProfileRequestAttributes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateProfileRequestAttributes setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }
        public Boolean getImmutable() {
            return this.immutable;
        }

        public CreateProfileRequestAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
