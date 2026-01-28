// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListDatasourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListDatasourcesResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>{&quot;host&quot;:&quot;rm-bp1f03mxxxxx.mysql.rds.aliyuncs.com&quot;,&quot;port&quot;:3306,&quot;userName&quot;:&quot;test01&quot;,&quot;database&quot;:&quot;test01&quot;,&quot;other&quot;:{&quot;useSSL&quot;:&quot;false&quot;}}</p>
         */
        @NameInMap("ConnectionParams")
        public String connectionParams;

        /**
         * <strong>example:</strong>
         * <p>145</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>job01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>target</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
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
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListDatasourcesResponseBodyDataRecords> records;

        /**
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
