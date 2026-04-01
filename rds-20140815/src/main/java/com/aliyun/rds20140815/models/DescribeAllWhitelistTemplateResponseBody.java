// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAllWhitelistTemplateResponseBody extends TeaModel {
    /**
     * <p>The response code returned. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: success</li>
     * <li><strong>400</strong>: client error</li>
     * <li><strong>401</strong>: identity authentication failed</li>
     * <li><strong>404</strong>: request page not found</li>
     * <li><strong>500</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeAllWhitelistTemplateResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: success</li>
     * <li><strong>400</strong>: client error</li>
     * <li><strong>500</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16C62438-491B-5C02-9B49-BA924A1372A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
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

    public static DescribeAllWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllWhitelistTemplateResponseBody self = new DescribeAllWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllWhitelistTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAllWhitelistTemplateResponseBody setData(DescribeAllWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAllWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public DescribeAllWhitelistTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAllWhitelistTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAllWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllWhitelistTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAllWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
        /**
         * <p>The primary key of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>12.2.X.X,10.0.X.X</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The ID of the whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>412</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>template_123</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>168****</p>
         */
        @NameInMap("UserId")
        public Integer userId;

        public static DescribeAllWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllWhitelistTemplateResponseBodyDataTemplates self = new DescribeAllWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeAllWhitelistTemplateResponseBodyDataTemplates setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeAllWhitelistTemplateResponseBodyDataTemplates setIps(String ips) {
            this.ips = ips;
            return this;
        }
        public String getIps() {
            return this.ips;
        }

        public DescribeAllWhitelistTemplateResponseBodyDataTemplates setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public DescribeAllWhitelistTemplateResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeAllWhitelistTemplateResponseBodyDataTemplates setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DescribeAllWhitelistTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrPageNumbers")
        public Integer currPageNumbers;

        /**
         * <p>Indicates whether the data that meets the conditions is displayed on the next page. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>Indicates whether the data that meets the conditions is displayed on the previous page. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasPrev")
        public Boolean hasPrev;

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        /**
         * <p>The information about whitelist templates that are returned by page.</p>
         */
        @NameInMap("Templates")
        public java.util.List<DescribeAllWhitelistTemplateResponseBodyDataTemplates> templates;

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalPageNumbers")
        public Integer totalPageNumbers;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>402</p>
         */
        @NameInMap("TotalRecords")
        public Integer totalRecords;

        public static DescribeAllWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllWhitelistTemplateResponseBodyData self = new DescribeAllWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllWhitelistTemplateResponseBodyData setCurrPageNumbers(Integer currPageNumbers) {
            this.currPageNumbers = currPageNumbers;
            return this;
        }
        public Integer getCurrPageNumbers() {
            return this.currPageNumbers;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setHasPrev(Boolean hasPrev) {
            this.hasPrev = hasPrev;
            return this;
        }
        public Boolean getHasPrev() {
            return this.hasPrev;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setMaxRecordsPerPage(Integer maxRecordsPerPage) {
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setTemplates(java.util.List<DescribeAllWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<DescribeAllWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setTotalPageNumbers(Integer totalPageNumbers) {
            this.totalPageNumbers = totalPageNumbers;
            return this;
        }
        public Integer getTotalPageNumbers() {
            return this.totalPageNumbers;
        }

        public DescribeAllWhitelistTemplateResponseBodyData setTotalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Integer getTotalRecords() {
            return this.totalRecords;
        }

    }

}
