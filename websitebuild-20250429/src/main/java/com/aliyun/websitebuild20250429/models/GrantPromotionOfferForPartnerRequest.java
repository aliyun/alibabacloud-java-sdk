// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GrantPromotionOfferForPartnerRequest extends TeaModel {
    @NameInMap("ActivityCode")
    public String activityCode;

    /**
     * <p>The activity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>232</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <p>The channel.</p>
     * 
     * <strong>example:</strong>
     * <p>WECHAT</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The employee code.</p>
     * 
     * <strong>example:</strong>
     * <p>WB02409424</p>
     */
    @NameInMap("EmployeeCode")
    public String employeeCode;

    /**
     * <p>The operation remarks (audit information).</p>
     * 
     * <strong>example:</strong>
     * <p>hz-maven</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static GrantPromotionOfferForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionOfferForPartnerRequest self = new GrantPromotionOfferForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GrantPromotionOfferForPartnerRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public GrantPromotionOfferForPartnerRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public GrantPromotionOfferForPartnerRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public GrantPromotionOfferForPartnerRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GrantPromotionOfferForPartnerRequest setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
        return this;
    }
    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public GrantPromotionOfferForPartnerRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
