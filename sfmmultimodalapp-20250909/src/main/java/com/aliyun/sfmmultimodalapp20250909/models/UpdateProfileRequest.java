// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateProfileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AttributesOperations")
    public java.util.List<UpdateProfileRequestAttributesOperations> attributesOperations;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("UserDefinedId")
    public String userDefinedId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileRequest self = new UpdateProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProfileRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateProfileRequest setAttributesOperations(java.util.List<UpdateProfileRequestAttributesOperations> attributesOperations) {
        this.attributesOperations = attributesOperations;
        return this;
    }
    public java.util.List<UpdateProfileRequestAttributesOperations> getAttributesOperations() {
        return this.attributesOperations;
    }

    public UpdateProfileRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProfileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProfileRequest setUserDefinedId(String userDefinedId) {
        this.userDefinedId = userDefinedId;
        return this;
    }
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    public UpdateProfileRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateProfileRequestAttributesOperations extends TeaModel {
        @NameInMap("AttributeId")
        public String attributeId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Op")
        public String op;

        public static UpdateProfileRequestAttributesOperations build(java.util.Map<String, ?> map) throws Exception {
            UpdateProfileRequestAttributesOperations self = new UpdateProfileRequestAttributesOperations();
            return TeaModel.build(map, self);
        }

        public UpdateProfileRequestAttributesOperations setAttributeId(String attributeId) {
            this.attributeId = attributeId;
            return this;
        }
        public String getAttributeId() {
            return this.attributeId;
        }

        public UpdateProfileRequestAttributesOperations setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateProfileRequestAttributesOperations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProfileRequestAttributesOperations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProfileRequestAttributesOperations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

}
