// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
    /**
     * <p>The client token. It can be any unique string.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p><strong>Target specifications for Enterprise Edition compute node specification changes</strong></p>
     * <p><strong>Primary instance compute node specifications (Enterprise Edition CN) general-purpose</strong>	</p>
     * <ul>
     * <li>polarx.x4.medium.2e	2 cores, 8 GB (general-purpose)</li>
     * <li>polarx.x4.large.2e	4 cores, 16 GB (general-purpose)</li>
     * <li>polarx.x4.xlarge.2e	8 cores, 32 GB (general-purpose)</li>
     * <li>polarx.x4.2xlarge.2e 16 cores, 64 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Primary instance compute node specifications (Enterprise Edition CN) dedicated</strong>	</p>
     * <ul>
     * <li>polarx.x8.large.2e	4 cores, 32 GB (dedicated)</li>
     * <li>polarx.x8.xlarge.2e	8 cores, 64 GB (dedicated)</li>
     * <li>polarx.x8.2xlarge.2e	16 cores, 128 GB (dedicated)</li>
     * <li>polarx.x4.4xlarge.2e	32 cores, 128 GB (dedicated)</li>
     * <li>polarx.x8.4xlarge.2e	32 cores, 256 GB (dedicated)</li>
     * <li>polarx.st.8xlarge.2e	60 cores, 470 GB (dedicated)</li>
     * <li>polarx.st.12xlarge.2e	90 cores, 720 GB (dedicated)</li>
     * </ul>
     * <p><strong>Read-only instance compute node specifications (Enterprise Edition CN) general-purpose</strong>	</p>
     * <ul>
     * <li>polarxro.x4.medium.2e	2 cores, 8 GB (general-purpose)</li>
     * <li>polarxro.x4.large.2e	4 cores, 16 GB (general-purpose)</li>
     * <li>polarxro.x4.xlarge.2e	8 cores, 32 GB (general-purpose)</li>
     * <li>polarxro.x4.2xlarge.2e	16 cores, 64 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Read-only instance compute node specifications (Enterprise Edition CN) dedicated</strong>	</p>
     * <ul>
     * <li>polarxro.x8.large.2e	4 cores, 32 GB (dedicated)</li>
     * <li>polarxro.x8.xlarge.2e	8 cores, 64 GB (dedicated)</li>
     * <li>polarxro.x8.2xlarge.2e	16 cores, 128 GB (dedicated)</li>
     * <li>polarxro.x4.4xlarge.2e	32 cores, 128 GB (dedicated)</li>
     * <li>polarxro.x8.4xlarge.2e	32 cores, 256 GB (dedicated)</li>
     * <li>polarxro.st.8xlarge.2e	60 cores, 470 GB (dedicated physical machine)</li>
     * <li>polarxro.st.12xlarge.2e	90 cores, 720 GB (dedicated physical machine).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.medium.2e</p>
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
     * <p><strong>Target specifications for Enterprise Edition storage node specification changes</strong></p>
     * <p><strong>Storage node specifications (Enterprise Edition DN) general-purpose</strong>	</p>
     * <ul>
     * <li>mysql.n4.medium.25	2 cores, 8 GB (general-purpose)</li>
     * <li>mysql.n4.large.25	4 cores, 16 GB (general-purpose)</li>
     * <li>mysql.n4.xlarge.25	8 cores, 32 GB (general-purpose)</li>
     * <li>mysql.n4.2xlarge.25	16 cores, 64 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Storage node specifications (Enterprise Edition DN) dedicated</strong>	</p>
     * <ul>
     * <li>mysql.x8.large.25	4 cores, 32 GB (dedicated)</li>
     * <li>mysql.x8.xlarge.25	8 cores, 64 GB (dedicated)</li>
     * <li>mysql.x8.2xlarge.25	16 cores, 128 GB (dedicated)</li>
     * <li>mysql.x4.4xlarge.25	32 cores, 128 GB (dedicated)</li>
     * <li>mysql.x8.4xlarge.25	32 cores, 256 GB (dedicated)</li>
     * <li>mysql.st.8xlarge.25	60 cores, 470 GB (dedicated)</li>
     * <li>mysql.st.12xlarge.25	90 cores, 720 GB (dedicated)</li>
     * </ul>
     * <p><strong>Read-only instance storage node specifications (Enterprise Edition DN) general-purpose</strong>	</p>
     * <ul>
     * <li>rds.mysql.s2.xlarge	2 cores, 8 GB (general-purpose)</li>
     * <li>mysqlro.x4.large.1	4 cores, 16 GB (general-purpose)</li>
     * <li>mysqlro.x4.xlarge.1	8 cores, 32 GB (general-purpose)</li>
     * <li>mysqlro.x4.2xlarge.1	16 cores, 64 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Read-only instance storage node specifications (Enterprise Edition DN) dedicated</strong>	</p>
     * <ul>
     * <li>mysqlro.x8.large.1	4 cores, 32 GB (dedicated)</li>
     * <li>mysqlro.x8.xlarge.1	8 cores, 64 GB (dedicated)</li>
     * <li>mysqlro.x8.2xlarge.1	16 cores, 128 GB (dedicated)</li>
     * <li>mysqlro.x4.4xlarge.1	32 cores, 128 GB (dedicated)</li>
     * <li>mysqlro.x8.4xlarge.1	32 cores, 256 GB (dedicated)</li>
     * <li>rds.mysql.st.h43	60 cores, 470 GB (dedicated physical machine)</li>
     * <li>rds.mysql.st.v52	90 cores, 720 GB (dedicated physical machine).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql.n4.medium.25</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>The target disk size for the specification change.</p>
     * <ul>
     * <li>If the instance uses a fixed-size disk, the disk cannot be changed. In this case, do not specify DnStorageSpace.</li>
     * <li>Valid values of DnStorageSpace: [20, 3072].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
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

    /**
     * <p>Specifies whether to change specifications for multiple DNs.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpecifiedDNScale")
    public Boolean specifiedDNScale;

    /**
     * <p>The target specifications for each DN when changing specifications for multiple DNs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pxc-xdb-s-htr3rh44ki3s6a4354&quot;:&quot;mysql.n4.medium.25&quot;,&quot;pxc-xdb-s-htr3rh44ki3s6a71c6&quot;:&quot;mysql.n4.medium.25&quot;}</p>
     */
    @NameInMap("SpecifiedDNSpecMapJson")
    public String specifiedDNSpecMapJson;

    /**
     * <p>The start time of the switch. The switch time range is [start time T, T+30m]. This parameter is not yet available.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-11T17:10:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The switch time. Valid values:</p>
     * <ul>
     * <li>0: immediately</li>
     * <li>1: within the O&amp;M window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p><strong>Target specifications for Standard Edition specification changes</strong></p>
     * <p><strong>Primary instance node specifications (for Standard Edition) (general-purpose):</strong></p>
     * <ul>
     * <li>mysql.n2.medium.25	2 cores, 4 GB (general-purpose)</li>
     * <li>mysql.n4.medium.25	2 cores, 8 GB (general-purpose)</li>
     * <li>mysql.n8.medium.25	2 cores, 16 GB (general-purpose)</li>
     * <li>mysql.n2.large.25	4 cores, 8 GB (general-purpose)</li>
     * <li>mysql.n4.large.25	4 cores, 16 GB (general-purpose)</li>
     * <li>mysql.n8.large.25	4 cores, 32 GB (general-purpose)</li>
     * <li>mysql.n2.xlarge.25	8 cores, 16 GB (general-purpose)</li>
     * <li>mysql.n4.xlarge.25	8 cores, 32 GB (general-purpose)</li>
     * <li>mysql.n8.xlarge.25	8 cores, 64 GB (general-purpose)</li>
     * <li>mysql.n2.2xlarge.25	16 cores, 32 GB (general-purpose)</li>
     * <li>mysql.n4.2xlarge.25	16 cores, 64 GB (general-purpose)</li>
     * <li>mysql.n8.2xlarge.25	16 cores, 128 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Primary instance node specifications (for Standard Edition) (dedicated):</strong></p>
     * <ul>
     * <li>mysql.x2.medium.25	2 cores, 4 GB (dedicated)</li>
     * <li>mysql.x4.medium.25	2 cores, 8 GB (dedicated)</li>
     * <li>mysql.x8.medium.25	2 cores, 16 GB (dedicated)</li>
     * <li>mysql.x2.large.25	4 cores, 8 GB (dedicated)</li>
     * <li>mysql.x4.large.25	4 cores, 16 GB (dedicated)</li>
     * <li>mysql.x8.large.25	4 cores, 32 GB (dedicated)</li>
     * <li>mysql.x2.xlarge.25	8 cores, 16 GB (dedicated)</li>
     * <li>mysql.x4.xlarge.25	8 cores, 32 GB (dedicated)</li>
     * <li>mysql.x8.xlarge.25	8 cores, 64 GB (dedicated)</li>
     * <li>mysql.x2.2xlarge.25	16 cores, 32 GB (dedicated)</li>
     * <li>mysql.x4.2xlarge.25	16 cores, 64 GB (dedicated)</li>
     * <li>mysql.x8.2xlarge.25	16 cores, 128 GB (dedicated)</li>
     * </ul>
     * <p><strong>Read-only instance node specifications (for Standard Edition) general-purpose</strong>	</p>
     * <ul>
     * <li>rds.mysql.s2.xlarge 	2 cores, 8 GB (general-purpose)</li>
     * <li>mysqlro.x4.large.1 	4 cores, 16 GB (general-purpose)</li>
     * <li>mysqlro.x4.xlarge.1 	8 cores, 32 GB (general-purpose)</li>
     * <li>mysqlro.x4.2xlarge.1 	16 cores, 64 GB (general-purpose)</li>
     * </ul>
     * <p><strong>Read-only instance node specifications (for Standard Edition) dedicated</strong>	</p>
     * <ul>
     * <li>mysqlro.x8.large.1 	4 cores, 32 GB (dedicated) </li>
     * <li>mysqlro.x8.xlarge.1 	8 cores, 64 GB (dedicated) </li>
     * <li>mysqlro.x8.2xlarge.1 	16 cores, 128 GB (dedicated) </li>
     * <li>mysqlro.x4.4xlarge.1 	32 cores, 128 GB (dedicated) </li>
     * <li>mysqlro.x8.4xlarge.1	32 cores, 256 GB (dedicated).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql.n2.medium.25</p>
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
