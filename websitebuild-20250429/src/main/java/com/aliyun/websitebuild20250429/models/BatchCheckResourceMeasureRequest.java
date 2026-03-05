// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BatchCheckResourceMeasureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("BelongId")
    public String belongId;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("BelongIdType")
    public String belongIdType;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>p20202933455</p>
     */
    @NameInMap("EspBizId")
    public String espBizId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;siteversion&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("OrderComponentParams")
    public String orderComponentParams;

    /**
     * <strong>example:</strong>
     * <p>[
     *                   {
     *                     &quot;resourceCode&quot;: &quot;InspirationTokens&quot;,
     *                     &quot;resourceValue&quot;: &quot;0&quot;
     *                   }
     *                 ]</p>
     */
    @NameInMap("ResourceCheckItems")
    public String resourceCheckItems;

    public static BatchCheckResourceMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckResourceMeasureRequest self = new BatchCheckResourceMeasureRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckResourceMeasureRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public BatchCheckResourceMeasureRequest setBelongIdType(String belongIdType) {
        this.belongIdType = belongIdType;
        return this;
    }
    public String getBelongIdType() {
        return this.belongIdType;
    }

    public BatchCheckResourceMeasureRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public BatchCheckResourceMeasureRequest setEspBizId(String espBizId) {
        this.espBizId = espBizId;
        return this;
    }
    public String getEspBizId() {
        return this.espBizId;
    }

    public BatchCheckResourceMeasureRequest setOrderComponentParams(String orderComponentParams) {
        this.orderComponentParams = orderComponentParams;
        return this;
    }
    public String getOrderComponentParams() {
        return this.orderComponentParams;
    }

    public BatchCheckResourceMeasureRequest setResourceCheckItems(String resourceCheckItems) {
        this.resourceCheckItems = resourceCheckItems;
        return this;
    }
    public String getResourceCheckItems() {
        return this.resourceCheckItems;
    }

}
