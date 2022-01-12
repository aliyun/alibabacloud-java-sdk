// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResValueRequest extends TeaModel {
    // 应用任务id
    @NameInMap("AppTaskId")
    public String appTaskId;

    // 页码, 从0开始
    @NameInMap("Index")
    public Integer index;

    // 代码或名称like
    @NameInMap("Keyword")
    public String keyword;

    // 配置代码
    @NameInMap("ResCode")
    public String resCode;

    // 配置名称
    @NameInMap("ResName")
    public String resName;

    // 配置子类型
    @NameInMap("ResSubType")
    public String resSubType;

    // 配置类型
    @NameInMap("ResType")
    public String resType;

    // 页大小
    @NameInMap("Size")
    public Integer size;

    // 值like
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
