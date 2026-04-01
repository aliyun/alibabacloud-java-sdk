// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResizeRCInstanceDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables the feature. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and insufficient inventory errors.</li>
     * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new disk size. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NewSize")
    public Long newSize;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The method that you want to use to resize the disk. Valid values:</p>
     * <ul>
     * <li><strong>offline</strong> (default): resizes disks offline. After you resize a disk offline, you must restart the instance for the resizing operation to take effect.</li>
     * <li><strong>online</strong>: resizes disks online. After you resize a disk online, the resizing operation takes effect immediately and you do not need to restart the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Type")
    public String type;

    public static ResizeRCInstanceDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeRCInstanceDiskRequest self = new ResizeRCInstanceDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeRCInstanceDiskRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ResizeRCInstanceDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResizeRCInstanceDiskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ResizeRCInstanceDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResizeRCInstanceDiskRequest setNewSize(Long newSize) {
        this.newSize = newSize;
        return this;
    }
    public Long getNewSize() {
        return this.newSize;
    }

    public ResizeRCInstanceDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeRCInstanceDiskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
