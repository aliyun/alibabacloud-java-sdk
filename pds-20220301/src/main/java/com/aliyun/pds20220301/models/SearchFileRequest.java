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
    @Deprecated
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

    /**
     * <p>The field by which to sort the returned results. Default value: created_at. Valid values:</p>
     * <ul>
     * <li>created_at: sorts the results by the time when the file was created.</li>
     * <li>updated_at: sorts the results by the time when the file was modified.</li>
     * <li>size: sorts the results by the size of the file.</li>
     * <li>name: sorts the results by the name of the file.</li>
     * </ul>
     * <p>The order in which you want to sort the returned results. Valid values:</p>
     * <ul>
     * <li>ASC: sorts the results in ascending order.</li>
     * <li>DESC: sorts the results in descending order.</li>
     * </ul>
     * <p>You must specify this parameter in the \<field name> \<ASC or DESC> format. Separate multiple field names with commas (,). A preceding field has a higher priority than a following field. Examples:</p>
     * <ul>
     * <li>If you want to sort the results based on the file name in ascending order, set this parameter to &quot;name ASC&quot;.</li>
     * <li>If you want to sort the results based on the creation time in descending order, set this parameter to &quot;created_at DESC&quot;.</li>
     * <li>If you want to sort the results based on the creation time in descending order first, and then sort the results based on the file name in ascending order if the creation time is the same, set this parameter to &quot;created_at DESC,name ASC&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("order_by")
    public String orderBy;

    /**
     * <p>The search condition. Fuzzy searches based on the file name or directory name are supported. The search condition can be up to 4,096 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>not name=123</p>
     */
    @NameInMap("query")
    public String query;

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

    @Deprecated
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

}
