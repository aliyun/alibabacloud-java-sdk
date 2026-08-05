// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class DeleteExperienceDataRequest extends TeaModel {
    /**
     * <p>Whether this is a dry run request</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static DeleteExperienceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperienceDataRequest self = new DeleteExperienceDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExperienceDataRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
