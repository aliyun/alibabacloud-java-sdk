// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskRequest extends TeaModel {
    /**
     * <p>The information about the images. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **RegistryType**: the type of the image repository. Valid values:</p>
     * <br>
     * <p>    *   acr</p>
     * <p>    *   harbor</p>
     * <p>    *   quay</p>
     * <br>
     * <p>*   **RepoId**: the ID of the image repository.</p>
     * <br>
     * <p>*   **InstanceId**: the ID of the Container Registry instance to which the image repository belongs.</p>
     * <br>
     * <p>*   **RepoNamespace**: the namespace to which the image repository belongs.</p>
     * <br>
     * <p>*   **RegionId**: the region ID of the image.</p>
     * <br>
     * <p>*   **RepoName**: the name of the image repository.</p>
     * <br>
     * <p>*   **Digest**: the digest of the image.</p>
     * <br>
     * <p>*   **Tag**: the tag that is added to the image.</p>
     * <br>
     * <p>*   **CreateTime**: the timestamp when the image was created. Unit: milliseconds.</p>
     * <br>
     * <p>*   **UpdateTime**: the timestamp when the image was updated. Unit: milliseconds.</p>
     */
    @NameInMap("Images")
    public String images;

    /**
     * <p>The source IP address of the request.</p>
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
