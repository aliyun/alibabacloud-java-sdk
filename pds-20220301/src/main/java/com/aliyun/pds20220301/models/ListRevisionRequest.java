// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRevisionRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Specifies the returned fields.</p>
     * <br>
     * <p>By default, this parameter is left empty. If you set this parameter to \\*, all fields are returned. If you leave this parameter empty, the creator of the file is not returned.</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The file ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 50.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Long limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.</p>
     * <br>
     * <p>By default, this parameter is left empty.</p>
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
