// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GrantPrivilegesRequest extends TeaModel {
    // 权限信息
    @NameInMap("PrivilegeBag")
    public GrantPrivilegesRequestPrivilegeBag privilegeBag;

    public static GrantPrivilegesRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPrivilegesRequest self = new GrantPrivilegesRequest();
        return TeaModel.build(map, self);
    }

    public GrantPrivilegesRequest setPrivilegeBag(GrantPrivilegesRequestPrivilegeBag privilegeBag) {
        this.privilegeBag = privilegeBag;
        return this;
    }
    public GrantPrivilegesRequestPrivilegeBag getPrivilegeBag() {
        return this.privilegeBag;
    }

    public static class GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef extends TeaModel {
        // 数据库名称
        @NameInMap("DbName")
        public String dbName;

        // 授权粒度
        @NameInMap("HiveObjectType")
        public String hiveObjectType;

        // 表名
        @NameInMap("TableName")
        public String tableName;

        public static GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef build(java.util.Map<String, ?> map) throws Exception {
            GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef self = new GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef();
            return TeaModel.build(map, self);
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setHiveObjectType(String hiveObjectType) {
            this.hiveObjectType = hiveObjectType;
            return this;
        }
        public String getHiveObjectType() {
            return this.hiveObjectType;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo extends TeaModel {
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

        public static GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo build(java.util.Map<String, ?> map) throws Exception {
            GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo self = new GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo();
            return TeaModel.build(map, self);
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setGrantOption(Boolean grantOption) {
            this.grantOption = grantOption;
            return this;
        }
        public Boolean getGrantOption() {
            return this.grantOption;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setGrantor(String grantor) {
            this.grantor = grantor;
            return this;
        }
        public String getGrantor() {
            return this.grantor;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

    }

    public static class GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege extends TeaModel {
        // HiveObjectRef
        @NameInMap("HiveObjectRef")
        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef hiveObjectRef;

        // 给谁授权
        @NameInMap("PrincipalName")
        public String principalName;

        // 授权类型，只能为 USER
        @NameInMap("PrincipalType")
        public String principalType;

        // 授权者的信息
        @NameInMap("PrivilegeGrantInfo")
        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo privilegeGrantInfo;

        public static GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege build(java.util.Map<String, ?> map) throws Exception {
            GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege self = new GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege();
            return TeaModel.build(map, self);
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege setHiveObjectRef(GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef hiveObjectRef) {
            this.hiveObjectRef = hiveObjectRef;
            return this;
        }
        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegeHiveObjectRef getHiveObjectRef() {
            return this.hiveObjectRef;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege setPrivilegeGrantInfo(GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo privilegeGrantInfo) {
            this.privilegeGrantInfo = privilegeGrantInfo;
            return this;
        }
        public GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilegePrivilegeGrantInfo getPrivilegeGrantInfo() {
            return this.privilegeGrantInfo;
        }

    }

    public static class GrantPrivilegesRequestPrivilegeBag extends TeaModel {
        // 权限信息
        @NameInMap("HiveObjectPrivilege")
        public java.util.List<GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege> hiveObjectPrivilege;

        public static GrantPrivilegesRequestPrivilegeBag build(java.util.Map<String, ?> map) throws Exception {
            GrantPrivilegesRequestPrivilegeBag self = new GrantPrivilegesRequestPrivilegeBag();
            return TeaModel.build(map, self);
        }

        public GrantPrivilegesRequestPrivilegeBag setHiveObjectPrivilege(java.util.List<GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege> hiveObjectPrivilege) {
            this.hiveObjectPrivilege = hiveObjectPrivilege;
            return this;
        }
        public java.util.List<GrantPrivilegesRequestPrivilegeBagHiveObjectPrivilege> getHiveObjectPrivilege() {
            return this.hiveObjectPrivilege;
        }

    }

}
