// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSampleFileRequest extends TeaModel {
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

    /**
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
