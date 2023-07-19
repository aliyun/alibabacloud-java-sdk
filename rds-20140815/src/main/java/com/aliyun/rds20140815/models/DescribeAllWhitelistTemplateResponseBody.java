// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAllWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAllWhitelistTemplateResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Ips")
        public String ips;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("TemplateName")
        public String templateName;

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
        @NameInMap("CurrPageNumbers")
        public Integer currPageNumbers;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("HasPrev")
        public Boolean hasPrev;

        @NameInMap("MaxRecordsPerPage")
        public Integer maxRecordsPerPage;

        @NameInMap("Templates")
        public java.util.List<DescribeAllWhitelistTemplateResponseBodyDataTemplates> templates;

        @NameInMap("TotalPageNumbers")
        public Integer totalPageNumbers;

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
