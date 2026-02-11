// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeUserModelListResponseBody extends TeaModel {
    /**
     * <p><code>code</code></p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Pagination parameter: number of items per page, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public java.util.List<DescribeUserModelListResponseBodyResultObject> resultObject;

    /**
     * <p>Indicates whether the request was successful, with values as follows:</p>
     * <ul>
     * <li>true, request succeeded</li>
     * <li>false, request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItem")
    public Long totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeUserModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserModelListResponseBody self = new DescribeUserModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserModelListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeUserModelListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserModelListResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeUserModelListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeUserModelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserModelListResponseBody setResultObject(java.util.List<DescribeUserModelListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeUserModelListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeUserModelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUserModelListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeUserModelListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeUserModelListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Authorization type.</p>
         * 
         * <strong>example:</strong>
         * <p>READ</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>Model name.</p>
         * 
         * <strong>example:</strong>
         * <p>Model_A</p>
         */
        @NameInMap("CustomerModuleName")
        public String customerModuleName;

        /**
         * <p>Remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>备注。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Associated features.</p>
         * 
         * <strong>example:</strong>
         * <p>template_a</p>
         */
        @NameInMap("FeatureTemplate")
        public String featureTemplate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1673578656000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Primary key ID of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Publication status.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("InnerDefineStatus")
        public String innerDefineStatus;

        /**
         * <p>Model identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>inner_model_a</p>
         */
        @NameInMap("InnerModuleName")
        public String innerModuleName;

        /**
         * <p>Whether iteration is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAllowIterate")
        public Boolean isAllowIterate;

        /**
         * <p>Whether rollback is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAllowRollback")
        public Boolean isAllowRollback;

        /**
         * <p>Iteration version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IterationVersion")
        public Long iterationVersion;

        /**
         * <p>Root model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RootModuleId")
        public Long rootModuleId;

        public static DescribeUserModelListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserModelListResponseBodyResultObject self = new DescribeUserModelListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeUserModelListResponseBodyResultObject setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeUserModelListResponseBodyResultObject setCustomerModuleName(String customerModuleName) {
            this.customerModuleName = customerModuleName;
            return this;
        }
        public String getCustomerModuleName() {
            return this.customerModuleName;
        }

        public DescribeUserModelListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeUserModelListResponseBodyResultObject setFeatureTemplate(String featureTemplate) {
            this.featureTemplate = featureTemplate;
            return this;
        }
        public String getFeatureTemplate() {
            return this.featureTemplate;
        }

        public DescribeUserModelListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeUserModelListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUserModelListResponseBodyResultObject setInnerDefineStatus(String innerDefineStatus) {
            this.innerDefineStatus = innerDefineStatus;
            return this;
        }
        public String getInnerDefineStatus() {
            return this.innerDefineStatus;
        }

        public DescribeUserModelListResponseBodyResultObject setInnerModuleName(String innerModuleName) {
            this.innerModuleName = innerModuleName;
            return this;
        }
        public String getInnerModuleName() {
            return this.innerModuleName;
        }

        public DescribeUserModelListResponseBodyResultObject setIsAllowIterate(Boolean isAllowIterate) {
            this.isAllowIterate = isAllowIterate;
            return this;
        }
        public Boolean getIsAllowIterate() {
            return this.isAllowIterate;
        }

        public DescribeUserModelListResponseBodyResultObject setIsAllowRollback(Boolean isAllowRollback) {
            this.isAllowRollback = isAllowRollback;
            return this;
        }
        public Boolean getIsAllowRollback() {
            return this.isAllowRollback;
        }

        public DescribeUserModelListResponseBodyResultObject setIterationVersion(Long iterationVersion) {
            this.iterationVersion = iterationVersion;
            return this;
        }
        public Long getIterationVersion() {
            return this.iterationVersion;
        }

        public DescribeUserModelListResponseBodyResultObject setRootModuleId(Long rootModuleId) {
            this.rootModuleId = rootModuleId;
            return this;
        }
        public Long getRootModuleId() {
            return this.rootModuleId;
        }

    }

}
