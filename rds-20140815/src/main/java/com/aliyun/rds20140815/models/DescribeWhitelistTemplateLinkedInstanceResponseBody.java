// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateLinkedInstanceResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Normal.</li>
     * <li><strong>400</strong>: Client fault.</li>
     * <li><strong>401</strong>: Failed to authenticate.</li>
     * <li><strong>404</strong>: Request page not found.</li>
     * <li><strong>500</strong>: Server fault.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeWhitelistTemplateLinkedInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Success.</li>
     * <li><strong>400</strong>: Client error.</li>
     * <li><strong>500</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F8C06AD-3F37-57A0-ABBF-ABD7824F55CE</p>
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

    public static DescribeWhitelistTemplateLinkedInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistTemplateLinkedInstanceResponseBody self = new DescribeWhitelistTemplateLinkedInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setData(DescribeWhitelistTemplateLinkedInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWhitelistTemplateLinkedInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhitelistTemplateLinkedInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWhitelistTemplateLinkedInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The instance information.</p>
         */
        @NameInMap("InsName")
        public java.util.List<String> insName;

        /**
         * <p>The whitelist template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>412</p>
         */
        @NameInMap("TemplateId")
        public Integer templateId;

        public static DescribeWhitelistTemplateLinkedInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhitelistTemplateLinkedInstanceResponseBodyData self = new DescribeWhitelistTemplateLinkedInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWhitelistTemplateLinkedInstanceResponseBodyData setInsName(java.util.List<String> insName) {
            this.insName = insName;
            return this;
        }
        public java.util.List<String> getInsName() {
            return this.insName;
        }

        public DescribeWhitelistTemplateLinkedInstanceResponseBodyData setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

    }

}
