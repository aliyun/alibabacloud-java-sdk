// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ExternalMultiFileRevisionConfig extends TeaModel {
    @NameInMap("revision_count")
    public Long revisionCount;

    @NameInMap("revision_merge_enabled")
    public Boolean revisionMergeEnabled;

    @NameInMap("revision_recycle_period")
    public Long revisionRecyclePeriod;

    public static ExternalMultiFileRevisionConfig build(java.util.Map<String, ?> map) throws Exception {
        ExternalMultiFileRevisionConfig self = new ExternalMultiFileRevisionConfig();
        return TeaModel.build(map, self);
    }

    public ExternalMultiFileRevisionConfig setRevisionCount(Long revisionCount) {
        this.revisionCount = revisionCount;
        return this;
    }
    public Long getRevisionCount() {
        return this.revisionCount;
    }

    public ExternalMultiFileRevisionConfig setRevisionMergeEnabled(Boolean revisionMergeEnabled) {
        this.revisionMergeEnabled = revisionMergeEnabled;
        return this;
    }
    public Boolean getRevisionMergeEnabled() {
        return this.revisionMergeEnabled;
    }

    public ExternalMultiFileRevisionConfig setRevisionRecyclePeriod(Long revisionRecyclePeriod) {
        this.revisionRecyclePeriod = revisionRecyclePeriod;
        return this;
    }
    public Long getRevisionRecyclePeriod() {
        return this.revisionRecyclePeriod;
    }

}
