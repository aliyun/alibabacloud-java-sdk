// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RevertPlaybookReleaseRequest extends TeaModel {
    /**
     * <p>Specifies whether to directly publish the new playbook after the rollback.</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IsPublish")
    public Boolean isPublish;

    /**
     * <p>The version of the playbook that you want to publish.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybookReleases](~~DescribePlaybookReleases~~) operation to query the playbook version.</p>
     */
    @NameInMap("PlayReleaseId")
    public Integer playReleaseId;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
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
