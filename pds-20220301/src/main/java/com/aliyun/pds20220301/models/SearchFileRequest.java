// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFileRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>url,thumbnail</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 100.</p>
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
     * <p>The field by which to sort the returned entries. Default value: created_at. Valid values:</p>
     * <ul>
     * <li>created_at: sorts the entries by creation time.</li>
     * <li>updated_at: sorts the entries by update time.</li>
     * <li>size: sorts the entries by file size.</li>
     * <li>name: sorts the entries by file name.</li>
     * </ul>
     * <p>The order in which you want to sort the returned entries. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order</li>
     * <li>DESC: descending order</li>
     * </ul>
     * <p>You must specify this parameter in the \<field> \<ASC or DESC> format. Separate multiple fields with commas (,). A preceding field has a higher priority than a following field. Examples:</p>
     * <ul>
     * <li>If you want to sort the entries by file name in ascending order, set this parameter to &quot;name ASC&quot;.</li>
     * <li>If you want to sort the entries by creation time in descending order, set this parameter to &quot;created_at DESC&quot;.</li>
     * <li>If you want to sort the entries by creation time in descending order and sort the entries by file name in ascending order in case of the same creation time, set this parameter to &quot;created_at DESC,name ASC&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The search conditions. Fuzzy searches based on the file name or directory name are supported. The value of this parameter can be up to 4,096 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>not name=123</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to perform recursive search on a folder that is specified by setting parent_file_id in the query parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("recursive")
    public Boolean recursive;

    /**
     * <p>Specifies whether to return the total number of retrieved files.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("return_total_count")
    public Boolean returnTotalCount;

    /**
     * <p>The thumbnail configurations. Up to five thumbnails can be returned at a time. The value contains key-value pairs. You can customize the keys. The URL of a thumbnail is returned based on the key.</p>
     */
    @NameInMap("thumbnail_processes")
    public java.util.Map<String, ImageProcess> thumbnailProcesses;

    public static SearchFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFileRequest self = new SearchFileRequest();
        return TeaModel.build(map, self);
    }

    public SearchFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public SearchFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public SearchFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchFileRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchFileRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchFileRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public SearchFileRequest setReturnTotalCount(Boolean returnTotalCount) {
        this.returnTotalCount = returnTotalCount;
        return this;
    }
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

    public SearchFileRequest setThumbnailProcesses(java.util.Map<String, ImageProcess> thumbnailProcesses) {
        this.thumbnailProcesses = thumbnailProcesses;
        return this;
    }
    public java.util.Map<String, ImageProcess> getThumbnailProcesses() {
        return this.thumbnailProcesses;
    }

}
