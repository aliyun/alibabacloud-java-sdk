// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFileRequest extends TeaModel {
    /**
     * <p>The category of the file. Valid values:</p>
     * <p>app: installation package. zip: compressed package. image: image. doc: document. video: video. audio: audio. others: other files.</p>
     * <p>By default, files of all categories are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The fields to return.</p>
     * <ol>
     * <li>If this parameter is set to \*, all fields of the file except the fields that must be specified are returned.</li>
     * <li>If only specific fields are required, you can specify the following fields: url, exif, cropping_suggestion, characteristic_hash, video_metadata, and video_preview_metadata. If multiple fields are required, separate them with commas (,). Example: url,exif.</li>
     * <li>The investigation_info field is returned only if you specify this field.</li>
     * </ol>
     * <p>By default, all fields except the fields that must be specified are returned.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\
     * By default, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The sorting field.</p>
     * <p>Default value: created_at.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>updated_at</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts the results based on the time when the file was last modified</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>size</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts the results based on the size of the file</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>name</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts the results based on the name of the file</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>created_at</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>sorts the results based on the time when the file was created</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>updated_at</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The sorting direction. Valid values:</p>
     * <p>ASC: ascending order. DESC: descending order.</p>
     * <p>Default value: ASC.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("order_direction")
    public String orderDirection;

    /**
     * <p>The ID of the parent folder. If the parent folder is a root directory, set this parameter to root.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The share ID. If you want to manage a file by using a share link, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The state of the file. Valid values:</p>
     * <p>available: Only normal files are returned. uploading: Only files that are being uploaded are returned.</p>
     * <p>By default, only files in the available state are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>available</p>
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
     * <p>file: Only files are returned. folder: Only folders are returned.</p>
     * <p>By default, files of all types are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
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
