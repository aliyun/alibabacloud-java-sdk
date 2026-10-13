// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRecyclebinRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The fields to return in the response.</p>
     * <p>Set to <code>*</code> to return all fields of a file.</p>
     * <p>If this parameter is not specified, a partial set of fields is returned by default.</p>
     * <p>This behavior excludes fields such as the file creator, file modifier, and user-defined tags.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The maximum number of items to return. Valid values: 1 to 200. Default: 50.</p>
     * <p>The number of items returned may be less than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination marker. The API returns items starting from the one that alphabetically follows the marker. If you omit this parameter, the API returns items from the beginning of the list. Default: none.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>Thumbnail settings. You can retrieve up to five thumbnails in a single request. The keys in this map are user-defined, and the response provides a thumbnail URL for each key.</p>
     */
    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ImageProcess> thumbnailProcesses;

    public static ListRecyclebinRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecyclebinRequest self = new ListRecyclebinRequest();
        return TeaModel.build(map, self);
    }

    public ListRecyclebinRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListRecyclebinRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListRecyclebinRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListRecyclebinRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRecyclebinRequest setThumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
        this.thumbnailProcesses = thumbnailProcesses;
        return this;
    }
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

}
