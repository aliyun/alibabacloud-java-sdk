// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOpaClusterStrategyNewResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The rules.</p>
     */
    @NameInMap("List")
    public java.util.List<ListOpaClusterStrategyNewResponseBodyList> list;

    /**
     * <p>The message that shows the export task result. The value is fixed as <strong>success</strong>, which indicates that the export task is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListOpaClusterStrategyNewResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7DFD947C-9172-5129-B783-DD14C55191D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The action of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: trigger alerts</li>
         * <li><strong>2</strong>: block</li>
         * <li><strong>3</strong>: allow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Action")
        public Integer action;

        /**
         * <p>The number of clusters on which the rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClusterCount")
        public Integer clusterCount;

        /**
         * <p>The clusters on which the rule takes effect.</p>
         */
        @NameInMap("ClusterIdList")
        public java.util.List<String> clusterIdList;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Config the Event Audit policys</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image names.</p>
         */
        @NameInMap("ImageName")
        public java.util.List<String> imageName;

        /**
         * <p>The tags that are added to the container.</p>
         */
        @NameInMap("Label")
        public java.util.List<String> label;

        /**
         * <p>Indicates whether the rule supports malicious Internet images. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MaliciousImage")
        public Boolean maliciousImage;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StrategyId")
        public Long strategyId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto-strategy-vohuiq</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        /**
         * <p>Indicates whether the rule supports unscanned images. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
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
