// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckUserResourceMeasureRequest extends TeaModel {
    /**
     * <p>The owner ID, which can be a website ID or an Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <p>The type of the owner ID. Valid values:</p>
     * <ul>
     * <li>siteId</li>
     * <li>uid.</li>
     * </ul>
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
     * <p>The ESP business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p20202933455</p>
     */
    @NameInMap("EspBizId")
    public String espBizId;

    /**
     * <p>The order module information. If this parameter is empty, espBizId and bizType cannot be empty.</p>
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
     * <p>The resource value. This parameter is empty by default and is required only for feature-type resources. Valid values:</p>
     * <ul>
     * <li>0: Not supported.</li>
     * <li>1: Supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceValue")
    public Long resourceValue;

    public static CheckUserResourceMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserResourceMeasureRequest self = new CheckUserResourceMeasureRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserResourceMeasureRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public CheckUserResourceMeasureRequest setBelongIdType(String belongIdType) {
        this.belongIdType = belongIdType;
        return this;
    }
    public String getBelongIdType() {
        return this.belongIdType;
    }

    public CheckUserResourceMeasureRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckUserResourceMeasureRequest setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public CheckUserResourceMeasureRequest setOrderComponentParams(String orderComponentParams) {
        this.orderComponentParams = orderComponentParams;
        return this;
    }
    public String getOrderComponentParams() {
        return this.orderComponentParams;
    }

    public CheckUserResourceMeasureRequest setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public CheckUserResourceMeasureRequest setResourceValue(Long resourceValue) {
        this.resourceValue = resourceValue;
        return this;
    }
    public Long getResourceValue() {
        return this.resourceValue;
    }

}
