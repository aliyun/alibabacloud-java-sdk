// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateSampleBatchRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Batch operation IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>324,343</p>
     */
    @NameInMap("ids")
    public String ids;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Tags (comma-separated).</p>
     * 
     * <strong>example:</strong>
     * <p>rm0102,rm0103</p>
     */
    @NameInMap("tags")
    public String tags;

    /**
     * <p>Version number (latest).</p>
     * 
     * <strong>example:</strong>
     * <p>1,1</p>
     */
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
