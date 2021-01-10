// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCContainerServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfigJsonStr")
    public String configJsonStr;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static CreateLDCContainerServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCContainerServiceRequest self = new CreateLDCContainerServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCContainerServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateLDCContainerServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateLDCContainerServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLDCContainerServiceRequest setConfigJsonStr(String configJsonStr) {
        this.configJsonStr = configJsonStr;
        return this;
    }
    public String getConfigJsonStr() {
        return this.configJsonStr;
    }

    public CreateLDCContainerServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLDCContainerServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLDCContainerServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCContainerServiceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateLDCContainerServiceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateLDCContainerServiceRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateLDCContainerServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
