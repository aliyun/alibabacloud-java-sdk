// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResValueRequest extends TeaModel {
    @NameInMap("AppTaskId")
    public String appTaskId;

    @NameInMap("Index")
    public Integer index;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ResCode")
    public String resCode;

    @NameInMap("ResName")
    public String resName;

    @NameInMap("ResSubType")
    public String resSubType;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("ValueKeyword")
    public String valueKeyword;

    public static QueryAppResValueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResValueRequest self = new QueryAppResValueRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppResValueRequest setAppTaskId(String appTaskId) {
        this.appTaskId = appTaskId;
        return this;
    }
    public String getAppTaskId() {
        return this.appTaskId;
    }

    public QueryAppResValueRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public QueryAppResValueRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryAppResValueRequest setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public QueryAppResValueRequest setResName(String resName) {
        this.resName = resName;
        return this;
    }
    public String getResName() {
        return this.resName;
    }

    public QueryAppResValueRequest setResSubType(String resSubType) {
        this.resSubType = resSubType;
        return this;
    }
    public String getResSubType() {
        return this.resSubType;
    }

    public QueryAppResValueRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public QueryAppResValueRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public QueryAppResValueRequest setValueKeyword(String valueKeyword) {
        this.valueKeyword = valueKeyword;
        return this;
    }
    public String getValueKeyword() {
        return this.valueKeyword;
    }

}
