// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class AddSampleDataByTextRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>List data.</p>
     * 
     * <strong>example:</strong>
     * <p>testA \n testB</p>
     */
    @NameInMap("dataValue")
    public String dataValue;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Sample UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>1806507582222226
     * _saf_sample_split_coupon_abuse_saf_sample_split_mobile_saf_sample_split_pass</p>
     */
    @NameInMap("sampleBatchUuid")
    public String sampleBatchUuid;

    public static AddSampleDataByTextRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSampleDataByTextRequest self = new AddSampleDataByTextRequest();
        return TeaModel.build(map, self);
    }

    public AddSampleDataByTextRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddSampleDataByTextRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public AddSampleDataByTextRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public AddSampleDataByTextRequest setSampleBatchUuid(String sampleBatchUuid) {
        this.sampleBatchUuid = sampleBatchUuid;
        return this;
    }
    public String getSampleBatchUuid() {
        return this.sampleBatchUuid;
    }

}
