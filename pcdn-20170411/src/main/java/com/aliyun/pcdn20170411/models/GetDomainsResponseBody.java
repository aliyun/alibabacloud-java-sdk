// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetDomainsResponseBody extends TeaModel {
    @NameInMap("DataList")
    public GetDomainsResponseBodyDataList dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Pager")
    public GetDomainsResponseBodyPager pager;

    @NameInMap("Code")
    public Integer code;

    public static GetDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainsResponseBody self = new GetDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainsResponseBody setDataList(GetDomainsResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetDomainsResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainsResponseBody setPager(GetDomainsResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetDomainsResponseBodyPager getPager() {
        return this.pager;
    }

    public GetDomainsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetDomainsResponseBodyDataListUsageData extends TeaModel {
        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("SliceFormat")
        public String sliceFormat;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("BusinessType")
        public String businessType;

        public static GetDomainsResponseBodyDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseBodyDataListUsageData self = new GetDomainsResponseBodyDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseBodyDataListUsageData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDomainsResponseBodyDataListUsageData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainsResponseBodyDataListUsageData setSliceFormat(String sliceFormat) {
            this.sliceFormat = sliceFormat;
            return this;
        }
        public String getSliceFormat() {
            return this.sliceFormat;
        }

        public GetDomainsResponseBodyDataListUsageData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDomainsResponseBodyDataListUsageData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetDomainsResponseBodyDataListUsageData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetDomainsResponseBodyDataListUsageData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

    }

    public static class GetDomainsResponseBodyDataList extends TeaModel {
        @NameInMap("UsageData")
        public java.util.List<GetDomainsResponseBodyDataListUsageData> usageData;

        public static GetDomainsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseBodyDataList self = new GetDomainsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseBodyDataList setUsageData(java.util.List<GetDomainsResponseBodyDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetDomainsResponseBodyDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetDomainsResponseBodyPager extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Page")
        public Integer page;

        public static GetDomainsResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseBodyPager self = new GetDomainsResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseBodyPager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetDomainsResponseBodyPager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetDomainsResponseBodyPager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

}
