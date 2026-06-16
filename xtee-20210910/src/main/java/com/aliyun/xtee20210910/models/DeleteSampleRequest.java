// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleRequest extends TeaModel {
    /**
     * <p>Language of the error message returned by the API. Valid values: zh: Chinese; en: English. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>ID of the sample to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SampleId")
    public Integer sampleId;

    public static DeleteSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleRequest self = new DeleteSampleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSampleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSampleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeleteSampleRequest setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Integer getSampleId() {
        return this.sampleId;
    }

}
