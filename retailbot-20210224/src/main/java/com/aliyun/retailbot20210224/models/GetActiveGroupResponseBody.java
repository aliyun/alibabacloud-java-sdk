// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetActiveGroupResponseBody extends TeaModel {
    // 资源名称
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetActiveGroupResponseBodyData data;

    // 资源一级ID
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetActiveGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActiveGroupResponseBody self = new GetActiveGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActiveGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetActiveGroupResponseBody setData(GetActiveGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetActiveGroupResponseBodyData getData() {
        return this.data;
    }

    public GetActiveGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetActiveGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetActiveGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetActiveGroupResponseBodyData extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShopId")
        public String shopId;

        public static GetActiveGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetActiveGroupResponseBodyData self = new GetActiveGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetActiveGroupResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public GetActiveGroupResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetActiveGroupResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetActiveGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetActiveGroupResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetActiveGroupResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetActiveGroupResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetActiveGroupResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetActiveGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetActiveGroupResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

    }

}
