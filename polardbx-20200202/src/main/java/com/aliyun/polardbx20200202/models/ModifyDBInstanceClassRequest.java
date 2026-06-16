// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use any arbitrary string.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>4核32G</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The storage node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>4核32G</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    @NameInMap("DnStorageSpace")
    public String dnStorageSpace;

    /**
     * <p>The region ID.</p>
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
     * <p>The target instance specifications. Valid values:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB</li>
     * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB</li>
     * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB</li>
     * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB</li>
     * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB</li>
     * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB</li>
     * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB</li>
     * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB</li>
     * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB</li>
     * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB</li>
     * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB.</li>
     * </ul>
     * 
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

    public ModifyDBInstanceClassRequest setDnStorageSpace(String dnStorageSpace) {
        this.dnStorageSpace = dnStorageSpace;
        return this;
    }
    public String getDnStorageSpace() {
        return this.dnStorageSpace;
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
