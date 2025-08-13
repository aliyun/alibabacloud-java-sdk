// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteSampleBatchRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values: </p>
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
     * <p>IDs for batch deletion operations.</p>
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
     * <p>List of versions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,1</p>
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
