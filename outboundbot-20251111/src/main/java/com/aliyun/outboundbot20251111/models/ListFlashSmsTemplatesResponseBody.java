// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public ListFlashSmsTemplatesResponseBodyData data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=out001</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlashSmsTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesResponseBody self = new ListFlashSmsTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsTemplatesResponseBody setData(ListFlashSmsTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFlashSmsTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListFlashSmsTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsTemplatesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListFlashSmsTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlashSmsTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates extends TeaModel {
        /**
         * <p>模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>测试模版</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates self = new ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListFlashSmsTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>数据列表</p>
         */
        @NameInMap("FlashSmsTemplates")
        public java.util.List<ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates> flashSmsTemplates;

        /**
         * <p>页码，从1开始</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>每页记录数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>符合条件的记录总数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFlashSmsTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsTemplatesResponseBodyData self = new ListFlashSmsTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsTemplatesResponseBodyData setFlashSmsTemplates(java.util.List<ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates> flashSmsTemplates) {
            this.flashSmsTemplates = flashSmsTemplates;
            return this;
        }
        public java.util.List<ListFlashSmsTemplatesResponseBodyDataFlashSmsTemplates> getFlashSmsTemplates() {
            return this.flashSmsTemplates;
        }

        public ListFlashSmsTemplatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFlashSmsTemplatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFlashSmsTemplatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
