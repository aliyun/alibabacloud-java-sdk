// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true (default)</strong>: automatically completes the payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The new disk type. Valid values:</p>
     * <ul>
     * <li><strong>cloud_essd</strong>: ESSD.</li>
     * <li><strong>cloud_auto</strong>: ESSD AutoPL disk</li>
     * </ul>
     * <p>This parameter is empty by default.</p>
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
     * <p>Specifies whether to perform a dry run. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not perform the actual request. The system checks the request parameters, request syntax, limits, and available resources.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The PL of the disk. Valid values:</p>
     * <ul>
     * <li><strong>PL1</strong> (default): A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
     * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
     * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL2</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The ID of the region in which the instance resides.</p>
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
