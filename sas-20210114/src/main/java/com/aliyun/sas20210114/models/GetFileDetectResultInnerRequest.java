// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class GetFileDetectResultInnerRequest extends TeaModel {
    @NameInMap("DnaHashKeyList")
    public java.util.List<String> dnaHashKeyList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HashKeyList")
    public java.util.List<String> hashKeyList;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public Integer type;

    public static GetFileDetectResultInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectResultInnerRequest self = new GetFileDetectResultInnerRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDetectResultInnerRequest setDnaHashKeyList(java.util.List<String> dnaHashKeyList) {
        this.dnaHashKeyList = dnaHashKeyList;
        return this;
    }
    public java.util.List<String> getDnaHashKeyList() {
        return this.dnaHashKeyList;
    }

    public GetFileDetectResultInnerRequest setHashKeyList(java.util.List<String> hashKeyList) {
        this.hashKeyList = hashKeyList;
        return this;
    }
    public java.util.List<String> getHashKeyList() {
        return this.hashKeyList;
    }

    public GetFileDetectResultInnerRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public GetFileDetectResultInnerRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public GetFileDetectResultInnerRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
