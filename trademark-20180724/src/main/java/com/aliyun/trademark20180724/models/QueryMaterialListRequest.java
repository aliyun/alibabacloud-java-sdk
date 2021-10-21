// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMaterialListRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Region")
    public Integer region;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CardNumber")
    public String cardNumber;

    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("MaterialId")
    public Long materialId;

    public static QueryMaterialListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialListRequest self = new QueryMaterialListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMaterialListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QueryMaterialListRequest setRegion(Integer region) {
        this.region = region;
        return this;
    }
    public Integer getRegion() {
        return this.region;
    }

    public QueryMaterialListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryMaterialListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMaterialListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMaterialListRequest setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    public String getCardNumber() {
        return this.cardNumber;
    }

    public QueryMaterialListRequest setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public QueryMaterialListRequest setMaterialId(Long materialId) {
        this.materialId = materialId;
        return this;
    }
    public Long getMaterialId() {
        return this.materialId;
    }

}
