// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOpaClusterStrategyNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<ListOpaClusterStrategyNewResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public ListOpaClusterStrategyNewResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOpaClusterStrategyNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpaClusterStrategyNewResponseBody self = new ListOpaClusterStrategyNewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpaClusterStrategyNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOpaClusterStrategyNewResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOpaClusterStrategyNewResponseBody setList(java.util.List<ListOpaClusterStrategyNewResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListOpaClusterStrategyNewResponseBodyList> getList() {
        return this.list;
    }

    public ListOpaClusterStrategyNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOpaClusterStrategyNewResponseBody setPageInfo(ListOpaClusterStrategyNewResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListOpaClusterStrategyNewResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListOpaClusterStrategyNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpaClusterStrategyNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOpaClusterStrategyNewResponseBodyList extends TeaModel {
        @NameInMap("Action")
        public Integer action;

        @NameInMap("ClusterCount")
        public Integer clusterCount;

        @NameInMap("ClusterIdList")
        public java.util.List<String> clusterIdList;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        @NameInMap("Label")
        public java.util.List<String> label;

        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        @NameInMap("StrategyId")
        public Long strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("UnScanedImage")
        public Boolean unScanedImage;

        public static ListOpaClusterStrategyNewResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListOpaClusterStrategyNewResponseBodyList self = new ListOpaClusterStrategyNewResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListOpaClusterStrategyNewResponseBodyList setAction(Integer action) {
            this.action = action;
            return this;
        }
        public Integer getAction() {
            return this.action;
        }

        public ListOpaClusterStrategyNewResponseBodyList setClusterCount(Integer clusterCount) {
            this.clusterCount = clusterCount;
            return this;
        }
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        public ListOpaClusterStrategyNewResponseBodyList setClusterIdList(java.util.List<String> clusterIdList) {
            this.clusterIdList = clusterIdList;
            return this;
        }
        public java.util.List<String> getClusterIdList() {
            return this.clusterIdList;
        }

        public ListOpaClusterStrategyNewResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListOpaClusterStrategyNewResponseBodyList setImageName(java.util.List<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public java.util.List<String> getImageName() {
            return this.imageName;
        }

        public ListOpaClusterStrategyNewResponseBodyList setLabel(java.util.List<String> label) {
            this.label = label;
            return this;
        }
        public java.util.List<String> getLabel() {
            return this.label;
        }

        public ListOpaClusterStrategyNewResponseBodyList setMaliciousImage(Boolean maliciousImage) {
            this.maliciousImage = maliciousImage;
            return this;
        }
        public Boolean getMaliciousImage() {
            return this.maliciousImage;
        }

        public ListOpaClusterStrategyNewResponseBodyList setStrategyId(Long strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public Long getStrategyId() {
            return this.strategyId;
        }

        public ListOpaClusterStrategyNewResponseBodyList setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public ListOpaClusterStrategyNewResponseBodyList setUnScanedImage(Boolean unScanedImage) {
            this.unScanedImage = unScanedImage;
            return this;
        }
        public Boolean getUnScanedImage() {
            return this.unScanedImage;
        }

    }

    public static class ListOpaClusterStrategyNewResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOpaClusterStrategyNewResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOpaClusterStrategyNewResponseBodyPageInfo self = new ListOpaClusterStrategyNewResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListOpaClusterStrategyNewResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListOpaClusterStrategyNewResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListOpaClusterStrategyNewResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOpaClusterStrategyNewResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
