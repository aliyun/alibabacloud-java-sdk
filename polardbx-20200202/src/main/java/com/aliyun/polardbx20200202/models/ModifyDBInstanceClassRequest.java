// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SpecifiedDNScale")
    public Boolean specifiedDNScale;

    @NameInMap("SpecifiedDNSpecMapJson")
    public String specifiedDNSpecMapJson;

    @NameInMap("SwitchTime")
    public String switchTime;

    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <strong>example:</strong>
     * <p>polarx.x4.xlarge.2e</p>
     */
    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    public static ModifyDBInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassRequest self = new ModifyDBInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBInstanceClassRequest setCnClass(String cnClass) {
        this.cnClass = cnClass;
        return this;
    }
    public String getCnClass() {
        return this.cnClass;
    }

    public ModifyDBInstanceClassRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDBInstanceClassRequest setDnClass(String dnClass) {
        this.dnClass = dnClass;
        return this;
    }
    public String getDnClass() {
        return this.dnClass;
    }

    public ModifyDBInstanceClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceClassRequest setSpecifiedDNScale(Boolean specifiedDNScale) {
        this.specifiedDNScale = specifiedDNScale;
        return this;
    }
    public Boolean getSpecifiedDNScale() {
        return this.specifiedDNScale;
    }

    public ModifyDBInstanceClassRequest setSpecifiedDNSpecMapJson(String specifiedDNSpecMapJson) {
        this.specifiedDNSpecMapJson = specifiedDNSpecMapJson;
        return this;
    }
    public String getSpecifiedDNSpecMapJson() {
        return this.specifiedDNSpecMapJson;
    }

    public ModifyDBInstanceClassRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyDBInstanceClassRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public ModifyDBInstanceClassRequest setTargetDBInstanceClass(String targetDBInstanceClass) {
        this.targetDBInstanceClass = targetDBInstanceClass;
        return this;
    }
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

}
