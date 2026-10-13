// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchDriveRequest extends TeaModel {
    /**
     * <p>The drive name.</p>
     * 
     * <strong>example:</strong>
     * <p>My personal space</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <p>The maximum number of drives to return. The value must be from 1 to 100. Default: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token. The server returns results alphabetically, starting from the entry after the marker. If this parameter is omitted, the query starts from the beginning of the list.<br>Default: none<br></p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>c9b7a5aa04d14ae3867fdc886fa01da4</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The owner type. Valid values:</p>
     * <p><code>user</code>: An individual user.<br><code>group</code>: A group of users.<br></p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("owner_type")
    public String ownerType;

    public static SearchDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDriveRequest self = new SearchDriveRequest();
        return TeaModel.build(map, self);
    }

    public SearchDriveRequest setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public SearchDriveRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchDriveRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchDriveRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public SearchDriveRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

}
