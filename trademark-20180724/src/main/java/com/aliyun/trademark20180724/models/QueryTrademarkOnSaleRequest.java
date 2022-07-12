// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkOnSaleRequest extends TeaModel {
    @NameInMap("Classification")
    public String classification;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegisterCode")
    public String registerCode;

    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("TmType")
    public String tmType;

    public static QueryTrademarkOnSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkOnSaleRequest self = new QueryTrademarkOnSaleRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkOnSaleRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public QueryTrademarkOnSaleRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkOnSaleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkOnSaleRequest setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public QueryTrademarkOnSaleRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public QueryTrademarkOnSaleRequest setTmType(String tmType) {
        this.tmType = tmType;
        return this;
    }
    public String getTmType() {
        return this.tmType;
    }

}
