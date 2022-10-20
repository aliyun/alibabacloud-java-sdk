// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryServicerByDepartmentAndMixNameRequest extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Long currentPageNum;

    @NameInMap("DepartmentIdList")
    public java.util.List<Long> departmentIdList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("PageSize")
    public Long pageSize;

    public static QueryServicerByDepartmentAndMixNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServicerByDepartmentAndMixNameRequest self = new QueryServicerByDepartmentAndMixNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryServicerByDepartmentAndMixNameRequest setCurrentPageNum(Long currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Long getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryServicerByDepartmentAndMixNameRequest setDepartmentIdList(java.util.List<Long> departmentIdList) {
        this.departmentIdList = departmentIdList;
        return this;
    }
    public java.util.List<Long> getDepartmentIdList() {
        return this.departmentIdList;
    }

    public QueryServicerByDepartmentAndMixNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryServicerByDepartmentAndMixNameRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryServicerByDepartmentAndMixNameRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
