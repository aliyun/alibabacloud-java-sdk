// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateSampleBatchRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ids")
    public String ids;

    @NameInMap("regId")
    public String regId;

    @NameInMap("tags")
    public String tags;

    @NameInMap("versions")
    public String versions;

    public static UpdateSampleBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleBatchRequest self = new UpdateSampleBatchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSampleBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateSampleBatchRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public UpdateSampleBatchRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UpdateSampleBatchRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateSampleBatchRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
