// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineLoaRequest extends TeaModel {
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("TrademarkName")
    public String trademarkName;

    @NameInMap("MaterialName")
    public String materialName;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("Address")
    public String address;

    @NameInMap("TmProduceType")
    public String tmProduceType;

    @NameInMap("PrincipalName")
    public Integer principalName;

    public static CombineLoaRequest build(java.util.Map<String, ?> map) throws Exception {
        CombineLoaRequest self = new CombineLoaRequest();
        return TeaModel.build(map, self);
    }

    public CombineLoaRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public CombineLoaRequest setTrademarkName(String trademarkName) {
        this.trademarkName = trademarkName;
        return this;
    }
    public String getTrademarkName() {
        return this.trademarkName;
    }

    public CombineLoaRequest setMaterialName(String materialName) {
        this.materialName = materialName;
        return this;
    }
    public String getMaterialName() {
        return this.materialName;
    }

    public CombineLoaRequest setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public CombineLoaRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CombineLoaRequest setTmProduceType(String tmProduceType) {
        this.tmProduceType = tmProduceType;
        return this;
    }
    public String getTmProduceType() {
        return this.tmProduceType;
    }

    public CombineLoaRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

}
