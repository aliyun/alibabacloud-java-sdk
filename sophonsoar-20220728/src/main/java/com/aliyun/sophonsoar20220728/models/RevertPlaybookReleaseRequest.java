// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RevertPlaybookReleaseRequest extends TeaModel {
    @NameInMap("IsPublish")
    public Boolean isPublish;

    @NameInMap("PlayReleaseId")
    public Integer playReleaseId;

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
