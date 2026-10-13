// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRevisionRequest extends TeaModel {
    /**
     * <p>The ID of the drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Specifies the fields to return.</p>
     * <p>By default, this parameter is empty. If you set this parameter to <code>*</code>, all fields are returned, including the name of the creator.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9520943DC264</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The maximum number of revisions to return. The value must be an integer from 1 to 100.</p>
     * <p>The default value is 50.</p>
     * <p>The actual number of returned revisions may be less than the specified value.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>A pagination marker. The response includes only revisions that occur alphabetically after the specified value. If you do not specify this parameter, the query starts from the beginning of the collection.</p>
     * <p>Default value: None</p>
     * 
     * <strong>example:</strong>
     * <p>40CB7794C929</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListRevisionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRevisionRequest self = new ListRevisionRequest();
        return TeaModel.build(map, self);
    }

    public ListRevisionRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListRevisionRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ListRevisionRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListRevisionRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListRevisionRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
