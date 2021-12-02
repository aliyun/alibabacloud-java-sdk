// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeAppDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppDetailResponseBodyResult result;

    public static DescribeAppDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDetailResponseBody self = new DescribeAppDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeAppDetailResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeAppDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppDetailResponseBody setResult(DescribeAppDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppDetailResponseBodyResultMiddleWareInfoList extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Code")
        public Integer code;

        @NameInMap("Name")
        public String name;

        public static DescribeAppDetailResponseBodyResultMiddleWareInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDetailResponseBodyResultMiddleWareInfoList self = new DescribeAppDetailResponseBodyResultMiddleWareInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAppDetailResponseBodyResultMiddleWareInfoList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppDetailResponseBodyResultMiddleWareInfoList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeAppDetailResponseBodyResultMiddleWareInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeAppDetailResponseBodyResultUserRoles extends TeaModel {
        @NameInMap("RealName")
        public String realName;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserType")
        public String userType;

        public static DescribeAppDetailResponseBodyResultUserRoles build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDetailResponseBodyResultUserRoles self = new DescribeAppDetailResponseBodyResultUserRoles();
            return TeaModel.build(map, self);
        }

        public DescribeAppDetailResponseBodyResultUserRoles setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public DescribeAppDetailResponseBodyResultUserRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeAppDetailResponseBodyResultUserRoles setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeAppDetailResponseBodyResultUserRoles setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class DescribeAppDetailResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppStateType")
        public String appStateType;

        @NameInMap("BizName")
        public String bizName;

        @NameInMap("BizTitle")
        public String bizTitle;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Language")
        public String language;

        @NameInMap("MiddleWareInfoList")
        public java.util.List<DescribeAppDetailResponseBodyResultMiddleWareInfoList> middleWareInfoList;

        @NameInMap("OperatingSystem")
        public String operatingSystem;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserRoles")
        public java.util.List<DescribeAppDetailResponseBodyResultUserRoles> userRoles;

        public static DescribeAppDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDetailResponseBodyResult self = new DescribeAppDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppDetailResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppDetailResponseBodyResult setAppStateType(String appStateType) {
            this.appStateType = appStateType;
            return this;
        }
        public String getAppStateType() {
            return this.appStateType;
        }

        public DescribeAppDetailResponseBodyResult setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public DescribeAppDetailResponseBodyResult setBizTitle(String bizTitle) {
            this.bizTitle = bizTitle;
            return this;
        }
        public String getBizTitle() {
            return this.bizTitle;
        }

        public DescribeAppDetailResponseBodyResult setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeAppDetailResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppDetailResponseBodyResult setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeAppDetailResponseBodyResult setMiddleWareInfoList(java.util.List<DescribeAppDetailResponseBodyResultMiddleWareInfoList> middleWareInfoList) {
            this.middleWareInfoList = middleWareInfoList;
            return this;
        }
        public java.util.List<DescribeAppDetailResponseBodyResultMiddleWareInfoList> getMiddleWareInfoList() {
            return this.middleWareInfoList;
        }

        public DescribeAppDetailResponseBodyResult setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        public DescribeAppDetailResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeAppDetailResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeAppDetailResponseBodyResult setUserRoles(java.util.List<DescribeAppDetailResponseBodyResultUserRoles> userRoles) {
            this.userRoles = userRoles;
            return this;
        }
        public java.util.List<DescribeAppDetailResponseBodyResultUserRoles> getUserRoles() {
            return this.userRoles;
        }

    }

}
