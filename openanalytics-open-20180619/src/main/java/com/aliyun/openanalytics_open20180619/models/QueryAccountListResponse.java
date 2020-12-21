// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryAccountListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryAccountListResponseData> data;

    public static QueryAccountListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountListResponse self = new QueryAccountListResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountListResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryAccountListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAccountListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAccountListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryAccountListResponse setData(java.util.List<QueryAccountListResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAccountListResponseData> getData() {
        return this.data;
    }

    public static class QueryAccountListResponseData extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("ShortName")
        @Validation(required = true)
        public String shortName;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("RamUid")
        @Validation(required = true)
        public String ramUid;

        public static QueryAccountListResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountListResponseData self = new QueryAccountListResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAccountListResponseData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryAccountListResponseData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryAccountListResponseData setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public QueryAccountListResponseData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAccountListResponseData setRamUid(String ramUid) {
            this.ramUid = ramUid;
            return this;
        }
        public String getRamUid() {
            return this.ramUid;
        }

    }

}
