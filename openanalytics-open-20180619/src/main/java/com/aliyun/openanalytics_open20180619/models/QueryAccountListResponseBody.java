// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class QueryAccountListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<QueryAccountListResponseBodyData> data;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryAccountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountListResponseBody self = new QueryAccountListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryAccountListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAccountListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryAccountListResponseBody setData(java.util.List<QueryAccountListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAccountListResponseBodyData> getData() {
        return this.data;
    }

    public QueryAccountListResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class QueryAccountListResponseBodyData extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("RamUid")
        public String ramUid;

        @NameInMap("ShortName")
        public String shortName;

        @NameInMap("Role")
        public String role;

        @NameInMap("UserName")
        public String userName;

        public static QueryAccountListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountListResponseBodyData self = new QueryAccountListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountListResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryAccountListResponseBodyData setRamUid(String ramUid) {
            this.ramUid = ramUid;
            return this;
        }
        public String getRamUid() {
            return this.ramUid;
        }

        public QueryAccountListResponseBodyData setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

        public QueryAccountListResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryAccountListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
