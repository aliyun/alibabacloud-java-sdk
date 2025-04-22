// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListFileRequest extends TeaModel {
    /**
     * <p>The file category. Valid values:</p>
     * <p>app: installation package zip: compressed package image doc: document video audio others</p>
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
     * <p>The field that is used to return additional information about a child subject. Valid values:</p>
     * <ul>
     * <li>url: returns the URL of the thumbnail of a file in the response.</li>
     * <li>exif: returns the Exchangeable Image File Format (EXIF) data of a file in the response.</li>
     * <li>cropping_suggestion: returns the cropping suggestion on a file in the response.</li>
     * <li>characteristic_hash: returns the characteristic hash value of a file in the response.</li>
     * <li>video_metadata: returns the metadata of a video file, such as the video duration, bitrate, height, and width, in the response.</li>
     * <li>video_preview_metadata: returns the transcoding information of a video file, such as the transcoding specification for each definition, in the response.</li>
     * <li>investigation_info: returns the investigation information in the response.</li>
     * <li>dir_size: returns the statistics on each subfolder in the response.</li>
     * <li>user_tags: returns the user tags of each child subject in the response.</li>
     * </ul>
     * <p>You can specify multiple fields by separating them with commas (,). Example: &quot;url,dir_size,user_tags&quot;.</p>
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
     * <p>The number of returned entries must be less than or equal to the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The name of the entry after which the list begins. Entries whose names are alphabetically after the value of this parameter are returned. If you do not specify this parameter, all entries are returned.\
     * This parameter is left empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The sorting field. Valid values:</p>
     * <p>created_at: sorts the entries by creation time. updated_at: sorts the entries by update time. size: sorts the entries by file size. name: sorts the entries by file name.</p>
     * <p>Default value: created_at.</p>
     * <p>Enumeration:</p>
     * <ul>
     * <li>updated_at: update time</li>
     * <li>size: file size</li>
     * <li>name: file name</li>
     * <li>created_at: creation time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>updated_at</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The sorting direction. Valid values:</p>
     * <p>ASC: ascending order DESC: descending order</p>
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
     * <p>The share ID. If you want to share a file, carry the <code>x-share-token</code> header for authentication in the request and specify share_id. In this case, <code>drive_id</code> is invalid. Otherwise, use an <code>AccessKey pair</code> or <code>access token</code> for authentication and specify <code>drive_id</code>. You must specify one of <code>share_id</code> and <code>drive_id</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The state of the files to return. Valid values:</p>
     * <p>available: returns only normal files. uploading: returns only files that are being uploaded.</p>
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
     * <p>The file type. Valid values:</p>
     * <p>file: returns only files. folder: returns only folders.</p>
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
