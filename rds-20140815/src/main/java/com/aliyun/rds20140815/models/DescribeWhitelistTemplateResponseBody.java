// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWhitelistTemplateResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistTemplateResponseBody self = new DescribeWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWhitelistTemplateResponseBody setData(DescribeWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public DescribeWhitelistTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeWhitelistTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWhitelistTemplateResponseBodyDataTemplate extends TeaModel {
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

        public static DescribeWhitelistTemplateResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistTemplateResponseBodyDataTemplate self = new DescribeWhitelistTemplateResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistTemplateResponseBodyDataTemplate setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeWhitelistTemplateResponseBodyDataTemplate setIps(String ips) {
            this.ips = ips;
            return this;
        }
        public String getIps() {
            return this.ips;
        }

        public DescribeWhitelistTemplateResponseBodyDataTemplate setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public DescribeWhitelistTemplateResponseBodyDataTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DescribeWhitelistTemplateResponseBodyDataTemplate setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class DescribeWhitelistTemplateResponseBodyData extends TeaModel {
        @NameInMap("Template")
        public DescribeWhitelistTemplateResponseBodyDataTemplate template;

        public static DescribeWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistTemplateResponseBodyData self = new DescribeWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistTemplateResponseBodyData setTemplate(DescribeWhitelistTemplateResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public DescribeWhitelistTemplateResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

    }

}
