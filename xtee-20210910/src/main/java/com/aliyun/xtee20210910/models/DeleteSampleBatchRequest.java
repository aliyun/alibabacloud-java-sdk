// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleBatchRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ids")
    public String ids;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("versions")
    public String versions;

    public static DeleteSampleBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSampleBatchRequest self = new DeleteSampleBatchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSampleBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteSampleBatchRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteSampleBatchRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeleteSampleBatchRequest setVersions(String versions) {
        this.versions = versions;
        return this;
    }
    public String getVersions() {
        return this.versions;
    }

}
