// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExpressionVariablePageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("outputs")
    public String outputs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    @NameInMap("status")
    public String status;

    @NameInMap("value")
    public String value;

    public static DescribeExpressionVariablePageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressionVariablePageRequest self = new DescribeExpressionVariablePageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressionVariablePageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExpressionVariablePageRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExpressionVariablePageRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DescribeExpressionVariablePageRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public DescribeExpressionVariablePageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeExpressionVariablePageRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeExpressionVariablePageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeExpressionVariablePageRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
