// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListActiveGroupsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("Code")
    public String code;

    // 数组，返回示例目录。
    @NameInMap("Data")
    public java.util.List<ListActiveGroupsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListActiveGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActiveGroupsResponseBody self = new ListActiveGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActiveGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActiveGroupsResponseBody setData(java.util.List<ListActiveGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListActiveGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListActiveGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActiveGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActiveGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListActiveGroupsResponseBodyData extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Config")
        public String config;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("ShopId")
        public String shopId;

        @NameInMap("Version")
        public String version;

        public static ListActiveGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListActiveGroupsResponseBodyData self = new ListActiveGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListActiveGroupsResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListActiveGroupsResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListActiveGroupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListActiveGroupsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListActiveGroupsResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListActiveGroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListActiveGroupsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListActiveGroupsResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListActiveGroupsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListActiveGroupsResponseBodyData setShopId(String shopId) {
            this.shopId = shopId;
            return this;
        }
        public String getShopId() {
            return this.shopId;
        }

        public ListActiveGroupsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
