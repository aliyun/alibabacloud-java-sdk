// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("condition")
    public String condition;

    @NameInMap("inputs")
    public String inputs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeFieldListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldListRequest self = new DescribeFieldListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFieldListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFieldListRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public DescribeFieldListRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public DescribeFieldListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
