// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListNextResourceRecordRequest extends TeaModel {
    /**
     * <p>Filters records by ID. Separate multiple IDs with commas. A maximum of 200 IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>record-001,record-002</p>
     */
    @NameInMap("ids")
    public String ids;

    /**
     * <p>Specifies whether to include system built-in records.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeSystemRecords")
    public Boolean includeSystemRecords;

    /**
     * <p>Specifies whether to enable JSON filter acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("jsonFilterAcc")
    public Boolean jsonFilterAcc;

    /**
     * <p>The JSON field path. Used together with jsonPathValue.</p>
     * 
     * <strong>example:</strong>
     * <p>$.status</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The filter value for the JSON field. Used together with jsonPath.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("jsonPathValue")
    public String jsonPathValue;

    /**
     * <p>The maximum number of records to return in this request. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not pass this parameter for the first request. For subsequent requests, pass the nextToken value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>t7F6JzTNNTjkq2tRBH8hR0a_NcuVYQWjbVwdFeuFhkylsUhrDl0JSofT5mrbI0oV&quot;</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to traverse records in reverse order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("reverse")
    public Boolean reverse;

    /**
     * <p>Searches for a specified string in record content.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <p>Searches by JSON content.</p>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("sjson")
    public String sjson;

    /**
     * <p>Filters records by tag.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("tag")
    public String tag;

    public static ListNextResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNextResourceRecordRequest self = new ListNextResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListNextResourceRecordRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListNextResourceRecordRequest setIncludeSystemRecords(Boolean includeSystemRecords) {
        this.includeSystemRecords = includeSystemRecords;
        return this;
    }
    public Boolean getIncludeSystemRecords() {
        return this.includeSystemRecords;
    }

    public ListNextResourceRecordRequest setJsonFilterAcc(Boolean jsonFilterAcc) {
        this.jsonFilterAcc = jsonFilterAcc;
        return this;
    }
    public Boolean getJsonFilterAcc() {
        return this.jsonFilterAcc;
    }

    public ListNextResourceRecordRequest setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }
    public String getJsonPath() {
        return this.jsonPath;
    }

    public ListNextResourceRecordRequest setJsonPathValue(String jsonPathValue) {
        this.jsonPathValue = jsonPathValue;
        return this;
    }
    public String getJsonPathValue() {
        return this.jsonPathValue;
    }

    public ListNextResourceRecordRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNextResourceRecordRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNextResourceRecordRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public ListNextResourceRecordRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListNextResourceRecordRequest setSjson(String sjson) {
        this.sjson = sjson;
        return this;
    }
    public String getSjson() {
        return this.sjson;
    }

    public ListNextResourceRecordRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
