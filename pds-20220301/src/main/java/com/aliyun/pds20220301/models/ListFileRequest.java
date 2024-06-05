// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFileRequest extends TeaModel {
    /**
     * <p>The category of the file. Valid values:</p>
     * <br>
     * <p>app: installation package. zip: compressed package. image: image. doc: document. video: video. audio: audio. others: other files.</p>
     * <br>
     * <p>By default, files of all categories are returned.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The fields to return.</p>
     * <br>
     * <p>1.  If this parameter is set to \\*, all fields of the file except the fields that must be specified are returned.</p>
     * <p>2.  If only specific fields are required, you can specify the following fields: url, exif, cropping_suggestion, characteristic_hash, video_metadata, and video_preview_metadata. If multiple fields are required, separate them with commas (,). Example: url,exif.</p>
     * <p>3.  The investigation_info field is returned only if you specify this field.</p>
     * <br>
     * <p>By default, all fields except the fields that must be specified are returned.</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\\</p>
     * <p>By default, this parameter is empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The sorting field.</p>
     * <br>
     * <p>Default value: created_at.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   updated_at</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts the results based on the time when the file was last modified</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   size</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts the results based on the size of the file</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   name</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts the results based on the name of the file</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   created_at</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    sorts the results based on the time when the file was created</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The sorting direction. Valid values:</p>
     * <br>
     * <p>ASC: ascending order. DESC: descending order.</p>
     * <br>
     * <p>Default value: ASC.</p>
     */
    @NameInMap("order_direction")
    public String orderDirection;

    /**
     * <p>The ID of the parent folder. If the parent folder is a root directory, set this parameter to root.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the `x-share-token` header for authentication in the request and specify share_id. In this case, `drive_id` is invalid. Otherwise, use an `AccessKey pair` or `access token` for authentication and specify `drive_id`. You must specify one of `share_id` and `drive_id`.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The state of the file. Valid values:</p>
     * <br>
     * <p>available: Only normal files are returned. uploading: Only files that are being uploaded are returned.</p>
     * <br>
     * <p>By default, only files in the available state are returned.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The thumbnail configurations. Up to five thumbnails can be returned at a time. The value contains key-value pairs. You can customize the keys. The URL of a thumbnail is returned based on the key.</p>
     */
    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ImageProcess> thumbnailProcesses;

    /**
     * <p>The type of the file. Valid values:</p>
     * <br>
     * <p>file: Only files are returned. folder: Only folders are returned.</p>
     * <br>
     * <p>By default, files of all types are returned.</p>
     */
    @NameInMap("type")
    public String type;

    public static ListFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileRequest self = new ListFileRequest();
        return TeaModel.build(map, self);
    }

    public ListFileRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListFileRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListFileRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListFileRequest setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public ListFileRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public ListFileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListFileRequest setThumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
        this.thumbnailProcesses = thumbnailProcesses;
        return this;
    }
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

    public ListFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
