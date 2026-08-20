// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordWeightRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. If you do not specify this parameter, the system automatically generates a value. To ensure uniqueness across different requests, the value cannot exceed 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>210bc45716943908285687176dcf0a</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5808</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The updated weight value <code>[0,100]</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateZoneRecordWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordWeightRequest self = new UpdateZoneRecordWeightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordWeightRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateZoneRecordWeightRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateZoneRecordWeightRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordWeightRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
