// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSampleFileRequest extends TeaModel {
    /**
     * <p>Language of error messages returned by the API. Valid values: zh: Chinese. en: English. Default value: en.</p>
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
     * <p>Sample ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SampleId")
    public Integer sampleId;

    /**
     * <p>Scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static DownloadSampleFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSampleFileRequest self = new DownloadSampleFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSampleFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadSampleFileRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DownloadSampleFileRequest setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
        return this;
    }
    public Integer getSampleId() {
        return this.sampleId;
    }

    public DownloadSampleFileRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
