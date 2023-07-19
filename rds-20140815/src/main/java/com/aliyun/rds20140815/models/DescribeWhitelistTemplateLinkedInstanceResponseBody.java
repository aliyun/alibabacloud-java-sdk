// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeWhitelistTemplateLinkedInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeWhitelistTemplateLinkedInstanceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InsName")
        public java.util.List<String> insName;

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
