// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulWhiteListResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of <strong>200</strong> indicates that the request was successful. Other values indicate that the request failed. You can identify the cause of the failure based on the value of this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The information about the whitelist of image vulnerabilities.</p>
     */
    @NameInMap("ImageVulWhitelist")
    public java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> imageVulWhitelist;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeImageVulWhiteListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>911025D0-3D1E-5213-A18A-37EA0C92****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The amount of time that was consumed to process the request. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeCost")
    public Long timeCost;

    public static DescribeImageVulWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulWhiteListResponseBody self = new DescribeImageVulWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulWhiteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageVulWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageVulWhiteListResponseBody setImageVulWhitelist(java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> imageVulWhitelist) {
        this.imageVulWhitelist = imageVulWhitelist;
        return this;
    }
    public java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> getImageVulWhitelist() {
        return this.imageVulWhitelist;
    }

    public DescribeImageVulWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageVulWhiteListResponseBody setPageInfo(DescribeImageVulWhiteListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageVulWhiteListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageVulWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageVulWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeImageVulWhiteListResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeImageVulWhiteListResponseBodyImageVulWhitelist extends TeaModel {
        /**
         * <p>The alias of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2019-19906:in_sasl_add_string</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The primary key ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>34032043</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>scan:AVD-2022-953356</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason why the vulnerability is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>already config in another way</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The object on which the query is performed. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: the object type. The value is fixed to repo.</li>
         * <li><strong>target</strong>: the object content. The value is in the Namespace/Image repository format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;type\&quot;:\&quot;repo\&quot;,\&quot;target\&quot;:[\&quot;sas_test/script_0209\&quot;,\&quot;sas_test/script\&quot;]}</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: system vulnerability</li>
         * <li><strong>sca</strong>: application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImageVulWhiteListResponseBodyImageVulWhitelist build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulWhiteListResponseBodyImageVulWhitelist self = new DescribeImageVulWhiteListResponseBodyImageVulWhitelist();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeImageVulWhiteListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageVulWhiteListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulWhiteListResponseBodyPageInfo self = new DescribeImageVulWhiteListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
