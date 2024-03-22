// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CreatePlaybookRequest extends TeaModel {
    /**
     * <p>The description of the playbook.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the playbook.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CreatePlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlaybookRequest self = new CreatePlaybookRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlaybookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePlaybookRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreatePlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
