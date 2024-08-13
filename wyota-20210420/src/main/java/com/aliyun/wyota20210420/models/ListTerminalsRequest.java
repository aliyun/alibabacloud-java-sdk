// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DemoDevice</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    @NameInMap("SerialNumbers")
    public java.util.List<String> serialNumbers;

    /**
     * <strong>example:</strong>
     * <p>tg-default</p>
     */
    @NameInMap("TerminalGroupId")
    public String terminalGroupId;

    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static ListTerminalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalsRequest self = new ListTerminalsRequest();
        return TeaModel.build(map, self);
    }

    public ListTerminalsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTerminalsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerminalsRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public ListTerminalsRequest setSerialNumbers(java.util.List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
        return this;
    }
    public java.util.List<String> getSerialNumbers() {
        return this.serialNumbers;
    }

    public ListTerminalsRequest setTerminalGroupId(String terminalGroupId) {
        this.terminalGroupId = terminalGroupId;
        return this;
    }
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    public ListTerminalsRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}
