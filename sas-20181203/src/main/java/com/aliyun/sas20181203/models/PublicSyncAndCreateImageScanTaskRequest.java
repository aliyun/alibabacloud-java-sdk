// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskRequest extends TeaModel {
    /**
     * <p>The status of the image scan task. Valid values:</p>
     * <br>
     * <p>*   **INIT**: The task is being initialized.</p>
     * <p>*   **PRE_ANALYZER**: The task is being pre-processed.</p>
     * <p>*   **SUCCESS**: The task is successful.</p>
     * <p>*   **FAIL**: The task failed.</p>
     */
    @NameInMap("Images")
    public String images;

    /**
     * <p>The ID of the image scan task.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static PublicSyncAndCreateImageScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PublicSyncAndCreateImageScanTaskRequest self = new PublicSyncAndCreateImageScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public PublicSyncAndCreateImageScanTaskRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public PublicSyncAndCreateImageScanTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
