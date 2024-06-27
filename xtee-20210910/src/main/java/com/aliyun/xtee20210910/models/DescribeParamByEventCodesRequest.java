// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamByEventCodesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    @NameInMap("parma")
    public String parma;

    @NameInMap("regId")
    public String regId;

    public static DescribeParamByEventCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeParamByEventCodesRequest self = new DescribeParamByEventCodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeParamByEventCodesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeParamByEventCodesRequest setEventCodes(String eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public String getEventCodes() {
        return this.eventCodes;
    }

    public DescribeParamByEventCodesRequest setParma(String parma) {
        this.parma = parma;
        return this;
    }
    public String getParma() {
        return this.parma;
    }

    public DescribeParamByEventCodesRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
