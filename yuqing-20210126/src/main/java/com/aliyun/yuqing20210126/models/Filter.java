// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    // 筛选模板id
    @NameInMap("id")
    public Long id;

    // 创建日期，毫秒
    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    // 修改时间，毫秒
    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    // 状态。1：有效，0：无效
    @NameInMap("valid")
    public Long valid;

    // 筛选模板名称
    @NameInMap("name")
    public String name;

    // 筛选模板配置内容
    @NameInMap("criteria")
    public String criteria;

    // 筛选模板所属id
    @NameInMap("filterGroupId")
    public Long filterGroupId;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Filter setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public Filter setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public Filter setValid(Long valid) {
        this.valid = valid;
        return this;
    }
    public Long getValid() {
        return this.valid;
    }

    public Filter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Filter setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public Filter setFilterGroupId(Long filterGroupId) {
        this.filterGroupId = filterGroupId;
        return this;
    }
    public Long getFilterGroupId() {
        return this.filterGroupId;
    }

}
