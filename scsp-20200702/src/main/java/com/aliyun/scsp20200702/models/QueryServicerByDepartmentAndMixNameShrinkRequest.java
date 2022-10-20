// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByDepartmentAndMixNameShrinkRequest extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("DepartmentIdList")
    public String departmentIdListShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryServicerByDepartmentAndMixNameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByDepartmentAndMixNameShrinkRequest self = new QueryServicerByDepartmentAndMixNameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByDepartmentAndMixNameShrinkRequest setCurrentPageNum(Long currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryServicerByDepartmentAndMixNameShrinkRequest setDepartmentIdListShrink(String departmentIdListShrink) {
        this.departmentIdListShrink = departmentIdListShrink;
        return this;
    }
    public String getDepartmentIdListShrink() {
        return this.departmentIdListShrink;
    }

    public QueryServicerByDepartmentAndMixNameShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServicerByDepartmentAndMixNameShrinkRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryServicerByDepartmentAndMixNameShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
