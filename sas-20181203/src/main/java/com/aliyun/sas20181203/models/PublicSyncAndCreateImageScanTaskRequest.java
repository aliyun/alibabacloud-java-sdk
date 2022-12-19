// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskRequest extends TeaModel {
    // The information about the images. The value of this parameter is in the JSON format and contains the following fields:
    // 
    // *   **RegistryType**: the type of the image repository. Valid values:
    // 
    //     *   acr
    //     *   harbor
    //     *   quay
    // 
    // *   **RepoId**: the ID of the image repository.
    // 
    // *   **InstanceId**: the ID of the Container Registry instance to which the image repository belongs.
    // 
    // *   **RepoNamespace**: the namespace to which the image repository belongs.
    // 
    // *   **RegionId**: the region ID of the image.
    // 
    // *   **RepoName**: the name of the image repository.
    // 
    // *   **Digest**: the digest of the image.
    // 
    // *   **Tag**: the tag that is added to the image.
    // 
    // *   **CreateTime**: the timestamp when the image was created. Unit: milliseconds.
    // 
    // *   **UpdateTime**: the timestamp when the image was updated. Unit: milliseconds.
    @NameInMap("Images")
    public String images;

    // The source IP address of the request.
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
