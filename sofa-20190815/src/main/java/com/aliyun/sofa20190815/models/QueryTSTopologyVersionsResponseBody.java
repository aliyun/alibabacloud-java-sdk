// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSTopologyVersionsResponseBodyList> list;

    public static QueryTSTopologyVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyVersionsResponseBody self = new QueryTSTopologyVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologyVersionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologyVersionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologyVersionsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSTopologyVersionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSTopologyVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSTopologyVersionsResponseBody setList(java.util.List<QueryTSTopologyVersionsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSTopologyVersionsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSTopologyVersionsResponseBodyList extends TeaModel {
        @NameInMap("BaseVersion")
        public Long baseVersion;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEffective")
        public String gmtEffective;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public Long version;

        public static QueryTSTopologyVersionsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyVersionsResponseBodyList self = new QueryTSTopologyVersionsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyVersionsResponseBodyList setBaseVersion(Long baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }
        public Long getBaseVersion() {
            return this.baseVersion;
        }

        public QueryTSTopologyVersionsResponseBodyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryTSTopologyVersionsResponseBodyList setGmtEffective(String gmtEffective) {
            this.gmtEffective = gmtEffective;
            return this;
        }
        public String getGmtEffective() {
            return this.gmtEffective;
        }

        public QueryTSTopologyVersionsResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSTopologyVersionsResponseBodyList setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryTSTopologyVersionsResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryTSTopologyVersionsResponseBodyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryTSTopologyVersionsResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSTopologyVersionsResponseBodyList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
