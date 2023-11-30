// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UserLogDetail extends TeaModel {
    @NameInMap("email")
    public String email;

    @NameInMap("expired_at")
    public Long expiredAt;

    @NameInMap("name")
    public String name;

    @NameInMap("phone")
    public String phone;

    @NameInMap("role_id")
    public String roleId;

    @NameInMap("update_to")
    public UserLogDetailUpdateTo updateTo;

    public static UserLogDetail build(java.util.Map<String, ?> map) throws Exception {
        UserLogDetail self = new UserLogDetail();
        return TeaModel.build(map, self);
    }

    public UserLogDetail setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UserLogDetail setExpiredAt(Long expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public Long getExpiredAt() {
        return this.expiredAt;
    }

    public UserLogDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserLogDetail setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UserLogDetail setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public UserLogDetail setUpdateTo(UserLogDetailUpdateTo updateTo) {
        this.updateTo = updateTo;
        return this;
    }
    public UserLogDetailUpdateTo getUpdateTo() {
        return this.updateTo;
    }

    public static class UserLogDetailUpdateTo extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("expired_at")
        public Long expiredAt;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

        @NameInMap("role_id")
        public String roleId;

        public static UserLogDetailUpdateTo build(java.util.Map<String, ?> map) throws Exception {
            UserLogDetailUpdateTo self = new UserLogDetailUpdateTo();
            return TeaModel.build(map, self);
        }

        public UserLogDetailUpdateTo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UserLogDetailUpdateTo setExpiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }
        public Long getExpiredAt() {
            return this.expiredAt;
        }

        public UserLogDetailUpdateTo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UserLogDetailUpdateTo setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public UserLogDetailUpdateTo setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

}
