// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListTemplatesForSqlRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SqlType1")
    public String sqlType1;

    @NameInMap("ChoseCondition")
    public String choseCondition;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("RuleId")
    public Integer ruleId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListTemplatesForSqlRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesForSqlRuleRequest self = new ListTemplatesForSqlRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplatesForSqlRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTemplatesForSqlRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTemplatesForSqlRuleRequest setSqlType1(String sqlType1) {
        this.sqlType1 = sqlType1;
        return this;
    }
    public String getSqlType1() {
        return this.sqlType1;
    }

    public ListTemplatesForSqlRuleRequest setChoseCondition(String choseCondition) {
        this.choseCondition = choseCondition;
        return this;
    }
    public String getChoseCondition() {
        return this.choseCondition;
    }

    public ListTemplatesForSqlRuleRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public ListTemplatesForSqlRuleRequest setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Integer getRuleId() {
        return this.ruleId;
    }

    public ListTemplatesForSqlRuleRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesForSqlRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
