// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class PublishPlaybookRequest extends TeaModel {
    /**
     * <p>The description of the published version.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a waf processing playbook</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac343acc-1a61-4084-9a1c-xxxxxxx</p>
     */
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
