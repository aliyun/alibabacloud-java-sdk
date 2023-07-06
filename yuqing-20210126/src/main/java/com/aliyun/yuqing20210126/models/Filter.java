// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    @NameInMap("criteria")
    public String criteria;

    @NameInMap("filterGroupId")
    public Long filterGroupId;

    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("valid")
    public Long valid;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
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

    public Filter setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Filter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Filter setValid(Long valid) {
        this.valid = valid;
        return this;
    }
    public Long getValid() {
        return this.valid;
    }

}
