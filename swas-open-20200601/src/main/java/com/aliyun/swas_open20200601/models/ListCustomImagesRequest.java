// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of **ClientToken** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the data disk snapshot.</p>
     */
    @NameInMap("DataSnapshotId")
    public String dataSnapshotId;

    /**
     * <p>The image IDs of the simple application server. The value can be a JSON array that consists of up to 100 image IDs. Separate multiple image IDs with commas (,).</p>
     */
    @NameInMap("ImageIds")
    public String imageIds;

    /**
     * <p>The image names of the simple application servers. The value can be a JSON array that consists of up to 100 image names. Separate multiple image names with commas (,).</p>
     */
    @NameInMap("ImageNames")
    public String imageNames;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>*   Maximum value: 100.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the simple application servers corresponding to the custom images. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the system disk snapshot.</p>
     */
    @NameInMap("SystemSnapshotId")
    public String systemSnapshotId;

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

    public ListCustomImagesRequest setSystemSnapshotId(String systemSnapshotId) {
        this.systemSnapshotId = systemSnapshotId;
        return this;
    }
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

}
