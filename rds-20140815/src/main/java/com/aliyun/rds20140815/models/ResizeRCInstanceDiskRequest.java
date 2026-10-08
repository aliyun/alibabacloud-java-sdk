// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResizeRCInstanceDiskRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: Only an order is generated. No payment is made.<blockquote>
     * <p>If your payment method has an insufficient balance, set AutoPay to false. An unpaid order is generated. You can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The cloud disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-x4462840nwinu6rr61m5o</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without creating the instance. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the check, the instance is created.</li>
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
     * <p>The size of the disk after expansion. Unit: GiB.</p>
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
     * <p>The method used to expand the disk. Valid values:</p>
     * <ul>
     * <li><strong>offline</strong> (default): Offline expansion. You must restart the instance for the expansion to take effect.</li>
     * <li><strong>online</strong>: Online expansion. The expansion takes effect without restarting the instance.</li>
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
