// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountStatResponseBody extends TeaModel {
    @NameInMap("GroupLimit")
    public Long groupLimit;

    @NameInMap("GroupNum")
    public Long groupNum;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateLimit")
    public Long templateLimit;

    @NameInMap("TemplateNum")
    public Long templateNum;

    public static DescribeAccountStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountStatResponseBody self = new DescribeAccountStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountStatResponseBody setGroupLimit(Long groupLimit) {
        this.groupLimit = groupLimit;
        return this;
    }
    public Long getGroupLimit() {
        return this.groupLimit;
    }

    public DescribeAccountStatResponseBody setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
        return this;
    }
    public Long getGroupNum() {
        return this.groupNum;
    }

    public DescribeAccountStatResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeAccountStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountStatResponseBody setTemplateLimit(Long templateLimit) {
        this.templateLimit = templateLimit;
        return this;
    }
    public Long getTemplateLimit() {
        return this.templateLimit;
    }

    public DescribeAccountStatResponseBody setTemplateNum(Long templateNum) {
        this.templateNum = templateNum;
        return this;
    }
    public Long getTemplateNum() {
        return this.templateNum;
    }

}
