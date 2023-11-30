// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRecyclebinRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Specifies the returned fields.</p>
     * <br>
     * <p>1\. If you set this parameter to \*, all fields of the file are returned.</p>
     * <br>
     * <p>2\. If you set this parameter to a null value or leave this parameter empty, the fields, such as file creator, file modifier, and custom tags, are not returned.</p>
     * <br>
     * <p>The default value is a null value, which indicates that only some fields are returned.</p>
     */
    @NameInMap("fields")
    public String fields;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 200. Default value: 50.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

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

}
