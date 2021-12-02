// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("BizTitle")
    public String bizTitle;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Language")
    public String language;

    @NameInMap("MiddleWareIdList")
    public java.util.List<Integer> middleWareIdList;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OperatingSystem")
    public String operatingSystem;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("StateType")
    public Integer stateType;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserRoles")
    public java.util.List<CreateAppRequestUserRoles> userRoles;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateAppRequest setBizTitle(String bizTitle) {
        this.bizTitle = bizTitle;
        return this;
    }
    public String getBizTitle() {
        return this.bizTitle;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateAppRequest setMiddleWareIdList(java.util.List<Integer> middleWareIdList) {
        this.middleWareIdList = middleWareIdList;
        return this;
    }
    public java.util.List<Integer> getMiddleWareIdList() {
        return this.middleWareIdList;
    }

    public CreateAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAppRequest setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public CreateAppRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public CreateAppRequest setStateType(Integer stateType) {
        this.stateType = stateType;
        return this;
    }
    public Integer getStateType() {
        return this.stateType;
    }

    public CreateAppRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateAppRequest setUserRoles(java.util.List<CreateAppRequestUserRoles> userRoles) {
        this.userRoles = userRoles;
        return this;
    }
    public java.util.List<CreateAppRequestUserRoles> getUserRoles() {
        return this.userRoles;
    }

    public static class CreateAppRequestUserRoles extends TeaModel {
        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public String userType;

        public static CreateAppRequestUserRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestUserRoles self = new CreateAppRequestUserRoles();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestUserRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public CreateAppRequestUserRoles setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateAppRequestUserRoles setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
