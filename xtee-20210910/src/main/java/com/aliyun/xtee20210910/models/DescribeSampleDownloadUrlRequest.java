// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleDownloadUrlRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sampleId")
    public Long sampleId;

    public static DescribeSampleDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDownloadUrlRequest self = new DescribeSampleDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleDownloadUrlRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleDownloadUrlRequest setSampleId(Long sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Long getSampleId() {
        return this.sampleId;
    }

}
