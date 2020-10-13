// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("DataList")
    @Validation(required = true)
    public GetDomainsResponseDataList dataList;

    @NameInMap("Pager")
    @Validation(required = true)
    public GetDomainsResponsePager pager;

    public static GetDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainsResponse self = new GetDomainsResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainsResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetDomainsResponse setDataList(GetDomainsResponseDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetDomainsResponseDataList getDataList() {
        return this.dataList;
    }

    public GetDomainsResponse setPager(GetDomainsResponsePager pager) {
        this.pager = pager;
        return this;
    }
    public GetDomainsResponsePager getPager() {
        return this.pager;
    }

    public static class GetDomainsResponseDataListUsageData extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("BusinessType")
        @Validation(required = true)
        public String businessType;

        @NameInMap("Status")
        @Validation(required = true)
        public Boolean status;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public String updatedAt;

        @NameInMap("SliceFormat")
        @Validation(required = true)
        public String sliceFormat;

        public static GetDomainsResponseDataListUsageData build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseDataListUsageData self = new GetDomainsResponseDataListUsageData();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseDataListUsageData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetDomainsResponseDataListUsageData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetDomainsResponseDataListUsageData setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetDomainsResponseDataListUsageData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetDomainsResponseDataListUsageData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDomainsResponseDataListUsageData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetDomainsResponseDataListUsageData setSliceFormat(String sliceFormat) {
            this.sliceFormat = sliceFormat;
            return this;
        }
        public String getSliceFormat() {
            return this.sliceFormat;
        }

    }

    public static class GetDomainsResponseDataList extends TeaModel {
        @NameInMap("UsageData")
        @Validation(required = true)
        public java.util.List<GetDomainsResponseDataListUsageData> usageData;

        public static GetDomainsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponseDataList self = new GetDomainsResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponseDataList setUsageData(java.util.List<GetDomainsResponseDataListUsageData> usageData) {
            this.usageData = usageData;
            return this;
        }
        public java.util.List<GetDomainsResponseDataListUsageData> getUsageData() {
            return this.usageData;
        }

    }

    public static class GetDomainsResponsePager extends TeaModel {
        @NameInMap("Page")
        @Validation(required = true)
        public Integer page;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        public static GetDomainsResponsePager build(java.util.Map<String, ?> map) throws Exception {
            GetDomainsResponsePager self = new GetDomainsResponsePager();
            return TeaModel.build(map, self);
        }

        public GetDomainsResponsePager setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetDomainsResponsePager setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetDomainsResponsePager setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
