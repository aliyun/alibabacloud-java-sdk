// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktIterationmeetingRequest extends TeaModel {
    @NameInMap("Begin")
    public String begin;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Length")
    public String length;

    public static ListLinkeLinktIterationmeetingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktIterationmeetingRequest self = new ListLinkeLinktIterationmeetingRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktIterationmeetingRequest setBegin(String begin) {
        this.begin = begin;
        return this;
    }
    public String getBegin() {
        return this.begin;
    }

    public ListLinkeLinktIterationmeetingRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public ListLinkeLinktIterationmeetingRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

}
