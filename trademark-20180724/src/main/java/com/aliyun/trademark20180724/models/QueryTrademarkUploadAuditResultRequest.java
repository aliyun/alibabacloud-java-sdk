// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkUploadAuditResultRequest extends TeaModel {
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

    public static QueryTrademarkUploadAuditResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkUploadAuditResultRequest self = new QueryTrademarkUploadAuditResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkUploadAuditResultRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public QueryTrademarkUploadAuditResultRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkUploadAuditResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTrademarkUploadAuditResultRequest setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
        return this;
    }
    public String getRegisterCode() {
        return this.registerCode;
    }

    public QueryTrademarkUploadAuditResultRequest setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public QueryTrademarkUploadAuditResultRequest setTmType(String tmType) {
        this.tmType = tmType;
        return this;
    }
    public String getTmType() {
        return this.tmType;
    }

}
