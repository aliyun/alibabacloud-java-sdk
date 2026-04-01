// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateResponseBody extends TeaModel {
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
    public DescribeWhitelistTemplateResponseBodyData data;

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
     * <p>ED169A3E-1657-4104-82AB-24EA8CD0DB75</p>
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
        /**
         * <p>The primary key of the data table.</p>
         * 
         * <strong>example:</strong>
         * <p>1013</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.X.X,2.3.X.X</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The ID of the whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>424</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The name of the IP whitelist template.</p>
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
         * <p>16****</p>
         */
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
        /**
         * <p>The information about the IP whitelist template.</p>
         */
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
