// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckResourceMeasureRequest extends TeaModel {
    /**
     * <p>The ID of the owner, such as the website ID or Alibaba Cloud user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <p>The type of the owner ID. Valid values: siteId and uid.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("BelongIdType")
    public String belongIdType;

    /**
     * <p>The ESP business type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The desired total for APP_WORKSPACE. Valid values: 0 to 100000. If this parameter is specified, it takes precedence over ResourceValue and is not added to the existing usage. For new calls, you only need to specify ResourceValue. This parameter is not used for APP or USER.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("DesiredTotal")
    public Long desiredTotal;

    /**
     * <p>The ESP business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p20202933455</p>
     */
    @NameInMap("EspBizId")
    public String espBizId;

    /**
     * <p>The order component parameters. If this parameter is empty, EspBizId and BizType cannot be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;siteversion&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("OrderComponentParams")
    public String orderComponentParams;

    /**
     * <p>The resource identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>InspirationTokens</p>
     */
    @NameInMap("ResourceCode")
    public String resourceCode;

    /**
     * <p>The resource value. This parameter is empty by default and is required only for feature resources. Valid values: 0: Not supported. 1: Supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceValue")
    public Long resourceValue;

    public static CheckResourceMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceMeasureRequest self = new CheckResourceMeasureRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceMeasureRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public CheckResourceMeasureRequest setBelongIdType(String belongIdType) {
        this.belongIdType = belongIdType;
        return this;
    }
    public String getBelongIdType() {
        return this.belongIdType;
    }

    public CheckResourceMeasureRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckResourceMeasureRequest setDesiredTotal(Long desiredTotal) {
        this.desiredTotal = desiredTotal;
        return this;
    }
    public Long getDesiredTotal() {
        return this.desiredTotal;
    }

    public CheckResourceMeasureRequest setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public CheckResourceMeasureRequest setOrderComponentParams(String orderComponentParams) {
        this.orderComponentParams = orderComponentParams;
        return this;
    }
    public String getOrderComponentParams() {
        return this.orderComponentParams;
    }

    public CheckResourceMeasureRequest setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public CheckResourceMeasureRequest setResourceValue(Long resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }
    public Long getResourceValue() {
        return this.resourceValue;
    }

}
