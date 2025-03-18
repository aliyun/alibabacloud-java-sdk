// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeVendorApiListResponseBody extends TeaModel {
    @NameInMap("ApiList")
    public java.util.List<DescribeVendorApiListResponseBodyApiList> apiList;

    @NameInMap("Page")
    public DescribeVendorApiListResponseBodyPage page;

    /**
     * <strong>example:</strong>
     * <p>E7698CFB-****-5840-8EC9-691B86729E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVendorApiListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVendorApiListResponseBody self = new DescribeVendorApiListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVendorApiListResponseBody setApiList(java.util.List<DescribeVendorApiListResponseBodyApiList> apiList) {
        this.apiList = apiList;
        return this;
    }
    public java.util.List<DescribeVendorApiListResponseBodyApiList> getApiList() {
        return this.apiList;
    }

    public DescribeVendorApiListResponseBody setPage(DescribeVendorApiListResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeVendorApiListResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeVendorApiListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVendorApiListResponseBodyApiList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;cmd&quot;: &quot;DescribeAclApiDispatch&quot;
         * }</p>
         */
        @NameInMap("AdvanceConfig")
        public String advanceConfig;

        /**
         * <strong>example:</strong>
         * <p>VerifyMobile</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>2017-08-01</p>
         */
        @NameInMap("ApiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAdvanceConfig")
        public Boolean needAdvanceConfig;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedPageInfo")
        public Boolean needPageInfo;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Count\&quot;: 10, \&quot;TotalCount\&quot;: 23, \&quot;PageSize\&quot;: 10, \&quot;CurrentPage\&quot;: 1}</p>
         */
        @NameInMap("PageInfo")
        public String pageInfo;

        /**
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;Domain&quot;,
         *         &quot;type&quot;: &quot;String&quot;,
         *         &quot;isRequired&quot;: true,
         *         &quot;exampleValue&quot;: &quot;www.<em><strong>.com&quot;,
         *         &quot;description&quot;: &quot;www.</strong></em>.com&quot;
         *     }
         * ]</p>
         */
        @NameInMap("Parameter")
        public String parameter;

        /**
         * <strong>example:</strong>
         * <p>cfw</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>cfw.xxx.com</p>
         */
        @NameInMap("ProductDomain")
        public String productDomain;

        /**
         * <strong>example:</strong>
         * <p>waf</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>Azure</p>
         */
        @NameInMap("VendorCode")
        public String vendorCode;

        public static DescribeVendorApiListResponseBodyApiList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVendorApiListResponseBodyApiList self = new DescribeVendorApiListResponseBodyApiList();
            return TeaModel.build(map, self);
        }

        public DescribeVendorApiListResponseBodyApiList setAdvanceConfig(String advanceConfig) {
            this.advanceConfig = advanceConfig;
            return this;
        }
        public String getAdvanceConfig() {
            return this.advanceConfig;
        }

        public DescribeVendorApiListResponseBodyApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeVendorApiListResponseBodyApiList setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public DescribeVendorApiListResponseBodyApiList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeVendorApiListResponseBodyApiList setNeedAdvanceConfig(Boolean needAdvanceConfig) {
            this.needAdvanceConfig = needAdvanceConfig;
            return this;
        }
        public Boolean getNeedAdvanceConfig() {
            return this.needAdvanceConfig;
        }

        public DescribeVendorApiListResponseBodyApiList setNeedPageInfo(Boolean needPageInfo) {
            this.needPageInfo = needPageInfo;
            return this;
        }
        public Boolean getNeedPageInfo() {
            return this.needPageInfo;
        }

        public DescribeVendorApiListResponseBodyApiList setPageInfo(String pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public String getPageInfo() {
            return this.pageInfo;
        }

        public DescribeVendorApiListResponseBodyApiList setParameter(String parameter) {
            this.parameter = parameter;
            return this;
        }
        public String getParameter() {
            return this.parameter;
        }

        public DescribeVendorApiListResponseBodyApiList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeVendorApiListResponseBodyApiList setProductDomain(String productDomain) {
            this.productDomain = productDomain;
            return this;
        }
        public String getProductDomain() {
            return this.productDomain;
        }

        public DescribeVendorApiListResponseBodyApiList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeVendorApiListResponseBodyApiList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeVendorApiListResponseBodyApiList setVendorCode(String vendorCode) {
            this.vendorCode = vendorCode;
            return this;
        }
        public String getVendorCode() {
            return this.vendorCode;
        }

    }

    public static class DescribeVendorApiListResponseBodyPage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeVendorApiListResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeVendorApiListResponseBodyPage self = new DescribeVendorApiListResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeVendorApiListResponseBodyPage setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeVendorApiListResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeVendorApiListResponseBodyPage setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
