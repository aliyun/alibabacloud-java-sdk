// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusterTaskRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    public static CreateSimilarImageClusterTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusterTaskRequest self = new CreateSimilarImageClusterTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusterTaskRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

}
