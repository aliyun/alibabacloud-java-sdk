// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListRulesV4ResponseBody extends TeaModel {
    /**
     * <p>The business type. This parameter has no practical meaning and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("BusinessType")
    public Integer businessType;

    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can determine the cause of the failure based on this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>219</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public java.util.List<RuleCountInfo> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error details when an error occurs, or <strong>successful</strong> when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The error details when an error occurs. This parameter is used when multiple messages are returned.</p>
     */
    @NameInMap("Messages")
    public java.util.List<String> messages;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96138D8D-8D26-4E41-BFF4-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. You can determine whether the request is successful based on this parameter. A value of <strong>true</strong> indicates success. A value of <strong>false</strong> or <strong>null</strong> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of data entries.</p>
     * 
     * <strong>example:</strong>
     * <p>219</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRulesV4ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesV4ResponseBody self = new ListRulesV4ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesV4ResponseBody setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public ListRulesV4ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRulesV4ResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListRulesV4ResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRulesV4ResponseBody setData(java.util.List<RuleCountInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RuleCountInfo> getData() {
        return this.data;
    }

    public ListRulesV4ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRulesV4ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesV4ResponseBody setMessages(java.util.List<String> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<String> getMessages() {
        return this.messages;
    }

    public ListRulesV4ResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRulesV4ResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRulesV4ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesV4ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRulesV4ResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
