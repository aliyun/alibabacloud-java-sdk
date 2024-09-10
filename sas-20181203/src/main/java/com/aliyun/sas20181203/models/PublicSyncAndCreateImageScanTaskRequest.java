// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class PublicSyncAndCreateImageScanTaskRequest extends TeaModel {
    /**
     * <p>The information about the images. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>RegistryType</strong>: the type of the image repository. Valid values:</p>
     * <ul>
     * <li>acr</li>
     * <li>harbor</li>
     * <li>quay</li>
     * </ul>
     * </li>
     * <li><p><strong>RepoId</strong>: the ID of the image repository.</p>
     * </li>
     * <li><p><strong>InstanceId</strong>: the ID of the Container Registry instance to which the image repository belongs.</p>
     * </li>
     * <li><p><strong>RepoNamespace</strong>: the namespace to which the image repository belongs.</p>
     * </li>
     * <li><p><strong>RegionId</strong>: the region ID of the image.</p>
     * </li>
     * <li><p><strong>RepoName</strong>: the name of the image repository.</p>
     * </li>
     * <li><p><strong>Digest</strong>: the digest of the image.</p>
     * </li>
     * <li><p><strong>Tag</strong>: the tag that is added to the image.</p>
     * </li>
     * <li><p><strong>CreateTime</strong>: the timestamp when the image was created. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>UpdateTime</strong>: the timestamp when the image was updated. Unit: milliseconds.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;registryType&quot;:&quot;acr&quot;,&quot;repoId&quot;:&quot;crr-red9kgqqi0fh75d5&quot;,&quot;instanceId&quot;:&quot;cri-1x2qtjd75ofqvfa8&quot;,&quot;repoNamespace&quot;:&quot;1125&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;repoName&quot;:&quot;script1&quot;,&quot;digest&quot;:&quot;b1064a5007786b6f82a50772858e8156bc1e5fbddb7dd20af6922761ad197fe4&quot;,&quot;tag&quot;:&quot;v0113-ver2&quot;,&quot;createTime&quot;:1641267666666,&quot;updateTime&quot;:1641267909090}]</p>
     */
    @NameInMap("Images")
    public String images;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.X.X</p>
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
