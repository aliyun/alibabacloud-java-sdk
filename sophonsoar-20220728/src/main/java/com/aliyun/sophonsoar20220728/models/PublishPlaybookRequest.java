// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class PublishPlaybookRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static PublishPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishPlaybookRequest self = new PublishPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public PublishPlaybookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
