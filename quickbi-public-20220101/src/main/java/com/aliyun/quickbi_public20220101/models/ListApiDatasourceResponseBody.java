// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListApiDatasourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListApiDatasourceResponseBodyResult result;

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
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("Body")
        public String body;

        @NameInMap("DataSize")
        public Float dataSize;

        @NameInMap("DateUpdateTime")
        public String dateUpdateTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("ShowName")
        public String showName;

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
        @NameInMap("Data")
        public java.util.List<ListApiDatasourceResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

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
