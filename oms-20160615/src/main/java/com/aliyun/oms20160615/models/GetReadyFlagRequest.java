// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetReadyFlagRequest extends TeaModel {
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("DomainCode")
    public String domainCode;

    @NameInMap("Filter")
    public String filter;

    @NameInMap("MaxResult")
    public Integer maxResult;

    @NameInMap("NextToken")
    public String nextToken;

    public static GetReadyFlagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReadyFlagRequest self = new GetReadyFlagRequest();
        return TeaModel.build(map, self);
    }

    public GetReadyFlagRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public GetReadyFlagRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetReadyFlagRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetReadyFlagRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetReadyFlagRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetReadyFlagRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public GetReadyFlagRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
