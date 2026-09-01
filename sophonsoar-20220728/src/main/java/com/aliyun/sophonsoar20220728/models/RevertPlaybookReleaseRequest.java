// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RevertPlaybookReleaseRequest extends TeaModel {
    /**
     * <p>Specifies whether to publish the playbook after the rollback.</p>
     * <ul>
     * <li><p><strong>true</strong> (default): Publishes the playbook after the rollback.</p>
     * </li>
     * <li><p><strong>false</strong>: Rolls back the playbook without publishing it.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPublish")
    public Boolean isPublish;

    /**
     * <p>The ID of the published playbook version.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybookReleases~~">DescribePlaybookReleases</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3f97b56e-064e-47e7-a309-xxxxxxx</p>
     */
    @NameInMap("PlayReleaseId")
    public Integer playReleaseId;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>185295a1-c987-4b64-8796-xxxxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static RevertPlaybookReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertPlaybookReleaseRequest self = new RevertPlaybookReleaseRequest();
        return TeaModel.build(map, self);
    }

    public RevertPlaybookReleaseRequest setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }
    public Boolean getIsPublish() {
        return this.isPublish;
    }

    public RevertPlaybookReleaseRequest setPlayReleaseId(Integer playReleaseId) {
        this.playReleaseId = playReleaseId;
        return this;
    }
    public Integer getPlayReleaseId() {
        return this.playReleaseId;
    }

    public RevertPlaybookReleaseRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
