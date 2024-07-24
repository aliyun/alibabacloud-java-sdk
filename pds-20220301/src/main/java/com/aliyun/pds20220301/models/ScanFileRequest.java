// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ScanFileRequest extends TeaModel {
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
     * <p>The file properties to return.</p>
     * <ul>
     * <li>If you want to return all file properties, set this parameter to \*.</li>
     * <li>By default, if you do not specify this parameter, the following properties of a file are returned: - file_id, - drive_id, - parent_file_id, - type, - created_at, - updated_at, - file_extention, - size, - starred, - status, - category, and - permissions.</li>
     * <li>You can also specify properties to return. Separate multiple properties with commas (,).</li>
     * </ul>
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
     * By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ScanFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanFileRequest self = new ScanFileRequest();
        return TeaModel.build(map, self);
    }

    public ScanFileRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ScanFileRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public ScanFileRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ScanFileRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
