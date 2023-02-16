// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20230117.models;

import com.aliyun.tea.*;

public class QueryAsyncJobListRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageNum")
    public String pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PopApiName")
    public String popApiName;

    @NameInMap("PopProduct")
    public String popProduct;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static QueryAsyncJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncJobListRequest self = new QueryAsyncJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsyncJobListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAsyncJobListRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryAsyncJobListRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public QueryAsyncJobListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryAsyncJobListRequest setPopApiName(String popApiName) {
        this.popApiName = popApiName;
        return this;
    }
    public String getPopApiName() {
        return this.popApiName;
    }

    public QueryAsyncJobListRequest setPopProduct(String popProduct) {
        this.popProduct = popProduct;
        return this;
    }
    public String getPopProduct() {
        return this.popProduct;
    }

    public QueryAsyncJobListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAsyncJobListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
