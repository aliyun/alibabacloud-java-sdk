// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SampleFileDownloadRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegId")
    public String regId;

    @NameInMap("Tab")
    public String tab;

    public static SampleFileDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        SampleFileDownloadRequest self = new SampleFileDownloadRequest();
        return TeaModel.build(map, self);
    }

    public SampleFileDownloadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SampleFileDownloadRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public SampleFileDownloadRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
