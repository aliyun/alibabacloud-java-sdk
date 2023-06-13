// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataSnapshotId")
    public String dataSnapshotId;

    @NameInMap("ImageIds")
    public String imageIds;

    @NameInMap("ImageNames")
    public String imageNames;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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
