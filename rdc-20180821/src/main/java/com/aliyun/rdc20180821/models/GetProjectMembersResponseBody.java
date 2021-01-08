// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetProjectMembersResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetProjectMembersResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMembersResponseBody self = new GetProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectMembersResponseBody setData(java.util.List<GetProjectMembersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProjectMembersResponseBodyData> getData() {
        return this.data;
    }

    public GetProjectMembersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetProjectMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectMembersResponseBodyDataUsers extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Email")
        public String email;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("StaffId")
        public String staffId;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Id")
        public Integer id;

        public static GetProjectMembersResponseBodyDataUsers build(java.util.Map<String, ?> map) throws Exception {
            GetProjectMembersResponseBodyDataUsers self = new GetProjectMembersResponseBodyDataUsers();
            return TeaModel.build(map, self);
        }

        public GetProjectMembersResponseBodyDataUsers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetProjectMembersResponseBodyDataUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetProjectMembersResponseBodyDataUsers setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetProjectMembersResponseBodyDataUsers setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }
        public String getStaffId() {
            return this.staffId;
        }

        public GetProjectMembersResponseBodyDataUsers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetProjectMembersResponseBodyDataUsers setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class GetProjectMembersResponseBodyData extends TeaModel {
        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("Users")
        public java.util.List<GetProjectMembersResponseBodyDataUsers> users;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        public static GetProjectMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectMembersResponseBodyData self = new GetProjectMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectMembersResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetProjectMembersResponseBodyData setUsers(java.util.List<GetProjectMembersResponseBodyDataUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<GetProjectMembersResponseBodyDataUsers> getUsers() {
            return this.users;
        }

        public GetProjectMembersResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectMembersResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
