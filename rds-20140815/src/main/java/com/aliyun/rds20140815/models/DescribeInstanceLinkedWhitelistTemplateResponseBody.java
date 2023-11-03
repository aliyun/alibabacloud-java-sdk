// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceLinkedWhitelistTemplateResponseBody extends TeaModel {
    /**
     * <p>The response code returned. Valid values:</p>
     * <br>
     * <p>*   **200**: success</p>
     * <p>*   **400**: client error</p>
     * <p>*   **401**: identity authentication failed</p>
     * <p>*   **404**: request page not found</p>
     * <p>*   **500**: server error</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeInstanceLinkedWhitelistTemplateResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <br>
     * <p>*   **200**: success</p>
     * <p>*   **400**: client error</p>
     * <p>*   **500**: server error</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The primary key of the data table.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The IP addresses.</p>
         */
        @NameInMap("Ips")
        public String ips;

        /**
         * <p>The whitelist template ID.</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        /**
         * <p>The whitelist template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The user ID.</p>
         */
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
        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InsName")
        public String insName;

        /**
         * <p>The information about whitelists that are returned by page.</p>
         */
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
