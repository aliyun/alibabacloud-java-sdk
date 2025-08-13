// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeParamByEventCodesRequest extends TeaModel {
    /**
     * <p>Set the language type for request and response, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Event code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse_pro,account_abuse</p>
     */
    @NameInMap("eventCodes")
    public String eventCodes;

    /**
     * <p>Query condition</p>
     * 
     * <strong>example:</strong>
     * <p>标题/描述</p>
     */
    @NameInMap("parma")
    public String parma;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
