// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PushResourceMeasureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Amount")
    public Long amount;

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
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;MD5\&quot;:\&quot;8ba46100bd898461f0f589704f2fad25\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;769\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:false,\&quot;uefi_preferred\&quot;:false}</p>
     */
    @NameInMap("MeasureData")
    public String measureData;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;MD5\&quot;:\&quot;8ba46100bd898461f0f589704f2fad25\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;769\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:false,\&quot;uefi_preferred\&quot;:false}</p>
     */
    @NameInMap("MetaData")
    public String metaData;

    /**
     * <strong>example:</strong>
     * <p>InspirationTokens</p>
     */
    @NameInMap("ResourceCode")
    public String resourceCode;

    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("UseTime")
    public String useTime;

    /**
     * <strong>example:</strong>
     * <p>MANUAL_BIZ</p>
     */
    @NameInMap("UseType")
    public String useType;

    public static PushResourceMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        PushResourceMeasureRequest self = new PushResourceMeasureRequest();
        return TeaModel.build(map, self);
    }

    public PushResourceMeasureRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public PushResourceMeasureRequest setBelongId(String belongId) {
        this.belongId = belongId;
        return this;
    }
    public String getBelongId() {
        return this.belongId;
    }

    public PushResourceMeasureRequest setBelongIdType(String belongIdType) {
        this.belongIdType = belongIdType;
        return this;
    }
    public String getBelongIdType() {
        return this.belongIdType;
    }

    public PushResourceMeasureRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PushResourceMeasureRequest setMeasureData(String measureData) {
        this.measureData = measureData;
        return this;
    }
    public String getMeasureData() {
        return this.measureData;
    }

    public PushResourceMeasureRequest setMetaData(String metaData) {
        this.metaData = metaData;
        return this;
    }
    public String getMetaData() {
        return this.metaData;
    }

    public PushResourceMeasureRequest setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public PushResourceMeasureRequest setUseTime(String useTime) {
        this.useTime = useTime;
        return this;
    }
    public String getUseTime() {
        return this.useTime;
    }

    public PushResourceMeasureRequest setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
