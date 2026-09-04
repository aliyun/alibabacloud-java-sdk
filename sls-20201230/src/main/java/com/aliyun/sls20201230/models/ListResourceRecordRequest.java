// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListResourceRecordRequest extends TeaModel {
    /**
     * <p>Filters records by ID. Separate multiple IDs with commas (,). A maximum of 200 IDs are supported.</p>
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
     * <p>The JSON field path. Use this parameter together with jsonPathValue.</p>
     * 
     * <strong>example:</strong>
     * <p>$.status</p>
     */
    @NameInMap("jsonPath")
    public String jsonPath;

    /**
     * <p>The filter value of the JSON field. Use this parameter together with jsonPath.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("jsonPathValue")
    public String jsonPathValue;

    /**
     * <p>The start position of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>Searches for the specified string in record content.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("search")
    public String search;

    /**
     * <p>The maximum number of records to return. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>Searches by JSON content.</p>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("sjson")
    public String sjson;

    /**
     * <p>Filters records by label.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("tag")
    public String tag;

    public static ListResourceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRecordRequest self = new ListResourceRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceRecordRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public ListResourceRecordRequest setIncludeSystemRecords(Boolean includeSystemRecords) {
        this.includeSystemRecords = includeSystemRecords;
        return this;
    }
    public Boolean getIncludeSystemRecords() {
        return this.includeSystemRecords;
    }

    public ListResourceRecordRequest setJsonFilterAcc(Boolean jsonFilterAcc) {
        this.jsonFilterAcc = jsonFilterAcc;
        return this;
    }
    public Boolean getJsonFilterAcc() {
        return this.jsonFilterAcc;
    }

    public ListResourceRecordRequest setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }
    public String getJsonPath() {
        return this.jsonPath;
    }

    public ListResourceRecordRequest setJsonPathValue(String jsonPathValue) {
        this.jsonPathValue = jsonPathValue;
        return this;
    }
    public String getJsonPathValue() {
        return this.jsonPathValue;
    }

    public ListResourceRecordRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListResourceRecordRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

    public ListResourceRecordRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListResourceRecordRequest setSjson(String sjson) {
        this.sjson = sjson;
        return this;
    }
    public String getSjson() {
        return this.sjson;
    }

    public ListResourceRecordRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
