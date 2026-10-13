// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: generates an order without deducting fees.<blockquote>
     * <p>If your account balance is insufficient, you can set the AutoPay parameter to false. An unpaid order is generated. You can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to automatically use coupons. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: automatically uses coupons. This is the default value.</li>
     * <li><strong>false</strong>: does not automatically use coupons.</li>
     * </ul>
     * <blockquote>
     * <p>If you use a coupon and then downgrade the instance type, the amount deducted by the voucher is not refunded.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The instance upgrade or downgrade type. Valid values:</p>
     * <blockquote>
     * <p>You do not need to specify this parameter. The system automatically determines whether to upgrade or downgrade the instance type. If you want to specify it, follow these rules:</p>
     * </blockquote>
     * <ul>
     * <li><strong>Up</strong> (default): upgrades the instance type. Make sure that your account balance is sufficient.</li>
     * <li><strong>Down</strong>: downgrades the instance type. When the instance type specified in InstanceType is lower than the current instance type, set Direction to Down.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>Specifies whether to perform a precheck on the instance creation operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a precheck without creating an instance. Check items include request parameters, request format, service limits, and inventory.</li>
     * <li><strong>false</strong>: sends a normal request and directly creates the instance after the request passes the precheck. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>The destination instance type. For more information about the instance types supported by RDS Target instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Target instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.i8.large.2cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>72329885****</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The restart time of the instance.</p>
     * <ul>
     * <li>If <strong>RebootWhenFinished</strong> is set to <strong>false</strong> and the instance is in the <strong>Running</strong> state, you <strong>must</strong> specify a restart time within 48 hours.</li>
     * <li>Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2025-04-03T12:05Z</p>
     */
    @NameInMap("RebootTime")
    public String rebootTime;

    /**
     * <p>Specifies whether to immediately restart the instance after the instance type change is complete. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: restarts the instance immediately. This is the default value.</li>
     * <li><strong>false</strong>: does not restart the instance immediately.</li>
     * </ul>
     * <blockquote>
     * <p>If the instance is in the <strong>Stopped</strong> state, it remains in the Stopped state and is not restarted even if you set RebootWhenFinished to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RebootWhenFinished")
    public Boolean rebootWhenFinished;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hagnzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceRequest self = new ModifyRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyRCInstanceRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyRCInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public ModifyRCInstanceRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyRCInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyRCInstanceRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyRCInstanceRequest setRebootTime(String rebootTime) {
        this.rebootTime = rebootTime;
        return this;
    }
    public String getRebootTime() {
        return this.rebootTime;
    }

    public ModifyRCInstanceRequest setRebootWhenFinished(Boolean rebootWhenFinished) {
        this.rebootWhenFinished = rebootWhenFinished;
        return this;
    }
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    public ModifyRCInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
