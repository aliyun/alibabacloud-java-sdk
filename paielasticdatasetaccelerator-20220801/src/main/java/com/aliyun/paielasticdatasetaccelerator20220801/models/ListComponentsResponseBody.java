// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("Components")
    public java.util.List<ListComponentsResponseBodyComponents> components;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setComponents(java.util.List<ListComponentsResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<ListComponentsResponseBodyComponents> getComponents() {
        return this.components;
    }

    public ListComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListComponentsResponseBodyComponentsTemplate extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Uri")
        public String uri;

        public static ListComponentsResponseBodyComponentsTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyComponentsTemplate self = new ListComponentsResponseBodyComponentsTemplate();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyComponentsTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComponentsResponseBodyComponentsTemplate setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListComponentsResponseBodyComponents extends TeaModel {
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Template")
        public ListComponentsResponseBodyComponentsTemplate template;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Version")
        public String version;

        public static ListComponentsResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyComponents self = new ListComponentsResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyComponents setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListComponentsResponseBodyComponents setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListComponentsResponseBodyComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComponentsResponseBodyComponents setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListComponentsResponseBodyComponents setTemplate(ListComponentsResponseBodyComponentsTemplate template) {
            this.template = template;
            return this;
        }
        public ListComponentsResponseBodyComponentsTemplate getTemplate() {
            return this.template;
        }

        public ListComponentsResponseBodyComponents setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListComponentsResponseBodyComponents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListComponentsResponseBodyComponents setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
