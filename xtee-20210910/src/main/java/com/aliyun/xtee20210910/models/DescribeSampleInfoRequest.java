// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("id")
    public Long id;

    @NameInMap("regId")
    public String regId;

    @NameInMap("versions")
    public Integer versions;

    public static DescribeSampleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleInfoRequest self = new DescribeSampleInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSampleInfoRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSampleInfoRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeSampleInfoRequest setVersions(Integer versions) {
        this.versions = versions;
        return this;
    }
    public Integer getVersions() {
        return this.versions;
    }

}
