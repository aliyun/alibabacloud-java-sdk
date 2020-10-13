// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class RevokePrivilegesRequest extends TeaModel {
    // 权限信息
    @NameInMap("PrivilegeBag")
    public RevokePrivilegesRequestPrivilegeBag privilegeBag;

    public static RevokePrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokePrivilegesRequest self = new RevokePrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public RevokePrivilegesRequest setPrivilegeBag(RevokePrivilegesRequestPrivilegeBag privilegeBag) {
        this.privilegeBag = privilegeBag;
        return this;
    }
    public RevokePrivilegesRequestPrivilegeBag getPrivilegeBag() {
        return this.privilegeBag;
    }

    public static class RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef extends TeaModel {
        // 数据库名称
        @NameInMap("DbName")
        public String dbName;

        // 授权粒度
        @NameInMap("HiveObjectType")
        public String hiveObjectType;

        // 表名
        @NameInMap("TableName")
        public String tableName;

        public static RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef build(java.util.Map<String, ?> map) throws Exception {
            RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef self = new RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef();
            return TeaModel.build(map, self);
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setHiveObjectType(String hiveObjectType) {
            this.hiveObjectType = hiveObjectType;
            return this;
        }
        public String getHiveObjectType() {
            return this.hiveObjectType;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo extends TeaModel {
        // 权限是否可以传递
        @NameInMap("GrantOption")
        public Boolean grantOption;

        // 授权者
        @NameInMap("Grantor")
        public String grantor;

        // 授权者的类型，只能为 USER
        @NameInMap("PrincipalType")
        public String principalType;

        // 权限
        @NameInMap("Privilege")
        public String privilege;

        public static RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo build(java.util.Map<String, ?> map) throws Exception {
            RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo self = new RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo();
            return TeaModel.build(map, self);
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setGrantOption(Boolean grantOption) {
            this.grantOption = grantOption;
            return this;
        }
        public Boolean getGrantOption() {
            return this.grantOption;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setGrantor(String grantor) {
            this.grantor = grantor;
            return this;
        }
        public String getGrantor() {
            return this.grantor;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

    public static class RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege extends TeaModel {
        // HiveObjectRef
        @NameInMap("HiveObjectRef")
        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef hiveObjectRef;

        // 给谁授权
        @NameInMap("PrincipalName")
        public String principalName;

        // 授权类型，只能为 USER
        @NameInMap("PrincipalType")
        public String principalType;

        // 授权者的信息
        @NameInMap("PrivilegeGrantInfo")
        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo privilegeGrantInfo;

        public static RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege build(java.util.Map<String, ?> map) throws Exception {
            RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege self = new RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege();
            return TeaModel.build(map, self);
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege setHiveObjectRef(RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef hiveObjectRef) {
            this.hiveObjectRef = hiveObjectRef;
            return this;
        }
        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef getHiveObjectRef() {
            return this.hiveObjectRef;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrivilegeGrantInfo(RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo privilegeGrantInfo) {
            this.privilegeGrantInfo = privilegeGrantInfo;
            return this;
        }
        public RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo getPrivilegeGrantInfo() {
            return this.privilegeGrantInfo;
        }

    }

    public static class RevokePrivilegesRequestPrivilegeBag extends TeaModel {
        // 权限信息
        @NameInMap("HiveObjectPrivilege")
        public java.util.List<RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege> hiveObjectPrivilege;

        public static RevokePrivilegesRequestPrivilegeBag build(java.util.Map<String, ?> map) throws Exception {
            RevokePrivilegesRequestPrivilegeBag self = new RevokePrivilegesRequestPrivilegeBag();
            return TeaModel.build(map, self);
        }

        public RevokePrivilegesRequestPrivilegeBag setHiveObjectPrivilege(java.util.List<RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege> hiveObjectPrivilege) {
            this.hiveObjectPrivilege = hiveObjectPrivilege;
            return this;
        }
        public java.util.List<RevokePrivilegesRequestPrivilegeBagHiveObjectPrivilege> getHiveObjectPrivilege() {
            return this.hiveObjectPrivilege;
        }

    }

}
