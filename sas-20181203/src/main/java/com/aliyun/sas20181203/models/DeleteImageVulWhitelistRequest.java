// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteImageVulWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the whitelist. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteImageVulWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageVulWhitelistRequest self = new DeleteImageVulWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageVulWhitelistRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteImageVulWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
