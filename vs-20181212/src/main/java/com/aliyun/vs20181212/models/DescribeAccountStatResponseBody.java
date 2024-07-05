// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeAccountStatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("GroupLimit")
    public Long groupLimit;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("GroupNum")
    public Long groupNum;

    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>3238848****092996</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TemplateLimit")
    public Long templateLimit;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
