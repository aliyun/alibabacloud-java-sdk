// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpLike")
    public String ipLike;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeMajorProtectionBlackIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorProtectionBlackIpsRequest self = new DescribeMajorProtectionBlackIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMajorProtectionBlackIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMajorProtectionBlackIpsRequest setIpLike(String ipLike) {
        this.ipLike = ipLike;
        return this;
    }
    public String getIpLike() {
        return this.ipLike;
    }

    public DescribeMajorProtectionBlackIpsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeMajorProtectionBlackIpsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMajorProtectionBlackIpsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMajorProtectionBlackIpsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeMajorProtectionBlackIpsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
