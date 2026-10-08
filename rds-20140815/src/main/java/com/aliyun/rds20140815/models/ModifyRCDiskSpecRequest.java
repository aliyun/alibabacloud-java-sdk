// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: Only an order is generated. No payment is made.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method has an insufficient balance, set AutoPay to false. An unpaid order is generated. You can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The type of the cloud disk. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd</strong> (default): ESSD cloud disk.</li>
     * <li><strong>cloud_auto</strong>: ESSD AutoPL cloud disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DiskCategory")
    public String diskCategory;

    /**
     * <p>The cloud disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9f3peueu5npsl****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to perform a dry run for this operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: A dry run is performed without executing the change. The check items include request parameters, request format, business limits, and inventory.</li>
     * <li><strong>false</strong> (default): A normal request is sent. After the check is passed, the change is directly executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
     * <ul>
     * <li><p><strong>PL1</strong> (default): A maximum of 50,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><strong>PL2</strong>: A maximum of 100,000 random read/write IOPS per disk.</p>
     * </li>
     * <li><p><strong>PL3</strong>: A maximum of 1,000,000 random read/write IOPS per disk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL2</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCDiskSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskSpecRequest self = new ModifyRCDiskSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyRCDiskSpecRequest setDiskCategory(String diskCategory) {
        this.diskCategory = diskCategory;
        return this;
    }
    public String getDiskCategory() {
        return this.diskCategory;
    }

    public ModifyRCDiskSpecRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ModifyRCDiskSpecRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyRCDiskSpecRequest setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public ModifyRCDiskSpecRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
