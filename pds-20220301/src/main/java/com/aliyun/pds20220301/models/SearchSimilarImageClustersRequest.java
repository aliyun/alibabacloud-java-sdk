// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchSimilarImageClustersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("image_thumbnail_process")
    @Deprecated
    public String imageThumbnailProcess;

    @NameInMap("limit")
    public Long limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("order")
    public String order;

    public static SearchSimilarImageClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSimilarImageClustersRequest self = new SearchSimilarImageClustersRequest();
        return TeaModel.build(map, self);
    }

    public SearchSimilarImageClustersRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public SearchSimilarImageClustersRequest setImageThumbnailProcess(String imageThumbnailProcess) {
        this.imageThumbnailProcess = imageThumbnailProcess;
        return this;
    }
    public String getImageThumbnailProcess() {
        return this.imageThumbnailProcess;
    }

    public SearchSimilarImageClustersRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchSimilarImageClustersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchSimilarImageClustersRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
