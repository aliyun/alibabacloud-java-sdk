// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchSimilarImageClustersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>image/resize,m_fill,h_128,w_128,limit_0/format,jpg</p>
     */
    @NameInMap("image_thumbnail_process")
    @Deprecated
    public String imageThumbnailProcess;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <strong>example:</strong>
     * <p>YWRzX3VzZXJfcHJvZmlsZV9je1bnQh***</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
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

    @Deprecated
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
