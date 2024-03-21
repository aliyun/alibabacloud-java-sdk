// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class QueryDetailItemRequest extends TeaModel {
    @NameInMap("DetailConvertType")
    public String detailConvertType;

    @NameInMap("DetailId")
    public String detailId;

    @NameInMap("DetailType")
    public String detailType;

    @NameInMap("Mock")
    public Boolean mock;

    public static QueryDetailItemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailItemRequest self = new QueryDetailItemRequest();
        return TeaModel.build(map, self);
    }

    public QueryDetailItemRequest setDetailConvertType(String detailConvertType) {
        this.detailConvertType = detailConvertType;
        return this;
    }
    public String getDetailConvertType() {
        return this.detailConvertType;
    }

    public QueryDetailItemRequest setDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }
    public String getDetailId() {
        return this.detailId;
    }

    public QueryDetailItemRequest setDetailType(String detailType) {
        this.detailType = detailType;
        return this;
    }
    public String getDetailType() {
        return this.detailType;
    }

    public QueryDetailItemRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
