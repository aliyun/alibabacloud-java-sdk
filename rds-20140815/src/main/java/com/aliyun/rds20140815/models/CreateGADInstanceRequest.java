// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGADInstanceRequest extends TeaModel {
    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    @NameInMap("CentralRegionId")
    public String centralRegionId;

    @NameInMap("DBList")
    public String DBList;

    @NameInMap("Description")
    public String description;

    @NameInMap("UnitNode")
    public java.util.List<CreateGADInstanceRequestUnitNode> unitNode;

    public static CreateGADInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGADInstanceRequest self = new CreateGADInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGADInstanceRequest setCentralDBInstanceId(String centralDBInstanceId) {
        this.centralDBInstanceId = centralDBInstanceId;
        return this;
    }
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    public CreateGADInstanceRequest setCentralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
        this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
        return this;
    }
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    public CreateGADInstanceRequest setCentralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
        this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
        return this;
    }
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    public CreateGADInstanceRequest setCentralRegionId(String centralRegionId) {
        this.centralRegionId = centralRegionId;
        return this;
    }
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    public CreateGADInstanceRequest setDBList(String DBList) {
        this.DBList = DBList;
        return this;
    }
    public String getDBList() {
        return this.DBList;
    }

    public CreateGADInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGADInstanceRequest setUnitNode(java.util.List<CreateGADInstanceRequestUnitNode> unitNode) {
        this.unitNode = unitNode;
        return this;
    }
    public java.util.List<CreateGADInstanceRequestUnitNode> getUnitNode() {
        return this.unitNode;
    }

    public static class CreateGADInstanceRequestUnitNode extends TeaModel {
        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        @NameInMap("DbInstanceClass")
        public String dbInstanceClass;

        @NameInMap("DtsConflict")
        public String dtsConflict;

        @NameInMap("DtsInstanceClass")
        public String dtsInstanceClass;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionID")
        public String regionID;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("VSwitchID")
        public String vSwitchID;

        @NameInMap("VpcID")
        public String vpcID;

        @NameInMap("ZoneID")
        public String zoneID;

        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        @NameInMap("ZoneIDSlave2")
        public String zoneIDSlave2;

        public static CreateGADInstanceRequestUnitNode build(java.util.Map<String, ?> map) throws Exception {
            CreateGADInstanceRequestUnitNode self = new CreateGADInstanceRequestUnitNode();
            return TeaModel.build(map, self);
        }

        public CreateGADInstanceRequestUnitNode setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public CreateGADInstanceRequestUnitNode setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public CreateGADInstanceRequestUnitNode setDbInstanceClass(String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        public CreateGADInstanceRequestUnitNode setDtsConflict(String dtsConflict) {
            this.dtsConflict = dtsConflict;
            return this;
        }
        public String getDtsConflict() {
            return this.dtsConflict;
        }

        public CreateGADInstanceRequestUnitNode setDtsInstanceClass(String dtsInstanceClass) {
            this.dtsInstanceClass = dtsInstanceClass;
            return this;
        }
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
        }

        public CreateGADInstanceRequestUnitNode setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateGADInstanceRequestUnitNode setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public CreateGADInstanceRequestUnitNode setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public CreateGADInstanceRequestUnitNode setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public CreateGADInstanceRequestUnitNode setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateGADInstanceRequestUnitNode setVSwitchID(String vSwitchID) {
            this.vSwitchID = vSwitchID;
            return this;
        }
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        public CreateGADInstanceRequestUnitNode setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public CreateGADInstanceRequestUnitNode setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

        public CreateGADInstanceRequestUnitNode setZoneIDSlave1(String zoneIDSlave1) {
            this.zoneIDSlave1 = zoneIDSlave1;
            return this;
        }
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        public CreateGADInstanceRequestUnitNode setZoneIDSlave2(String zoneIDSlave2) {
            this.zoneIDSlave2 = zoneIDSlave2;
            return this;
        }
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

    }

}
