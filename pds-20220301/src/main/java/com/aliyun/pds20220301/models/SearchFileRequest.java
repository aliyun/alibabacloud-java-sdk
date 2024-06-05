// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchFileRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("fields")
    @Deprecated
    public String fields;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker.\\</p>
     * <p>By default, this parameter is left empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
     * <br>
     * <p>*   created_at: sorts the results by the time when the file was created.</p>
     * <p>*   updated_at: sorts the results by the time when the file was modified.</p>
     * <p>*   size: sorts the results by the size of the file.</p>
     * <p>*   name: sorts the results by the name of the file.</p>
     * <br>
     * <p>The order in which you want to sort the returned results. Valid values:</p>
     * <br>
     * <p>*   ASC: sorts the results in ascending order.</p>
     * <p>*   DESC: sorts the results in descending order.</p>
     * <br>
     * <p>You must specify this parameter in the \\<field name> \\<ASC or DESC> format. Separate multiple field names with commas (,). A preceding field has a higher priority than a following field. Examples:</p>
     * <br>
     * <p>*   If you want to sort the results based on the file name in ascending order, set this parameter to "name ASC".</p>
     * <p>*   If you want to sort the results based on the creation time in descending order, set this parameter to "created_at DESC".</p>
     * <p>*   If you want to sort the results based on the creation time in descending order first, and then sort the results based on the file name in ascending order if the creation time is the same, set this parameter to "created_at DESC,name ASC".</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The search condition. Fuzzy searches based on the file name or directory name are supported. The search condition can be up to 4,096 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>Specifies whether to return the total number of retrieved files.</p>
     */
    @NameInMap("return_total_count")
    public Boolean returnTotalCount;

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

    public SearchFileRequest setReturnTotalCount(Boolean returnTotalCount) {
        this.returnTotalCount = returnTotalCount;
        return this;
    }
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

}
