// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningDetailResponseBody extends TeaModel {
    /**
     * <p>Queries the details about a specified check item.</p>
     */
    @NameInMap("Advice")
    public String advice;

    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Item")
    public String item;

    @NameInMap("Level")
    public String level;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>DescribeCheckWarningDetail</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCheckWarningDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningDetailResponseBody self = new DescribeCheckWarningDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningDetailResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeCheckWarningDetailResponseBody setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeCheckWarningDetailResponseBody setItem(String item) {
        this.item = item;
        return this;
    }
    public String getItem() {
        return this.item;
    }

    public DescribeCheckWarningDetailResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeCheckWarningDetailResponseBody setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public DescribeCheckWarningDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckWarningDetailResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
