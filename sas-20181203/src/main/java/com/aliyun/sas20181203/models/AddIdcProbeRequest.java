// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddIdcProbeRequest extends TeaModel {
    /**
     * <p>The name of the data center.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IdcName")
    public String idcName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("IdcRegion")
    public String idcRegion;

    /**
     * <p>The scan interval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IntervalPeriod")
    public Integer intervalPeriod;

    /**
     * <p>The settings of the CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX/24</p>
     */
    @NameInMap("IpSegments")
    public String ipSegments;

    /**
     * <p>The Linux port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("LinuxPort")
    public String linuxPort;

    /**
     * <p>The unit of the scan interval. Valid values:</p>
     * <ul>
     * <li><strong>day</strong></li>
     * <li><strong>hour</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>076a446d-df7d-424c-bdc5-bb5dc7f1****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The Windows port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("WinPort")
    public String winPort;

    public static AddIdcProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIdcProbeRequest self = new AddIdcProbeRequest();
        return TeaModel.build(map, self);
    }

    public AddIdcProbeRequest setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public AddIdcProbeRequest setIdcRegion(String idcRegion) {
        this.idcRegion = idcRegion;
        return this;
    }
    public String getIdcRegion() {
        return this.idcRegion;
    }

    public AddIdcProbeRequest setIntervalPeriod(Integer intervalPeriod) {
        this.intervalPeriod = intervalPeriod;
        return this;
    }
    public Integer getIntervalPeriod() {
        return this.intervalPeriod;
    }

    public AddIdcProbeRequest setIpSegments(String ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }
    public String getIpSegments() {
        return this.ipSegments;
    }

    public AddIdcProbeRequest setLinuxPort(String linuxPort) {
        this.linuxPort = linuxPort;
        return this;
    }
    public String getLinuxPort() {
        return this.linuxPort;
    }

    public AddIdcProbeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public AddIdcProbeRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public AddIdcProbeRequest setWinPort(String winPort) {
        this.winPort = winPort;
        return this;
    }
    public String getWinPort() {
        return this.winPort;
    }

}
