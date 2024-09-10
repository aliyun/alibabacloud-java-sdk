// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyIdcProbeRequest extends TeaModel {
    /**
     * <p>The name of the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdcName")
    public String idcName;

    /**
     * <p>The region ID of the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("IdcRegion")
    public String idcRegion;

    /**
     * <p>The scan interval.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    /**
     * <p>The settings of the CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX/24</p>
     */
    @NameInMap("IpSegments")
    public String ipSegments;

    /**
     * <p>The Linux port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("LinuxPort")
    public String linuxPort;

    /**
     * <p>The unit of the scan interval. Valid values:</p>
     * <ul>
     * <li><strong>day</strong></li>
     * <li><strong>hour</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The usage status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: enabled.</li>
     * <li><strong>1</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b6d4072118f487094199cedf90c****,f6310b7976144639867beea2f346****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The Windows port.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("WinPort")
    public String winPort;

    public static ModifyIdcProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIdcProbeRequest self = new ModifyIdcProbeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIdcProbeRequest setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public ModifyIdcProbeRequest setIdcRegion(String idcRegion) {
        this.idcRegion = idcRegion;
        return this;
    }
    public String getIdcRegion() {
        return this.idcRegion;
    }

    public ModifyIdcProbeRequest setIntervalPeriod(Integer intervalPeriod) {
        this.intervalPeriod = intervalPeriod;
        return this;
    }
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    public ModifyIdcProbeRequest setIpSegments(String ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }
    public String getIpSegments() {
        return this.ipSegments;
    }

    public ModifyIdcProbeRequest setLinuxPort(String linuxPort) {
        this.linuxPort = linuxPort;
        return this;
    }
    public String getLinuxPort() {
        return this.linuxPort;
    }

    public ModifyIdcProbeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public ModifyIdcProbeRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModifyIdcProbeRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public ModifyIdcProbeRequest setWinPort(String winPort) {
        this.winPort = winPort;
        return this;
    }
    public String getWinPort() {
        return this.winPort;
    }

}
