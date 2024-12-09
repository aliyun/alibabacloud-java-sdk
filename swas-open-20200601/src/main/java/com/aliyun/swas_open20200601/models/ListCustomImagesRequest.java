// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data disk snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-acscasca****</p>
     */
    @NameInMap("DataSnapshotId")
    public String dataSnapshotId;

    /**
     * <p>The image IDs of the simple application server. The value can be a JSON array that consists of up to 100 image IDs. Separate multiple image IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;fe9c66133a9d4688872869726b52****&quot;, &quot;794c230fd3e64ea19f83f4d7a0ad****&quot;]</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The image names of the simple application servers. The value can be a JSON array that consists of up to 100 image names. Separate multiple image names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test1****&quot;, &quot;test2****&quot;]</p>
     */
    @NameInMap("ImageNames")
    public String imageNames;

    /**
     * <p>The ID of the simple application server from which the image is derived.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 100.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the simple application servers corresponding to the custom images. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bti7cf7yj2i</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to query shared images. Valid values:</p>
     * <ul>
     * <li>False: do not query shared images. The shared images are not included in the response.</li>
     * <li>True: query shared images. The shared images are included in the response.</li>
     * </ul>
     * <p>If you do not specify this parameter, all images are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Share")
    public Boolean share;

    /**
     * <p>The ID of the system disk snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp14m09pq8***0g6</p>
     */
    @NameInMap("SystemSnapshotId")
    public String systemSnapshotId;

    /**
     * <p>Tag N of the custom image.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListCustomImagesRequestTag> tag;

    public static ListCustomImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesRequest self = new ListCustomImagesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListCustomImagesRequest setDataSnapshotId(String dataSnapshotId) {
        this.dataSnapshotId = dataSnapshotId;
        return this;
    }
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    public ListCustomImagesRequest setImageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    public String getImageIds() {
        return this.imageIds;
    }

    public ListCustomImagesRequest setImageNames(String imageNames) {
        this.imageNames = imageNames;
        return this;
    }
    public String getImageNames() {
        return this.imageNames;
    }

    public ListCustomImagesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCustomImagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomImagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomImagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListCustomImagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListCustomImagesRequest setShare(Boolean share) {
        this.share = share;
        return this;
    }
    public Boolean getShare() {
        return this.share;
    }

    public ListCustomImagesRequest setSystemSnapshotId(String systemSnapshotId) {
        this.systemSnapshotId = systemSnapshotId;
        return this;
    }
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

    public ListCustomImagesRequest setTag(java.util.List<ListCustomImagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListCustomImagesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListCustomImagesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. A tag key can be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. A tag value can be up to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCustomImagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesRequestTag self = new ListCustomImagesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCustomImagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
