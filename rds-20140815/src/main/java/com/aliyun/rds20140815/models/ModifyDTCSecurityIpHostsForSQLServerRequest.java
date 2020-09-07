// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    // description: RDS实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: ECS实例的IP地址和Windows系统的计算机名。格式：ip,hostname。多个实例之间以英文分号（;）隔开。>计算机名查看方式请参见[设置分布式事务白名单](~~124321~~)。; 
    @NameInMap("SecurityIpHosts")
    @Validation(required = true)
    public String securityIpHosts;

    // description: 白名单分组名称。; 
    @NameInMap("WhiteListGroupName")
    @Validation(required = true)
    public String whiteListGroupName;

    // description: RDS实例的地域ID，可以通过接口[DescribeRegions](~~26243~~)查看。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyDTCSecurityIpHostsForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerRequest self = new ModifyDTCSecurityIpHostsForSQLServerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setSecurityIpHosts(String securityIpHosts) {
        this.securityIpHosts = securityIpHosts;
        return this;
    }
    public String getSecurityIpHosts() {
        return this.securityIpHosts;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setWhiteListGroupName(String whiteListGroupName) {
        this.whiteListGroupName = whiteListGroupName;
        return this;
    }
    public String getWhiteListGroupName() {
        return this.whiteListGroupName;
    }

    public ModifyDTCSecurityIpHostsForSQLServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
