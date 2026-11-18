// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListDatasourcesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListDatasourcesResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BAC1ADB5-EEB5-5834-93D8-522E067AF8D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDatasourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourcesResponseBody self = new ListDatasourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasourcesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDatasourcesResponseBody setData(ListDatasourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDatasourcesResponseBodyData getData() {
        return this.data;
    }

    public ListDatasourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDatasourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatasourcesResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The connection parameters of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;host&quot;:&quot;rm-bp1f03mxxxxx.mysql.rds.aliyuncs.com&quot;,&quot;port&quot;:3306,&quot;userName&quot;:&quot;test01&quot;,&quot;database&quot;:&quot;test01&quot;,&quot;other&quot;:{&quot;useSSL&quot;:&quot;false&quot;}}</p>
         */
        @NameInMap("ConnectionParams")
        public String connectionParams;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>145</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The specific pronunciation rule type. Valid values:</p>
         * <ul>
         * <li>replacement: A rule that directly replaces a word with its pronunciation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The updater.</p>
         * 
         * <strong>example:</strong>
         * <p>1827811800555555</p>
         */
        @NameInMap("Updater")
        public String updater;

        public static ListDatasourcesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourcesResponseBodyDataRecords self = new ListDatasourcesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListDatasourcesResponseBodyDataRecords setConnectionParams(String connectionParams) {
            this.connectionParams = connectionParams;
            return this;
        }
        public String getConnectionParams() {
            return this.connectionParams;
        }

        public ListDatasourcesResponseBodyDataRecords setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public ListDatasourcesResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatasourcesResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasourcesResponseBodyDataRecords setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListDatasourcesResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

    }

    public static class ListDatasourcesResponseBodyData extends TeaModel {
        /**
         * <p>The maximum number of entries to return for this request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token used to retrieve the next page of results. If the data that meets the query conditions is not completely read, the server returns this token. You can use this token to continue reading the subsequent data. You do not need to specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of data source records on the current page.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListDatasourcesResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListDatasourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasourcesResponseBodyData self = new ListDatasourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDatasourcesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDatasourcesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDatasourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDatasourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDatasourcesResponseBodyData setRecords(java.util.List<ListDatasourcesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListDatasourcesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListDatasourcesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
