// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class CreateApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Application")
    public CreateApplicationResponseBodyApplication application;

    public static CreateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponseBody self = new CreateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApplicationResponseBody setApplication(CreateApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public CreateApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public static class CreateApplicationResponseBodyApplication extends TeaModel {
        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UpdateUsername")
        public String updateUsername;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("UsingSharedStorage")
        public Boolean usingSharedStorage;

        @NameInMap("AppDescription")
        public String appDescription;

        public static CreateApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationResponseBodyApplication self = new CreateApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public CreateApplicationResponseBodyApplication setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public CreateApplicationResponseBodyApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateApplicationResponseBodyApplication setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public CreateApplicationResponseBodyApplication setUpdateUsername(String updateUsername) {
            this.updateUsername = updateUsername;
            return this;
        }
        public String getUpdateUsername() {
            return this.updateUsername;
        }

        public CreateApplicationResponseBodyApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateApplicationResponseBodyApplication setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public CreateApplicationResponseBodyApplication setUsingSharedStorage(Boolean usingSharedStorage) {
            this.usingSharedStorage = usingSharedStorage;
            return this;
        }
        public Boolean getUsingSharedStorage() {
            return this.usingSharedStorage;
        }

        public CreateApplicationResponseBodyApplication setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

    }

}
