// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantUsers")
    public java.util.List<DescribeTenantUsersResponseBodyTenantUsers> tenantUsers;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUsersResponseBody self = new DescribeTenantUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantUsersResponseBody setTenantUsers(java.util.List<DescribeTenantUsersResponseBodyTenantUsers> tenantUsers) {
        this.tenantUsers = tenantUsers;
        return this;
    }
    public java.util.List<DescribeTenantUsersResponseBodyTenantUsers> getTenantUsers() {
        return this.tenantUsers;
    }

    public DescribeTenantUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTenantUsersResponseBodyTenantUsersDatabases extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Role")
        public String role;

        @NameInMap("Table")
        public String table;

        public static DescribeTenantUsersResponseBodyTenantUsersDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantUsersResponseBodyTenantUsersDatabases self = new DescribeTenantUsersResponseBodyTenantUsersDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeTenantUsersResponseBodyTenantUsers extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> databases;

        @NameInMap("Description")
        public String description;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserStatus")
        public String userStatus;

        @NameInMap("UserType")
        public String userType;

        public static DescribeTenantUsersResponseBodyTenantUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantUsersResponseBodyTenantUsers self = new DescribeTenantUsersResponseBodyTenantUsers();
            return TeaModel.build(map, self);
        }

        public DescribeTenantUsersResponseBodyTenantUsers setDatabases(java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> getDatabases() {
            return this.databases;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
