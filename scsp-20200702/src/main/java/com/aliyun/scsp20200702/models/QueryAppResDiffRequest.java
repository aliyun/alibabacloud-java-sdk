// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResDiffRequest extends TeaModel {
    @NameInMap("AppTaskId")
    public String appTaskId;

    @NameInMap("DiffKeyword")
    public String diffKeyword;

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

    public static QueryAppResDiffRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResDiffRequest self = new QueryAppResDiffRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppResDiffRequest setAppTaskId(String appTaskId) {
        this.appTaskId = appTaskId;
        return this;
    }
    public String getAppTaskId() {
        return this.appTaskId;
    }

    public QueryAppResDiffRequest setDiffKeyword(String diffKeyword) {
        this.diffKeyword = diffKeyword;
        return this;
    }
    public String getDiffKeyword() {
        return this.diffKeyword;
    }

    public QueryAppResDiffRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public QueryAppResDiffRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryAppResDiffRequest setResCode(String resCode) {
        this.resCode = resCode;
        return this;
    }
    public String getResCode() {
        return this.resCode;
    }

    public QueryAppResDiffRequest setResName(String resName) {
        this.resName = resName;
        return this;
    }
    public String getResName() {
        return this.resName;
    }

    public QueryAppResDiffRequest setResSubType(String resSubType) {
        this.resSubType = resSubType;
        return this;
    }
    public String getResSubType() {
        return this.resSubType;
    }

    public QueryAppResDiffRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public QueryAppResDiffRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
