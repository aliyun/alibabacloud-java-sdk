// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSampleDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SampleId")
    public Integer sampleId;

    public static GetSampleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSampleDetailRequest self = new GetSampleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSampleDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetSampleDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public GetSampleDetailRequest setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Integer getSampleId() {
        return this.sampleId;
    }

}
