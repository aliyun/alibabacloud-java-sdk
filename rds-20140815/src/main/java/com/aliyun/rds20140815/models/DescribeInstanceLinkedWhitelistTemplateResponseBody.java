// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceLinkedWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeInstanceLinkedWhitelistTemplateResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeInstanceLinkedWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceLinkedWhitelistTemplateResponseBody self = new DescribeInstanceLinkedWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setData(DescribeInstanceLinkedWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceLinkedWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceLinkedWhitelistTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates extends TeaModel {
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

        public static DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates self = new DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates setIps(String ips) {
            this.ips = ips;
            return this;
        }
        public String getIps() {
            return this.ips;
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DescribeInstanceLinkedWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("InsName")
        public String insName;

        @NameInMap("Templates")
        public java.util.List<DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates> templates;

        public static DescribeInstanceLinkedWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceLinkedWhitelistTemplateResponseBodyData self = new DescribeInstanceLinkedWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyData setInsName(String insName) {
            this.insName = insName;
            return this;
        }
        public String getInsName() {
            return this.insName;
        }

        public DescribeInstanceLinkedWhitelistTemplateResponseBodyData setTemplates(java.util.List<DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates> templates) {
            this.templates = templates;
            return this;
        }
        public java.util.List<DescribeInstanceLinkedWhitelistTemplateResponseBodyDataTemplates> getTemplates() {
            return this.templates;
        }

    }

}
