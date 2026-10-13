// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ScanFileRequest extends TeaModel {
    /**
     * <p>Drive ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>File properties to include in the scan response.</p>
     * <ul>
     * <li><p>Use \&quot;\*\&quot; to get all properties.</p>
     * </li>
     * <li><p>If not specified, the following properties are returned by default:
     * \- file_id,
     * \- drive_id,
     * \- parent_file_id,
     * \- type,
     * \- created_at,
     * \- updated_at,
     * \- file_extension,
     * \- size,
     * \- starred,
     * \- status,
     * \- category,
     * \- permissions.</p>
     * </li>
     * <li><p>You can also specify individual properties. Separate multiple properties with commas.</p>
     * </li>
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
     * <p>Limit the number of resources returned in this response. Valid values: [1, 100].</p>
     * <p>The actual number of results may be less than the specified limit but never more.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>Return results starting from the first item after the marker, sorted alphabetically. If not set, return results from the beginning.<br>Default value: none<br></p>
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
