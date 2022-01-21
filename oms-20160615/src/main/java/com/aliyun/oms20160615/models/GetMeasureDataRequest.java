// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetMeasureDataRequest extends TeaModel {
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

    @NameInMap("QueryField")
    public String queryField;

    public static GetMeasureDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMeasureDataRequest self = new GetMeasureDataRequest();
        return TeaModel.build(map, self);
    }

    public GetMeasureDataRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public GetMeasureDataRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetMeasureDataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetMeasureDataRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public GetMeasureDataRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public GetMeasureDataRequest setMaxResult(Integer maxResult) {
        this.maxResult = maxResult;
        return this;
    }
    public Integer getMaxResult() {
        return this.maxResult;
    }

    public GetMeasureDataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetMeasureDataRequest setQueryField(String queryField) {
        this.queryField = queryField;
        return this;
    }
    public String getQueryField() {
        return this.queryField;
    }

}
