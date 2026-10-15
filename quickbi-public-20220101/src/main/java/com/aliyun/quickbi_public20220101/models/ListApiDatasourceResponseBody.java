// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListApiDatasourceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Result")
    public ListApiDatasourceResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListApiDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiDatasourceResponseBody self = new ListApiDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiDatasourceResponseBody setResult(ListApiDatasourceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListApiDatasourceResponseBodyResult getResult() {
        return this.result;
    }

    public ListApiDatasourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApiDatasourceResponseBodyResultData extends TeaModel {
        /**
         * <p>The ID of the API data source.</p>
         * 
         * <strong>example:</strong>
         * <p>0f2c3c6409be4dc0810f2a5785e816a8</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>The query statement parameter settings in JSON format, which can be user-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key1&quot;:&quot;value1&quot;}</p>
         */
        @NameInMap("Body")
        public String body;

        /**
         * <p>The data volume of the API data source.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0.39746094</p>
         */
        @NameInMap("DataSize")
        public Float dataSize;

        /**
         * <p>The last synchronization time of the API data source. Format example: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25 16:19:43</p>
         */
        @NameInMap("DateUpdateTime")
        public String dateUpdateTime;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25 16:19:43</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25 16:19:43</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>REST_API_SYNC_0f2c3c6409be4dc0810f2a5785e816a8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The parameter settings in JSONArray format.</p>
         * <ul>
         * <li>name: the parameter name.</li>
         * <li>value: the parameter value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;token&quot;,&quot;value&quot;:&quot;xxxxxxxxxxxx&quot;},{&quot;name&quot;:&quot;pageSize&quot;,&quot;value&quot;:100}]</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The name of the API data source.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDataSource</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The synchronization task status of the API data source.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StatusType")
        public Integer statusType;

        public static ListApiDatasourceResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListApiDatasourceResponseBodyResultData self = new ListApiDatasourceResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListApiDatasourceResponseBodyResultData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ListApiDatasourceResponseBodyResultData setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListApiDatasourceResponseBodyResultData setDataSize(Float dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Float getDataSize() {
            return this.dataSize;
        }

        public ListApiDatasourceResponseBodyResultData setDateUpdateTime(String dateUpdateTime) {
            this.dateUpdateTime = dateUpdateTime;
            return this;
        }
        public String getDateUpdateTime() {
            return this.dateUpdateTime;
        }

        public ListApiDatasourceResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListApiDatasourceResponseBodyResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListApiDatasourceResponseBodyResultData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListApiDatasourceResponseBodyResultData setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListApiDatasourceResponseBodyResultData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListApiDatasourceResponseBodyResultData setStatusType(Integer statusType) {
            this.statusType = statusType;
            return this;
        }
        public Integer getStatusType() {
            return this.statusType;
        }

    }

    public static class ListApiDatasourceResponseBodyResult extends TeaModel {
        /**
         * <p>The list of API data sources.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListApiDatasourceResponseBodyResultData> data;

        /**
         * <p>The page number of the returned data, used for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of rows per page specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static ListApiDatasourceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListApiDatasourceResponseBodyResult self = new ListApiDatasourceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListApiDatasourceResponseBodyResult setData(java.util.List<ListApiDatasourceResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListApiDatasourceResponseBodyResultData> getData() {
            return this.data;
        }

        public ListApiDatasourceResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListApiDatasourceResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListApiDatasourceResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
