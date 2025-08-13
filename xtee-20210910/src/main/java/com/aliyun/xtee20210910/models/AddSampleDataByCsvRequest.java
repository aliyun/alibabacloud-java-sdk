// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class AddSampleDataByCsvRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Uploaded OSS address.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/path/test.csv</p>
     */
    @NameInMap("ossFileName")
    public String ossFileName;

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
     * <p>1806507582222226_saf_sample_split_coupon_abuse_saf_sample_split_mobile_saf_sample_split_pass</p>
     */
    @NameInMap("sampleBatchUuid")
    public String sampleBatchUuid;

    public static AddSampleDataByCsvRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSampleDataByCsvRequest self = new AddSampleDataByCsvRequest();
        return TeaModel.build(map, self);
    }

    public AddSampleDataByCsvRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddSampleDataByCsvRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public AddSampleDataByCsvRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public AddSampleDataByCsvRequest setSampleBatchUuid(String sampleBatchUuid) {
        this.sampleBatchUuid = sampleBatchUuid;
        return this;
    }
    public String getSampleBatchUuid() {
        return this.sampleBatchUuid;
    }

}
