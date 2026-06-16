// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckSampleNameRequest extends TeaModel {
    /**
     * <p>Language of error messages returned by the API. Valid values: zh: Chinese; en: English. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Sample name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleTest</p>
     */
    @NameInMap("SampleName")
    public String sampleName;

    public static CheckSampleNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSampleNameRequest self = new CheckSampleNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckSampleNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckSampleNameRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CheckSampleNameRequest setSampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }
    public String getSampleName() {
        return this.sampleName;
    }

}
