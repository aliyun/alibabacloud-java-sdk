// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("BizTitle")
    public String bizTitle;

    @NameInMap("Description")
    public String description;

    @NameInMap("Language")
    public String language;

    @NameInMap("MiddleWareIdList")
    public java.util.List<Integer> middleWareIdList;

    @NameInMap("OperatingSystem")
    public String operatingSystem;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("UserRoles")
    public java.util.List<UpdateAppRequestUserRoles> userRoles;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateAppRequest setBizTitle(String bizTitle) {
        this.bizTitle = bizTitle;
        return this;
    }
    public String getBizTitle() {
        return this.bizTitle;
    }

    public UpdateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateAppRequest setMiddleWareIdList(java.util.List<Integer> middleWareIdList) {
        this.middleWareIdList = middleWareIdList;
        return this;
    }
    public java.util.List<Integer> getMiddleWareIdList() {
        return this.middleWareIdList;
    }

    public UpdateAppRequest setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public UpdateAppRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public UpdateAppRequest setUserRoles(java.util.List<UpdateAppRequestUserRoles> userRoles) {
        this.userRoles = userRoles;
        return this;
    }
    public java.util.List<UpdateAppRequestUserRoles> getUserRoles() {
        return this.userRoles;
    }

    public static class UpdateAppRequestUserRoles extends TeaModel {
        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public String userType;

        public static UpdateAppRequestUserRoles build(java.util.Map<String, ?> map) throws Exception {
            UpdateAppRequestUserRoles self = new UpdateAppRequestUserRoles();
            return TeaModel.build(map, self);
        }

        public UpdateAppRequestUserRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public UpdateAppRequestUserRoles setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateAppRequestUserRoles setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
