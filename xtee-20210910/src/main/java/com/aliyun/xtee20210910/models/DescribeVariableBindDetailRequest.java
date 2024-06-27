// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableBindDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("defineId")
    public Long defineId;

    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    public static DescribeVariableBindDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableBindDetailRequest self = new DescribeVariableBindDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVariableBindDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVariableBindDetailRequest setDefineId(Long defineId) {
        this.defineId = defineId;
        return this;
    }
    public Long getDefineId() {
        return this.defineId;
    }

    public DescribeVariableBindDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeVariableBindDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
