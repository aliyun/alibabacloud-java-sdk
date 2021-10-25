// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberRequest extends TeaModel {
    @NameInMap("CentralRegionId")
    public String centralRegionId;

    @NameInMap("CentralDBInstanceId")
    public String centralDBInstanceId;

    @NameInMap("GadInstanceId")
    public String gadInstanceId;

    @NameInMap("UnitNode")
    public java.util.List<CreateGadInstanceMemberRequestUnitNode> unitNode;

    @NameInMap("CentralRdsDtsAdminAccount")
    public String centralRdsDtsAdminAccount;

    @NameInMap("CentralRdsDtsAdminPassword")
    public String centralRdsDtsAdminPassword;

    @NameInMap("DBList")
    public String DBList;

    public static CreateGadInstanceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceMemberRequest self = new CreateGadInstanceMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceMemberRequest setCentralRegionId(String centralRegionId) {
        this.centralRegionId = centralRegionId;
        return this;
    }
    public String getCentralRegionId() {
        return this.centralRegionId;
    }

    public CreateGadInstanceMemberRequest setCentralDBInstanceId(String centralDBInstanceId) {
        this.centralDBInstanceId = centralDBInstanceId;
        return this;
    }
    public String getCentralDBInstanceId() {
        return this.centralDBInstanceId;
    }

    public CreateGadInstanceMemberRequest setGadInstanceId(String gadInstanceId) {
        this.gadInstanceId = gadInstanceId;
        return this;
    }
    public String getGadInstanceId() {
        return this.gadInstanceId;
    }

    public CreateGadInstanceMemberRequest setUnitNode(java.util.List<CreateGadInstanceMemberRequestUnitNode> unitNode) {
        this.unitNode = unitNode;
        return this;
    }
    public java.util.List<CreateGadInstanceMemberRequestUnitNode> getUnitNode() {
        return this.unitNode;
    }

    public CreateGadInstanceMemberRequest setCentralRdsDtsAdminAccount(String centralRdsDtsAdminAccount) {
        this.centralRdsDtsAdminAccount = centralRdsDtsAdminAccount;
        return this;
    }
    public String getCentralRdsDtsAdminAccount() {
        return this.centralRdsDtsAdminAccount;
    }

    public CreateGadInstanceMemberRequest setCentralRdsDtsAdminPassword(String centralRdsDtsAdminPassword) {
        this.centralRdsDtsAdminPassword = centralRdsDtsAdminPassword;
        return this;
    }
    public String getCentralRdsDtsAdminPassword() {
        return this.centralRdsDtsAdminPassword;
    }

    public CreateGadInstanceMemberRequest setDBList(String DBList) {
        this.DBList = DBList;
        return this;
    }
    public String getDBList() {
        return this.DBList;
    }

    public static class CreateGadInstanceMemberRequestUnitNode extends TeaModel {
        @NameInMap("RegionID")
        public String regionID;

        @NameInMap("ZoneID")
        public String zoneID;

        @NameInMap("VpcID")
        public String vpcID;

        @NameInMap("VSwitchID")
        public String vSwitchID;

        @NameInMap("SecurityIPList")
        public String securityIPList;

        @NameInMap("DBInstanceStorage")
        public Long DBInstanceStorage;

        @NameInMap("ZoneIDSlave1")
        public String zoneIDSlave1;

        @NameInMap("ZoneIDSlave2")
        public String zoneIDSlave2;

        @NameInMap("DtsInstanceClass")
        public String dtsInstanceClass;

        @NameInMap("DbInstanceClass")
        public String dbInstanceClass;

        @NameInMap("DBInstanceDescription")
        public String DBInstanceDescription;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DtsConflict")
        public String dtsConflict;

        public static CreateGadInstanceMemberRequestUnitNode build(java.util.Map<String, ?> map) throws Exception {
            CreateGadInstanceMemberRequestUnitNode self = new CreateGadInstanceMemberRequestUnitNode();
            return TeaModel.build(map, self);
        }

        public CreateGadInstanceMemberRequestUnitNode setRegionID(String regionID) {
            this.regionID = regionID;
            return this;
        }
        public String getRegionID() {
            return this.regionID;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneID(String zoneID) {
            this.zoneID = zoneID;
            return this;
        }
        public String getZoneID() {
            return this.zoneID;
        }

        public CreateGadInstanceMemberRequestUnitNode setVpcID(String vpcID) {
            this.vpcID = vpcID;
            return this;
        }
        public String getVpcID() {
            return this.vpcID;
        }

        public CreateGadInstanceMemberRequestUnitNode setVSwitchID(String vSwitchID) {
            this.vSwitchID = vSwitchID;
            return this;
        }
        public String getVSwitchID() {
            return this.vSwitchID;
        }

        public CreateGadInstanceMemberRequestUnitNode setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public CreateGadInstanceMemberRequestUnitNode setDBInstanceStorage(Long DBInstanceStorage) {
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }
        public Long getDBInstanceStorage() {
            return this.DBInstanceStorage;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneIDSlave1(String zoneIDSlave1) {
            this.zoneIDSlave1 = zoneIDSlave1;
            return this;
        }
        public String getZoneIDSlave1() {
            return this.zoneIDSlave1;
        }

        public CreateGadInstanceMemberRequestUnitNode setZoneIDSlave2(String zoneIDSlave2) {
            this.zoneIDSlave2 = zoneIDSlave2;
            return this;
        }
        public String getZoneIDSlave2() {
            return this.zoneIDSlave2;
        }

        public CreateGadInstanceMemberRequestUnitNode setDtsInstanceClass(String dtsInstanceClass) {
            this.dtsInstanceClass = dtsInstanceClass;
            return this;
        }
        public String getDtsInstanceClass() {
            return this.dtsInstanceClass;
        }

        public CreateGadInstanceMemberRequestUnitNode setDbInstanceClass(String dbInstanceClass) {
            this.dbInstanceClass = dbInstanceClass;
            return this;
        }
        public String getDbInstanceClass() {
            return this.dbInstanceClass;
        }

        public CreateGadInstanceMemberRequestUnitNode setDBInstanceDescription(String DBInstanceDescription) {
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        public CreateGadInstanceMemberRequestUnitNode setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CreateGadInstanceMemberRequestUnitNode setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public CreateGadInstanceMemberRequestUnitNode setDtsConflict(String dtsConflict) {
            this.dtsConflict = dtsConflict;
            return this;
        }
        public String getDtsConflict() {
            return this.dtsConflict;
        }

    }

}
