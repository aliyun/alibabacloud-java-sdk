// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskRequest extends TeaModel {
    @NameInMap("Images")
    public String images;

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
