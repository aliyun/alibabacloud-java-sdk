// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRolesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRolesResponseBody setData(ListRolesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRolesResponseBodyData getData() {
        return this.data;
    }

    public ListRolesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRolesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRolesResponseBodyDataRole extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRolesResponseBodyDataRole build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRole self = new ListRolesResponseBodyDataRole();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRole setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRolesResponseBodyDataRole setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListRolesResponseBodyDataRole setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRolesResponseBodyDataRole setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public ListRolesResponseBodyDataRole setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRolesResponseBodyDataRole setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListRolesResponseBodyData extends TeaModel {
        @NameInMap("Role")
        public java.util.List<ListRolesResponseBodyDataRole> role;

        public static ListRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyData self = new ListRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyData setRole(java.util.List<ListRolesResponseBodyDataRole> role) {
            this.role = role;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRole> getRole() {
            return this.role;
        }

    }

}
